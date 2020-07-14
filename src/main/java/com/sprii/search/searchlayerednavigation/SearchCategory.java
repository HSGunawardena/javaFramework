package com.sprii.search.searchlayerednavigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.PropertyFileReader;
import utils.SpriiTestFramework;

public class SearchCategory {
    WebDriver driver = SpriiTestFramework.getInstance().getDriver();
    PropertyFileReader prop = new PropertyFileReader();

    String searchCategoryTabElement = prop.getProperty("SearchCategory", "search.category.tab.element");
    String searchCategoryDiaperingElement = prop.getProperty("SearchCategory", "search.category.diapering.element");
    String searchCategoryDiapersAndWipesElement = prop.getProperty("SearchCategory", "search.category.diaper.and.wipes.element");

    //Select category tab in layered navigation
    public SearchCategory clickCategoryTabInLayeredNavigation() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(searchCategoryTabElement), 20);
        driver.findElement(By.xpath(searchCategoryTabElement)).click();
        return this;
    }

    //Select diapering category tab in layered navigation
    public SearchCategory SelectDiaperingCategoryTabInLayeredNavigation() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(searchCategoryDiaperingElement), 20);
        driver.findElement(By.xpath(searchCategoryDiaperingElement)).click();
        return this;
    }

    //Select diapering and wipes category tab in layered navigation
    public SearchCategory SelectDiaperingAndWipesCategoryTabInLayeredNavigation() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(searchCategoryDiapersAndWipesElement), 20);
        driver.findElement(By.xpath(searchCategoryDiapersAndWipesElement)).click();
        return this;
    }

}
