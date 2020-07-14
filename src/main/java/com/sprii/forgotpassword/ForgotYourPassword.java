package com.sprii.forgotpassword;

import com.sprii.login.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.PropertyFileReader;
import utils.SpriiTestFramework;

public class ForgotYourPassword {

    WebDriver driver = SpriiTestFramework.getInstance().getDriver();
    PropertyFileReader prop = new PropertyFileReader();

    String emailAddressElement = prop.getProperty("ForgotYourPassword", "email.address.element");
    String goBackElement = prop.getProperty("ForgotYourPassword", "go.back.element");
    String resetMyPasswordElement = prop.getProperty("ForgotYourPassword", "reset.my.password.element");

    public LoginPage resetEmailSuccess(String email){
        setEmailAs(email);
        return new LoginPage();
    }

    public ForgotYourPassword resetEmailUnSuccess(String email){
        setEmailAs(email);
        return this;
    }

    public LoginPage goBackLink(){
        driver.findElement(By.linkText(goBackElement)).click();
        return new LoginPage();
    }

    private void setEmailAs(String email){
        SpriiTestFramework.getInstance().waitForElement(By.xpath(emailAddressElement), 20);
        driver.findElement(By.xpath(emailAddressElement)).sendKeys(email);
        driver.findElement(By.xpath(resetMyPasswordElement)).click();
    }
}
