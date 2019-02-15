/* Project		: Faviana B2C UK
 * Author		: Bharath Kambalakatta
 * Created Date	: 30-Oct-2018
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

public class TC03_VerifyingTheAdditionOfProductToWishlist extends TestBase {

	public static final Logger log = Logger
			.getLogger(TC03_VerifyingTheAdditionOfProductToWishlist.class.getName());

	LandingPage landing;
	LoginPage login;
	WishlistPage wishlist;
	ProductPage product;
	ProductDetailsPage productdetails;

	public TC03_VerifyingTheAdditionOfProductToWishlist() {
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
	public void verifyingTheAdditionOfProductToWIshlist() {
		landing.clickingOnLoginMenuPresentAtRightTop();
		login.loggingInToTheApplication(prop.getProperty("username"),
				prop.getProperty("password"));
		landing.clickingOnPromDresses();
		product.selectingAProduct();
		productdetails.addingAProductToWishlist();
		String actualText = productdetails.messageDisplayedAfterAddingAProductToWishlist();
		Assert.assertEquals(actualText, productdetails.textAfterAddingAProductToWishList);
		productdetails.clickOnClickhereLinkDisplayedAfterAddingAProductToWisList();
		wishlist.verifyIfProductIsDisplayedInWishlist();
		wishlist.removingProductFromWishlist();
		log.info("Product has been successfully added to the Wishlist and removed from the Wishlist");
	}

	@AfterClass
	public void tearDown() {
		endTest();
	}
}
