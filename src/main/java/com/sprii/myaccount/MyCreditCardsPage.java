package com.sprii.myaccount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.PropertyFileReader;
import utils.SpriiTestFramework;

public class MyCreditCardsPage {

    WebDriver driver = SpriiTestFramework.getInstance().getDriver();
    PropertyFileReader prop = new PropertyFileReader();

    String deleteCardElement = prop.getProperty("MyCreditCardsPage", "delete.card.element");

    public MyCreditCardsPage deleteCardDetails(){
        SpriiTestFramework.getInstance().waitForElement(By.linkText(deleteCardElement), 20);
        driver.findElement(By.linkText(deleteCardElement)).click();
        return this;
    }
}
