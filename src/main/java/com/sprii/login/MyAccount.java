package com.sprii.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.PropertyFileReader;
import utils.SpriiTestFramework;

public class MyAccount {
    WebDriver driver = SpriiTestFramework.getInstance().getDriver();
    PropertyFileReader propertyFileReader = new PropertyFileReader();

    String myAccountTitleElement = propertyFileReader.getProperty("MyAccountPage", "my.account.title.element");

    public boolean titleIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(myAccountTitleElement), 5);
        String title = driver.findElement(By.xpath(myAccountTitleElement)).getText();
        if(title.equals("MY ACCOUNT")){
            return true;
        }else{
            return false;
        }
    }
}
