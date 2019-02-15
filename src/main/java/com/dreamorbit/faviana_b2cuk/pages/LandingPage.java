/* Project		: Faviana B2C UK
 * Author		: Bharath Kambalakatta
 * Created Date	: 12-Oct-2018
 * Reviewer		:
 */

package com.dreamorbit.faviana_b2cuk.pages;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.dreamorbit.faviana_b2cuk.testbase.TestBase;
import com.dreamorbit.faviana_b2cuk.testutils.BrokenLinks;

public class LandingPage extends TestBase {

	public static final Logger log = Logger.getLogger(LandingPage.class
			.getName());

	ProductPage product = new ProductPage();

	public String applicationTitle = "Designer Dresses by Faviana New York | Faviana";

	// @FindBy(id = "ltkmodal-contentarea")
	// List<WebElement> popUpDisplayedDuringLaunch;

	// @FindBy(id = "ltk-close-button")
	// WebElement closeButtonInPopUpDisplayedDuringLaunch;

	@FindBy(xpath = "//a[contains(text(),'Login')]")
	// div[@class='top-right hidden-xs']
	WebElement loginMenuPresentAtRightTop;

	@FindBy(tagName = "a")
	List<WebElement> allLinksPresent;

	// Web Elements - Main Categories
	@FindBy(xpath = "//a[@class='menu_a mobilePreventURL'][contains(text(),'BEST SELLERS')]")
	WebElement bestSellersMainCategory;

	@FindBy(xpath = "//a[@class='menu_a mobilePreventURL'][contains(text(),'PROM DRESSES')]")
	WebElement promDressesMainCategory;

	@FindBy(xpath = "//a[@class='menu_a mobilePreventURL'][contains(text(),'FORMAL DRESSES')]")
	WebElement formalDressesMainCategory;

	@FindBy(xpath = "//a[@class='menu_a mobilePreventURL'][contains(text(),'DRESSES BY EVENT')]")
	WebElement dressesByEventMainCategory;

	@FindBy(xpath = "//a[@class='menu_a mobilePreventURL'][contains(text(),'SALE')]")
	WebElement saleMainCategory;

	@FindBy(xpath = "//a[@class='menu_a mobilePreventURL'][contains(text(),'GLAM & GOWNS')]")
	WebElement glamAndGownsMainCategory;

	// Web Elements - PROM DRESSES - BY COLOR - Sub Categories
	@FindBy(xpath = "//a[contains(text(),'Black Prom Dresses')]")
	WebElement blackPromDressesSubCategory;

	@FindBy(xpath = "//a[contains(text(),'Blue Prom Dresses')]")
	WebElement bluePromDressesSubCategory;

	@FindBy(xpath = "//a[contains(text(),'Burgundy Prom Dresses')]")
	WebElement burgundyPromDressesSubCategory;

	@FindBy(xpath = "//a[contains(text(),'Gold Prom Dresses')]")
	WebElement goldPromDressesSubCategory;

	@FindBy(xpath = "//a[contains(text(),'Green Prom Dresses')]")
	WebElement greenPromDressesSubCategory;

	@FindBy(xpath = "//a[contains(text(),'Pink Prom Dresses')]")
	WebElement pinkPromDressesSubCategory;

	@FindBy(xpath = "//a[contains(text(),'Purple Prom Dresses')]")
	WebElement purplePromDressesSubCategory;

	@FindBy(xpath = "//a[contains(text(),'Red Prom Dresses')]")
	WebElement redPromDressesSubCategory;

	@FindBy(xpath = "//a[contains(text(),'White Prom Dresses')]")
	WebElement whitePromDressesSubCategory;

	@FindBy(xpath = "//header[@class='header']//ul//li[10]//a[1]")
	WebElement viewAllSubCategoryUnderPromDressesByColor;

	// Web Elements - PROM DRESSES - BY SYLE - Sub Categories
	@FindBy(xpath = "//a[contains(text(),'Long Prom Dresses')]")
	WebElement longPromDressesSubCategory;

	@FindBy(xpath = "//a[contains(text(),'Mermaid Prom Dresses')]")
	WebElement mermaidPromDressesSubCategory;

	@FindBy(xpath = "//a[contains(text(),'Off Shoulder Prom Dresses')]")
	WebElement offShoulderPromDressesSubCategory;

