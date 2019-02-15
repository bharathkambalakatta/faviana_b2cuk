/* Project		: Faviana B2C UK
 * Author		: Bharath Kambalakatta
 * Created Date	: 23-Oct-2018
 * Reviewer		:
 */

package com.dreamorbit.faviana_b2cuk.pages;

import java.util.Random;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.dreamorbit.faviana_b2cuk.testbase.TestBase;

public class CheckoutPage extends TestBase {

	public static final Logger log = Logger
			.getLogger(CheckoutPage.class.getName());
	
	@FindBy(xpath = "//input[@id='customer-email']")
	WebElement emailAddressTextBox;

	@FindBy(xpath = "//select[@name='country_id']")
	WebElement countryDropDown;

	@FindBy(name = "firstname")
	WebElement firstNameTextBox;

	@FindBy(name = "lastname")
	WebElement lastNameTextBox;

	@FindBy(name = "company")
	WebElement companyTextBox;

	@FindBy(name = "city")
	WebElement cityTextBox;

	@FindBy(name = "street[0]")
	WebElement streetAddress1TextBox;

	@FindBy(name = "street[1]")
	WebElement streetAddress2TextBox;

	@FindBy(xpath = "//select[@name='region_id']")
	WebElement stateProvinceDropDown;

	@FindBy(name = "postcode")
	WebElement zipPostalCodeTextBox;

	@FindBy(name = "telephone")
	WebElement phoneNumberTextBox;

	@FindBy(xpath = "//table[@class='table-checkout-shipping-method']/tbody/tr[1]/td[1]")
	WebElement shippingMethodRadioButton;

	@FindBy(xpath = "//span[text()='Credit Card']/parent::label/parent::div/input")
	WebElement creditCardRadioButton;

	@FindBy(xpath = "//input[@id='authorizenet_directpost_cc_number']")
	WebElement creditCardNumberTextBox;

	@FindBy(xpath = "//select[@id='authorizenet_directpost_expiration']")
	WebElement expirationDateMonthDropDown;

	@FindBy(xpath = "//select[@id='authorizenet_directpost_expiration_yr']")
	WebElement expirationDateYearDropDown;

	@FindBy(xpath = "//input[@id='authorizenet_directpost_cc_cid']")
	WebElement cvvTextBox;

	@FindBy(xpath = "//input[@id='billing-address-same-as-shipping-authorizenet_directpost']")
	WebElement myBillingAndShippingAddressAreSameCheckBox;

	@FindBy(xpath = "//input[@id='cashondelivery']")
	WebElement cashOnDeliveryRadioButton;

	@FindBy(xpath = "//span[text()='Place Order']")
	WebElement placeOrderButton;

	@FindBy(xpath = "//button[@id='continue-to-confirm']")
	WebElement continueToConfirmButton;

	@FindBy(xpath = "//button[@id='confirm']")
	WebElement confirmButton;
	
	@FindBy(className = "thanks-box")
	WebElement thankYouMessageDisplay;
	
	@FindBy (xpath = "//label[@for='paypal_express']")
	WebElement payPalRadioButton;
	
	@FindBy (xpath = "//button/span[text()='Continue to PayPal']")
	WebElement continueToPayPalButton;

	public CheckoutPage() {
		PageFactory.initElements(driver, this);
	}

	public void enteringDetailsInShippingSection(String country, String firstname,
			String lastname, String streetaddress1, String streetaddress2,
			String city, String stateprovince, String zippostalcode,
			String phonenumber, String emailaddress) {
		Select select = new Select(countryDropDown);
		select.selectByValue(country);
		firstNameTextBox.sendKeys(firstname);
		lastNameTextBox.sendKeys(lastname);
		streetAddress1TextBox.sendKeys(streetaddress1);
		streetAddress2TextBox.sendKeys(streetaddress2);
		cityTextBox.sendKeys(city);
		stateProvinceDropDown.sendKeys(stateprovince);
		zipPostalCodeTextBox.sendKeys(zippostalcode);
		phoneNumberTextBox.sendKeys(phonenumber);
		Random randomGenerator = new Random();  
		int randomInt = randomGenerator.nextInt(999999);  
		emailAddressTextBox.sendKeys(emailaddress + randomInt +"@TEST.COM");
		log.info("User details has been entered in 'SHIPPING' section");
		shippingMethodRadioButton.isDisplayed();
		shippingMethodRadioButton.click();
		log.info("User has clicked on 'CONTINUE' button present in 'SHIPPING' section");
	}

	public void enteringDetailsInBillingSection(String creditcardnumber,
			String expirationmonth, String expirationyear, String cvv)
			throws InterruptedException {
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", creditCardRadioButton);
		Thread.sleep(3000);
		log.info("User has selected 'Credit Card' option in 'BILLING' section");
		creditCardNumberTextBox.sendKeys(creditcardnumber);
		Select select1 = new Select(expirationDateMonthDropDown);
		select1.selectByValue(expirationmonth);
		Select select2 = new Select(expirationDateYearDropDown);
		select2.selectByValue(expirationyear);
		cvvTextBox.sendKeys(cvv);
		log.info("Credit card details has been entered");
		myBillingAndShippingAddressAreSameCheckBox.click();
		log.info("'My billing and shipping address are the same' checkbox has been selected");
		continueToConfirmButton.click();
		log.info("User has clicked on 'CONTINUE' button in 'BILLING' section");
		}

	public void enteringDetailsInReviewSection() throws InterruptedException {
		Thread.sleep(5000);
		confirmButton.click();
		log.info("User has clicked on 'CONFIRM' button in 'REVIEW' section");
	}

	public void orderUsingCashOnDeliveryOptionInBillingSection() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", cashOnDeliveryRadioButton);
		log.info("User has selected 'Cash On Delivery' option in 'BILLING' section");
		js.executeScript("arguments[0].click();",
				myBillingAndShippingAddressAreSameCheckBox);
		log.info("'My billing and shipping address are the same' checkbox has been selected");
		js.executeScript("arguments[0].click();", placeOrderButton);
		log.info("User has clicked on 'PLACE ORDER' button");
		thankYouMessageDisplay.isDisplayed();
		log.info("'THANK YOU!' page is displayed");
	}
	
	public void orderUsingPayPalOptionInPaymentMethodsSection() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver,15);
		wait.until(ExpectedConditions.visibilityOf(payPalRadioButton));
		Thread.sleep(10000);
		payPalRadioButton.click();
		log.info("User has selected 'PayPal' radio button in PAYMENT METHODS section");
		continueToPayPalButton.click();
		log.info("User has clicked on 'CONTINUE TO PAYPAL' button");
//		thankYouMessageDisplay.isDisplayed();
//		log.info("'THANK YOU!' page is displayed");
	}
}
