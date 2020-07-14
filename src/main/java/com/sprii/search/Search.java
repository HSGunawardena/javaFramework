package com.sprii.search;

import com.sprii.pdp.ConfigProductWithSpecialPriceDetailPage;
import com.sprii.pdp.SimpleProduct1WithOriginalPriceDetailPage;
import com.sprii.pdp.SimpleProduct3WithSpecialPriceDetailPage;
import com.sprii.pdp.SimpleProduct4WithOriginalPriceDetailPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.PropertyFileReader;
import utils.SpriiTestFramework;

public class Search {

    private WebDriver driver = SpriiTestFramework.getInstance().getDriver();
    private PropertyFileReader prop = new PropertyFileReader();

    private String searchBarElement = prop.getProperty("Search", "search.bar.element");
    private String searchSubmitButtonElement = prop.getProperty("Search", "search.submit.button.element");
    private String searchPredictiveSearchWindowElement = prop.getProperty("Search", "search.autocomplete.window.element");
    private String searchTextFieldElement = prop.getProperty("Search", "search.text.field.element");
    private String searchSimpleProduct1Element = prop.getProperty("Search", "search.simple.product1.element");
    private String searchConfigProduct2Element = prop.getProperty("Search", "search.configurable.product2.element");
    private String searchSimpleProduct3Element = prop.getProperty("Search", "search.simple.product2.element");
    private String searchSimpleProduct4Element = prop.getProperty("Search", "search.simple.product4.element");

    public SearchResultCategoryPage goToTestAutomationCategoryUsingSearch(String category) {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(searchBarElement), 20);
        driver.findElement(By.xpath(searchBarElement)).sendKeys(category);
        SpriiTestFramework.getInstance().waitForElement(By.xpath(searchSubmitButtonElement), 20);
        driver.findElement(By.xpath(searchSubmitButtonElement)).click();
        return new SearchResultCategoryPage();
    }

    public SimpleProduct1WithOriginalPriceDetailPage selectSimpleProduct1FromPredictiveSearchWindow(String productName) throws Exception {

        SpriiTestFramework.getInstance().waitForElement(By.id(searchTextFieldElement), 100);
        driver.findElement(By.id(searchTextFieldElement)).sendKeys(productName);
        //WebElement searchWindow = driver.findElement(By.xpath(searchPredictiveSearchWindowElement));
        //driver.switchTo().frame(searchWindow);
        SpriiTestFramework.getInstance().waitTillClickable(By.xpath(searchSimpleProduct1Element), 50);
        driver.findElement(By.xpath(searchSimpleProduct1Element)).click();
        return new SimpleProduct1WithOriginalPriceDetailPage();
    }

    public ConfigProductWithSpecialPriceDetailPage selectConfigProduct2FromPredictiveSearchWindow(String productName) throws Exception {

        SpriiTestFramework.getInstance().waitForElement(By.id(searchTextFieldElement), 100);
        driver.findElement(By.id(searchTextFieldElement)).sendKeys(productName);
        SpriiTestFramework.getInstance().waitTillClickable(By.xpath(searchConfigProduct2Element), 50);
        driver.findElement(By.xpath(searchConfigProduct2Element)).click();
        return new ConfigProductWithSpecialPriceDetailPage();
    }

    public SimpleProduct3WithSpecialPriceDetailPage selectSimpleProduct3FromPredictiveSearchWindow(String productName) throws Exception {

        SpriiTestFramework.getInstance().waitForElement(By.id(searchTextFieldElement), 100);
        driver.findElement(By.id(searchTextFieldElement)).sendKeys(productName);
        SpriiTestFramework.getInstance().waitTillClickable(By.xpath(searchSimpleProduct3Element), 50);
        driver.findElement(By.xpath(searchSimpleProduct3Element)).click();
        return new SimpleProduct3WithSpecialPriceDetailPage();
    }

    public SimpleProduct4WithOriginalPriceDetailPage selectSimpleProduct4FromPredictiveSearchWindow(String productName) throws Exception {

        SpriiTestFramework.getInstance().waitForElement(By.id(searchTextFieldElement), 100);
        driver.findElement(By.id(searchTextFieldElement)).sendKeys(productName);
        SpriiTestFramework.getInstance().waitTillClickable(By.xpath(searchSimpleProduct4Element), 50);
        driver.findElement(By.xpath(searchSimpleProduct4Element)).click();
        return new SimpleProduct4WithOriginalPriceDetailPage();
    }
}
