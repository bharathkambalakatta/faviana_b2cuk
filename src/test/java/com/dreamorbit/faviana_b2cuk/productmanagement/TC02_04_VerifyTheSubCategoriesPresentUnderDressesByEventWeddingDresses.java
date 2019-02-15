package com.dreamorbit.faviana_b2cuk.productmanagement;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.dreamorbit.faviana_b2cuk.pages.LandingPage;
import com.dreamorbit.faviana_b2cuk.pages.ProductPage;
import com.dreamorbit.faviana_b2cuk.testbase.TestBase;

public class TC02_04_VerifyTheSubCategoriesPresentUnderDressesByEventWeddingDresses
		extends TestBase {

	public static final Logger log = Logger
			.getLogger(TC02_04_VerifyTheSubCategoriesPresentUnderDressesByEventWeddingDresses.class
					.getName());

	LandingPage landing;
	ProductPage product;

	public TC02_04_VerifyTheSubCategoriesPresentUnderDressesByEventWeddingDresses() {
		super();
	}

	@BeforeClass
	public void setUp() {
		initializeBrowser();
		landing = new LandingPage();
		product = new ProductPage();
	}

	@Test
	public void verifyTheSubCategoriesPresentUnderDressesByEventWeddingDresses() {
		log.info("verifyTheSubCategoriesPresentUnderEachMainCategory test execution started");

		landing.verifyingSubCategoriesUnderDressesByEventWeddingDresses();

		String actualHeaderInBachelorettePartyDressesPage = landing
				.clickingOnBachelorettePartyDressesPresentUnderDressesByEventWeddingDresses();
		Assert.assertEquals(actualHeaderInBachelorettePartyDressesPage,
				product.bachelorettePartyDressesPageHeader);
		log.info("'Bachelorette Party Dresses' page is displayed");

		String actualHeaderInBridalDressesPage = landing
				.clickingOnBridalDressesPresentUnderDressesByEventWeddingDresses();
		Assert.assertEquals(actualHeaderInBridalDressesPage,
				product.bridalDressesPageHeader);
		log.info("'Bridal Dresses' page is displayed");

		String actualHeaderInBridalShowerDressesPage = landing
				.clickingOnBridalShowerDressesPresentUnderDressesByEventWeddingDresses();
		Assert.assertEquals(actualHeaderInBridalShowerDressesPage,
				product.bridalShowerDressesPageHeader);
		log.info("'Bridal Shower Dresses' page is displayed");

		String actualHeaderInBridesmaidDressesPage = landing
				.clickingOnBridesmaidDressesPresentUnderDressesByEventWeddingDresses();
		Assert.assertEquals(actualHeaderInBridesmaidDressesPage,
				product.bridesmaidDressesPageHeader);
		log.info("'Bridesmaid Dresses' page is displayed");

		String actualHeaderInMotherOfTheBrideDressesPage = landing
				.clickingOnMotherOfTheBrideDressesPresentUnderDressesByEventWeddingDresses();
		Assert.assertEquals(actualHeaderInMotherOfTheBrideDressesPage,
				product.motherOfTheBrideDressesPageHeader);
		log.info("'Mother of the Bride Dresses' page is displayed");

		String actualHeaderInReceptionDressesPage = landing
				.clickingOnReceptionDressesPresentUnderDressesByEventWeddingDresses();
		Assert.assertEquals(actualHeaderInReceptionDressesPage,
				product.receptionDressesPageHeader);
		log.info("'Reception Dresses' page is displayed");

		String actualHeaderInRehearsalDinnerDressesPage = landing
				.clickingOnRehearsalDinnerDressesPresentUnderDressesByEventWeddingDresses();
		Assert.assertEquals(actualHeaderInRehearsalDinnerDressesPage,
				product.rehearsalDinnerDressesPageHeader);
		log.info("'Rehearsal Dinner Dresses' page is displayed");

		String actualHeaderInWeddingGuestDressesPage = landing
				.clickingOnWeddingGuestDressesPresentUnderDressesByEventWeddingDresses();
		Assert.assertEquals(actualHeaderInWeddingGuestDressesPage,
				product.weddingGuestDressesPageHeader);
		log.info("'Wedding Guest Dresses' page is displayed");

		String actualHeaderInViewAllDressesByEventWeddingDressesPage = landing
				.clickingOnViewAllPresentUnderDressesByEventWeddingDresses();
		Assert.assertEquals(
				actualHeaderInViewAllDressesByEventWeddingDressesPage,
				product.viewAllPageHeaderDressesByEventWeddingDresses);
		log.info("'View All' page for DRESSES BY EVENT - WEDDING DRESSES is displayed");

		log.info("verifyTheSubCategoriesPresentUnderDressesByEventWeddingDresses test executed successfully");
	}

	@AfterClass
	public void tearDown() {
		endTest();
	}

}
