package com.sprii.myaccount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.PropertyFileReader;
import utils.SpriiTestFramework;

public class CreateAccountPage {
    WebDriver driver   = SpriiTestFramework.getInstance().getDriver();
    PropertyFileReader prop = new PropertyFileReader();

    String firstNameElement = prop.getProperty("CreateAccountPage","first.name.element");
    String lastNameElement = prop.getProperty("CreateAccountPage","last.name.element");
    String emailElement = prop.getProperty("CreateAccountPage","email.element");
    String passwordElement = prop.getProperty("CreateAccountPage","password.element");
    String passwordConfirmationElement = prop.getProperty("CreateAccountPage","password.confirmation.element");
    String submitButtonElement = prop.getProperty("CreateAccountPage","submit.button.element");
    String facebookButtonElement = prop.getProperty("CreateAccountPage","facebook.button.element");
    String userEmailElement = prop.getProperty("CreateAccountPage","user.email.element");
    String userPasswordElement = prop.getProperty("CreateAccountPage","user.password.element");
    String signButtonElement = prop.getProperty("CreateAccountPage","sign.button.element");



    public CreateAccountPage setFirstName(String fName){
        SpriiTestFramework.getInstance().waitForElement(By.id(firstNameElement),20);
        driver.findElement(By.id(firstNameElement)).sendKeys(fName);
        return this;
    }

    public CreateAccountPage setLastName(String lName){
        SpriiTestFramework.getInstance().waitForElement(By.id(lastNameElement), 20);
        driver.findElement(By.id(lastNameElement)).sendKeys(lName);
        return this;
    }

    public CreateAccountPage setEmail(String email){
        SpriiTestFramework.getInstance().waitForElement(By.id(emailElement), 20);
        driver.findElement(By.id(emailElement)).sendKeys(email);
        return this;
    }

    public CreateAccountPage setPassword (String password){
        SpriiTestFramework.getInstance().waitForElement(By.id(passwordElement),20);
        driver.findElement(By.id(passwordElement)).sendKeys(password);
        return this;
    }

    public CreateAccountPage setConfirmPassword(String confirmPassword){
        SpriiTestFramework.getInstance().waitForElement(By.id(passwordConfirmationElement),20);
        driver.findElement(By.id(passwordConfirmationElement)).sendKeys(confirmPassword);
        return this;
    }

    public AccountDashboardPage submit(){
        driver.findElement(By.xpath(submitButtonElement)).click();
        return new AccountDashboardPage();
    }

    public AccountDashboardPage selectLoginFacebook(){
        String parentHandle = driver.getWindowHandle();
        driver.findElement(By.xpath(facebookButtonElement)).click(); // switching to new window
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        return new AccountDashboardPage();
    }

    public AccountDashboardPage loginfacebook(String username, String password){
        SpriiTestFramework.getInstance().waitForElement(By.id(userEmailElement),20);
        driver.findElement(By.id(userEmailElement)).sendKeys(username);
        driver.findElement(By.id(userPasswordElement)).sendKeys(password);
        driver.findElement(By.id(signButtonElement)).click();
        return new AccountDashboardPage();
    }

}
