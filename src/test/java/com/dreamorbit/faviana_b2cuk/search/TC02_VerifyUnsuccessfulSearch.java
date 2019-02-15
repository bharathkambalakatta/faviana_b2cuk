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

public class TC02_VerifyUnsuccessfulSearch extends TestBase {

	public static final Logger log = Logger
			.getLogger(TC02_VerifyUnsuccessfulSearch.class.getName());

	LandingPage landing;
	ProductPage product;

	public TC02_VerifyUnsuccessfulSearch() {
		super();
	}

	@BeforeClass
	public void setUp() {
		initializeBrowser();
		landing = new LandingPage();
		product = new ProductPage();
	}

	@Test
	public void verifyUnsuccessfulSearch() {
		landing.searchingForAProductWhichIsNotAvailable();
		product.searchResultNotAvailable();
		log.info("Search returned no results message is displayed on the screen");
	}
	
	@AfterClass
	public void tearDown() {
		endTest();
	}
}
