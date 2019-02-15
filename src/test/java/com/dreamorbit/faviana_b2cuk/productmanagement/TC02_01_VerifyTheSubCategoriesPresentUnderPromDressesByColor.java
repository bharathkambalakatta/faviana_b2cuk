package com.dreamorbit.faviana_b2cuk.productmanagement;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.dreamorbit.faviana_b2cuk.pages.LandingPage;
import com.dreamorbit.faviana_b2cuk.pages.ProductPage;
import com.dreamorbit.faviana_b2cuk.testbase.TestBase;

public class TC02_01_VerifyTheSubCategoriesPresentUnderPromDressesByColor
		extends TestBase {

	public static final Logger log = Logger
			.getLogger(TC02_01_VerifyTheSubCategoriesPresentUnderPromDressesByColor.class
					.getName());

	LandingPage landing;
	ProductPage product;

	public TC02_01_VerifyTheSubCategoriesPresentUnderPromDressesByColor() {
		super();
	}

	@BeforeClass
	public void setUp() {
		initializeBrowser();
		landing = new LandingPage();
		product = new ProductPage();
	}

	@Test
	public void verifyTheSubCategoriesPresentUnderPromDressesByColor() {
		log.info("verifyTheSubCategoriesPresentUnderPromDressesByColor test execution started");

		landing.verifyingSubCategoriesUnderPromDressesByColor();

		String actualHeaderInBlackPromDressesPage = landing
				.clickingOnBlackPromDressesPresentUnderPromDressesByColor();
		Assert.assertEquals(actualHeaderInBlackPromDressesPage,
				product.blackPromDressesPageHeader);
		log.info("'Black Prom Dresses' page is displayed");

		String actualHeaderInBluePromDressesPage = landing
				.clickingOnBluePromDressesPresentUnderPromDressesByColor();
		Assert.assertEquals(actualHeaderInBluePromDressesPage,
				product.bluePromDressesPageHeader);
		log.info("'Blue Prom Dresses' page is displayed");

		String actualHeaderInBurgundyPromDressesPage = landing
				.clickingOnBurgundyPromDressesPresentUnderPromDressesByColor();
		Assert.assertEquals(actualHeaderInBurgundyPromDressesPage,
				product.burgundyPromDressesPageHeader);
		log.info("'Burgundy Prom Dresses' page is displayed");

		String actualHeaderInGoldPromDressesPage = landing
				.clickingOnGoldPromDressesPresentUnderPromDressesByColor();
		Assert.assertEquals(actualHeaderInGoldPromDressesPage,
				product.goldPromDressesPageHeader);
		log.info("'Gold Prom Dresses' page is displayed");

		String actualHeaderInGreenPromDressesPage = landing
				.clickingOnGreenPromDressesPresentUnderPromDressesByColor();
		Assert.assertEquals(actualHeaderInGreenPromDressesPage,
				product.greenPromDressesPageHeader);
		log.info("'Green Prom Dresses' page is displayed");

		String actualHeaderInPinkPromDressesPage = landing
				.clickingOnPinkPromDressesPresentUnderPromDressesByColor();
		Assert.assertEquals(actualHeaderInPinkPromDressesPage,
				product.pinkPromDressesPageHeader);
		log.info("'Pink Prom Dresses' page is displayed");

		String actualHeaderInPurplePromDressesPage = landing
				.clickingOnPurplePromDressesPresentUnderPromDressesByColor();
		Assert.assertEquals(actualHeaderInPurplePromDressesPage,
				product.purplePromDressesPageHeader);
		log.info("'Purple Prom Dresses' page is displayed");

		String actualHeaderInRedPromDressesPage = landing
				.clickingOnRedPromDressesPresentUnderPromDressesByColor();
		Assert.assertEquals(actualHeaderInRedPromDressesPage,
				product.redPromDressesPageHeader);
		log.info("'Red Prom Dresses' page is displayed");

		String actualHeaderInWhitePromDressesPage = landing
				.clickingOnWhitePromDressesPresentUnderPromDressesByColor();
		Assert.assertEquals(actualHeaderInWhitePromDressesPage,
				product.whitePromDressesPageHeader);
		log.info("'Black Prom Dresses' page is displayed");

		String actualHeaderInViewAllPromDressesByColorPage = landing
				.clickingOnViewAllPresentUnderPromDressesByColor();
		Assert.assertEquals(actualHeaderInViewAllPromDressesByColorPage,
				product.viewAllPageHeaderPromDressesByColor);
		log.info("'View All' page for PROM DRESSES - BY COLOR is displayed");

		log.info("verifyTheSubCategoriesPresentUnderPromDressesByColor test executed successfully");
	}

	@AfterClass
	public void tearDown() {
		endTest();
	}

}
