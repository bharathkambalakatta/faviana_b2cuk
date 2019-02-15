/* Project		: Faviana B2C UK
 * Author		: Bharath Kambalakatta
 * Created Date	: 29-Oct-2018
 * Reviewer		:
 */

package com.dreamorbit.faviana_b2cuk.wishlist;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.dreamorbit.faviana_b2cuk.pages.LandingPage;
import com.dreamorbit.faviana_b2cuk.pages.LoginPage;
import com.dreamorbit.faviana_b2cuk.testbase.TestBase;

public class TC01_VerifyWishlistForGuest extends TestBase {

	public static final Logger log = Logger
			.getLogger(TC01_VerifyWishlistForGuest.class.getName());

	LandingPage landing;
	LoginPage login;

	public TC01_VerifyWishlistForGuest() {
		super();
	}

	@BeforeClass
	public void setUp() {
		initializeBrowser();
		landing = new LandingPage();
		login = new LoginPage();
	}

	@Test
	public void verifyWishlistForGuest() {
		landing.clickingOnWishlistIcon();
		String actual = login.verifyIfLoginPageIsDisplayed();
		Assert.assertEquals(actual, login.customerLoginHeaderText);
		log.info("Guest user has been navigated to Login screen when clicked on 'Wishlist' icon");
	}

	@AfterClass
	public void tearDown() {
		endTest();
	}

}
