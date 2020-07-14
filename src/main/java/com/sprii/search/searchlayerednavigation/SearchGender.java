package com.sprii.search.searchlayerednavigation;

import com.sprii.plp.layerednavigation.gender.Gender;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.PropertyFileReader;
import utils.SpriiTestFramework;

public class SearchGender {
    WebDriver driver = SpriiTestFramework.getInstance().getDriver();
    PropertyFileReader prop = new PropertyFileReader();

    String genderTabElement = prop.getProperty("SearchGender", "search.gender.tab.element");
    String genderTabShowMoreButtonElement = prop.getProperty("SearchGender", "search.gender.tab.show.more.button.element");
    String genderTabShowLessButtonElement = prop.getProperty("SearchGender", "search.gender.tab.show.less.button.element");
    String genderTabBoysElement = prop.getProperty("SearchGender", "search.gender.tab.boys.element");
    String genderTabGirlsElement = prop.getProperty("SearchGender", "search.gender.tab.girls.element");
    String genderTabMenElement = prop.getProperty("SearchGender", "search.gender.tab.men.element");
    String genderTabUnisexElement = prop.getProperty("SearchGender", "search.gender.tab.unisex.element");
    String genderTabWomenElement = prop.getProperty("SearchGender", "search.gender.tab.women.element");

    //Remove gender elements
    String removeBoysGenderElement = prop.getProperty("SearchGender", "search.remove.boys.gender.element");
    String removeGirlsGenderElement = prop.getProperty("SearchGender", "search.remove.girls.gender.element");
    String removeMenGenderElement = prop.getProperty("SearchGender", "search.remove.men.gender.element");
    String removeUnisexGenderElement = prop.getProperty("SearchGender", "search.remove.unisex.gender.element");
    String removeWomenGenderElement = prop.getProperty("SearchGender", "search.remove.women.gender.element");
    String clearAllElement = prop.getProperty("SearchGender", "search.clear.all.element");

    //Select Gender Tab
    public SearchGender clickEventOnGenderTab() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(genderTabElement), 20);
        driver.findElement(By.xpath(genderTabElement)).click();
        return this;
    }

    //Show More Button Click
    public SearchGender showMoreButtonClickEvent() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(genderTabShowMoreButtonElement), 1000);
        WebElement target = driver.findElement(By.xpath(genderTabShowMoreButtonElement));
        Actions builder = new Actions(driver);
        builder.moveToElement(target).click().build().perform();
        return this;
    }

    //Show Less Button Click
    public SearchGender showLessButtonClickEvent() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(genderTabShowLessButtonElement), 20);
        driver.findElement(By.xpath(genderTabShowLessButtonElement)).click();
        return this;
    }

    //Select SearchGender elements
    public SearchGender selectBoysGender() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(genderTabBoysElement), 20);
        driver.findElement(By.xpath(genderTabBoysElement)).click();
        return this;
    }

    public SearchGender selectGirlsGender() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(genderTabGirlsElement), 20);
        driver.findElement(By.xpath(genderTabGirlsElement)).click();
        return this;
    }

    public SearchGender selectMenGender() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(genderTabMenElement), 20);
        driver.findElement(By.xpath(genderTabMenElement)).click();
        return this;
    }

    public SearchGender selectUnisexGender() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(genderTabUnisexElement), 20);
        driver.findElement(By.xpath(genderTabUnisexElement)).click();
        return this;
    }

    public SearchGender selectWomenGender() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(genderTabWomenElement), 20);
        driver.findElement(By.xpath(genderTabWomenElement)).click();
        return this;
    }

    //Remove SearchGender elements
    public SearchGender removeBoysGender() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(removeBoysGenderElement), 20);
        driver.findElement(By.xpath(removeBoysGenderElement)).click();
        return this;
    }

    public SearchGender removeGirlsGender() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(removeGirlsGenderElement), 20);
        driver.findElement(By.xpath(removeGirlsGenderElement)).click();
        return this;
    }

    public SearchGender removeMenGender() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(removeMenGenderElement), 20);
        driver.findElement(By.xpath(removeMenGenderElement)).click();
        return this;
    }

    public SearchGender removeUnisexGender() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(removeUnisexGenderElement), 20);
        driver.findElement(By.xpath(removeUnisexGenderElement)).click();
        return this;
    }

    public SearchGender removeWomenGender() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(removeWomenGenderElement), 20);
        driver.findElement(By.xpath(removeWomenGenderElement)).click();
        return this;
    }

    //Remove all selected items
    public SearchGender clearAll() {
        SpriiTestFramework.getInstance().waitForElement(By.linkText(clearAllElement), 20);
        driver.findElement(By.linkText(clearAllElement)).click();
        return this;
    }
}
