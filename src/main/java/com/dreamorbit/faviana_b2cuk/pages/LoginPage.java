/* Project		: Faviana B2C UK
 * Author		: Bharath Kambalakatta
 * Created Date	: 16-Oct-2018
 * Reviewer		:
 */

package com.dreamorbit.faviana_b2cuk.pages;

import java.util.Iterator;
import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dreamorbit.faviana_b2cuk.testbase.TestBase;

public class LoginPage extends TestBase {

	public static final Logger log = Logger
			.getLogger(LoginPage.class.getName());

	LandingPage landing = new LandingPage();

	public String textAfterSuccessfulLogin = "My Dashboard";
	public String retailerSiteTitle = "Retailer Login | Faviana NY";
	public String customerLoginHeaderText = "CUSTOMER LOGIN";

	@FindBy(xpath = "//input[@name='login[username]']")
	WebElement userNameTextBox;

	@FindBy(xpath = "//input[@name='login[password]']")
	WebElement passwordTextBox;

	@FindBy(xpath = "//button[text()='SUBMIT']")
	WebElement submitButton;

	@FindBy(xpath = "//span[text()='My Dashboard']")
	WebElement myDashboardHeaderAfterSuccessfulLogin;

	@FindBy(xpath = "//h1[text()='CUSTOMER LOGIN']/parent::div/p/a[text()='Click Here']")
	WebElement clickHereToRegisterLink;

	@FindBy(xpath = "//h1[text()='RETAILER LOGIN']/parent::div/p/a[text()='Click Here']")
	WebElement clickHereToSignInToOurNewRetailerWebsiteLink;
	
	@FindBy(xpath = "//a[@id='btn_facebook_login']")
	WebElement connectUsingYourFaceBookButton;
	
	@FindBy(xpath = "//h1[contains(text(),'CUSTOMER LOGIN')]")
	WebElement customerLoginHeader;
	
	@FindBy(xpath = "//div[contains(text(),'You are not logged in: You are not logged in. Please log in and try again.')]")
	WebElement messageInFaceBookWindow;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public void loggingInToTheApplication(String username, String password) {
		userNameTextBox.clear();
		userNameTextBox.sendKeys(username);
		log.info("'Email/Username' has been entered");
		passwordTextBox.clear();
		passwordTextBox.sendKeys(password);
		log.info("'Password' has been entered");
		submitButton.click();
		log.info("User has clicked on 'SUBMIT' button");
	}

	public String successfulLogin() {
		return myDashboardHeaderAfterSuccessfulLogin.getText();
	}

	public void clickingOnclickHereToRegisterLink() {
		clickHereToRegisterLink.click();
		log.info("User has clicked on 'Don’t have an account? Click Here to register'");
	}

	public String clickingOnClickHereToSignInToOurNewRetailerWebsite() {
		clickHereToSignInToOurNewRetailerWebsiteLink.click();
		log.info("User has clicked on 'Click Here to sign in to our new retailer website'");
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> itr = windowHandles.iterator();
		String parentWindow = itr.next();
		String childWindow = itr.next();
		driver.switchTo().window(childWindow);
		String title = driver.getTitle();
		driver.switchTo().window(parentWindow);
		return title;
	}
	
	public void clickingOnConnectUsingYourFaceBookButton() {
		connectUsingYourFaceBookButton.click();
		log.info("User has clicked on 'Connect using your: FACEBOOK'");
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> itr = windowHandles.iterator();
		String parentWindow = itr.next();
		String childWindow = itr.next();
		driver.switchTo().window(childWindow);
		messageInFaceBookWindow.isDisplayed();
		driver.switchTo().window(parentWindow);
	}
	
	public String verifyIfLoginPageIsDisplayed() {
		return customerLoginHeader.getText();
	}
	
}
