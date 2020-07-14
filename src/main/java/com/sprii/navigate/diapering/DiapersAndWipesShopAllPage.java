package com.sprii.navigate.diapering;

import com.sprii.plp.ProductListingPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.PropertyFileReader;
import utils.SpriiTestFramework;

public class DiapersAndWipesShopAllPage {
    WebDriver driver = SpriiTestFramework.getInstance().getDriver();

    PropertyFileReader prop = new PropertyFileReader();


    String testAutomationSubCategoryElement = prop.getProperty("DiapersAndWipesShopAllPage", "test.automation.sub.category.element");


    public ProductListingPage directToTestAutomationCategory(){
        SpriiTestFramework.getInstance().waitForElement(By.xpath(testAutomationSubCategoryElement), 20);
        driver.findElement(By.xpath(testAutomationSubCategoryElement)).click();
        return new ProductListingPage();
    }
}
