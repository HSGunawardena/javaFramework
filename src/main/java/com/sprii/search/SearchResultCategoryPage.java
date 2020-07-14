package com.sprii.search;

import com.sprii.home.HomePage;
import com.sprii.navigate.diapering.DiaperingPage;
import com.sprii.navigate.diapering.DiapersAndWipesPage;
import com.sprii.pdp.*;
import com.sprii.plp.ProductListingPage;
import com.sprii.shoppingcart.ShoppingCartPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import utils.PropertyFileReader;
import utils.SpriiTestFramework;

public class SearchResultCategoryPage {
    WebDriver driver = SpriiTestFramework.getInstance().getDriver();
    PropertyFileReader prop = new PropertyFileReader();

    String sortingDropDownElement = prop.getProperty("SearchResultCategoryPage", "search.category.sorting.dropdown.element");
    String specialPriceSimpleProductNameElement = prop.getProperty("SearchResultCategoryPage", "search.category.special.price.simple.product.name.element");
    String specialPriceSimpleProductImageElement = prop.getProperty("SearchResultCategoryPage", "search.category.special.price.simple.product.image.element");
    String specialPriceSimpleProductAddToCartElement = prop.getProperty("SearchResultCategoryPage", "search.category.special.price.simple.product.add.to.cart.element");
    String testAutomationSubCategoryElement = prop.getProperty("SearchResultCategoryPage", "search.category.test.automation.sub.category.element");
    String layeredNavigationCategoryElement = prop.getProperty("SearchResultCategoryPage", "search.category.layered.navigation.category.element");
    String originalPriceSimpleProductNameElement = prop.getProperty("SearchResultCategoryPage", "search.category.original.price.simple.product.name.element");
    String originalPriceSimpleProductImageElement = prop.getProperty("SearchResultCategoryPage", "search.category.original.price.simple.product.image.element");
    String originalPriceSimpleProductAddToCartElement = prop.getProperty("SearchResultCategoryPage", "search.category.original.price.simple.product.add.to.cart.element");
    String originalPriceConfigProductNameElement = prop.getProperty("SearchResultCategoryPage", "search.category.original.price.config.product.name.element");
    String originalPriceConfigProductImageElement = prop.getProperty("SearchResultCategoryPage", "search.category.original.price.config.product,image.element");
    String originalPriceConfigProductAddToCartElement = prop.getProperty("SearchResultCategoryPage", "search.category.original.price.config.product.add.to.cart.element");
    String specialPriceConfigProductNameElement = prop.getProperty("SearchResultCategoryPage", "search.category.special.price.config.product.name.element");
    String specialPriceConfigProductImageElement = prop.getProperty("SearchResultCategoryPage", "search.category.special.price.config.product.image.element");
    String specialPriceConfigProductAddToCartElement = prop.getProperty("SearchResultCategoryPage", "search.category.special.price.config.product.add.to.cart.element");
    String specialPriceSimpleProduct3NameElement = prop.getProperty("SearchResultCategoryPage", "search.category.special.price.simple.product3.name.element");
    String specialPriceSimpleProduct3ImageElement = prop.getProperty("SearchResultCategoryPage", "search.category.special.price.simple.product3.image.element");
    String specialPriceSimpleProduct3AddToCartElement = prop.getProperty("SearchResultCategoryPage", "search.category.special.price.simple.product3.add.to.cart.element");
    String originalPriceSimpleProduct4NameElement = prop.getProperty("SearchResultCategoryPage", "search.category.original.price.simple.product4.name.element");
    String originalPriceSimpleProduct4ImageElement = prop.getProperty("SearchResultCategoryPage", "search.category.original.price.simple.product4.image.element");
    String originalPriceSimpleProduct4AddToCartElement = prop.getProperty("SearchResultCategoryPage", "search.category.original.price.simple.product4.add.to.cart.element");
    String breadcrumbHomePageElement = prop.getProperty("SearchResultCategoryPage", "search.category.breadcrumb.homepage.element");
    String productListingCategoryNameElement = prop.getProperty("SearchResultCategoryPage", "search.category.product.listing.category.name.element");

