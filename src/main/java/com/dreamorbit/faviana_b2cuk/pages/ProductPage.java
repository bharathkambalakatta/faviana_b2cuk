/* Project		: Faviana B2C UK
 * Author		: Bharath Kambalakatta
 * Created Date	: 23-Oct-2018
 * Reviewer		:
 */

package com.dreamorbit.faviana_b2cuk.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dreamorbit.faviana_b2cuk.testbase.TestBase;

public class ProductPage extends TestBase {

	public static final Logger log = Logger.getLogger(ProductPage.class
			.getName());

	// Main Categories - Individual Page Headers
	public String bestSellersPageHeader = "BEST SELLERS";
	public String promDressesPageHeader = "PROM DRESSES";
	public String formalDressesPageHeader = "FORMAL DRESSES";
	public String dressesByEventPageHeader = "DRESSES BY EVENT";
	public String salePageHeader = "SALE";
	public String glamAndGownsPageTitle = "Glam & Gowns - Fashion & Beauty Blog | Faviana NY";

	// PROM DRESSES - BY COLOR - Sub Categories - Individual Page Headers
	public String blackPromDressesPageHeader = "Black Prom Dresses";
	public String bluePromDressesPageHeader = "Blue Prom Dresses";
	public String burgundyPromDressesPageHeader = "Burgundy Prom Dresses";
	public String goldPromDressesPageHeader = "Gold Prom Dresses";
	public String greenPromDressesPageHeader = "Green Prom Dresses";
	public String pinkPromDressesPageHeader = "Pink Prom Dresses";
	public String purplePromDressesPageHeader = "Purple Prom Dresses";
	public String redPromDressesPageHeader = "Red Prom Dresses";
	public String whitePromDressesPageHeader = "White Prom Dresses";
	public String viewAllPageHeaderPromDressesByColor = "BY COLOR";

	// PROM DRESSES - BY STYLE - Sub Categories - Individual Page Headers
	public String longPromDressesPageHeader = "Long Prom Dresses";
	public String mermaidPromDressesPageHeader = "Mermaid Prom Dresses";
	public String offShoulderPromDressesPageHeader = "Off Shoulder Prom Dresses";
	public String plusSizePromDressesPageHeader = "Plus Size Prom Dresses";
	public String promDressesWithChokerPageHeader = "Prom Dresses with Choker";
	public String shortPromDressesPageHeader = "Short Prom Dresses";
	public String twoPiecePromDressesPageHeader = "Two-Piece Prom Dresses";
	public String viewAllPageHeaderPromDressesByStyle = "BY STYLE";

	// DRESSES BY EVENT - BY EVENT - Sub Categories - Individual Page Headers
	public String cocktailDressesPageHeader = "Cocktail Dresses";
	public String graduationDressesPageHeader = "Graduation Dresses";
	public String holidayDressesPageHeader = "Holiday Dresses";
	public String homecomingDressesPageHeader = "Homecoming Dresses";
	public String newYearEveDressesPageHeader = "New Year's Eve Dresses";
	public String pageantDressesPageHeader = "Pageant Dresses";
	public String partyAndClubDressesPageHeader = "Party & Club Dresses";
	public String sweet16DressesPageHeader = "Sweet 16 Dresses";
	public String viewAllPageHeaderDressesByEventByEvent = "BY EVENT";

	// DRESSES BY EVENT - WEDDING DRESSES - Sub Categories - Individual Page
	// Headers
	public String bachelorettePartyDressesPageHeader = "Bachelorette Party Dresses";
	public String bridalDressesPageHeader = "Bridal Dresses";
	public String bridalShowerDressesPageHeader = "Bridal Shower Dresses";
	public String bridesmaidDressesPageHeader = "Bridesmaid Dresses";
	public String motherOfTheBrideDressesPageHeader = "Mother of the Bride Dresses";
	public String receptionDressesPageHeader = "Reception Dresses";
	public String rehearsalDinnerDressesPageHeader = "Rehearsal Dinner Dresses";
	public String weddingGuestDressesPageHeader = "Wedding Guest Dresses";
	public String viewAllPageHeaderDressesByEventWeddingDresses = "WEDDING DRESSES";

