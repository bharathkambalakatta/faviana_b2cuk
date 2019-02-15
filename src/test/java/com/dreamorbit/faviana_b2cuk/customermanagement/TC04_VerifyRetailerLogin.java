/* Project		: Faviana B2C UK
 * Author		: Bharath Kambalakatta
 * Created Date	: 23-Oct-2018
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

public class TC04_VerifyRetailerLogin extends TestBase {

	public static final Logger log = Logger
			.getLogger(TC04_VerifyRetailerLogin.class.getName());

	LandingPage landing;
	LoginPage login;

	public TC04_VerifyRetailerLogin() {
		super();
	}

	@BeforeClass
	public void setUp() {
		initializeBrowser();
		landing = new LandingPage();
		login = new LoginPage();
	}

	@Test
	public void verifyRetailerLogin() {
		landing.clickingOnLoginMenuPresentAtRightTop();
		login.clickingOnClickHereToSignInToOurNewRetailerWebsite();
		String actualTitle = login
				.clickingOnClickHereToSignInToOurNewRetailerWebsite();
		Assert.assertEquals(actualTitle, login.retailerSiteTitle);
		log.info("Retailer site opened successfully");
	}

	@AfterClass
	public void tearDown() {
		endTest();
	}

}
