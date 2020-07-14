package com.sprii.myaccount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.PropertyFileReader;
import utils.SpriiTestFramework;

public class ManageYourPreferencesPage {

    WebDriver driver = SpriiTestFramework.getInstance().getDriver();
    PropertyFileReader prop = new PropertyFileReader();

    String radioButtonElement = prop.getProperty("ManageYourPreferencesPage", "radio.button.element");
    String saveButtonElement = prop.getProperty("ManageYourPreferencesPage", "save.button.element");
    String backButtonElement = prop.getProperty("ManageYourPreferencesPage", "back.button.element");


    public ManageYourPreferencesPage getNewsLetter(){
        SpriiTestFramework.getInstance().waitForElement(By.id(radioButtonElement), 20);
        driver.findElement(By.id(radioButtonElement)).click();
        return this;
    }

    public AccountDashboardPage selectSaveButton(){
        SpriiTestFramework.getInstance().waitForElement(By.xpath(saveButtonElement), 20);
        driver.findElement(By.xpath(saveButtonElement)).click();
        return new AccountDashboardPage();
    }

    public AccountDashboardPage selectBackButton(){
        SpriiTestFramework.getInstance().waitForElement(By.linkText(backButtonElement), 20);
        driver.findElement(By.linkText(backButtonElement)).click();
        return new AccountDashboardPage();
    }
}
