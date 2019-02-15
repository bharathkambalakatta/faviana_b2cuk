/* Project		: Faviana B2C UK
 * Author		: Bharath Kambalakatta
 * Created Date	: 30-Oct-2018
 * Reviewer		:
 */

package com.dreamorbit.faviana_b2cuk.wishlist;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.dreamorbit.faviana_b2cuk.pages.LandingPage;
import com.dreamorbit.faviana_b2cuk.pages.LoginPage;
import com.dreamorbit.faviana_b2cuk.pages.MyDashboardPage;
import com.dreamorbit.faviana_b2cuk.pages.WishlistPage;
import com.dreamorbit.faviana_b2cuk.testbase.TestBase;

public class TC02_VerifyWishlistForExistingUsers extends TestBase {

	public static final Logger log = Logger
			.getLogger(TC02_VerifyWishlistForExistingUsers.class.getName());

	LandingPage landing;
	LoginPage login;
	MyDashboardPage mydashboard;
	WishlistPage wishlist;

	public TC02_VerifyWishlistForExistingUsers() {
		super();
	}

	@BeforeClass
	public void setUp() {
		initializeBrowser();
		landing = new LandingPage();
		login = new LoginPage();
		mydashboard = new MyDashboardPage();
		wishlist = new WishlistPage();
	}

	@Test
	public void verifyWishlistForExistingUsers() {
		landing.clickingOnLoginMenuPresentAtRightTop();
		login.loggingInToTheApplication(prop.getProperty("username"),
				prop.getProperty("password"));
		mydashboard.clickingOnWishlistIcon();
		wishlist.verifyIfWishlistPageIsDisplayed();
		log.info("Wishlist page is displayed when clicked on 'Wishlist' icon");
	}

	@AfterClass
	public void tearDown() {
		endTest();
	}
}