	@FindBy(xpath = "//a[contains(text(),'Plus Size Prom Dresses')]")
	WebElement plusSizePromDressesSubCategory;

	@FindBy(xpath = "//a[contains(text(),'Prom Dresses with Choker')]")
	WebElement promDressesWithChokerSubCategory;

	@FindBy(xpath = "//a[contains(text(),'Short Prom Dresses')]")
	WebElement shortPromDressesSubCategory;

	@FindBy(xpath = "//a[contains(text(),'Two-Piece Prom Dresses')]")
	WebElement twoPiecePromDressesSubCategory;

	@FindBy(xpath = "//ul//li[2]//div[1]//div[1]//div[1]//div[3]//ul[1]//li[8]//a[1]")
	WebElement viewAllSubCategoryUnderPromDressesByStyle;

	// Web Elements - DRESSES BY EVENT - BY EVENT - Sub Categories
	@FindBy(xpath = "//a[contains(text(),'Cocktail Dresses')]")
	WebElement cocktailDressesSubCategory;

	@FindBy(xpath = "//a[contains(text(),'Graduation Dresses')]")
	WebElement graduationDressesSubCategory;

	@FindBy(xpath = "//a[contains(text(),'Holiday Dresses')]")
	WebElement holidayDressesSubCategory;

	@FindBy(xpath = "//a[contains(text(),'Homecoming Dresses')]")
	WebElement homecomingDressesSubCategory;

	@FindBy(xpath = "//a[contains(text(),'New Year')]")
	WebElement newYearEveDressesSubCategory;

	@FindBy(xpath = "//a[contains(text(),'Pageant Dresses')]")
	WebElement pageantDressesSubCategory;

	@FindBy(xpath = "//a[contains(text(),'Party & Club Dresses')]")
	WebElement partyAndClubDressesSubCategory;

	@FindBy(xpath = "//a[contains(text(),'Sweet 16 Dresses')]")
	WebElement sweet16DressesSubCategory;

	@FindBy(xpath = "//ul//li[4]//div[1]//div[1]//div[1]//div[2]//ul[1]//li[9]//a[1]")
	WebElement viewAllSubCategoryUnderDressesByEventByEvent;

	// Web Elements - DRESSES BY EVENT - WEDDING DRESSES - Sub Categories
	@FindBy(xpath = "//a[contains(text(),'Bachelorette Party Dresses')]")
	WebElement bachelorettePartyDressesSubCategory;

	@FindBy(xpath = "//a[contains(text(),'Bridal Dresses')]")
	WebElement bridalDressesSubCategory;

	@FindBy(xpath = "//a[contains(text(),'Bridal Shower Dresses')]")
	WebElement bridalShowerDressesSubCategory;

	@FindBy(xpath = "//a[contains(text(),'Bridesmaid Dresses')]")
	WebElement bridesmaidDressesSubCategory;

	@FindBy(xpath = "//a[contains(text(),'Mother of the Bride Dresses')]")
	WebElement motherOfTheBrideDressesSubCategory;

	@FindBy(xpath = "//a[contains(text(),'Reception Dresses')]")
	WebElement receptionDressesSubCategory;

	@FindBy(xpath = "//a[contains(text(),'Rehearsal Dinner Dresses')]")
	WebElement rehearsalDinnerDressesSubCategory;

	@FindBy(xpath = "//a[contains(text(),'Wedding Guest Dresses')]")
	WebElement weddingGuestDressesSubCategory;

	@FindBy(xpath = "//div[@class='sub-left pull-left']//div[3]//ul[1]//li[9]//a[1]")
	WebElement viewAllSubCategoryUnderDressesByEventWeddingDresses;

	@FindBy(xpath = "//span[@class='faviana-sprite header-search-icon']")
	WebElement searchIcon;

	@FindBy(xpath = "//input[@id='search']")
	WebElement searchTextBox;

	@FindBy(xpath = "//button[@title='Go']")
	WebElement goButton;

	@FindBy(xpath = "//span[@class='faviana-sprite']")
	WebElement wishlistIcon;

	@FindBy(xpath = "//span[@class='faviana-sprite mini-cart-icon']")
	WebElement shoppingBagIcon;

