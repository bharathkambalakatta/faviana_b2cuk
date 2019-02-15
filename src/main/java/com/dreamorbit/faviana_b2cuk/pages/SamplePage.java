/* Project		: Faviana B2C UK
 * Author		: Bharath Kambalakatta
 * Created Date	: 1-Nov-2018
 * Reviewer		:
 */

package com.dreamorbit.faviana_b2cuk.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dreamorbit.faviana_b2cuk.testbase.TestBase;

public class SamplePage extends TestBase {

	public static final Logger log = Logger
			.getLogger(SamplePage.class.getName());
	
	public String text = "";

	@FindBy(xpath = "")
	WebElement message;
	
	@FindBy(xpath = "")
	WebElement button;
	
	public SamplePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String assertMethod() {
		return message.getText();
	}
	
	public void method(){
		button.click();
		log.info("");
	}
}
