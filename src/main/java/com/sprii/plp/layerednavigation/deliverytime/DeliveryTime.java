package com.sprii.plp.layerednavigation.deliverytime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.PropertyFileReader;
import utils.SpriiTestFramework;

public class DeliveryTime {

    WebDriver driver = SpriiTestFramework.getInstance().getDriver();
    PropertyFileReader prop = new PropertyFileReader();

    String deliveryTimeTabElement = prop.getProperty("DeliveryTime", "delivery.time.tab.element");
    String hoursDeliveryTimeTabElement = prop.getProperty("DeliveryTime", "24.hours.delivery.time.element");
    String deliveryTimeRemoveElement = prop.getProperty("DeliveryTime", "delivery.time.remove.element");
    String deliveryTimeClearAllElement = prop.getProperty("DeliveryTime", "clear.all.element");

    //Select Delivery tab in layered navigation
    public DeliveryTime clickEventOnDeliveryTimeTab() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(deliveryTimeTabElement), 20);
        driver.findElement(By.xpath(deliveryTimeTabElement)).click();
        return this;
    }

    //Select delivery time
    public DeliveryTime select24HoursDeliveryTime() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(hoursDeliveryTimeTabElement), 20);
        driver.findElement(By.xpath(hoursDeliveryTimeTabElement)).click();
        return this;
    }

    //Remove selected delivery tab
    public DeliveryTime remove24HoursDeliveryTime() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(deliveryTimeRemoveElement), 20);
        driver.findElement(By.xpath(deliveryTimeRemoveElement)).click();
        return this;
    }

    //Remove all selected items
    public DeliveryTime clearAllClickEvent() {
        SpriiTestFramework.getInstance().waitForElement(By.linkText(deliveryTimeClearAllElement), 20);
        driver.findElement(By.linkText(deliveryTimeClearAllElement)).click();
        return this;
    }
}
