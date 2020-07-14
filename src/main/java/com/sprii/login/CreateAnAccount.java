package com.sprii.login;

import com.sprii.myaccount.AccountDashboardPage;
import com.sprii.myaccount.CreateAccountPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.PropertyFileReader;
import utils.SpriiTestFramework;

public class CreateAnAccount {
    WebDriver driver   = SpriiTestFramework.getInstance().getDriver();
    PropertyFileReader prop = new PropertyFileReader();

    String firstNameElement = prop.getProperty("CreateAnAccount","first.name.element");
    String lastNameElement = prop.getProperty("CreateAnAccount","last.name.element");
    String emailElement = prop.getProperty("CreateAnAccount","email.element");
    String passwordElement = prop.getProperty("CreateAnAccount","password.element");
    String passwordConfirmationElement = prop.getProperty("CreateAnAccount","password.confirmation.element");
    String submitButtonElement = prop.getProperty("CreateAnAccount","submit.button.element");
    String facebookButtonElement = prop.getProperty("CreateAnAccount","facebook.button.element");
    String userEmailElement = prop.getProperty("CreateAnAccount","user.email.element");
    String userPasswordElement = prop.getProperty("CreateAnAccount","user.password.element");
    String signButtonElement = prop.getProperty("CreateAnAccount","sign.button.element");



    public CreateAnAccount setFirstName(String fName){
        SpriiTestFramework.getInstance().waitForElement(By.id(firstNameElement),20);
        driver.findElement(By.id(firstNameElement)).sendKeys(fName);
        return this;
    }

    public CreateAnAccount setLastName(String lName){
        SpriiTestFramework.getInstance().waitForElement(By.id(lastNameElement), 20);
        driver.findElement(By.id(lastNameElement)).sendKeys(lName);
        return this;
    }

    public CreateAnAccount setEmail(String email){
        SpriiTestFramework.getInstance().waitForElement(By.id(emailElement), 20);
        driver.findElement(By.id(emailElement)).sendKeys(email);
        return this;
    }

    public CreateAnAccount setPassword (String password){
        SpriiTestFramework.getInstance().waitForElement(By.id(passwordElement),20);
        driver.findElement(By.id(passwordElement)).sendKeys(password);
        return this;
    }

    public CreateAnAccount setConfirmPassword(String confirmPassword){
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
