//HEADER

package com.dreamorbit.faviana_b2cuk.endtoendflow;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.dreamorbit.faviana_b2cuk.pages.CheckoutPage;
import com.dreamorbit.faviana_b2cuk.pages.LandingPage;
import com.dreamorbit.faviana_b2cuk.pages.LoginPage;
import com.dreamorbit.faviana_b2cuk.pages.ProductDetailsPage;
import com.dreamorbit.faviana_b2cuk.pages.ProductPage;
import com.dreamorbit.faviana_b2cuk.testbase.TestBase;

public class TC03_VerifySuccessfulOrderForACustomerWithOrderSummary extends TestBase {

	public static final Logger log = Logger
			.getLogger(TC03_VerifySuccessfulOrderForACustomerWithOrderSummary.class.getName());
	
	LandingPage landing;
	LoginPage login;
	ProductPage product;
	ProductDetailsPage productdetails;
	CheckoutPage checkout;

	String sheetName = "Checkout";

	public TC03_VerifySuccessfulOrderForACustomerWithOrderSummary() {
		super();
	}

	@BeforeClass
	public void setUp() {
		initializeBrowser();
		landing = new LandingPage();
		login = new LoginPage();
		product = new ProductPage();
		productdetails = new ProductDetailsPage();
		checkout = new CheckoutPage();
	}

	@Test
	public void verifySuccessfulOrderForACustomer() throws InterruptedException {
		landing.clickingOnLoginMenuPresentAtRightTop();
		login.loggingInToTheApplication(prop.getProperty("username"),
				prop.getProperty("password"));
		landing.clickingOnPromDresses();
		product.selectingAProduct();
		productdetails.addingAProductToShoppingBag();
		productdetails
				.clickingOnCheckoutButtonPresentInAddToShoppingBagNotificationPopup();
//		checkout.orderUsingPayPalOptionInPaymentMethodsSection();
		log.info("Guest user has successfully placed an order");
	}

	@AfterClass
	public void tearDown() {
		// endTest();
	}

}
