package com.dreamorbit.faviana_b2cuk.productmanagement;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.dreamorbit.faviana_b2cuk.pages.LandingPage;
import com.dreamorbit.faviana_b2cuk.pages.ProductPage;
import com.dreamorbit.faviana_b2cuk.testbase.TestBase;

public class TC03_VerifyProductsDisplayInProductListPage extends TestBase {

	public static final Logger log = Logger
			.getLogger(TC03_VerifyProductsDisplayInProductListPage.class.getName());

	LandingPage landing;
	ProductPage product;

	public TC03_VerifyProductsDisplayInProductListPage() {
		super();
	}

	@BeforeClass
	public void setUp() {
		initializeBrowser();
		landing = new LandingPage();
		product = new ProductPage();
	}

	@Test
	public void verifyProductsDisplayInProductListPage() {
		log.info("verifyProductsDisplayInProductListPage test execution started");
		landing.clickingOnPromDresses();
		product.verifyIfProductsAreDisplayed();
		product.scrollingDownInProductListPage();
		product.verifyIfProductsAreDisplayedInSecondPage();
		product.verifyingTextDisplayedAtTheEndOfProductListPage();
		log.info("verifyProductsDisplayInProductListPage test executed successfully");
	}

	@AfterClass
	public void tearDown() {
		endTest();
	}

}