	@FindBy(xpath = "//span[contains(text(),'Your Shopping Bag')]")
	WebElement yourShoppingBagLink;

	public LandingPage() {
		PageFactory.initElements(driver, this);
	}

	// public void closePopUpDisplayedDuringLaunch() {
	// if (popUpDisplayedDuringLaunch.size() != 0) {
	// closeButtonInPopUpDisplayedDuringLaunch.click();
	// }
	// }

	public String successfulApplicationLaunch() {
		return driver.getTitle();
	}

	public void linksInThePage() {
		int linksCount = allLinksPresent.size();
		System.out.println("Total links present in the page: " + linksCount);
		for (int i = 0; i < linksCount; i++) {
			WebElement elements = allLinksPresent.get(i);
			String url = elements.getAttribute("href");
			BrokenLinks.verifyLinkActiveOrNot(url);
		}
	}

	public void verifyingMainCategories() {
		bestSellersMainCategory.isDisplayed();
		promDressesMainCategory.isDisplayed();
		formalDressesMainCategory.isDisplayed();
		dressesByEventMainCategory.isDisplayed();
		saleMainCategory.isDisplayed();
		glamAndGownsMainCategory.isDisplayed();
		log.info("All the main categories are present");
	}

	public void verifyingSubCategoriesUnderPromDressesByColor() {
		blackPromDressesSubCategory.isDisplayed();
		bluePromDressesSubCategory.isDisplayed();
		burgundyPromDressesSubCategory.isDisplayed();
		goldPromDressesSubCategory.isDisplayed();
		greenPromDressesSubCategory.isDisplayed();
		pinkPromDressesSubCategory.isDisplayed();
		purplePromDressesSubCategory.isDisplayed();
		redPromDressesSubCategory.isDisplayed();
		whitePromDressesSubCategory.isDisplayed();
		viewAllSubCategoryUnderPromDressesByColor.isDisplayed();
		log.info("All the sub categories are present under PROM DRESSES - BY COLOR");
	}

	public void verifyingSubCategoriesUnderPromDressesByStyle() {
		longPromDressesSubCategory.isDisplayed();
		mermaidPromDressesSubCategory.isDisplayed();
		offShoulderPromDressesSubCategory.isDisplayed();
		plusSizePromDressesSubCategory.isDisplayed();
		promDressesWithChokerSubCategory.isDisplayed();
		shortPromDressesSubCategory.isDisplayed();
		twoPiecePromDressesSubCategory.isDisplayed();
		viewAllSubCategoryUnderPromDressesByStyle.isDisplayed();
		log.info("All the sub categories are present under PROM DRESSES - BY STYLE");
	}

	public void verifyingSubCategoriesUnderDressesByEventByEvent() {
		cocktailDressesSubCategory.isDisplayed();
		graduationDressesSubCategory.isDisplayed();
		holidayDressesSubCategory.isDisplayed();
		homecomingDressesSubCategory.isDisplayed();
		newYearEveDressesSubCategory.isDisplayed();
		pageantDressesSubCategory.isDisplayed();
		partyAndClubDressesSubCategory.isDisplayed();
		sweet16DressesSubCategory.isDisplayed();
		viewAllSubCategoryUnderDressesByEventByEvent.isDisplayed();
		log.info("All the sub categories are present under DRESSES BY EVENT - BY STYLE");
	}

	public void verifyingSubCategoriesUnderDressesByEventWeddingDresses() {
		bachelorettePartyDressesSubCategory.isDisplayed();
		bridalDressesSubCategory.isDisplayed();
		bridalShowerDressesSubCategory.isDisplayed();
		bridesmaidDressesSubCategory.isDisplayed();
		motherOfTheBrideDressesSubCategory.isDisplayed();
		receptionDressesSubCategory.isDisplayed();
		rehearsalDinnerDressesSubCategory.isDisplayed();
		weddingGuestDressesSubCategory.isDisplayed();
		viewAllSubCategoryUnderDressesByEventWeddingDresses.isDisplayed();
		log.info("All the sub categories are present under DRESSES BY EVENT - WEDDING DRESSES");
	}

	// Methods to click on each Main Categories
	public String clickingOnBestSellers() {
		bestSellersMainCategory.click();
		log.info("User has clicked on 'BEST SELLERS' category");
		String headerInBestSellersPage = product.bestSellersHeader.getText();
		return headerInBestSellersPage;
	}

