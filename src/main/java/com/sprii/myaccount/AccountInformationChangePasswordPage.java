package com.sprii.myaccount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.PropertyFileReader;
import utils.SpriiTestFramework;

public class AccountInformationChangePasswordPage {
    WebDriver driver = SpriiTestFramework.getInstance().getDriver();
    PropertyFileReader prop = new PropertyFileReader();

    String editFirstnameElement = prop.getProperty("AccountInformationChangePasswordPage","edit.firstname.element");
    String editLastnameElement = prop.getProperty("AccountInformationChangePasswordPage", "edit.lastname.element");
    String emailButtonElement = prop.getProperty("AccountInformationChangePasswordPage", "email.button.element");
    String passwordButtonElement = prop.getProperty("AccountInformationChangePasswordPage", "password.button.element");
    String  currentPasswordElement = prop.getProperty("AccountInformationChangePasswordPage", "current.password.element");
    String  newPasswordElement = prop.getProperty("AccountInformationChangePasswordPage", "new.password.element");
    String  confirmPasswordElement = prop.getProperty("AccountInformationChangePasswordPage", "confirm.password.element");
    String emailFieldElement = prop.getProperty("AccountInformationChangePasswordPage", "email.field.element");
    String  saveButtonElement = prop.getProperty("AccountInformationChangePasswordPage", "save.button.element");
    String goBackElement = prop.getProperty("AccountInformationChangePasswordPage", "go.back.element");



    public AccountInformationChangePasswordPage editUserName(String uname){
        SpriiTestFramework.getInstance().waitForElement(By.id(editFirstnameElement), 20);
        driver.findElement(By.id(editFirstnameElement)).clear();
        driver.findElement(By.id(editFirstnameElement)).sendKeys(uname);
        return this;
    }

    public AccountInformationChangePasswordPage editPassword(String password){
        SpriiTestFramework.getInstance().waitForElement(By.id(editLastnameElement),20);
        driver.findElement(By.id(editLastnameElement)).clear();
        driver.findElement(By.id(editLastnameElement)).sendKeys(password);

        return this;
    }

    public AccountDashboardPage changePassword(String password, String currPassword, String confirmPassword){
        SpriiTestFramework.getInstance().waitForElement(By.id(currentPasswordElement),20);
        driver.findElement(By.id(currentPasswordElement)).sendKeys(password);
        driver.findElement(By.id(newPasswordElement)).sendKeys(currPassword);
        driver.findElement(By.id(confirmPasswordElement)).sendKeys(confirmPassword);
        driver.findElement(By.id(saveButtonElement)).click();
        return new AccountDashboardPage();
    }

    public  AccountDashboardPage changeEmail(String email, String password){

        SpriiTestFramework.getInstance().waitForElement((By.id(emailButtonElement)),20);
        driver.findElement(By.id(emailButtonElement)).click();
        driver.findElement((By.id(passwordButtonElement))).click();
        driver.findElement(By.id(emailFieldElement)).clear();
        driver.findElement(By.id(emailFieldElement)).sendKeys(email);
        driver.findElement((By.id(currentPasswordElement))).sendKeys(password);
        return new AccountDashboardPage();
    }

    public  AccountDashboardPage ChangeEmailandPassword(String email, String password, String currPassword, String confirmPassword){
        SpriiTestFramework.getInstance().waitForElement((By.id(emailButtonElement)),20);
        driver.findElement(By.id(emailButtonElement)).click();
        driver.findElement(By.id(emailFieldElement)).clear();
        driver.findElement(By.id(emailFieldElement)).sendKeys(email);
        driver.findElement(By.id(currentPasswordElement)).sendKeys(password);
        driver.findElement(By.id(newPasswordElement)).sendKeys(currPassword);
        driver.findElement(By.id(confirmPasswordElement)).sendKeys(confirmPassword);
        driver.findElement(By.id(saveButtonElement)).click();

        return new AccountDashboardPage();
    }

    public AccountDashboardPage goBack(){
        SpriiTestFramework.getInstance().waitForElement(By.linkText(goBackElement), 20);
        driver.findElement(By.linkText(goBackElement)).click();

        return new AccountDashboardPage();
    }

}