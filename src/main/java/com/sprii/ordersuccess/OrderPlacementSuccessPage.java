package com.sprii.ordersuccess;

import com.sprii.home.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.PropertyFileReader;
import utils.SpriiTestFramework;

public class OrderPlacementSuccessPage {
    WebDriver driver = SpriiTestFramework.getInstance().getDriver();
    PropertyFileReader propertyFileReader = new PropertyFileReader();

    String orderNumberElement = propertyFileReader.getProperty(
            "OrderPlacementSuccessPage",
            "order.number.element");
    String orderSuccessContinueShoppingLinkElement = propertyFileReader.getProperty(
            "OrderPlacementSuccessPage",
            "order.success.continue.shopping.link.element");

    public String getOrderID() {
        String orderID;
        SpriiTestFramework.getInstance().waitForElement(By.xpath(orderNumberElement), 15);
        orderID = driver.findElement(By.xpath(orderNumberElement)).getText();
        return orderID;
    }

    public HomePage clickContinueShoppingLink(){
        SpriiTestFramework.getInstance().waitForElement(By.xpath(orderSuccessContinueShoppingLinkElement), 200);
        driver.findElement(By.xpath(orderSuccessContinueShoppingLinkElement)).click();
        return new HomePage();
    }
}