	public String clickingOnPromDresses() {
		promDressesMainCategory.click();
		log.info("User has clicked on 'PROM DRESSES' category");
		String headerInPromDressesPage = product.promDressesHeader.getText();
		return headerInPromDressesPage;
	}

	public String clickingOnFormalDresses() {
		formalDressesMainCategory.click();
		log.info("User has clicked on 'FORMAL DRESSES' category");
		String headerInFormalDressesPage = product.formalDressesHeader
				.getText();
		return headerInFormalDressesPage;
	}

	public String clickingOnDressesByEvent() {
		dressesByEventMainCategory.click();
		log.info("User has clicked on 'DRESSES BY EVENT' category");
		String headerInDressesByEventPage = product.dressesByEventHeader
				.getText();
		return headerInDressesByEventPage;
	}

	public String clickingOnSale() {
		saleMainCategory.click();
		log.info("User has clicked on 'SALE' category");
		String headerInSalePage = product.saleHeader.getText();
		return headerInSalePage;
	}

	public String clickingOnGlamAndGowns() throws InterruptedException {
		glamAndGownsMainCategory.click();
		Thread.sleep(3000);
		log.info("User has clicked on 'GLAM & GOWNS' category");
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> itr = windowHandles.iterator();
		String parentWindow = itr.next();
		String childWindow = itr.next();
		driver.switchTo().window(childWindow);
		String title = driver.getTitle();
		driver.switchTo().window(parentWindow);
		return title;
	}

	// Methods to click on each Sub Categories present under PROM DRESSES - BY
	// COLOR
	public String clickingOnBlackPromDressesPresentUnderPromDressesByColor() {
		Actions action = new Actions(driver);
		action.moveToElement(promDressesMainCategory).build().perform();
		blackPromDressesSubCategory.click();
		log.info("User has clicked on 'Black Prom Dresses' present under PROM DRESSES - BY COLOR");
		String headerInBlackPromDressesPage = product.blackPromDressesHeader
				.getText();
		return headerInBlackPromDressesPage;
	}

	public String clickingOnBluePromDressesPresentUnderPromDressesByColor() {
		Actions action = new Actions(driver);
		action.moveToElement(promDressesMainCategory).build().perform();
		bluePromDressesSubCategory.click();
		log.info("User has clicked on 'Blue Prom Dresses' present under PROM DRESSES - BY COLOR");
		String headerInBluePromDressesPage = product.bluePromDressesHeader
				.getText();
		return headerInBluePromDressesPage;
	}

	public String clickingOnBurgundyPromDressesPresentUnderPromDressesByColor() {
		Actions action = new Actions(driver);
		action.moveToElement(promDressesMainCategory).build().perform();
		burgundyPromDressesSubCategory.click();
		log.info("User has clicked on 'Burgundy Prom Dresses' present under PROM DRESSES - BY COLOR");
		String headerInBurgundyPromDressesPage = product.burgundyPromDressesHeader
				.getText();
		return headerInBurgundyPromDressesPage;
	}

	public String clickingOnGoldPromDressesPresentUnderPromDressesByColor() {
		Actions action = new Actions(driver);
		action.moveToElement(promDressesMainCategory).build().perform();
		goldPromDressesSubCategory.click();
		log.info("User has clicked on 'Gold Prom Dresses' present under PROM DRESSES - BY COLOR");
		String headerInGoldPromDressesPage = product.goldPromDressesHeader
				.getText();
		return headerInGoldPromDressesPage;
	}

	public String clickingOnGreenPromDressesPresentUnderPromDressesByColor() {
		Actions action = new Actions(driver);
		action.moveToElement(promDressesMainCategory).build().perform();
		greenPromDressesSubCategory.click();
		log.info("User has clicked on 'Green Prom Dresses' present under PROM DRESSES - BY COLOR");
		String headerInGreenPromDressesPage = product.greenPromDressesHeader
				.getText();
		return headerInGreenPromDressesPage;
	}

