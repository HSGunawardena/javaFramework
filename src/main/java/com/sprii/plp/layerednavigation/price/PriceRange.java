package com.sprii.plp.layerednavigation.price;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.PropertyFileReader;
import utils.SpriiTestFramework;


public class PriceRange {

    WebDriver driver = SpriiTestFramework.getInstance().getDriver();
    PropertyFileReader prop = new PropertyFileReader();
    WebDriverWait wait;

    String priceTabElement = prop.getProperty("PriceRange", "price.tab.element");
    String priceRangeSliderBarElement = prop.getProperty("PriceRange", "price.range.slider.bar.element");
    String priceSliderLeftElement = prop.getProperty("PriceRange", "price.slider.left.element");
    String priceSliderRightElement = prop.getProperty("PriceRange", "price.slider.right.element");

    public PriceRange clickEventOnPrice() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(priceTabElement), 20);
        driver.findElement(By.xpath(priceTabElement)).click();
        return this;
    }

    public WebElement findElement(By locator) {
        return
                wait.until(ExpectedConditions.
                        elementToBeClickable(locator));
    }

    public WebElement findHiddenElement(By locator) {
        return
                wait.until(ExpectedConditions.
                        presenceOfElementLocated(locator));
    }

    public PriceRange movePriceSlider() {
        WebElement priceSilder = driver.findElement(By.xpath(priceRangeSliderBarElement));
        Dimension sliderSize = priceSilder.getSize();

        int sliderWidth = sliderSize.getWidth();
        int xCoord = priceSilder.getLocation().getX();

        Actions builder = new Actions(driver);
        builder.moveToElement(priceSilder)
                .click()
                .dragAndDropBy(priceSilder, xCoord + sliderWidth, 0)
                .build()
                .perform();

        WebElement hiddenPrice = findHiddenElement(By.xpath(priceSliderLeftElement));
        int priceValue = Integer.parseInt(hiddenPrice.getAttribute("value"));

        priceSilder = findElement(By.xpath(priceRangeSliderBarElement));
        String sliderPercent = priceSilder.getAttribute("price");
        return this;
    }

    //public PriceRange selectPriceRange(int x){

        /*TestApp.getInstance().waitForElement(By.xpath(priceRangeSliderBarElement), 20);
        WebElement slider = driver.findElement(By.xpath(priceRangeSliderBarElement));
        int width = slider.getSize().getWidth();
        Actions act= new Actions(driver);
        act.moveToElement(slider, ((width*x)/100), 0).click();
        act.build().perform(); */

       /* WebElement Slider = driver.findElement(By.xpath(priceRangeSliderBarElement));
        int PixelsToMove = GetP(Slider, 7, 18, 2)
        Actions SliderAction = new Actions(driver);
        SliderAction.ClickAndHold(Slider)
                .MoveByOffset((-(int)Slider.Size.Width / 2),0)
                .MoveByOffset(PixelsToMove, 0).Release().Perform();

        return this;
    }

    public static int GetPixelsToMove(WebElement Slider, double Amount, double SliderMax, double SliderMin)
    {
        int pixels = 0;
        double tempPixels = Slider.getSize().getWidth();
        tempPixels = tempPixels / (SliderMax - SliderMin);
        tempPixels = tempPixels * (Amount - SliderMin);
        pixels = Convert.ToInt32(tempPixels);
        return pixels;
    }*/


}
