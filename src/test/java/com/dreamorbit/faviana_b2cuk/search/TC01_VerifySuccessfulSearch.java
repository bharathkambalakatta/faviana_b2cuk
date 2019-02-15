/* Project		: Faviana B2C UK
 * Author		: Bharath Kambalakatta
 * Created Date	: 26-Oct-2018
 * Reviewer		:
 */

package com.dreamorbit.faviana_b2cuk.search;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.dreamorbit.faviana_b2cuk.pages.LandingPage;
import com.dreamorbit.faviana_b2cuk.pages.ProductPage;
import com.dreamorbit.faviana_b2cuk.testbase.TestBase;

public class TC01_VerifySuccessfulSearch extends TestBase {

	public static final Logger log = Logger
			.getLogger(TC01_VerifySuccessfulSearch.class.getName());

	LandingPage landing;
	ProductPage product;

	public TC01_VerifySuccessfulSearch() {
		super();
	}

	@BeforeClass
	public void setUp() {
		initializeBrowser();
		landing = new LandingPage();
		product = new ProductPage();
	}

	@Test
	public void verifySuccessfulSearch() {
		landing.searchingForAProduct();
		product.searchResult();
		log.info("Searched product has been displayed on the screen");
	}

	@AfterClass
	public void tearDown() {
		 endTest();
	}
}