	public String clickingOnPinkPromDressesPresentUnderPromDressesByColor() {
		Actions action = new Actions(driver);
		action.moveToElement(promDressesMainCategory).build().perform();
		pinkPromDressesSubCategory.click();
		log.info("User has clicked on 'Pink Prom Dresses' present under PROM DRESSES - BY COLOR");
		String headerInPinkPromDressesPage = product.pinkPromDressesHeader
				.getText();
		return headerInPinkPromDressesPage;
	}

	public String clickingOnPurplePromDressesPresentUnderPromDressesByColor() {
		Actions action = new Actions(driver);
		action.moveToElement(promDressesMainCategory).build().perform();
		purplePromDressesSubCategory.click();
		log.info("User has clicked on 'Purple Prom Dresses' present under PROM DRESSES - BY COLOR");
		String headerInPurplePromDressesPage = product.purplePromDressesHeader
				.getText();
		return headerInPurplePromDressesPage;
	}

	public String clickingOnRedPromDressesPresentUnderPromDressesByColor() {
		Actions action = new Actions(driver);
		action.moveToElement(promDressesMainCategory).build().perform();
		redPromDressesSubCategory.click();
		log.info("User has clicked on 'Red Prom Dresses' present under PROM DRESSES - BY COLOR");
		String headerInRedPromDressesPage = product.redPromDressesHeader
				.getText();
		return headerInRedPromDressesPage;
	}

	public String clickingOnWhitePromDressesPresentUnderPromDressesByColor() {
		Actions action = new Actions(driver);
		action.moveToElement(promDressesMainCategory).build().perform();
		whitePromDressesSubCategory.click();
		log.info("User has clicked on 'White Prom Dresses' present under PROM DRESSES - BY COLOR");
		String headerInWhitePromDressesPage = product.whitePromDressesHeader
				.getText();
		return headerInWhitePromDressesPage;
	}

	public String clickingOnViewAllPresentUnderPromDressesByColor() {
		Actions action = new Actions(driver);
		action.moveToElement(promDressesMainCategory).build().perform();
		viewAllSubCategoryUnderPromDressesByColor.click();
		log.info("User has clicked on 'View All' present under PROM DRESSES - BY COLOR");
		String headerInViewAllPagePromDressesByColor = product.viewAllHeaderPromDressesByColor
				.getText();
		return headerInViewAllPagePromDressesByColor;
	}

	// Methods to click on each Sub Categories present under PROM DRESSES - BY
	// STYLE
	public String clickingOnLongPromDressesPresentUnderPromDressesByStyle() {
		Actions action = new Actions(driver);
		action.moveToElement(promDressesMainCategory).build().perform();
		longPromDressesSubCategory.click();
		log.info("User has clicked on 'Long Prom Dresses' present under PROM DRESSES - BY STYLE");
		String headerInLongPromDressesPage = product.longPromDressesHeader
				.getText();
		return headerInLongPromDressesPage;
	}

	public String clickingOnMermaidPromDressesPresentUnderPromDressesByStyle() {
		Actions action = new Actions(driver);
		action.moveToElement(promDressesMainCategory).build().perform();
		mermaidPromDressesSubCategory.click();
		log.info("User has clicked on 'Mermaid Prom Dresses' present under PROM DRESSES - BY STYLE");
		String headerInMermaidPromDressesPage = product.mermaidPromDressesHeader
				.getText();
		return headerInMermaidPromDressesPage;
	}

	public String clickingOnOffShoulderPromDressesPresentUnderPromDressesByStyle() {
		Actions action = new Actions(driver);
		action.moveToElement(promDressesMainCategory).build().perform();
		offShoulderPromDressesSubCategory.click();
		log.info("User has clicked on 'Off Shoulder Prom Dresses' present under PROM DRESSES - BY STYLE");
		String headerInOffShoulderPromDressesPage = product.offShoulderPromDressesHeader
				.getText();
		return headerInOffShoulderPromDressesPage;
	}

	public String clickingOnPlusSizePromDressesPresentUnderPromDressesByStyle() {
		Actions action = new Actions(driver);
		action.moveToElement(promDressesMainCategory).build().perform();
		plusSizePromDressesSubCategory.click();
		log.info("User has clicked on 'Plus Size Prom Dresses' present under PROM DRESSES - BY STYLE");
		String headerInPlusSizePromDressesPage = product.plusSizePromDressesHeader
				.getText();
		return headerInPlusSizePromDressesPage;
	}