	// Web Elements - Page Header in every Main Categories
	@FindBy(xpath = "//h1[@class='page-title']/span[contains(text(),'BEST SELLERS')]")
	WebElement bestSellersHeader;

	@FindBy(xpath = "//h1[@class='page-title']/span[contains(text(),'PROM DRESSES')]")
	WebElement promDressesHeader;

	@FindBy(xpath = "//h1[@class='page-title']/span[contains(text(),'FORMAL DRESSES')]")
	WebElement formalDressesHeader;

	@FindBy(xpath = "//h1[@class='page-title']/span[contains(text(),'DRESSES BY EVENT')]")
	WebElement dressesByEventHeader;

	@FindBy(xpath = "//h1[@class='page-title']/span[contains(text(),'SALE')]")
	WebElement saleHeader;

	// Web Elements - PROM DRESSES - BY COLOR - Page Header in every Sub
	// Categories
	@FindBy(xpath = "//h1[@class='page-title']/span[contains(text(),'Black Prom Dresses')]")
	WebElement blackPromDressesHeader;

	@FindBy(xpath = "//h1[@class='page-title']/span[contains(text(),'Blue Prom Dresses')]")
	WebElement bluePromDressesHeader;

	@FindBy(xpath = "//h1[@class='page-title']/span[contains(text(),'Burgundy Prom Dresses')]")
	WebElement burgundyPromDressesHeader;

	@FindBy(xpath = "//h1[@class='page-title']/span[contains(text(),'Gold Prom Dresses')]")
	WebElement goldPromDressesHeader;

	@FindBy(xpath = "//h1[@class='page-title']/span[contains(text(),'Green Prom Dresses')]")
	WebElement greenPromDressesHeader;

	@FindBy(xpath = "//h1[@class='page-title']/span[contains(text(),'Pink Prom Dresses')]")
	WebElement pinkPromDressesHeader;

	@FindBy(xpath = "//h1[@class='page-title']/span[contains(text(),'Purple Prom Dresses')]")
	WebElement purplePromDressesHeader;

	@FindBy(xpath = "//h1[@class='page-title']/span[contains(text(),'Red Prom Dresses')]")
	WebElement redPromDressesHeader;

	@FindBy(xpath = "//h1[@class='page-title']/span[contains(text(),'White Prom Dresses')]")
	WebElement whitePromDressesHeader;

	@FindBy(xpath = "//h1[@class='page-title']/span[contains(text(),'BY COLOR')]")
	WebElement viewAllHeaderPromDressesByColor;

	// Web Elements - PROM DRESSES - BY SYLE - Page Header in every Sub
	// Categories
	@FindBy(xpath = "//h1[@class='page-title']/span[contains(text(),'Long Prom Dresses')]")
	WebElement longPromDressesHeader;

	@FindBy(xpath = "//h1[@class='page-title']/span[contains(text(),'Mermaid Prom Dresses')]")
	WebElement mermaidPromDressesHeader;

	@FindBy(xpath = "//h1[@class='page-title']/span[contains(text(),'Off Shoulder Prom Dresses')]")
	WebElement offShoulderPromDressesHeader;

	@FindBy(xpath = "//h1[@class='page-title']/span[contains(text(),'Plus Size Prom Dresses')]")
	WebElement plusSizePromDressesHeader;

	@FindBy(xpath = "//h1[@class='page-title']/span[contains(text(),'Prom Dresses with Choker')]")
	WebElement promDressesWithChokerHeader;

	@FindBy(xpath = "//h1[@class='page-title']/span[contains(text(),'Short Prom Dresses')]")
	WebElement shortPromDressesHeader;

