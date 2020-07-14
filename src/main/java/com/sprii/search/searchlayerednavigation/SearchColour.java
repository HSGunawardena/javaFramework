package com.sprii.search.searchlayerednavigation;

import com.sprii.plp.layerednavigation.color.Colour;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.PropertyFileReader;
import utils.SpriiTestFramework;

public class SearchColour {
    WebDriver driver = SpriiTestFramework.getInstance().getDriver();
    PropertyFileReader prop = new PropertyFileReader();

    //Select color tab in layered navigation elements
    String colourTabElement = prop.getProperty("SearchColour", "search.colour.tab.element");
    String colourTabShowMoreButtonElement = prop.getProperty("SearchColour", "search.colour.tab.show.more.button.element");
    String colourTabShowLessButtonElement = prop.getProperty("SearchColour", "search.colour.tab.show.less.button.element");
    String colorTabBlueElement = prop.getProperty("SearchColour", "search.colour.tab.blue.element");
    String colorTabBrownElement = prop.getProperty("SearchColour", "search.colour.tab.brown.element");
    String colorTabGoldElement = prop.getProperty("SearchColour", "search.colour.tab.gold.element");
    String colorTabGreenElement = prop.getProperty("SearchColour", "search.colour.tab.green.element");
    String colorTabOrangeElement = prop.getProperty("SearchColour", "search.colour.tab.orange.element");
    String colorTabPurpleElement = prop.getProperty("SearchColour", "search.colour.tab.purple.element");
    String colorTabRedElement = prop.getProperty("SearchColour", "search.colour.tab.red.element");
    String colorTabSilverElement = prop.getProperty("SearchColour", "search.colour.tab.silver.element");
    String colorTabWhiteElement = prop.getProperty("SearchColour", "search.colour.tab.white.element");
    String colorTabYellowElement = prop.getProperty("SearchColour", "search.colour.tab.yellow.element");

    //Remove colors elements
    String removeColorBlueElement = prop.getProperty("SearchColour", "search.remove.blue.colour.element");
    String removeColorBrownElement = prop.getProperty("SearchColour", "search.remove.brown.colour.element");
    String removeColorGoldElement = prop.getProperty("SearchColour", "search.remove.gold.colour.element");
    String removeColorGreenElement = prop.getProperty("SearchColour", "search.remove.green.colour.element");
    String removeColorOrangeElement = prop.getProperty("SearchColour", "search.remove.orange.colour.element");
    String removeColorPurpleElement = prop.getProperty("SearchColour", "search.remove.purple.colour.element");
    String removeColorRedElement = prop.getProperty("SearchColour", "search.remove.red.colour.element");
    String removeColorSilverElement = prop.getProperty("SearchColour", "search.remove.silver.colour.element");
    String removeColorWhiteElement = prop.getProperty("SearchColour", "search.remove.white.colour.element");
    String removeColourYellowElement = prop.getProperty("SearchColour", "search.remove.yellow.colour.element");
    String clearAllColorElement = prop.getProperty("SearchColour", "search.clear.all.colour.element");

    //Select Colour Element
    public SearchColour selectColourElement() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(colourTabElement), 20);
        driver.findElement(By.xpath(colourTabElement)).click();
        return this;
    }

    //Show more button click
    public SearchColour showMoreButtonClickEvent() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(colourTabShowMoreButtonElement), 1000);
        WebElement target = driver.findElement(By.xpath(colourTabShowMoreButtonElement));
        Actions builder = new Actions(driver);
        builder.moveToElement(target).click().build().perform();
        return this;
    }

    //Show less button click
    public SearchColour showLessButtonClickEvent() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(colourTabShowLessButtonElement), 20);
        driver.findElement(By.xpath(colourTabShowLessButtonElement)).click();
        return this;
    }

    //Select SearchColour elements
    public SearchColour selectBlueColor() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(colorTabBlueElement), 20);
        driver.findElement(By.xpath(colorTabBlueElement)).click();
        return this;
    }

    public SearchColour selectBGreenColor() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(colorTabGreenElement), 20);
        driver.findElement(By.xpath(colorTabGreenElement)).click();
        return this;
    }

    public SearchColour selectBrownColor() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(colorTabBrownElement), 20);
        driver.findElement(By.xpath(colorTabBrownElement)).click();
        return this;
    }

    public SearchColour selectGoldColor() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(colorTabGoldElement), 20);
        driver.findElement(By.xpath(colorTabGoldElement)).click();
        return this;
    }

    public SearchColour selectOrangeColor() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(colorTabOrangeElement), 20);
        driver.findElement(By.xpath(colorTabOrangeElement)).click();
        return this;
    }

    public SearchColour selectPurpleColor() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(colorTabPurpleElement), 20);
        driver.findElement(By.xpath(colorTabPurpleElement)).click();
        return this;
    }

    public SearchColour selectRedColor() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(colorTabRedElement), 20);
        driver.findElement(By.xpath(colorTabRedElement)).click();
        return this;
    }

    public SearchColour selectSilverColor() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(colorTabSilverElement), 20);
        driver.findElement(By.xpath(colorTabSilverElement)).click();
        return this;
    }

    public SearchColour selectWhiteColor() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(colorTabWhiteElement), 20);
        driver.findElement(By.xpath(colorTabWhiteElement)).click();
        return this;
    }

    public SearchColour selectYellowColor() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(colorTabYellowElement), 20);
        driver.findElement(By.xpath(colorTabYellowElement)).click();
        return this;
    }

    //Remove colours
    public SearchColour removeBlueColor() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(removeColorBlueElement), 20);
        driver.findElement(By.xpath(removeColorBlueElement)).click();
        return this;
    }

    public SearchColour removeBrownColor() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(removeColorBrownElement), 20);
        driver.findElement(By.xpath(removeColorBrownElement)).click();
        return this;
    }

    public SearchColour removeGoldColor() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(removeColorGoldElement), 20);
        driver.findElement(By.xpath(removeColorGoldElement)).click();
        return this;
    }

    public SearchColour removeGreenColor() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(removeColorGreenElement), 20);
        driver.findElement(By.xpath(removeColorGreenElement)).click();
        return this;
    }

    public SearchColour removeOrangeColor() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(removeColorOrangeElement), 20);
        driver.findElement(By.xpath(removeColorOrangeElement)).click();
        return this;
    }

    public SearchColour removePurpleColor() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(removeColorPurpleElement), 20);
        driver.findElement(By.xpath(removeColorPurpleElement)).click();
        return this;
    }

    public SearchColour removeRedColor() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(removeColorRedElement), 20);
        driver.findElement(By.xpath(removeColorRedElement)).click();
        return this;
    }

    public SearchColour removeSilverColor() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(removeColorSilverElement), 20);
        driver.findElement(By.xpath(removeColorSilverElement)).click();
        return this;
    }

    public SearchColour removeWhiteColor() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(removeColorWhiteElement), 20);
        driver.findElement(By.xpath(removeColorWhiteElement)).click();
        return this;
    }

    public SearchColour removeYellowColor() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(removeColourYellowElement), 20);
        driver.findElement(By.xpath(removeColourYellowElement)).click();
        return this;
    }

    //Remove all
    public SearchColour clearAllColors() {
        SpriiTestFramework.getInstance().waitForElement(By.linkText(clearAllColorElement), 20);
        driver.findElement(By.linkText(clearAllColorElement)).click();
        return this;
    }

}