	public String clickingOnPromDressesWithChokerPresentUnderPromDressesByStyle() {
		Actions action = new Actions(driver);
		action.moveToElement(promDressesMainCategory).build().perform();
		promDressesWithChokerSubCategory.click();
		log.info("User has clicked on 'Prom Dresses with Choker' present under PROM DRESSES - BY STYLE");
		String headerInPromDressesWithChokerPage = product.promDressesWithChokerHeader
				.getText();
		return headerInPromDressesWithChokerPage;
	}

	public String clickingOnShortPromDressesPresentUnderPromDressesByStyle() {
		Actions action = new Actions(driver);
		action.moveToElement(promDressesMainCategory).build().perform();
		shortPromDressesSubCategory.click();
		log.info("User has clicked on 'Short Prom Dresses' present under PROM DRESSES - BY STYLE");
		String headerInShortPromDressesPage = product.shortPromDressesHeader
				.getText();
		return headerInShortPromDressesPage;
	}

	public String clickingOnTwoPiecePromDressesPresentUnderPromDressesByStyle() {
		Actions action = new Actions(driver);
		action.moveToElement(promDressesMainCategory).build().perform();
		twoPiecePromDressesSubCategory.click();
		log.info("User has clicked on 'Two-Piece Prom Dresses' present under PROM DRESSES - BY STYLE");
		String headerInTwoPiecePromDressesPage = product.twoPiecePromDressesHeader
				.getText();
		return headerInTwoPiecePromDressesPage;
	}

	public String clickingOnViewAllPresentUnderPromDressesByStyle() {
		Actions action = new Actions(driver);
		action.moveToElement(promDressesMainCategory).build().perform();
		viewAllSubCategoryUnderPromDressesByStyle.click();
		log.info("User has clicked on 'View All' present under PROM DRESSES - BY STYLE");
		String headerInViewAllPagePromDressesByStyle = product.viewAllHeaderPromDressesByStyle
				.getText();
		return headerInViewAllPagePromDressesByStyle;
	}

	// Methods to click on each Sub Categories present under PROM DRESSES - BY
	// STYLE
	public String clickingOnCocktailDressesPresentUnderDressesByEventByEvent() {
		Actions action = new Actions(driver);
		action.moveToElement(dressesByEventMainCategory).build().perform();
		cocktailDressesSubCategory.click();
		log.info("User has clicked on 'Cocktail Dresses' present under DRESSES BY EVENT - BY EVENT");
		String headerInCocktailDressesPage = product.cocktailDressesHeader
				.getText();
		return headerInCocktailDressesPage;
	}

	public String clickingOnGraduationDressesPresentUnderDressesByEventByEvent() {
		Actions action = new Actions(driver);
		action.moveToElement(dressesByEventMainCategory).build().perform();
		graduationDressesSubCategory.click();
		log.info("User has clicked on 'Graduation Dresses' present under DRESSES BY EVENT - BY EVENT");
		String headerInGraduationDressesPage = product.graduationDressesHeader
				.getText();
		return headerInGraduationDressesPage;
	}

	public String clickingOnHolidayDressesPresentUnderDressesByEventByEvent() {
		Actions action = new Actions(driver);
		action.moveToElement(dressesByEventMainCategory).build().perform();
		holidayDressesSubCategory.click();
		log.info("User has clicked on 'Holiday Dresses' present under DRESSES BY EVENT - BY EVENT");
		String headerInHolidayDressesPage = product.holidayDressesHeader
				.getText();
		return headerInHolidayDressesPage;
	}

	public String clickingOnHomecomingDressesPresentUnderDressesByEventByEvent() {
		Actions action = new Actions(driver);
		action.moveToElement(dressesByEventMainCategory).build().perform();
		homecomingDressesSubCategory.click();
		log.info("User has clicked on 'Homecoming Dresses' present under DRESSES BY EVENT - BY EVENT");
		String headerInHomecomingDressesPage = product.homecomingDressesHeader
				.getText();
		return headerInHomecomingDressesPage;
	}

