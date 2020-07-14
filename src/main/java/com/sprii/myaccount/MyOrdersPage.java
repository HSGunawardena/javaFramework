package com.sprii.myaccount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.PropertyFileReader;
import utils.SpriiTestFramework;

public class MyOrdersPage {

    WebDriver driver = SpriiTestFramework.getInstance().getDriver();
    PropertyFileReader prop = new PropertyFileReader();

    String pageTitleElement = prop.getProperty("MyOrdersPage", "page.title.element");

    public MyOrdersPage getPageTitle(){
     SpriiTestFramework.getInstance().waitForElement(By.className(pageTitleElement), 20);
     driver.findElement(By.className(pageTitleElement)).getText();

        return this;
    }

}
