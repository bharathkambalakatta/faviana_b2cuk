package com.dreamorbit.faviana_b2cuk.productmanagement;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.dreamorbit.faviana_b2cuk.pages.LandingPage;
import com.dreamorbit.faviana_b2cuk.pages.ProductPage;
import com.dreamorbit.faviana_b2cuk.testbase.TestBase;

public class TC04_VerifyTheFiltersInProductListPage extends TestBase {

	public static final Logger log = Logger
			.getLogger(TC04_VerifyTheFiltersInProductListPage.class.getName());

	LandingPage landing;
	ProductPage product;

	public TC04_VerifyTheFiltersInProductListPage() {
		super();
	}

	@BeforeClass
	public void setUp() {
		initializeBrowser();
		landing = new LandingPage();
		product = new ProductPage();
	}

	@Test
	public void verifyTheFiltersInProductListPage() {
		log.info("verifyTheFiltersInProductListPage test execution started");
//		landing.clickingOnBlackPromDressesPresentUnderPromDressesByColor();
//		product.verifyingTheFiltersDisplayedInPromDressesByColorPage();
//		landing.clickingOnLongPromDressesPresentUnderPromDressesByStyle();
//		product.verifyingTheFiltersDisplayedInPromDressesByStylePage();
		landing.clickingOnPromDresses();
		product.verifyingTheFiltersDisplayedInPromDressesPage();
		product.selectingOptionsFromStyleFilter();
		product.selectingOptionsFromColorFilter();
		product.selectingOptionsFromSizeFilter();
		product.selectingOptionsFromCollectionFilter();
		log.info("verifyTheFiltersInProductListPage test executed successfully");
		
		//TEST
	}

	@AfterClass
	public void tearDown() {
//		endTest();
	}

}