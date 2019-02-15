/* Project		: Faviana B2C UK
 * Author		: Bharath Kambalakatta
 * Created Date	: 18-Oct-2018
 * Reviewer		:
 */

package com.dreamorbit.faviana_b2cuk.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dreamorbit.faviana_b2cuk.testbase.TestBase;

public class MyDashboardPage extends TestBase{
	
	public static final Logger log = Logger
			.getLogger(MyDashboardPage.class.getName());
	
	public String textAfterSuccessfulRegistration = "Thank you for registering with Faviana.";

	@FindBy(xpath = "//div[text()='Thank you for registering with Faviana.']")
	WebElement messageAfterSuccessfulRegistration;
	
	@FindBy(xpath = "//span[@class='faviana-sprite']")
	WebElement wishlistIcon;
	
	public MyDashboardPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String successfulRegistration() {
		return messageAfterSuccessfulRegistration.getText();
	}
	
	public void clickingOnWishlistIcon(){
		wishlistIcon.click();
		log.info("User has clicked on 'Wishlist' icon present at the right top");
	}
}
