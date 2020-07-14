package com.sprii.regressionTestSuite;

import com.sprii.footer.FacebookPage;
import com.sprii.forgotpassword.ForgotYourPassword;
import com.sprii.header.Header;
import com.sprii.login.CreateAnAccount;
import com.sprii.login.LoginPage;
import com.sprii.login.LogoutSuccessPage;
import com.sprii.login.MyAccount;
import com.sprii.myaccount.AccountDashboardPage;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.SpriiTestFramework;

public class LoginPageTest {

    LoginPage login;
    Header header;
    MyAccount myAccount;
    AccountDashboardPage accountDashboardPage;
    LogoutSuccessPage logoutSuccessPage;
    ForgotYourPassword forgotYourPassword;
    CreateAnAccount createAnAccount;
    FacebookPage facebookPage;
    Boolean emailRequiredValidationMsg;
    Boolean passwordRequiredValidationMsg;
    Boolean incorrectPasswordMsg;
    Boolean incorrectEmailMsg;
    Boolean incorrectEmailAndPasswordMsg;
    Boolean invalidEmailMsg;

    @BeforeClass
    public void beforeClass() {
        SpriiTestFramework.getInstance().openBrowser();
    }

    @BeforeMethod
    public void setUp() throws Exception {
        SpriiTestFramework.getInstance().navigateToURL();
        login = new LoginPage();
        header = new Header();
        myAccount = new MyAccount();

        login = header
                .redirectToSignInPage();

    }

    @Test(priority = 10)
    public void testLoginSuccess() throws Exception {
        logoutSuccessPage = login
                .loginSuccess("sureni+1@sprii.com", "surenisprii@#123")
                .selectLogout();
    }

    @Test(priority = 2)
    public void testLoginUnSuccessWithInvalidEmail() throws Exception {
        invalidEmailMsg = login
                .loginUnSuccess("sureni+1sprii.com", "surenisprii@#123")
                .msgForInvalidEmailAddressIsAvailable();
        Assert.assertTrue(invalidEmailMsg);
    }

    @Test(priority = 3)
    public void testLoginUnSuccessWithWrongEmail() throws Exception {
        login
                .loginUnSuccess("sureniajdh@sprii.com", "surenisprii@#123");
        Thread.sleep(5000);
        incorrectEmailMsg = login
                .msgForIncorrectEmailIsAvailable();
        Assert.assertTrue(incorrectEmailMsg);
    }

    @Test(priority = 4)
    public void testLoginUnSuccessWithIncorrectPassword() throws Exception {
        login
                .loginUnSuccess("sureni+1@sprii.com", "surenisprii@#");
        Thread.sleep(5000);
        incorrectPasswordMsg = login
                .msgForIncorrectPasswordIsAvailable();
        Assert.assertTrue(incorrectPasswordMsg);
    }

    @Test(priority = 5)
    public void testLoginUnSuccessWithIncorrectPasswordAndIcorrectEmail() throws Exception {
        login
                .loginUnSuccess("sureniwewew@sprii.com", "surenisprii@#");
        Thread.sleep(5000);
        incorrectEmailAndPasswordMsg = login
                .msgForIncorrectEmailAndPasswordIsAvailable();
        Assert.assertTrue(incorrectEmailAndPasswordMsg);
    }

    @Test(priority = 6)
    public void testLoginButtonClickWithoutEnteringEmailAndPassword() throws Exception {
        emailRequiredValidationMsg = login
                .loginUnSuccess("", "")
                .emailRequiredValidationMsgIsAvailable();
        Assert.assertTrue(emailRequiredValidationMsg);

        passwordRequiredValidationMsg = login
                .passwordRequiredValidationMsgIsAvailable();
        Assert.assertTrue(passwordRequiredValidationMsg);
    }

    @Test(priority = 7)
    public void testForgotYourPasswordLink() throws Exception {
        forgotYourPassword = login
                .resetPassword();
    }

    @Test(priority = 8)
    public void testCreateAccountButtonClick() throws Exception {
        createAnAccount = login
                .customerCreation();
    }

    @Test(priority = 9)
    public void testFaceBookLogin() throws Exception {
        login
                .facebookLogin("sureni@sprii.com", "Sprii@#123");
    }

    @AfterClass
    public void afterClass() throws Exception {
        SpriiTestFramework.getInstance().closeBrowser();
    }
}
