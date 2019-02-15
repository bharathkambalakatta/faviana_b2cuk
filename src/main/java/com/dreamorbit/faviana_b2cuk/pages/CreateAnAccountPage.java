/* Project		: Faviana B2C UK
 * Author		: Bharath Kambalakatta
 * Created Date	: 22-Oct-2018
 * Reviewer		:
 */

package com.dreamorbit.faviana_b2cuk.pages;

import java.util.Random;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dreamorbit.faviana_b2cuk.testbase.TestBase;

public class CreateAnAccountPage extends TestBase{
	
	public static final Logger log = Logger
			.getLogger(CreateAnAccountPage.class.getName());
	
	LoginPage login = new LoginPage();

	@FindBy(xpath = "//input[@id='firstname']")
	WebElement firstNameTextBox;
	
	@FindBy(xpath = "//input[@id='lastname']")
	WebElement lastNameTextBox;
	
	@FindBy(xpath = "//input[@id='email_address']")
	WebElement emailTextBox;
	
	@FindBy(xpath = "//input[@id='password']")
	WebElement passwordTextBox;
	
	@FindBy(xpath = "//input[@id='password-confirmation']")
	WebElement confirmPasswordTextBox;
	
	@FindBy(xpath = "//label[@for='is_subscribed']/preceding-sibling::input")
	WebElement signUpForNewsletter;
	
	@FindBy(xpath = "//button[@title='Create an Account']")
	WebElement createAnAccountButton;

	public CreateAnAccountPage() {
		PageFactory.initElements(driver, this);
	}

	public void creatingANewAccount(String firstname, String lastname, String email, String password, String confirmpassword) {
		login.clickingOnclickHereToRegisterLink();
		firstNameTextBox.sendKeys(firstname);
		log.info("User has entered 'First Name'");
		lastNameTextBox.sendKeys(lastname);
		log.info("User has entered 'Last Name'");
		Random randomGenerator = new Random();  
		int randomInt = randomGenerator.nextInt(999999);  
		emailTextBox.sendKeys(email + randomInt +"@TEST.COM");
		log.info("User has entered 'Email'");
		passwordTextBox.sendKeys(password);
		log.info("User has entered 'Password'");
		confirmPasswordTextBox.sendKeys(confirmpassword);
		log.info("User has entered Password again in 'Confirm Password'");
		signUpForNewsletter.click();
		log.info("User has unselected 'Sign Up for Newsletter'");
		createAnAccountButton.click();
		log.info("User has clicked on 'CREATE AN ACCOUNT' button");
	}
}
