package com.sprii.regressionTestSuite;

import com.sprii.forgotpassword.ForgotYourPassword;
import com.sprii.header.Header;
import com.sprii.login.LoginPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.SpriiTestFramework;

public class ForgotYourPasswordTest {

    LoginPage login;
    Header header;
    ForgotYourPassword forgotPasswordPage;

    @BeforeClass
    public void beforeClass() {
        SpriiTestFramework.getInstance().openBrowser();
        SpriiTestFramework.getInstance().navigateToURL();
    }

    @BeforeMethod
    public void setUp() throws Exception {
        login = new LoginPage();
        header = new Header();
        forgotPasswordPage = new ForgotYourPassword();

        forgotPasswordPage = header.redirectToSignInPage().resetPassword();

    }

    @Test(priority = 1)
    public void testResetEmailSuccess() throws Exception {
        login = forgotPasswordPage
                .resetEmailSuccess("sureni+1@sprii.com");
    }

    @Test(priority = 2)
    public void testResetEmailUnSuccess() throws Exception {
        login = forgotPasswordPage
                .resetEmailSuccess("sureni+1sprii.com");
    }

    @Test(priority = 3)
    public void testGoBackLink() throws Exception {
        login = forgotPasswordPage
                .goBackLink();
    }

    @AfterClass
    public void afterClass() {
        SpriiTestFramework.getInstance().closeBrowser();
    }
}