    public SearchResultCategoryPage sortingOptionsDropDown(String sortingOptions){
        SpriiTestFramework.getInstance().waitForElement(By.xpath(sortingDropDownElement), 20);
        Select status = new Select(driver.findElement(By.xpath(sortingDropDownElement)));
        status.selectByVisibleText(sortingOptions);
        return this;
    }

    public SimpleProductWithSpecialPriceDetailPage clickEventOnSimpleProductSpecialPriceName(){
        SpriiTestFramework.getInstance().waitForElement(By.xpath(specialPriceSimpleProductNameElement), 20);
        driver.findElement(By.xpath(specialPriceSimpleProductNameElement)).click();
        return new SimpleProductWithSpecialPriceDetailPage();
    }

    public SimpleProductWithSpecialPriceDetailPage clickEventOnSimpleProductSpecialPriceImage(){
        SpriiTestFramework.getInstance().waitForElement(By.xpath(specialPriceSimpleProductImageElement), 20);
        driver.findElement(By.xpath(specialPriceSimpleProductImageElement)).click();
        return new SimpleProductWithSpecialPriceDetailPage();
    }

    public ShoppingCartPage addToCartSimpleProductWithSpecialPrice(){
        driver.navigate().refresh();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(specialPriceSimpleProductAddToCartElement), 30);
        driver.findElement(By.xpath(specialPriceSimpleProductAddToCartElement)).click();
        return new ShoppingCartPage();
    }

    public SimpleProduct1WithOriginalPriceDetailPage clickEventOnSimpleProductOriginalPriceName(){
        SpriiTestFramework.getInstance().waitForElement(By.xpath(originalPriceSimpleProductNameElement), 20);
        driver.findElement(By.xpath(originalPriceSimpleProductNameElement)).click();
        return new SimpleProduct1WithOriginalPriceDetailPage();
    }

    public SimpleProduct1WithOriginalPriceDetailPage clickEventOnSimpleProductOriginalPriceImage(){
        SpriiTestFramework.getInstance().waitForElement(By.xpath(originalPriceSimpleProductImageElement), 20);
        driver.findElement(By.xpath(originalPriceSimpleProductImageElement)).click();
        return new SimpleProduct1WithOriginalPriceDetailPage();
    }

    public ShoppingCartPage addToCartButtonEventForSimpleProductWithOriginalPrice(){
        driver.navigate().refresh();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(originalPriceSimpleProductAddToCartElement), 50);
        driver.findElement(By.xpath(originalPriceSimpleProductAddToCartElement)).click();
        return new ShoppingCartPage();
    }

    public ConfigProductWithOriginalPriceDetailPage clickEventOnConfigProductOriginalPriceName(){
        SpriiTestFramework.getInstance().waitForElement(By.xpath(originalPriceConfigProductNameElement), 20);
        driver.findElement(By.xpath(originalPriceConfigProductNameElement)).click();
        return new ConfigProductWithOriginalPriceDetailPage();
    }

    public ConfigProductWithOriginalPriceDetailPage clickEventOnConfigProductOriginalPriceImage(){
        SpriiTestFramework.getInstance().waitForElement(By.xpath(originalPriceConfigProductImageElement),20);
        driver.findElement(By.xpath(originalPriceConfigProductImageElement)).click();
        return new ConfigProductWithOriginalPriceDetailPage();
    }

    public ConfigProductWithOriginalPriceDetailPage addToCartButtonEventForConfigProductWithOriginalPrice(){
        driver.navigate().refresh();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(originalPriceConfigProductAddToCartElement), 2000);
        driver.findElement(By.xpath(originalPriceConfigProductAddToCartElement)).click();
        return new ConfigProductWithOriginalPriceDetailPage();
    }

    public ConfigProductWithSpecialPriceDetailPage clickEventOnConfigProductSpecialPriceName(){
        SpriiTestFramework.getInstance().waitForElement(By.xpath(specialPriceConfigProductNameElement), 20);
        driver.findElement(By.xpath(specialPriceConfigProductNameElement)).click();
        return new ConfigProductWithSpecialPriceDetailPage();
    }

    public ConfigProductWithSpecialPriceDetailPage clickEventOnConfigProductSpecialPriceImage(){
        SpriiTestFramework.getInstance().waitForElement(By.xpath(specialPriceConfigProductImageElement),20);
        driver.findElement(By.xpath(specialPriceConfigProductImageElement)).click();
        return new ConfigProductWithSpecialPriceDetailPage();
    }

    public ConfigProductWithSpecialPriceDetailPage addToCartButtonEventForConfigProductWithSpecialPrice(){
        driver.navigate().refresh();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(specialPriceConfigProductAddToCartElement), 20);
        driver.findElement(By.xpath(specialPriceConfigProductAddToCartElement)).click();
        return new ConfigProductWithSpecialPriceDetailPage();
    }

    public SimpleProduct3WithSpecialPriceDetailPage clickEventOnSimpleProduct3SpecialPriceName(){
        SpriiTestFramework.getInstance().waitForElement(By.xpath(specialPriceSimpleProduct3NameElement), 20);
        driver.findElement(By.xpath(specialPriceSimpleProduct3NameElement)).click();
        return new SimpleProduct3WithSpecialPriceDetailPage();
    }

    public SimpleProduct3WithSpecialPriceDetailPage clickEventOnSimpleProduct3SpecialPriceImage(){
        SpriiTestFramework.getInstance().waitForElement(By.xpath(specialPriceSimpleProduct3ImageElement), 20);
        driver.findElement(By.xpath(specialPriceSimpleProduct3ImageElement)).click();
        return new SimpleProduct3WithSpecialPriceDetailPage();
    }

    public ShoppingCartPage addToCartButtonEventForSimpleProduct3WithSpecialPrice(){
        driver.navigate().refresh();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(specialPriceSimpleProduct3AddToCartElement), 30);
        driver.findElement(By.xpath(specialPriceSimpleProduct3AddToCartElement)).click();
        return new ShoppingCartPage();
    }

    public SimpleProduct4WithOriginalPriceDetailPage clickEventOnSimpleProduct4OriginalPriceName(){
        SpriiTestFramework.getInstance().waitForElement(By.xpath(originalPriceSimpleProduct4NameElement), 20);
        driver.findElement(By.xpath(originalPriceSimpleProduct4NameElement)).click();
        return new SimpleProduct4WithOriginalPriceDetailPage();
    }

    public SimpleProduct4WithOriginalPriceDetailPage clickEventOnSimpleProduct4OriginalPriceImage(){
        SpriiTestFramework.getInstance().waitForElement(By.xpath(originalPriceSimpleProduct4ImageElement), 20);
        driver.findElement(By.xpath(originalPriceSimpleProduct4ImageElement)).click();
        return new SimpleProduct4WithOriginalPriceDetailPage();
    }

    public ShoppingCartPage addToCartButtonEventForSimpleProduct4WithOriginalPrice(){
        driver.navigate().refresh();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(originalPriceSimpleProduct4AddToCartElement), 30);
        driver.findElement(By.xpath(originalPriceSimpleProduct4AddToCartElement)).click();
        return new ShoppingCartPage();
    }

    public HomePage selectHomePageBreadcrumb(){
        SpriiTestFramework.getInstance().waitForElement(By.xpath(breadcrumbHomePageElement), 20);
        driver.findElement(By.xpath(breadcrumbHomePageElement)).click();
        return new HomePage();
    }

    public boolean productListingCategoryName(){
        SpriiTestFramework.getInstance().waitForElement(By.xpath(productListingCategoryNameElement), 20);
        String productListingCategoryName = driver.findElement(By.xpath(productListingCategoryNameElement)).getText();
        if(productListingCategoryName.equals("SEARCH RESULTS FOR: 'TEST AUTOMATION'")){
            return true;
        }
        else{
            return false;
        }
    }
}
