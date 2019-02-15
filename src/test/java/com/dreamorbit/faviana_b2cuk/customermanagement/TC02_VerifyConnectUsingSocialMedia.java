/* Project		: Faviana B2C UK
 * Author		: Bharath Kambalakatta
 * Created Date	: 23-Oct-2018
 * Reviewer		:
 */

package com.dreamorbit.faviana_b2cuk.customermanagement;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.dreamorbit.faviana_b2cuk.pages.LandingPage;
import com.dreamorbit.faviana_b2cuk.pages.LoginPage;
import com.dreamorbit.faviana_b2cuk.testbase.TestBase;

public class TC02_VerifyConnectUsingSocialMedia extends TestBase {

	public static final Logger log = Logger
			.getLogger(TC02_VerifyConnectUsingSocialMedia.class.getName());

	LandingPage landing;
	LoginPage login;

	public TC02_VerifyConnectUsingSocialMedia() {
		super();
	}

	@BeforeClass
	public void setUp() {
		initializeBrowser();
		landing = new LandingPage();
		login = new LoginPage();
	}

	@Test
	public void verifyConnectUsingSocialMedia() {
		landing.clickingOnLoginMenuPresentAtRightTop();
		login.clickingOnConnectUsingYourFaceBookButton();
		log.info("A new window has been opened where user can register using FACEBOOK");
		
	}

	@AfterClass
	public void tearDown() {
		endTest();
	}
}
