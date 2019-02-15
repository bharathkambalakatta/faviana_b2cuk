/* Project		: Faviana B2C UK
 * Author		: Bharath Kambalakatta
 * Created Date	: 12-Oct-2018
 * Reviewer		:
 */

package com.dreamorbit.faviana_b2cuk.testbase;

//Test cases update for all the steps
//Steps in the extent report
//Reading excel by cell (Search)
//Parallel execution

//TC01_VerifySuccessfulOrderForGuest
//TC02_VerifySuccessfulOrderForACustomer

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.dreamorbit.faviana_b2cuk.testutils.TestUtil;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;

	public static ExtentReports extent;
	public static ExtentTest test;
	public ITestResult result;

	// public static EventFiringWebDriver eventDriver;
	// public static WebEventListener eventListener;

	public static final Logger log = Logger.getLogger(TestBase.class.getName());

	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream(
					System.getProperty("user.dir")
							+ "//src//main//java//com//dreamorbit//faviana_b2cuk//properties//config.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void initializeBrowser() {
		PropertyConfigurator.configure("log4j//log4j.properties");
		String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir")
							+ "//drivers//chromedriver.exe");
			driver = new ChromeDriver();
			log.info("Chrome browser launched successfully");
		} else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir")
							+ "//drivers//geckodriver.exe");
			driver = new FirefoxDriver();
			log.info("Firefox browser launched successfully");
		} else if (browserName.equals("ie")) {
			System.setProperty("webdriver.ie.driver",
					System.getProperty("user.dir")
							+ "//drivers//IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			log.info("IE browser launched successfully");
		}

		// eventDriver = new EventFiringWebDriver(driver);
		// eventListener = new WebEventListener();
		// eventDriver.register(eventListener);
		// driver = eventDriver;

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts()
				.implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		log.info("Application URL has been entered");
	}

	static {
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat formater = new SimpleDateFormat("MM_dd_yyyy_kk_mm_ss");
		extent = new ExtentReports(System.getProperty("user.dir") + "/reports/"
				+ formater.format(calendar.getTime()) + ".html", false);
	}

	public String getScreenShot(String imageName) throws IOException {
		if (imageName.equals("")) {
			imageName = "failed";
		}
		File image = ((TakesScreenshot) driver)
				.getScreenshotAs(OutputType.FILE);
		String imagelocation = System.getProperty("user.dir") + "/screenshots/";
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat formater = new SimpleDateFormat("MM_dd_yyyy_kk_mm_ss");
		String actualImageName = imagelocation + imageName + "_"
				+ formater.format(calendar.getTime()) + ".png";
		File destFile = new File(actualImageName);
		FileHandler.copy(image, destFile);
		return actualImageName;
	}

	public void getresult(ITestResult result) throws IOException {
		if (result.getStatus() == ITestResult.SUCCESS) {

			test.log(LogStatus.PASS, result.getName() + " Test Passed");
		} else if (result.getStatus() == ITestResult.SKIP) {
			test.log(LogStatus.SKIP,
					result.getName() + " Test Skipped and and the reason is:"
							+ result.getThrowable());
		} else if (result.getStatus() == ITestResult.FAILURE) {
			test.log(LogStatus.FAIL,
					result.getName() + " Test Failed" + result.getThrowable());
			String screen = getScreenShot("");
			test.log(LogStatus.FAIL, test.addScreenCapture(screen));
		}
	}

	@BeforeMethod()
	public void beforeMethod(Method result) {
		test = extent.startTest(result.getName());
		test.log(LogStatus.INFO, result.getName() + " Test Started");
	}

	@AfterMethod()
	public void afterMethod(ITestResult result) throws IOException {
		getresult(result);
	}

	public void endTest() {
		extent.endTest(test);
		extent.flush();
		driver.quit();
		log.info("Browser has been closed");
	}
}
