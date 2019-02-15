/* Project		: Faviana B2C UK
 * Author		: Bharath Kambalakatta
 * Created Date	: 16-Oct-2018
 * Reviewer		:
 */

package com.dreamorbit.faviana_b2cuk.customermanagement;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.dreamorbit.faviana_b2cuk.pages.LandingPage;
import com.dreamorbit.faviana_b2cuk.pages.LoginPage;
import com.dreamorbit.faviana_b2cuk.testbase.TestBase;

public class TC03_VerifyExistingUserLogin extends TestBase {

	public static final Logger log = Logger
			.getLogger(TC03_VerifyExistingUserLogin.class.getName());

	LandingPage landing;
	LoginPage login;

	public TC03_VerifyExistingUserLogin() {
		super();
	}

	@BeforeClass
	public void setUp() {
		initializeBrowser();
		landing = new LandingPage();
		login = new LoginPage();
	}

	@Test
	public void verifyExistingUserLogin() {
		String actualTitle = landing.successfulApplicationLaunch();
		Assert.assertEquals(actualTitle, landing.applicationTitle);
		// login.closePopUpDisplayedDuringLaunch();
		landing.clickingOnLoginMenuPresentAtRightTop();
		login.loggingInToTheApplication(prop.getProperty("username"),
				prop.getProperty("password"));
		String actualText = login.successfulLogin();
		Assert.assertEquals(actualText, login.textAfterSuccessfulLogin);
		log.info("User has successfully logged into the application");
	}

	@AfterClass
	public void tearDown() {
		endTest();
	}
}
