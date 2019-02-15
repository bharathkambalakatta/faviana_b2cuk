/* Project		: Faviana B2C UK
 * Author		: Bharath Kambalakatta
 * Created Date	: 22-Oct-2018
 * Reviewer		:
 */

package com.dreamorbit.faviana_b2cuk.customermanagement;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dreamorbit.faviana_b2cuk.pages.CreateAnAccountPage;
import com.dreamorbit.faviana_b2cuk.pages.LandingPage;
import com.dreamorbit.faviana_b2cuk.pages.MyDashboardPage;
import com.dreamorbit.faviana_b2cuk.testbase.TestBase;
import com.dreamorbit.faviana_b2cuk.testutils.ReadExcel;

public class TC01_VerifyNewCustomerRegistration extends TestBase {

	public static final Logger log = Logger
			.getLogger(TC01_VerifyNewCustomerRegistration.class.getName());

	LandingPage landing;
	CreateAnAccountPage createanaccount;
	MyDashboardPage mydashboard;

	String sheetName = "Register";

	public TC01_VerifyNewCustomerRegistration() {
		super();
	}

	@BeforeClass
	public void setUp() {
		initializeBrowser();
		landing = new LandingPage();
		createanaccount = new CreateAnAccountPage();
		mydashboard = new MyDashboardPage();
	}

	@DataProvider
	public Object[][] getRegisterTestData() {
		Object data[][] = ReadExcel.getTestData(sheetName);
		return data;
	}

	@Test(dataProvider = "getRegisterTestData")
	public void verifyNewCustomerRegistration(String firstname,
			String lastname, String email, String password,
			String confirmpassword) {
		landing.clickingOnLoginMenuPresentAtRightTop();
		createanaccount.creatingANewAccount(firstname, lastname, email,
				password, confirmpassword);
		String actualText = mydashboard.successfulRegistration();
		Assert.assertEquals(actualText,
				mydashboard.textAfterSuccessfulRegistration);
		log.info("New user has been successfully registered in the application");

	}

	@AfterClass
	public void tearDown() {
		endTest();
	}
}
