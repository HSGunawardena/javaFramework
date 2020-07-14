package com.sprii.regressionTestSuite;

import com.sprii.header.Header;
import com.sprii.home.HomePage;
import com.sprii.login.CreateAnAccount;
import com.sprii.myaccount.AccountDashboardPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.SpriiTestFramework;

public class UserRegisterTest {
    private HomePage homepage;
    private Header headerPage;
    private CreateAnAccount createAnAccountPage;
    private AccountDashboardPage accountDashboardPage;


    @BeforeMethod
    public void setUp() {
        SpriiTestFramework.getInstance().openBrowser();
        SpriiTestFramework.getInstance().navigateToURL();
        homepage = new HomePage();
        headerPage = new Header();
        createAnAccountPage = new CreateAnAccount();
        accountDashboardPage = new AccountDashboardPage();
    }

    @Test
    public void testCreateUser() {
        headerPage.redirectingToCreateAnAccount();
        createAnAccountPage.setFirstName("Sanuja")
                .setLastName("Test")
                .setEmail("Sanuja+3333@sprii.com")
                .setPassword("sprii123")
                .setConfirmPassword("sprii123")
                .submit();
    }

    @Test
    public void testSingInWithFaceBook() {
        headerPage.redirectingToCreateAnAccount();
        createAnAccountPage.selectLoginFacebook();
        createAnAccountPage.loginfacebook("sureni@sprii.com", "sprii@#123");
    }

    @AfterClass
    public void afterClass() {
        SpriiTestFramework.getInstance().closeBrowser();
    }
}

