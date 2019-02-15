/* Project		: Faviana B2C UK
 * Author		: Bharath Kambalakatta
 * Created Date	: 1-Nov-2018
 * Reviewer		:
 */

package com.dreamorbit.faviana_b2cuk.customermanagement;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.dreamorbit.faviana_b2cuk.pages.SamplePage;
import com.dreamorbit.faviana_b2cuk.testbase.TestBase;

public class TC00_Sample extends TestBase {

	public static final Logger log = Logger
			.getLogger(TC00_Sample.class.getName());

	SamplePage sample;

	public TC00_Sample() {
		super();
	}

	@BeforeClass
	public void setUp() {
		initializeBrowser();
		sample = new SamplePage();
	}

	@Test
	public void sample() {
		log.info("sample test execution started");
		sample.method();
		String actualTitle = sample.assertMethod();
		Assert.assertEquals(actualTitle, sample.text);
		log.info("sample test executed successfully");
	}

	@AfterClass
	public void tearDown() {
		endTest();
	}

}
