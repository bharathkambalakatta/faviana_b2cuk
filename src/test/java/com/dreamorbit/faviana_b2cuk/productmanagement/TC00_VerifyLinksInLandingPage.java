/* Project		: Faviana B2C UK
 * Author		: Bharath Kambalakatta
 * Created Date	: 12-Oct-2018
 * Reviewer		:
 */

package com.dreamorbit.faviana_b2cuk.productmanagement;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.dreamorbit.faviana_b2cuk.pages.LandingPage;
import com.dreamorbit.faviana_b2cuk.testbase.TestBase;

public class TC00_VerifyLinksInLandingPage extends TestBase {

	public static final Logger log = Logger
			.getLogger(TC00_VerifyLinksInLandingPage.class.getName());

	LandingPage landing;

	public TC00_VerifyLinksInLandingPage() {
		super();
	}

	@BeforeClass
	public void setUp() {
		initializeBrowser();
		landing = new LandingPage();
	}

	@Test
	public void verifyBrokenLinks() {
		log.info("verifyBrokenLinks test execution started");
		landing.linksInThePage();
		log.info("Verified if all the links present in Home|Landing Page are active or broken");
		log.info("verifyBrokenLinks test executed successfully");
	}

	@AfterClass
	public void tearDown() {
		endTest();
	}
}
