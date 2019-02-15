/* Project		: Faviana B2C UK
 * Author		: Bharath Kambalakatta
 * Created Date	: 26-Dec-2018
 * Reviewer		:
 */

package com.dreamorbit.faviana_b2cuk.shoppingbag;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.dreamorbit.faviana_b2cuk.pages.LandingPage;
import com.dreamorbit.faviana_b2cuk.pages.ProductDetailsPage;
import com.dreamorbit.faviana_b2cuk.pages.ProductPage;
import com.dreamorbit.faviana_b2cuk.pages.ShoppingBagPage;
import com.dreamorbit.faviana_b2cuk.testbase.TestBase;

public class TC01_VerifyAddToShoppingBagForGuest extends TestBase {
	
	public static final Logger log = Logger
			.getLogger(TC01_VerifyAddToShoppingBagForGuest.class.getName());

	LandingPage landing;
	ProductPage product;
	ProductDetailsPage productdetails;
	ShoppingBagPage shoppingbag;

	public TC01_VerifyAddToShoppingBagForGuest() {
		super();
	}

	@BeforeClass
	public void setUp() {
		initializeBrowser();
		landing = new LandingPage();
		product = new ProductPage();
		productdetails = new ProductDetailsPage();
		shoppingbag = new ShoppingBagPage();
	}

	@Test
	public void verifyAddToShoppingBagForGuest() throws InterruptedException {
		landing.clickingOnPromDresses();
		product.selectingAProduct();
		productdetails.verifyMessageDisplayedWhenColorAndSizeAreNotSelected();
		productdetails.addingAProductToShoppingBag();
		productdetails.closingAddToShoppingBagNotificationPopUp();
		landing.navigatingToShoppingBag();
		shoppingbag.verifyIfTheProductIsDisplayedInShoppingBag();
		log.info("Add To Shopping Bag test for a guest user is successfully executed");
	}

	@AfterClass
	public void tearDown() {
		endTest();
	}
}
