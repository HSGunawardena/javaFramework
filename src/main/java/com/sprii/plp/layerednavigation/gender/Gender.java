package com.sprii.plp.layerednavigation.gender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utils.PropertyFileReader;
import utils.SpriiTestFramework;

public class Gender {

    WebDriver driver = SpriiTestFramework.getInstance().getDriver();
    PropertyFileReader prop = new PropertyFileReader();

    String genderTabElement = prop.getProperty("Gender", "gender.tab.element");
    String genderTabShowMoreButtonElement = prop.getProperty("Gender", "gender.tab.show.more.button.element");
    String genderTabShowLessButtonElement = prop.getProperty("Gender", "gender.tab.show.less.button.element");
    String genderTabBoysElement = prop.getProperty("Gender", "gender.tab.boys.element");
    String genderTabGirlsElement = prop.getProperty("Gender", "gender.tab.girls.element");
    String genderTabMenElement = prop.getProperty("Gender", "gender.tab.men.element");
    String genderTabUnisexElement = prop.getProperty("Gender", "gender.tab.unisex.element");
    String genderTabWomenElement = prop.getProperty("Gender", "gender.tab.women.element");

    //Remove gender elements
    String removeBoysGenderElement = prop.getProperty("Gender", "remove.boys.gender.element");
    String removeGirlsGenderElement = prop.getProperty("Gender", "remove.girls.gender.element");
    String removeMenGenderElement = prop.getProperty("Gender", "remove.men.gender.element");
    String removeUnisexGenderElement = prop.getProperty("Gender", "remove.unisex.gender.element");
    String removeWomenGenderElement = prop.getProperty("Gender", "remove.women.gender.element");
    String clearAllElement = prop.getProperty("Gender", "clear.all.element");

    //Select Gender Tab
    public Gender clickEventOnGenderTab() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(genderTabElement), 20);
        driver.findElement(By.xpath(genderTabElement)).click();
        return this;
    }

    //Show More Button Click
    public Gender showMoreButtonClickEvent() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(genderTabShowMoreButtonElement), 1000);
        WebElement target = driver.findElement(By.xpath(genderTabShowMoreButtonElement));
        Actions builder = new Actions(driver);
        builder.moveToElement(target).click().build().perform();
        return this;
    }

    //Show Less Button Click
    public Gender showLessButtonClickEvent() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(genderTabShowLessButtonElement), 20);
        driver.findElement(By.xpath(genderTabShowLessButtonElement)).click();
        return this;
    }

    //Select gender elements
    public Gender selectBoysGender() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(genderTabBoysElement), 20);
        driver.findElement(By.xpath(genderTabBoysElement)).click();
        return this;
    }

    public Gender selectGirlsGender() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(genderTabGirlsElement), 20);
        driver.findElement(By.xpath(genderTabGirlsElement)).click();
        return this;
    }

    public Gender selectMenGender() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(genderTabMenElement), 20);
        driver.findElement(By.xpath(genderTabMenElement)).click();
        return this;
    }

    public Gender selectUnisexGender() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(genderTabUnisexElement), 20);
        driver.findElement(By.xpath(genderTabUnisexElement)).click();
        return this;
    }

    public Gender selectWomenGender() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(genderTabWomenElement), 20);
        driver.findElement(By.xpath(genderTabWomenElement)).click();
        return this;
    }

    //Remove gender elements
    public Gender removeBoysGender() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(removeBoysGenderElement), 20);
        driver.findElement(By.xpath(removeBoysGenderElement)).click();
        return this;
    }

    public Gender removeGirlsGender() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(removeGirlsGenderElement), 20);
        driver.findElement(By.xpath(removeGirlsGenderElement)).click();
        return this;
    }

    public Gender removeMenGender() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(removeMenGenderElement), 20);
        driver.findElement(By.xpath(removeMenGenderElement)).click();
        return this;
    }

    public Gender removeUnisexGender() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(removeUnisexGenderElement), 20);
        driver.findElement(By.xpath(removeUnisexGenderElement)).click();
        return this;
    }

    public Gender removeWomenGender() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(removeWomenGenderElement), 20);
        driver.findElement(By.xpath(removeWomenGenderElement)).click();
        return this;
    }

    //Remove all selected items
    public Gender clearAll() {
        SpriiTestFramework.getInstance().waitForElement(By.linkText(clearAllElement), 20);
        driver.findElement(By.linkText(clearAllElement)).click();
        return this;
    }
}