	@FindBy(xpath = "//h1[@class='page-title']/span[contains(text(),'Two-Piece Prom Dresses')]")
	WebElement twoPiecePromDressesHeader;

	@FindBy(xpath = "//h1[@class='page-title']/span[contains(text(),'BY STYLE')]")
	WebElement viewAllHeaderPromDressesByStyle;

	// Web Elements - DRESSES BY EVENT - BY EVENT - Page Header in every Sub
	// Categories
	@FindBy(xpath = "//h1[@class='page-title']/span[contains(text(),'Cocktail Dresses')]")
	WebElement cocktailDressesHeader;

	@FindBy(xpath = "//h1[@class='page-title']/span[contains(text(),'Graduation Dresses')]")
	WebElement graduationDressesHeader;

	@FindBy(xpath = "//h1[@class='page-title']/span[contains(text(),'Holiday Dresses')]")
	WebElement holidayDressesHeader;

	@FindBy(xpath = "//h1[@class='page-title']/span[contains(text(),'Homecoming Dresses')]")
	WebElement homecomingDressesHeader;

	@FindBy(xpath = "//h1[@class='page-title']/span[contains(text(),'New Year')]")
	WebElement newYearEveDressesHeader;

	@FindBy(xpath = "//h1[@class='page-title']/span[contains(text(),'Pageant Dresses')]")
	WebElement pageantDressesHeader;

	@FindBy(xpath = "//h1[@class='page-title']/span[contains(text(),'Party & Club Dresses')]")
	WebElement partyAndClubDressesHeader;

	@FindBy(xpath = "//h1[@class='page-title']/span[contains(text(),'Sweet 16 Dresses')]")
	WebElement sweet16DressesHeader;

	@FindBy(xpath = "//h1[@class='page-title']/span[contains(text(),'BY EVENT')]")
	WebElement viewAllHeaderDressesByEventByEvent;

	// Web Elements - DRESSES BY EVENT - WEDDING DRESSES - Page Header in every
	// Sub Categories
	@FindBy(xpath = "//h1[@class='page-title']/span[contains(text(),'Bachelorette Party Dresses')]")
	WebElement bachelorettePartyDressesHeader;

	@FindBy(xpath = "//h1[@class='page-title']/span[contains(text(),'Bridal Dresses')]")
	WebElement bridalDressesHeader;

	@FindBy(xpath = "//h1[@class='page-title']/span[contains(text(),'Bridal Shower Dresses')]")
	WebElement bridalShowerDressesHeader;

	@FindBy(xpath = "//h1[@class='page-title']/span[contains(text(),'Bridesmaid Dresses')]")
	WebElement bridesmaidDressesHeader;

	@FindBy(xpath = "//h1[@class='page-title']/span[contains(text(),'Mother of the Bride Dresses')]")
	WebElement motherOfTheBrideDressesHeader;

	@FindBy(xpath = "//h1[@class='page-title']/span[contains(text(),'Reception Dresses')]")
	WebElement receptionDressesHeader;

	@FindBy(xpath = "//h1[@class='page-title']/span[contains(text(),'Rehearsal Dinner Dresses')]")
	WebElement rehearsalDinnerDressesHeader;

	@FindBy(xpath = "//h1[@class='page-title']/span[contains(text(),'Wedding Guest Dresses')]")
	WebElement weddingGuestDressesHeader;

	@FindBy(xpath = "//h1[@class='page-title']/span[contains(text(),'WEDDING DRESSES')]")
	WebElement viewAllHeaderDressesByEventWeddingDresses;

	@FindBy(xpath = "//ol[@class='products list items product-items']//li[1]//div")
	WebElement firstProductInProductListPage;
	
	@FindBy(xpath = "//ol[@class='products list items product-items']//li[2]//div")
	WebElement secondProductInProductListPage;
	
	@FindBy(xpath = "//ol[@class='products list items product-items']//li[3]//div")
	WebElement thirdProductInProductListPage;
	
