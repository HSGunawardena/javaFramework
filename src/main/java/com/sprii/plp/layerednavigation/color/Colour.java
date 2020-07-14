package com.sprii.plp.layerednavigation.color;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utils.PropertyFileReader;
import utils.SpriiTestFramework;

public class Colour {

    WebDriver driver = SpriiTestFramework.getInstance().getDriver();
    PropertyFileReader prop = new PropertyFileReader();

    //Select color tab in layered navigation elements
    String colourTabElement = prop.getProperty("Colour", "colour.tab.element");
    String colourTabShowMoreButtonElement = prop.getProperty("Colour", "colour.tab.show.more.button.element");
    String colourTabShowLessButtonElement = prop.getProperty("Colour", "colour.tab.show.less.button.element");
    String colorTabBlueElement = prop.getProperty("Colour", "colour.tab.blue.element");
    String colorTabBrownElement = prop.getProperty("Colour", "colour.tab.brown.element");
    String colorTabGoldElement = prop.getProperty("Colour", "colour.tab.gold.element");
    String colorTabGreenElement = prop.getProperty("Colour", "colour.tab.green.element");
    String colorTabOrangeElement = prop.getProperty("Colour", "colour.tab.orange.element");
    String colorTabPurpleElement = prop.getProperty("Colour", "colour.tab.purple.element");
    String colorTabRedElement = prop.getProperty("Colour", "colour.tab.red.element");
    String colorTabSilverElement = prop.getProperty("Colour", "colour.tab.silver.element");
    String colorTabWhiteElement = prop.getProperty("Colour", "colour.tab.white.element");
    String colorTabYellowElement = prop.getProperty("Colour", "colour.tab.yellow.element");

    //Remove colors elements
    String removeColorBlueElement = prop.getProperty("Colour", "remove.blue.colour.element");
    String removeColorBrownElement = prop.getProperty("Colour", "remove.brown.colour.element");
    String removeColorGoldElement = prop.getProperty("Colour", "remove.gold.colour.element");
    String removeColorGreenElement = prop.getProperty("Colour", "remove.green.colour.element");
    String removeColorOrangeElement = prop.getProperty("Colour", "remove.orange.colour.element");
    String removeColorPurpleElement = prop.getProperty("Colour", "remove.purple.colour.element");
    String removeColorRedElement = prop.getProperty("Colour", "remove.red.colour.element");
    String removeColorSilverElement = prop.getProperty("Colour", "remove.silver.colour.element");
    String removeColorWhiteElement = prop.getProperty("Colour", "remove.white.colour.element");
    String removeColourYellowElement = prop.getProperty("Colour", "remove.yellow.colour.element");
    String clearAllColorElement = prop.getProperty("Colour", "clear.all.colour.element");

    //Select Colour Element
    public Colour selectColourElement() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(colourTabElement), 20);
        driver.findElement(By.xpath(colourTabElement)).click();
        return this;
    }

    //Show more button click
    public Colour showMoreButtonClickEvent() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(colourTabShowMoreButtonElement), 1000);
        WebElement target = driver.findElement(By.xpath(colourTabShowMoreButtonElement));
        Actions builder = new Actions(driver);
        builder.moveToElement(target).click().build().perform();
        return this;
    }

    //Show less button click
    public Colour showLessButtonClickEvent() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(colourTabShowLessButtonElement), 20);
        driver.findElement(By.xpath(colourTabShowLessButtonElement)).click();
        return this;
    }

    //Select colour elements
    public Colour selectBlueColor() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(colorTabBlueElement), 20);
        driver.findElement(By.xpath(colorTabBlueElement)).click();
        return this;
    }

    public Colour selectBGreenColor() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(colorTabGreenElement), 20);
        driver.findElement(By.xpath(colorTabGreenElement)).click();
        return this;
    }

    public Colour selectBrownColor() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(colorTabBrownElement), 20);
        driver.findElement(By.xpath(colorTabBrownElement)).click();
        return this;
    }

    public Colour selectGoldColor() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(colorTabGoldElement), 20);
        driver.findElement(By.xpath(colorTabGoldElement)).click();
        return this;
    }

    public Colour selectOrangeColor() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(colorTabOrangeElement), 20);
        driver.findElement(By.xpath(colorTabOrangeElement)).click();
        return this;
    }

    public Colour selectPurpleColor() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(colorTabPurpleElement), 20);
        driver.findElement(By.xpath(colorTabPurpleElement)).click();
        return this;
    }

    public Colour selectRedColor() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(colorTabRedElement), 20);
        driver.findElement(By.xpath(colorTabRedElement)).click();
        return this;
    }

    public Colour selectSilverColor() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(colorTabSilverElement), 20);
        driver.findElement(By.xpath(colorTabSilverElement)).click();
        return this;
    }

    public Colour selectWhiteColor() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(colorTabWhiteElement), 20);
        driver.findElement(By.xpath(colorTabWhiteElement)).click();
        return this;
    }

    public Colour selectYellowColor() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(colorTabYellowElement), 20);
        driver.findElement(By.xpath(colorTabYellowElement)).click();
        return this;
    }

    //Remove colours
    public Colour removeBlueColor() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(removeColorBlueElement), 20);
        driver.findElement(By.xpath(removeColorBlueElement)).click();
        return this;
    }

    public Colour removeBrownColor() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(removeColorBrownElement), 20);
        driver.findElement(By.xpath(removeColorBrownElement)).click();
        return this;
    }

    public Colour removeGoldColor() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(removeColorGoldElement), 20);
        driver.findElement(By.xpath(removeColorGoldElement)).click();
        return this;
    }

    public Colour removeGreenColor() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(removeColorGreenElement), 20);
        driver.findElement(By.xpath(removeColorGreenElement)).click();
        return this;
    }

    public Colour removeOrangeColor() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(removeColorOrangeElement), 20);
        driver.findElement(By.xpath(removeColorOrangeElement)).click();
        return this;
    }

    public Colour removePurpleColor() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(removeColorPurpleElement), 20);
        driver.findElement(By.xpath(removeColorPurpleElement)).click();
        return this;
    }

    public Colour removeRedColor() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(removeColorRedElement), 20);
        driver.findElement(By.xpath(removeColorRedElement)).click();
        return this;
    }

    public Colour removeSilverColor() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(removeColorSilverElement), 20);
        driver.findElement(By.xpath(removeColorSilverElement)).click();
        return this;
    }

    public Colour removeWhiteColor() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(removeColorWhiteElement), 20);
        driver.findElement(By.xpath(removeColorWhiteElement)).click();
        return this;
    }

    public Colour removeYellowColor() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(removeColourYellowElement), 20);
        driver.findElement(By.xpath(removeColourYellowElement)).click();
        return this;
    }

    //Remove all
    public Colour clearAllColors() {
        SpriiTestFramework.getInstance().waitForElement(By.linkText(clearAllColorElement), 20);
        driver.findElement(By.linkText(clearAllColorElement)).click();
        return this;
    }

}
