package com.dreamorbit.faviana_b2cuk.productmanagement;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.dreamorbit.faviana_b2cuk.pages.LandingPage;
import com.dreamorbit.faviana_b2cuk.pages.ProductPage;
import com.dreamorbit.faviana_b2cuk.testbase.TestBase;

public class TC02_03_VerifyTheSubCategoriesPresentUnderDressesByEventByEvent
		extends TestBase {

	public static final Logger log = Logger
			.getLogger(TC02_03_VerifyTheSubCategoriesPresentUnderDressesByEventByEvent.class
					.getName());

	LandingPage landing;
	ProductPage product;

	public TC02_03_VerifyTheSubCategoriesPresentUnderDressesByEventByEvent() {
		super();
	}

	@BeforeClass
	public void setUp() {
		initializeBrowser();
		landing = new LandingPage();
		product = new ProductPage();
	}

	@Test
	public void verifyTheSubCategoriesPresentUnderDressesByEventByEvent() {
		log.info("verifyTheSubCategoriesPresentUnderDressesByEventByEvent test execution started");

		landing.verifyingSubCategoriesUnderDressesByEventByEvent();

		String actualHeaderInCocktailDressesPage = landing
				.clickingOnCocktailDressesPresentUnderDressesByEventByEvent();
		Assert.assertEquals(actualHeaderInCocktailDressesPage,
				product.cocktailDressesPageHeader);
		log.info("'Cocktail Dresses' page is displayed");

		String actualHeaderInGraduationDressesPage = landing
				.clickingOnGraduationDressesPresentUnderDressesByEventByEvent();
		Assert.assertEquals(actualHeaderInGraduationDressesPage,
				product.graduationDressesPageHeader);
		log.info("'Graduation Dresses' page is displayed");

		String actualHeaderInHolidayDressesPage = landing
				.clickingOnHolidayDressesPresentUnderDressesByEventByEvent();
		Assert.assertEquals(actualHeaderInHolidayDressesPage,
				product.holidayDressesPageHeader);
		log.info("'Holiday Dresses' page is displayed");

		String actualHeaderInHomecomingDressesPage = landing
				.clickingOnHomecomingDressesPresentUnderDressesByEventByEvent();
		Assert.assertEquals(actualHeaderInHomecomingDressesPage,
				product.homecomingDressesPageHeader);
		log.info("'Homecoming Dresses' page is displayed");

		String actualHeaderInNewYearEveDressesPage = landing
				.clickingOnNewYearEveDressesPresentUnderDressesByEventByEvent();
		Assert.assertEquals(actualHeaderInNewYearEveDressesPage,
				product.newYearEveDressesPageHeader);
		log.info("'New Year's Eve Dresses' page is displayed");

		String actualHeaderInPageantDressesPage = landing
				.clickingOnPageantDressesPresentUnderDressesByEventByEvent();
		Assert.assertEquals(actualHeaderInPageantDressesPage,
				product.pageantDressesPageHeader);
		log.info("'Pageant Dresses' page is displayed");

		String actualHeaderInPartyAndClubDressesPage = landing
				.clickingOnPartyAndClubDressesPresentUnderDressesByEventByEvent();
		Assert.assertEquals(actualHeaderInPartyAndClubDressesPage,
				product.partyAndClubDressesPageHeader);
		log.info("'Party & Club Dresses' page is displayed");

		String actualHeaderInSweet16DressesPage = landing
				.clickingOnSweet16DressesPresentUnderDressesByEventByEvent();
		Assert.assertEquals(actualHeaderInSweet16DressesPage,
				product.sweet16DressesPageHeader);
		log.info("'Sweet 16 Dresses' page is displayed");

		String actualHeaderInViewAllDressesByEventByEventPage = landing
				.clickingOnViewAllPresentUnderDressesByEventByEvent();
		Assert.assertEquals(actualHeaderInViewAllDressesByEventByEventPage,
				product.viewAllPageHeaderDressesByEventByEvent);
		log.info("'View All' page for DRESSES BY EVENT - BY EVENT is displayed");

		log.info("verifyTheSubCategoriesPresentUnderDressesByEventByEvent test executed successfully");
	}

	@AfterClass
	public void tearDown() {
		endTest();
	}

}
