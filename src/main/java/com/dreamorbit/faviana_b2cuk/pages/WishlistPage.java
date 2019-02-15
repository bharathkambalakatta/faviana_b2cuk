package com.dreamorbit.faviana_b2cuk.pages;

import java.util.Iterator;
import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dreamorbit.faviana_b2cuk.testbase.TestBase;

public class WishlistPage extends TestBase{

	public static final Logger log = Logger.getLogger(WishlistPage.class
			.getName());
	
	public String facebookSiteTitle = "Facebook";
	public String twitterSiteTitle = "Share a link on Twitter";
	public String pinitSiteTitle = "Pinterest";
	
	@FindBy(xpath = "//h1[@class='wish-title']//span")
	WebElement wishlistHeaderAtTop;
	
	@FindBy(xpath = "//a[contains(text(),'FAVIANA S10164')]")
	WebElement favianaS10164Product;
	
	@FindBy(xpath = "//a[contains(text(),'FAVIANA S10164')]/parent::h3/following-sibling::a/span[contains(text(),'Remove from Wish List')]")
	WebElement removeFromWishlistForFavianaS10164Product;
	
	@FindBy(xpath = "//div[@class='wish-meta']/ul/li[1]")
	WebElement facebookIcon;
	
	@FindBy(xpath = "//div[@class='wish-meta']/ul/li[2]")
	WebElement twitterIcon;
	
	@FindBy(xpath = "//div[@class='wish-meta']/ul/li[3]")
	WebElement pinitIcon;
	
	public WishlistPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void verifyIfWishlistPageIsDisplayed() {
		wishlistHeaderAtTop.isDisplayed();
		log.info("Wishlist header is displayed at the top of the page");
	}
	
	public void verifyIfProductIsDisplayedInWishlist(){
		favianaS10164Product.isDisplayed();
		log.info("Faviana S10164 Product is displayed in Wishlist page");
	}
	
	public void removingProductFromWishlist(){
		removeFromWishlistForFavianaS10164Product.click();
		log.info("Faviana S10164 Product has been removed from Wishlist");
	}
	
	public String verifyingIfFacebookPageIsDisplayed(){
		facebookIcon.click();
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> itr = windowHandles.iterator();
		String parentWindow = itr.next();
		String childWindow = itr.next();
		driver.switchTo().window(childWindow);
		String title = driver.getTitle();
		log.info("Facebook page is successfully displayed when opened using the icon present in Wishlist page");
		driver.close();
		driver.switchTo().window(parentWindow);
		return title;
			}
	
	public String verifyingIfTwitterPageIsDisplayed(){
		twitterIcon.click();
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> itr = windowHandles.iterator();
		String parentWindow = itr.next();
		String childWindow = itr.next();
		driver.switchTo().window(childWindow);
		String title = driver.getTitle();
		log.info("Twitter page is successfully displayed when opened using the icon present in Wishlist page");
		driver.close();
		driver.switchTo().window(parentWindow);
		return title;
	}
	
	public String verifyingIfPinItPageIsDisplayed(){
		pinitIcon.click();
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> itr = windowHandles.iterator();
		String parentWindow = itr.next();
		String childWindow = itr.next();
		driver.switchTo().window(childWindow);
		String title = driver.getTitle();
		log.info("Pin It page is successfully displayed when opened using the icon present in Wishlist page");
		driver.close();
		driver.switchTo().window(parentWindow);
		return title;
	}
}