	public String clickingOnNewYearEveDressesPresentUnderDressesByEventByEvent() {
		Actions action = new Actions(driver);
		action.moveToElement(dressesByEventMainCategory).build().perform();
		newYearEveDressesSubCategory.click();
		log.info("User has clicked on 'New Year's Eve Dresses' present under DRESSES BY EVENT - BY EVENT");
		String headerInNewYearEveDressesPage = product.newYearEveDressesHeader
				.getText();
		return headerInNewYearEveDressesPage;
	}

	public String clickingOnPageantDressesPresentUnderDressesByEventByEvent() {
		Actions action = new Actions(driver);
		action.moveToElement(dressesByEventMainCategory).build().perform();
		pageantDressesSubCategory.click();
		log.info("User has clicked on 'Pageant Dresses' present under DRESSES BY EVENT - BY EVENT");
		String headerInPageantDressesPage = product.pageantDressesHeader
				.getText();
		return headerInPageantDressesPage;
	}

	public String clickingOnPartyAndClubDressesPresentUnderDressesByEventByEvent() {
		Actions action = new Actions(driver);
		action.moveToElement(dressesByEventMainCategory).build().perform();
		partyAndClubDressesSubCategory.click();
		log.info("User has clicked on 'Party & Club Dresses' present under DRESSES BY EVENT - BY EVENT");
		String headerInPartyAndClubDressesPage = product.partyAndClubDressesHeader
				.getText();
		return headerInPartyAndClubDressesPage;
	}

	public String clickingOnSweet16DressesPresentUnderDressesByEventByEvent() {
		Actions action = new Actions(driver);
		action.moveToElement(dressesByEventMainCategory).build().perform();
		sweet16DressesSubCategory.click();
		log.info("User has clicked on 'Sweet 16 Dresses' present under DRESSES BY EVENT - BY EVENT");
		String headerInSweet16DressesPage = product.sweet16DressesHeader
				.getText();
		return headerInSweet16DressesPage;
	}

	public String clickingOnViewAllPresentUnderDressesByEventByEvent() {
		Actions action = new Actions(driver);
		action.moveToElement(dressesByEventMainCategory).build().perform();
		viewAllSubCategoryUnderDressesByEventByEvent.click();
		log.info("User has clicked on 'View All' present under DRESSES BY EVENT - BY EVENT");
		String headerInViewAllPageDressesByEventByEvent = product.viewAllHeaderDressesByEventByEvent
				.getText();
		return headerInViewAllPageDressesByEventByEvent;
	}

	// Methods to click on each Sub Categories present under PROM DRESSES - BY
	// STYLE
	public String clickingOnBachelorettePartyDressesPresentUnderDressesByEventWeddingDresses() {
		Actions action = new Actions(driver);
		action.moveToElement(dressesByEventMainCategory).build().perform();
		bachelorettePartyDressesSubCategory.click();
		log.info("User has clicked on 'Bachelorette Party Dresses' present under DRESSES BY EVENT - WEDDING DRESSES");
		String headerInBachelorettePartyDressesPage = product.bachelorettePartyDressesHeader
				.getText();
		return headerInBachelorettePartyDressesPage;
	}

	public String clickingOnBridalDressesPresentUnderDressesByEventWeddingDresses() {
		Actions action = new Actions(driver);
		action.moveToElement(dressesByEventMainCategory).build().perform();
		bridalDressesSubCategory.click();
		log.info("User has clicked on 'Bridal Dresses' present under DRESSES BY EVENT - WEDDING DRESSES");
		String headerInBridalDressesPage = product.bridalDressesHeader
				.getText();
		return headerInBridalDressesPage;
	}

	public String clickingOnBridalShowerDressesPresentUnderDressesByEventWeddingDresses() {
		Actions action = new Actions(driver);
		action.moveToElement(dressesByEventMainCategory).build().perform();
		bridalShowerDressesSubCategory.click();
		log.info("User has clicked on 'Bridal Shower Dresses' present under DRESSES BY EVENT - WEDDING DRESSES");
		String headerInBridalShowerDressesPage = product.bridalShowerDressesHeader
				.getText();
		return headerInBridalShowerDressesPage;
	}

	public String clickingOnBridesmaidDressesPresentUnderDressesByEventWeddingDresses() {
		Actions action = new Actions(driver);
		action.moveToElement(dressesByEventMainCategory).build().perform();
		bridesmaidDressesSubCategory.click();
		log.info("User has clicked on 'Bridesmaid Dresses' present under DRESSES BY EVENT - WEDDING DRESSES");
		String headerInBridesmaidDressesPage = product.bridesmaidDressesHeader
				.getText();
		return headerInBridesmaidDressesPage;
	}