	@FindBy(xpath = "//ol[@class='products list items product-items']//li[4]//div")
	WebElement forthProductInProductListPage;
	
	@FindBy(xpath = "//ol[@class='products list items product-items']//li[5]//div")
	WebElement fifthProductInProductListPage;
	
	@FindBy(xpath = "//ol[@class='products list items product-items']//li[6]//div")
	WebElement sixthProductInProductListPage;
	
	@FindBy(xpath = "//ol[@class='products list items product-items']//li[7]//div")
	WebElement seventhProductInProductListPage;
	
	@FindBy(xpath = "//ol[@class='products list items product-items']//li[8]//div")
	WebElement eightProductInProductListPage;
	
	@FindBy(xpath = "//div[@id='amasty-shopby-product-list']//div[2]//ol[1]//li[1]/div")
	WebElement twentyFifthProductInProductListPage;
	
	@FindBy(xpath = "//div[@id='amasty-shopby-product-list']//div[2]//ol[1]//li[5]/div")
	WebElement twentyNinthProductInProductListPage;	
	
	@FindBy(xpath = "//em[contains(text(),'No more dresses to show.')]")
	WebElement noMoreDressesToShowTextAtTheBottomOfThePage;
	
	@FindBy(xpath = "//span[contains(text(),'Imagine the moment the limo pulls into your drivew')]")
	WebElement descriptionAtTheEndOfThePage;
	
	@FindBy(xpath = "//div[@id='aw-filter-style']//div[@class='filter-options-title']")
	WebElement styleFilter;
	
	@FindBy(xpath = "//div[@id='aw-filter-parent_color']//div[@class='filter-options-title']")
	WebElement colorFilter;
	
	@FindBy(xpath = "//div[@id='aw-filter-size']//div[@class='filter-options-title']")
	WebElement sizeFilter;
	
	@FindBy(xpath = "//div[@id='aw-filter-product_collection']//div[@class='filter-options-title']")
	WebElement collectionFilter;
	
	@FindBy(xpath = "//div[@id='aw-filter-price']//div[@class='filter-options-title']")
	WebElement priceFilter;
	
	@FindBy(xpath = "//div[@id='aw-filter-style']/div[2]//li[1]/input")
	WebElement firstOptionInStyleFilter;
	
	@FindBy(xpath = "//div[@id='aw-filter-parent_color']/div[2]//li[1]/input")
	WebElement firstOptionInColorFilter;
	
	@FindBy(xpath = "//div[@id='aw-filter-size']/div[2]//li[1]/input")
	WebElement firstOptionInSizeFilter;
	
	@FindBy(xpath = "//div[@id='aw-filter-product_collection']/div[2]//li[1]/input")
	WebElement firstOptionInCollectionFilter;
	
	@FindBy(xpath = "//ul[@class='selected-items-list']//li[1]")
	WebElement firstSelectedFilter;
	
	@FindBy(xpath = "//a[@class='product photo product-item-photo'][contains(text(),'FAVIANA 7850')]")
	WebElement productFaviana7850;

	@FindBy(xpath = "//a[contains(text(),'FAVIANA 10000')]")
	WebElement productFaviana10000;

	@FindBy(xpath = "//div[contains(text(),'Your search returned no results.')]")
	WebElement productNotFound;

	public ProductPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void verifyIfProductsAreDisplayed(){
		firstProductInProductListPage.isDisplayed();
		secondProductInProductListPage.isDisplayed();
		thirdProductInProductListPage.isDisplayed();
		forthProductInProductListPage.isDisplayed();
		fifthProductInProductListPage.isDisplayed();
		sixthProductInProductListPage.isDisplayed();
		seventhProductInProductListPage.isDisplayed();
		eightProductInProductListPage.isDisplayed();
		log.info("Products are displayed in Product List page");
	}
	
	public void verifyIfProductsAreDisplayedInSecondPage(){
		twentyFifthProductInProductListPage.isDisplayed();
		twentyNinthProductInProductListPage.isDisplayed();
		log.info("Products are displayed in 2nd page of Product List page");
	}
	
