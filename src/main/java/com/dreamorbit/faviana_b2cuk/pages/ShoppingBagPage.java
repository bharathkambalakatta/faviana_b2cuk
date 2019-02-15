package com.dreamorbit.faviana_b2cuk.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dreamorbit.faviana_b2cuk.testbase.TestBase;

public class ShoppingBagPage extends TestBase {

	public static final Logger log = Logger.getLogger(ShoppingBagPage.class
			.getName());

	@FindBy(xpath = "//td[@class='col STYLE NUMBER']//a[text()='FAVIANA S10164']")
	WebElement favianaS10164Product;

	public ShoppingBagPage() {
		PageFactory.initElements(driver, this);
	}

	public void verifyIfTheProductIsDisplayedInShoppingBag() {
		favianaS10164Product.isDisplayed();
		log.info("FAVIANA 7850 product is present in Shopping Bag");
	}

}