	public String clickingOnMotherOfTheBrideDressesPresentUnderDressesByEventWeddingDresses() {
		Actions action = new Actions(driver);
		action.moveToElement(dressesByEventMainCategory).build().perform();
		motherOfTheBrideDressesSubCategory.click();
		log.info("User has clicked on 'Mother of the Bride Dresses' present under DRESSES BY EVENT - WEDDING DRESSES");
		String headerInMotherOfTheBrideDressesPage = product.motherOfTheBrideDressesHeader
				.getText();
		return headerInMotherOfTheBrideDressesPage;
	}

	public String clickingOnReceptionDressesPresentUnderDressesByEventWeddingDresses() {
		Actions action = new Actions(driver);
		action.moveToElement(dressesByEventMainCategory).build().perform();
		receptionDressesSubCategory.click();
		log.info("User has clicked on 'Reception Dresses' present under DRESSES BY EVENT - WEDDING DRESSES");
		String headerInReceptionDressesPage = product.receptionDressesHeader
				.getText();
		return headerInReceptionDressesPage;
	}

	public String clickingOnRehearsalDinnerDressesPresentUnderDressesByEventWeddingDresses() {
		Actions action = new Actions(driver);
		action.moveToElement(dressesByEventMainCategory).build().perform();
		rehearsalDinnerDressesSubCategory.click();
		log.info("User has clicked on 'Rehearsal Dinner Dresses' present under DRESSES BY EVENT - WEDDING DRESSES");
		String headerInRehearsalDinnerDressesDressesPage = product.rehearsalDinnerDressesHeader
				.getText();
		return headerInRehearsalDinnerDressesDressesPage;
	}

	public String clickingOnWeddingGuestDressesPresentUnderDressesByEventWeddingDresses() {
		Actions action = new Actions(driver);
		action.moveToElement(dressesByEventMainCategory).build().perform();
		weddingGuestDressesSubCategory.click();
		log.info("User has clicked on 'Wedding Guest Dresses' present under DRESSES BY EVENT - WEDDING DRESSES");
		String headerInWeddingGuestDressesPage = product.weddingGuestDressesHeader
				.getText();
		return headerInWeddingGuestDressesPage;
	}

	public String clickingOnViewAllPresentUnderDressesByEventWeddingDresses() {
		Actions action = new Actions(driver);
		action.moveToElement(dressesByEventMainCategory).build().perform();
		viewAllSubCategoryUnderDressesByEventWeddingDresses.click();
		log.info("User has clicked on 'View All' present under DRESSES BY EVENT - WEDDING DRESSES");
		String headerInViewAllPageDressesByEventWeddingDresses = product.viewAllHeaderDressesByEventWeddingDresses
				.getText();
		return headerInViewAllPageDressesByEventWeddingDresses;
	}

	public void clickingOnLoginMenuPresentAtRightTop() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", loginMenuPresentAtRightTop);
		log.info("User has clicked on 'LOGIN' menu present in Home|Landing Page");
	}

	public void searchingForAProduct() {
		searchIcon.click();
		log.info("User has clicked on the 'Search' icon present at the right top");
		searchTextBox.sendKeys("10000");
		log.info("User has entered a valid style number");
		goButton.click();
		log.info("User has clicked on 'Go' button");
	}

	public void searchingForAProductWhichIsNotAvailable() {
		searchIcon.click();
		log.info("User has clicked on the 'Search' icon present at the right top");
		searchTextBox.sendKeys("100000");
		log.info("User has entered an invalid style number");
		goButton.click();
		log.info("User has clicked on 'Go' button");
	}

	public void clickingOnWishlistIcon() {
		wishlistIcon.click();
		log.info("User has clicked on 'Wishlist' icon present at the right top");
	}

	public void navigatingToShoppingBag() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(shoppingBagIcon));
		Thread.sleep(5000);
		shoppingBagIcon.click();
		yourShoppingBagLink.click();
		log.info("User has clicked on 'Shopping Bag' icon present at the right top");
	}

}
