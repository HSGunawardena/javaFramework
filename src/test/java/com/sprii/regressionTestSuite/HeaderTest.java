package com.sprii.regressionTestSuite;

import com.sprii.header.*;
import com.sprii.home.HomePage;
import com.sprii.login.CreateAnAccount;
import com.sprii.login.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.SpriiTestFramework;

public class HeaderTest {
    
    Header header;
    ArabicHomePage arabicSite;
    SAHomePgae storeSA;
    BHHomePage storeBH;
    KWHomePage storeKW;
    LoginPage signIn;
    CreateAnAccount createAnAccount;
    HomePage home;
    Boolean isFreeShippingOnAllOrdersLabelAvailable;
    Boolean isPriceMatchGuaranteeLabelAvailable;
    Boolean isSpriiComEverythingForMumLabelAvailable;
    
    @BeforeClass
    public void beforeClass() throws Exception{
        SpriiTestFramework.getInstance().openBrowser();
    }

    @BeforeMethod
    public void setUp() throws Exception {
        SpriiTestFramework.getInstance().navigateToURL();
        header = new Header();
    }

   //Todo  @Test
    public void testArabicHomeLink() throws Exception{
        arabicSite = header
              .homeArabicLink();
    }

    @Test (priority = 1)
    public void testRedirectToSAHome() throws Exception { 
        storeSA = header
                .redirectToSAHome();
    }

    @Test (priority = 2)
    public void testRedirectToBHHome() throws Exception{
        storeBH = header
                .redirectToBHHome();
    }

    @Test (priority = 3)
    public void testRedirectToKWHome() throws Exception{
        storeKW = header
                .redirectToKWHome();
    }

    @Test (priority = 4)
    public void testRedirectingToCreateAnAccount() throws Exception{
        createAnAccount = header
                .redirectingToCreateAnAccount();
    }

    @Test (priority = 5)
    public void testRedirectToSignInPage() throws Exception {
        signIn = header
                .redirectToSignInPage();
    }

    @Test (priority = 6)
    public void testExpandMiniCart() throws Exception{
        header = header
                .expandEmptyMiniCart();
    }

    @Test (priority = 7)
    public void testClickOnLogoFromHomePage() throws Exception{
        header = header
                .clickOnLogoFromHomePage();
    }

    @Test (priority = 8)
    public void testClickOnLogoFromOtherPages() throws Exception{
        signIn = header
                .redirectToSignInPage();
        home = header
                .clickOnLogoFromOtherPages();
    }

    @Test (priority = 9)
    public void testFreeShippingOnAllOrdersLabel() throws Exception{
        isFreeShippingOnAllOrdersLabelAvailable = header
                .freeShippingOnAllOrdersTitleIsAvailable();
        Assert.assertTrue(isFreeShippingOnAllOrdersLabelAvailable);
    }

    /*@Test (priority = 10)
    public void testPriceMatchGuaranteeLabel() throws Exception{
        isPriceMatchGuaranteeLabelAvailable= header
                .priceMatchGuaranteeTitleIsAvailable();
        Assert.assertTrue(isPriceMatchGuaranteeLabelAvailable);
    }*/

    /*@Test (priority = 11)
    public void testSpriiComEverythingForMumLabel() throws Exception{
        isSpriiComEverythingForMumLabelAvailable= header
                .spriiComEverythingForMumsTitleIsAvailable();
        Assert.assertTrue(isSpriiComEverythingForMumLabelAvailable);
    }*/

    @AfterClass
    public void afterClass() throws Exception{
        SpriiTestFramework.getInstance().closeBrowser();
    }
}
