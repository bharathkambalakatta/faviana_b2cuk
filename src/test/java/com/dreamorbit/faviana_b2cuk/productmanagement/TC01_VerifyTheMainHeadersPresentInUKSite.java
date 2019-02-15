/* Project		: Faviana B2C UK
 * Author		: Bharath Kambalakatta
 * Created Date	: 07-Feb-2019
 * Reviewer		:
 */

package com.dreamorbit.faviana_b2cuk.productmanagement;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.dreamorbit.faviana_b2cuk.pages.LandingPage;
import com.dreamorbit.faviana_b2cuk.pages.ProductPage;
import com.dreamorbit.faviana_b2cuk.testbase.TestBase;

public class TC01_VerifyTheMainHeadersPresentInUKSite extends TestBase {

	public static final Logger log = Logger
			.getLogger(TC01_VerifyTheMainHeadersPresentInUKSite.class.getName());

	LandingPage landing;
	ProductPage product;

	public TC01_VerifyTheMainHeadersPresentInUKSite() {
		super();
	}

	@BeforeClass
	public void setUp() {
		initializeBrowser();
		landing = new LandingPage();
		product = new ProductPage();
	}

	@Test
	public void verifyTheMainHeadersPresentInUKSite()
			throws InterruptedException {
		log.info("verifyTheMainHeadersPresentInUKSite test execution started");

		landing.verifyingMainCategories();
		String actualHeaderInBestSellersPage = landing.clickingOnBestSellers();
		Assert.assertEquals(actualHeaderInBestSellersPage,
				product.bestSellersPageHeader);
		log.info("'BEST SELLERS' page is displayed");

		String actualHeaderInPromDressesPage = landing.clickingOnPromDresses();
		Assert.assertEquals(actualHeaderInPromDressesPage,
				product.promDressesPageHeader);
		log.info("'PROM DRESSES' page is displayed");

		String actualHeaderInFormalDressesPage = landing
				.clickingOnFormalDresses();
		Assert.assertEquals(actualHeaderInFormalDressesPage,
				product.formalDressesPageHeader);
		log.info("'FORMAL DRESSES' page is displayed");

		String actualHeaderInDressesByEventPage = landing
				.clickingOnDressesByEvent();
		Assert.assertEquals(actualHeaderInDressesByEventPage,
				product.dressesByEventPageHeader);
		log.info("'DRESSES BY EVENT' page is displayed");

		String actualHeaderInSalePage = landing.clickingOnSale();
		Assert.assertEquals(actualHeaderInSalePage, product.salePageHeader);
		log.info("'SALE' page is displayed");

		String actualHeaderInGlamandGownsPage = landing
				.clickingOnGlamAndGowns();
		Assert.assertEquals(actualHeaderInGlamandGownsPage,
				product.glamAndGownsPageTitle);

		log.info("verifyTheMainHeadersPresentInUKSite test executed successfully");
	}

	@AfterClass
	public void tearDown() {
		endTest();
	}

}
