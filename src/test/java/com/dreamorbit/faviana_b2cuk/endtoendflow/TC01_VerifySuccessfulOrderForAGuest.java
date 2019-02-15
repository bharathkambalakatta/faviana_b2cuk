package com.dreamorbit.faviana_b2cuk.endtoendflow;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dreamorbit.faviana_b2cuk.pages.CheckoutPage;
import com.dreamorbit.faviana_b2cuk.pages.LandingPage;
import com.dreamorbit.faviana_b2cuk.pages.ProductDetailsPage;
import com.dreamorbit.faviana_b2cuk.pages.ProductPage;
import com.dreamorbit.faviana_b2cuk.testbase.TestBase;
import com.dreamorbit.faviana_b2cuk.testutils.ReadExcel;

public class TC01_VerifySuccessfulOrderForAGuest extends TestBase {

	public static final Logger log = Logger
			.getLogger(TC01_VerifySuccessfulOrderForAGuest.class.getName());

	LandingPage landing;
	ProductPage product;
	ProductDetailsPage productdetails;
	CheckoutPage checkout;

	String sheetName = "Checkout";

	public TC01_VerifySuccessfulOrderForAGuest() {
		super();
	}

	@BeforeClass
	public void setUp() {
		initializeBrowser();
		landing = new LandingPage();
		product = new ProductPage();
		productdetails = new ProductDetailsPage();
		checkout = new CheckoutPage();
	}

	@DataProvider
	public Object[][] getCheckoutTestData() {
		Object data[][] = ReadExcel.getTestData(sheetName);
		return data;

	}

	@Test(dataProvider = "getCheckoutTestData")
	public void verifySuccessfulOrderForGuest(String country, String firstname,
			String lastname, String streetaddress1, String streetaddress2,
			String city, String stateprovince, String zippostalcode,
			String phonenumber, String emailaddress, String creditcardnumber,
			String expirationmonth, String expirationyear, String cvv)
			throws InterruptedException {
		landing.clickingOnPromDresses();
		// landing.clickingOnBlackPromDresses();
		product.selectingAProduct();
		productdetails.addingAProductToShoppingBag();
		productdetails
				.clickingOnCheckoutButtonPresentInAddToShoppingBagNotificationPopup();
		checkout.enteringDetailsInShippingSection(country, firstname, lastname,
				streetaddress1, streetaddress2, city, stateprovince,
				zippostalcode, phonenumber, emailaddress);
		// checkout.enteringDetailsInBillingSection(creditcardnumber,
		// expirationmonth, expirationyear, cvv);
		// checkout.enteringDetailsInReviewSection();
		checkout.orderUsingPayPalOptionInPaymentMethodsSection();
		log.info("Guest user has successfully placed an order");
	}

	@AfterClass
	public void tearDown() {
//		endTest();
	}
}
