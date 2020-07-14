package com.sprii.search.searchlayerednavigation;

import com.sprii.plp.layerednavigation.deliverytime.DeliveryTime;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.PropertyFileReader;
import utils.SpriiTestFramework;

public class SearchDeliveryTime {
    WebDriver driver = SpriiTestFramework.getInstance().getDriver();
    PropertyFileReader prop = new PropertyFileReader();

    String deliveryTimeTabElement = prop.getProperty("SearchDeliveryTime", "search.delivery.time.tab.element");
    String hoursDeliveryTimeTabElement = prop.getProperty("SearchDeliveryTime", "search.24.hours.delivery.time.element");
    String deliveryTimeRemoveElement = prop.getProperty("SearchDeliveryTime", "search.delivery.time.remove.element");
    String deliveryTimeClearAllElement = prop.getProperty("SearchDeliveryTime", "search.clear.all.element");

    //Select Delivery tab in layered navigation
    public SearchDeliveryTime clickEventOnDeliveryTimeTab() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(deliveryTimeTabElement), 20);
        driver.findElement(By.xpath(deliveryTimeTabElement)).click();
        return this;
    }

    //Select delivery time
    public SearchDeliveryTime select24HoursDeliveryTime() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(hoursDeliveryTimeTabElement), 20);
        driver.findElement(By.xpath(hoursDeliveryTimeTabElement)).click();
        return this;
    }

    //Remove selected delivery tab
    public SearchDeliveryTime remove24HoursDeliveryTime() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(deliveryTimeRemoveElement), 20);
        driver.findElement(By.xpath(deliveryTimeRemoveElement)).click();
        return this;
    }

    //Remove all selected items
    public SearchDeliveryTime clearAllClickEvent() {
        SpriiTestFramework.getInstance().waitForElement(By.linkText(deliveryTimeClearAllElement), 20);
        driver.findElement(By.linkText(deliveryTimeClearAllElement)).click();
        return this;
    }
}
