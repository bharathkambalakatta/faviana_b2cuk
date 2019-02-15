/* Project		: Faviana B2C UK
 * Author		: Bharath Kambalakatta
 * Created Date	: 23-Oct-2018
 * Reviewer		:
 */

package com.dreamorbit.faviana_b2cuk.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.dreamorbit.faviana_b2cuk.testbase.TestBase;

public class ProductDetailsPage extends TestBase {

	public static final Logger log = Logger
			.getLogger(ProductDetailsPage.class.getName());
	
	public String textAfterAddingAProductToWishList = "FAVIANA S10164 has been added to your Wish List!!. To view your wishlist Click here";
	
	@FindBy(xpath = "//div[@option-label='Black']")
	WebElement blackColorOption;

	@FindBy(xpath = "//div[@class='styledSelect active selectsize']")
	WebElement sizeDropdown;

	@FindBy(xpath = "//li[text()='00']")
	WebElement size00DropdDownValue;

	@FindBy(xpath = "//span[contains(text(),'Add To Shopping Bag')]")
	WebElement addToShoppingBagButton;

	@FindBy(xpath = "//a[text()='CHECKOUT']")
	WebElement checkoutButtonInAddToShoppingBagNotificationPopUp;
	
	@FindBy(xpath = "//span[contains(text(),'Add to Wish List')]")
	WebElement addToWishlistButton;
	
	@FindBy(xpath = "//div[contains(text(),'has been added to your Wish List!!. To view your wishlist')]")
	WebElement messageAfterAddingAProductToWishlist;
	
	@FindBy(xpath = "//a[contains(text(),'Click here')]")
	WebElement clickhereLinkDisplayedAfterAddingAProductToWisList;
	
	@FindBy(xpath = "//span[@id='color_valid']")
	WebElement selectAColorMessage;

	@FindBy(xpath = "//span[@id='size_valid']")
	WebElement selectASizeMessage;
	
	@FindBy(xpath = "//div[@class='modal-close-success-popup']")
	WebElement closeInAddToShoppingBagNotificationPopUp;
	
	public ProductDetailsPage() {
		PageFactory.initElements(driver, this);
	}

	public void addingAProductToShoppingBag() {
		blackColorOption.click();
		sizeDropdown.click();
		size00DropdDownValue.click();
		addToShoppingBagButton.click();
		log.info("User has selected color and size and clicked on 'ADD TO SHOPPING BAG' button");
	}
	
	public void clickingOnCheckoutButtonPresentInAddToShoppingBagNotificationPopup(){
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions
				.visibilityOf(checkoutButtonInAddToShoppingBagNotificationPopUp));
		checkoutButtonInAddToShoppingBagNotificationPopUp.click();
		log.info("User has clicked on 'CHECKOUT' button present in ADD TO SHOPPING BAG notification popup");
	}
	
	public void addingAProductToWishlist(){
		addToWishlistButton.click();
		log.info("User has clicked on 'ADD TO WISHLIST' button");
	}
	
	public String messageDisplayedAfterAddingAProductToWishlist(){
		return messageAfterAddingAProductToWishlist.getText();
	}
	
	public void clickOnClickhereLinkDisplayedAfterAddingAProductToWisList(){
		clickhereLinkDisplayedAfterAddingAProductToWisList.click();
		log.info("User has clicked on 'Click here' link displayed after adding a product to Wishlist ");
	}
	
	public void verifyMessageDisplayedWhenColorAndSizeAreNotSelected() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions
				.visibilityOf(blackColorOption));
		addToShoppingBagButton.click();
		log.info("User has clicked on 'ADD TO SHOPPING BAG' button without selecting color and size");
		selectAColorMessage.isDisplayed();
		log.info("'Select a color' message is displayed");
		selectASizeMessage.isDisplayed();
		log.info("'Select a size' message is displayed");
	}
	
	public void closingAddToShoppingBagNotificationPopUp(){
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions
				.visibilityOf(closeInAddToShoppingBagNotificationPopUp));
		closeInAddToShoppingBagNotificationPopUp.click();
		log.info("User has clicked on 'X' in Add To Shopping Bag notification popup");
	}
}
