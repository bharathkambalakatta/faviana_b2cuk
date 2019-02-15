package com.dreamorbit.faviana_b2cuk.productmanagement;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.dreamorbit.faviana_b2cuk.pages.LandingPage;
import com.dreamorbit.faviana_b2cuk.pages.ProductPage;
import com.dreamorbit.faviana_b2cuk.testbase.TestBase;

public class TC02_02_VerifyTheSubCategoriesPresentUnderPromDressesByStyle
		extends TestBase {

	public static final Logger log = Logger
			.getLogger(TC02_02_VerifyTheSubCategoriesPresentUnderPromDressesByStyle.class
					.getName());

	LandingPage landing;
	ProductPage product;

	public TC02_02_VerifyTheSubCategoriesPresentUnderPromDressesByStyle() {
		super();
	}

	@BeforeClass
	public void setUp() {
		initializeBrowser();
		landing = new LandingPage();
		product = new ProductPage();
	}

	@Test
	public void verifyTheSubCategoriesPresentUnderPromDressesByStyle() {
		log.info("verifyTheSubCategoriesPresentUnderPromDressesByStyle test execution started");

		landing.verifyingSubCategoriesUnderPromDressesByStyle();

		String actualHeaderInLongPromDressesPage = landing
				.clickingOnLongPromDressesPresentUnderPromDressesByStyle();
		Assert.assertEquals(actualHeaderInLongPromDressesPage,
				product.longPromDressesPageHeader);
		log.info("'Long Prom Dresses' page is displayed");

		String actualHeaderInMermaidPromDressesPage = landing
				.clickingOnMermaidPromDressesPresentUnderPromDressesByStyle();
		Assert.assertEquals(actualHeaderInMermaidPromDressesPage,
				product.mermaidPromDressesPageHeader);
		log.info("'Mermaid Prom Dresses' page is displayed");

		String actualHeaderInOffShoulderPromDressesPage = landing
				.clickingOnOffShoulderPromDressesPresentUnderPromDressesByStyle();
		Assert.assertEquals(actualHeaderInOffShoulderPromDressesPage,
				product.offShoulderPromDressesPageHeader);
		log.info("'Off Shoulder Prom Dresses' page is displayed");

		String actualHeaderInPlusSizePromDressesPage = landing
				.clickingOnPlusSizePromDressesPresentUnderPromDressesByStyle();
		Assert.assertEquals(actualHeaderInPlusSizePromDressesPage,
				product.plusSizePromDressesPageHeader);
		log.info("'Plus Size Prom Dresses' page is displayed");

		String actualHeaderInPromDressesWithChokerPage = landing
				.clickingOnPromDressesWithChokerPresentUnderPromDressesByStyle();
		Assert.assertEquals(actualHeaderInPromDressesWithChokerPage,
				product.promDressesWithChokerPageHeader);
		log.info("'Prom Dresses With Choker' page is displayed");

		String actualHeaderInShortPromDressesPage = landing
				.clickingOnShortPromDressesPresentUnderPromDressesByStyle();
		Assert.assertEquals(actualHeaderInShortPromDressesPage,
				product.shortPromDressesPageHeader);
		log.info("'Short Prom Dresses' page is displayed");

		String actualHeaderInTwoPiecePromDressesPage = landing
				.clickingOnTwoPiecePromDressesPresentUnderPromDressesByStyle();
		Assert.assertEquals(actualHeaderInTwoPiecePromDressesPage,
				product.twoPiecePromDressesPageHeader);
		log.info("'Two-Piece Prom Dresses' page is displayed");

		String actualHeaderInViewAllPromDressesByStylePage = landing
				.clickingOnViewAllPresentUnderPromDressesByStyle();
		Assert.assertEquals(actualHeaderInViewAllPromDressesByStylePage,
				product.viewAllPageHeaderPromDressesByStyle);
		log.info("'View All' page for PROM DRESSES - BY STYLE is displayed");

		log.info("verifyTheSubCategoriesPresentUnderPromDressesByStyle test executed successfully");
	}

	@AfterClass
	public void tearDown() {
		endTest();
	}

}
