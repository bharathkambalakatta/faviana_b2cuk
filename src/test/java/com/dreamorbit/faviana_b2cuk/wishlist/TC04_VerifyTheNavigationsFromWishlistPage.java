/* Project		: Faviana B2C UK
 * Author		: Bharath Kambalakatta
 * Created Date	: 24-Dec-2018
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
import com.dreamorbit.faviana_b2cuk.pages.ProductDetailsPage;
import com.dreamorbit.faviana_b2cuk.pages.ProductPage;
import com.dreamorbit.faviana_b2cuk.pages.WishlistPage;
import com.dreamorbit.faviana_b2cuk.testbase.TestBase;

public class TC04_VerifyTheNavigationsFromWishlistPage extends TestBase {

	public static final Logger log = Logger
			.getLogger(TC04_VerifyTheNavigationsFromWishlistPage.class.getName());

	LandingPage landing;
	LoginPage login;
	WishlistPage wishlist;
	ProductPage product;
	ProductDetailsPage productdetails;

	public TC04_VerifyTheNavigationsFromWishlistPage() {
		super();
	}

	@BeforeClass
	public void setUp() {
		initializeBrowser();
		landing = new LandingPage();
		login = new LoginPage();
		wishlist = new WishlistPage();
		product = new ProductPage();
		productdetails = new ProductDetailsPage();
	}

	@Test
	public void verifyTheNavigationsFromWishlistPage() {
		landing.clickingOnLoginMenuPresentAtRightTop();
		login.loggingInToTheApplication(prop.getProperty("username"),
				prop.getProperty("password"));
		landing.clickingOnPromDresses();
		product.selectingAProduct();
		productdetails.addingAProductToWishlist();
		productdetails.clickOnClickhereLinkDisplayedAfterAddingAProductToWisList();
		String title = wishlist.verifyingIfFacebookPageIsDisplayed();
		Assert.assertEquals(title, wishlist.facebookSiteTitle);
		String title1 = wishlist.verifyingIfTwitterPageIsDisplayed();
		Assert.assertEquals(title1, wishlist.twitterSiteTitle);
		String title2 = wishlist.verifyingIfPinItPageIsDisplayed();
		Assert.assertEquals(title2, wishlist.pinitSiteTitle);
		wishlist.removingProductFromWishlist();
		log.info("verifyTheNavigationsFromWishlistPage test has been successfully executed");
	}

	@AfterClass
	public void tearDown() {
//		endTest();
	}
}
