package com.dreamorbit.faviana_b2cuk.shoppingbag;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.dreamorbit.faviana_b2cuk.pages.LandingPage;
import com.dreamorbit.faviana_b2cuk.pages.LoginPage;
import com.dreamorbit.faviana_b2cuk.pages.ProductDetailsPage;
import com.dreamorbit.faviana_b2cuk.pages.ProductPage;
import com.dreamorbit.faviana_b2cuk.pages.ShoppingBagPage;
import com.dreamorbit.faviana_b2cuk.testbase.TestBase;

public class TC02_VerifyAddToShoppingBagForCustomers extends TestBase {

	public static final Logger log = Logger
			.getLogger(TC02_VerifyAddToShoppingBagForCustomers.class.getName());

	LandingPage landing;
	LoginPage login;
	ProductPage product;
	ProductDetailsPage productdetails;
	ShoppingBagPage shoppingbag;

	public TC02_VerifyAddToShoppingBagForCustomers() {
		super();
	}

	@BeforeClass
	public void setUp() {
		initializeBrowser();
		landing = new LandingPage();
		login = new LoginPage();
		product = new ProductPage();
		productdetails = new ProductDetailsPage();
		shoppingbag = new ShoppingBagPage();
	}

	@Test
	public void verifyAddToShoppingBagForCustomers() throws InterruptedException {
		landing.clickingOnLoginMenuPresentAtRightTop();
		login.loggingInToTheApplication(prop.getProperty("username"),
				prop.getProperty("password"));
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
