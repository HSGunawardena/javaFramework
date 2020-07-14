package com.sprii.login;

import com.sprii.forgotpassword.ForgotYourPassword;
import com.sprii.myaccount.AccountDashboardPage;
import com.sprii.myaccount.MyWishListPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.PropertyFileReader;
import utils.SpriiTestFramework;

public class LoginPage {

    WebDriver driver = SpriiTestFramework.getInstance().getDriver();
    PropertyFileReader prop = new PropertyFileReader();

    String userNameElement = prop.getProperty("LoginPage", "user.name.element");
    String passwordElement = prop.getProperty("LoginPage", "password.element");
    String loginButtonElement = prop.getProperty("LoginPage", "login.button.element");
    String createAnAccountButtonElement = prop.getProperty("LoginPage", "create.an.account.button.element");
    String forgotPasswordElement = prop.getProperty("LoginPage", "forgot.password.element");
    String facebookLoginButtonElement = prop.getProperty("LoginPage", "facebook.login.button.element");
    String facebookUsernameElement = prop.getProperty("LoginPage", "facebook.username.element");
    String facebookLoginPasswordElement = prop.getProperty("LoginPage", "facebook.login.pw.element");
    String facebookSignInButton = prop.getProperty("LoginPage", "facebook.sign.in.button");
    String fieldEmailElement = prop.getProperty("LoginPage", "field.email.element");
    String fieldPasswordElement = prop.getProperty("LoginPage", "field.password.element");
    String signInButtonElement = prop.getProperty("LoginPage", "sign.in.button.element");

    //Assertions
    String emailRequiredValidationElement = prop.getProperty("LoginPage", "email.required.validation.element");
    String passwordRequiredValidationElement = prop.getProperty("LoginPage", "password.required.validation.element");
    String incorrectPasswordValidationMsgElement = prop.getProperty("LoginPage", "incorrect.password.validation.msg.element");
    String incorrectEmailFieldValidationMsgElement = prop.getProperty("LoginPage", "incorrect.email.field.validation.msg.element");
    String incorrectEmailAndPasswordValidationMsgElement = prop.getProperty("LoginPage", "incorrect.email.and.password.validation.msg.element");
    String invalidEmailAddressElement = prop.getProperty("LoginPage", "invalid.email.msg.element");
    String guestUserWishListMsgElement = prop.getProperty("LoginPage", "guest.user.wish.list.msg.element");

    public AccountDashboardPage loginSuccess(String username, String password) {
        loginAs(username, password);
        return new AccountDashboardPage();
    }

    public MyWishListPage loginSuccessForGuestWishList(String username, String password) {
        loginAs(username, password);
        return new MyWishListPage();
    }

    public LoginPage loginUnSuccess(String username, String password) {
        loginAs(username, password);
        return this;
    }

    public CreateAnAccount customerCreation() {
        SpriiTestFramework.getInstance().waitForElement(By.linkText(createAnAccountButtonElement), 20);
        driver.findElement(By.linkText(createAnAccountButtonElement)).click();
        return new CreateAnAccount();
    }

    public ForgotYourPassword resetPassword() {
        SpriiTestFramework.getInstance().waitForElement(By.linkText(forgotPasswordElement), 20);
        driver.findElement(By.linkText(forgotPasswordElement)).click();
        return new ForgotYourPassword();
    }

    public AccountDashboardPage facebookLogin(String uname, String pw) {
        String parentHandle = driver.getWindowHandle();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(facebookLoginButtonElement), 20);
        driver.findElement(By.xpath(facebookLoginButtonElement)).click();

        for (String winhandles : driver.getWindowHandles()) {
            driver.switchTo().window(winhandles);
        }

        SpriiTestFramework.getInstance().waitForElement(By.xpath(facebookUsernameElement), 20);
        driver.findElement(By.xpath(facebookUsernameElement)).sendKeys(uname);
        driver.findElement(By.xpath(facebookLoginPasswordElement)).sendKeys(pw);
        driver.findElement(By.xpath(facebookSignInButton)).click();
        //driver.close();
        //driver.switchTo().window(parentHandle);
        return new AccountDashboardPage();
    }

    private void loginAs(String username, String password) {
        SpriiTestFramework.getInstance().waitForElement(By.name(userNameElement), 20);
        driver.findElement(By.name(userNameElement)).sendKeys(username);
        driver.findElement(By.name(passwordElement)).sendKeys(password);
        driver.findElement(By.xpath(loginButtonElement)).click();
    }

    public LoginPage setEmail(String email) {
        SpriiTestFramework.getInstance().waitForElement(By.id(fieldEmailElement), 20);
        driver.findElement(By.id(fieldEmailElement)).sendKeys(email);
        return this;
    }

    public LoginPage setPassword(String password) {
        SpriiTestFramework.getInstance().waitForElement(By.id(fieldPasswordElement), 20);
        driver.findElement(By.id(fieldPasswordElement)).sendKeys(password);
        return this;
    }

    public AccountDashboardPage selectSignIn() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(signInButtonElement), 20);
        driver.findElement(By.xpath(signInButtonElement)).click();
        return new AccountDashboardPage();
    }

    public boolean emailRequiredValidationMsgIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(emailRequiredValidationElement), 20);
        String emailRequiredValidationMsg = driver.findElement(By.xpath(emailRequiredValidationElement)).getText();
        if (emailRequiredValidationMsg.equals("This is a required field.")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean passwordRequiredValidationMsgIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(passwordRequiredValidationElement), 20);
        String passwordRequiredValidationMsg = driver.findElement(By.xpath(passwordRequiredValidationElement)).getText();
        if (passwordRequiredValidationMsg.equals("This is a required field.")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean msgForIncorrectPasswordIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(incorrectPasswordValidationMsgElement), 20);
        String msgForIncorrectPassword = driver.findElement(By.xpath(incorrectPasswordValidationMsgElement)).getText();
        if (msgForIncorrectPassword.equals("The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later.")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean msgForIncorrectEmailIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(incorrectEmailFieldValidationMsgElement), 100);
        String msgForIncorrectEmail = driver.findElement(By.xpath(incorrectEmailFieldValidationMsgElement)).getText();
        if (msgForIncorrectEmail.equals("The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later.")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean msgForIncorrectEmailAndPasswordIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(incorrectEmailAndPasswordValidationMsgElement), 20);
        String msgForIncorrectEmailAndPassword = driver.findElement(By.xpath(incorrectEmailAndPasswordValidationMsgElement)).getText();
        if (msgForIncorrectEmailAndPassword.equals("The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later.")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean msgForInvalidEmailAddressIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(invalidEmailAddressElement), 20);
        String msgForInvalidEmail = driver.findElement(By.xpath(invalidEmailAddressElement)).getText();
        if (msgForInvalidEmail.equals("Please enter a valid email address (Ex: johndoe@domain.com).")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean msgForGuestUserWishListIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(guestUserWishListMsgElement), 20);
        String msgForGuestUserWishListMsg = driver.findElement(By.xpath(guestUserWishListMsgElement)).getText();
        if (msgForGuestUserWishListMsg.equals("You must login or register to add items to your wishlist.")) {
            return true;
        } else {
            return false;
        }
    }

}
