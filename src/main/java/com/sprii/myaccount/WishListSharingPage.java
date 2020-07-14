package com.sprii.myaccount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.PropertyFileReader;
import utils.SpriiTestFramework;

public class WishListSharingPage {

    WebDriver driver = SpriiTestFramework.getInstance().getDriver();
    PropertyFileReader prop = new PropertyFileReader();

    String emailAddressElement = prop.getProperty("WishListSharingPage", "email.address.element");
    String messageElement = prop.getProperty("WishListSharingPage", "message.element");
    String shareButtonElement = prop.getProperty("WishListSharingPage", "share.button.element");
    String backButtonElement = prop.getProperty("WishListSharingPage", "back.button.element");

    public WishListSharingPage setEmails(String emails){
        SpriiTestFramework.getInstance().waitForElement(By.id(emailAddressElement), 20);
        driver.findElement(By.id(emailAddressElement)).sendKeys(emails);
        return this;
    }

    public WishListSharingPage setMessage(String message){
        SpriiTestFramework.getInstance().waitForElement(By.id(messageElement), 20);
        driver.findElement(By.id(messageElement)).sendKeys(message);
        return this;
    }

    public MyWishListPage selectShareWishList(){
        SpriiTestFramework.getInstance().waitForElement(By.xpath(shareButtonElement), 20);
        driver.findElement(By.xpath(shareButtonElement)).click();
        return new MyWishListPage();
    }

    public MyWishListPage selectBackButton(){
        SpriiTestFramework.getInstance().waitForElement(By.id(backButtonElement), 20);
        driver.findElement(By.id(backButtonElement)).click();
        return new MyWishListPage();
    }

}