	public void scrollingDownInProductListPage(){
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		 log.info("User has scrolled down to end of the page");
	}
	
	public void verifyingTextDisplayedAtTheEndOfProductListPage(){
		 noMoreDressesToShowTextAtTheBottomOfThePage.isDisplayed();
		 log.info("'No more dresses to show.' text is displayed at the end of the page");
		 descriptionAtTheEndOfThePage.isDisplayed();
		 log.info("Description is displayed at the end of the page");
	}
	
	public void verifyingTheFiltersDisplayedInPromDressesByColorPage(){
		styleFilter.isDisplayed();
		sizeFilter.isDisplayed();
		collectionFilter.isDisplayed();
		priceFilter.isDisplayed();
		log.info("STYLE, SIZE, COLLECTION and PRICE filters are displayed in PROM DRESSES - BY COLOR page");
	}
	
	public void verifyingTheFiltersDisplayedInPromDressesByStylePage(){
		styleFilter.isDisplayed();
		colorFilter.isDisplayed();
		collectionFilter.isDisplayed();
		priceFilter.isDisplayed();
		log.info("STYLE, COLOR, COLLECTION and PRICE filters are displayed in PROM DRESSES - BY COLOR page");
	}
	
	public void verifyingTheFiltersDisplayedInPromDressesPage(){
		styleFilter.isDisplayed();
		colorFilter.isDisplayed();
		sizeFilter.isDisplayed();
		collectionFilter.isDisplayed();
		priceFilter.isDisplayed();
		log.info("STYLE, COLOR, SiZE, COLLECTION and PRICE filters are displayed in PROM DRESSES page");
	}
	
	public void selectingOptionsFromStyleFilter(){
		styleFilter.click();
		firstOptionInStyleFilter.click();
		log.info("User has selected the 1st option from STYLE filter");
		firstSelectedFilter.isDisplayed();
		log.info("STYLE filter has been applied");
		firstProductInProductListPage.isDisplayed();
		log.info("Products are displayed when filter is applied on STYLE");
		firstSelectedFilter.click();
		log.info("STYLE filter has been deselected");
	}
	
	public void selectingOptionsFromColorFilter(){
		colorFilter.click();
		firstOptionInColorFilter.click();
		log.info("User has selected the 1st option from COLOR filter");
		firstSelectedFilter.isDisplayed();
		log.info("COLOR filter has been applied");
		firstProductInProductListPage.isDisplayed();
		log.info("Products are displayed when filter is applied on COLOR");
		firstSelectedFilter.click();
		log.info("COLOR filter has been deselected");
	}
	
	public void selectingOptionsFromSizeFilter(){
		sizeFilter.click();
		firstOptionInSizeFilter.click();
		log.info("User has selected the 1st option from SIZE filter");
		firstSelectedFilter.isDisplayed();
		log.info("SIZE filter has been applied");
		firstProductInProductListPage.isDisplayed();
		log.info("Products are displayed when filter is applied on SIZE");
		firstSelectedFilter.click();
		log.info("SIZE filter has been deselected");
	}
	
	public void selectingOptionsFromCollectionFilter(){
		collectionFilter.click();
		firstOptionInCollectionFilter.click();
		log.info("User has selected the 1st option from COLLECTION filter");
		firstSelectedFilter.isDisplayed();
		log.info("COLLECTION filter has been applied");
		firstProductInProductListPage.isDisplayed();
		log.info("Products are displayed when filter is applied on COLLECTION");
		firstSelectedFilter.click();
		log.info("COLLECTION filter has been deselected");
	}
	
	public void selectingAProduct() {
		firstProductInProductListPage.click();
		log.info("User has selected a product in Product Page");
	}

	public void searchResult() {
		productFaviana10000.isDisplayed();
	}

	public void searchResultNotAvailable() {
		productNotFound.isDisplayed();
	}
}
