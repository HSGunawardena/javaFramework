package com.sprii.regressionTestSuite;

import com.sprii.home.*;
import com.sprii.navigate.diapering.DiaperingPage;
import com.sprii.navigate.feeding.FeedingPage;
import com.sprii.navigate.mums.MumsPage;
import com.sprii.navigate.toys.ToysPage;
import com.sprii.pdp.*;
import com.sprii.plp.CartPage;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.SpriiTestFramework;

public class HomePageTest {

    HomePage home;
    SimpleProduct1WithOriginalPriceDetailPage simpleProduct1WithOriginalPrice;
    SimpleProductWithSpecialPriceDetailPage simpleProductWithSpecialPrice;
    ConfigProductWithOriginalPriceDetailPage configProduct1WithOriginalPrice;
    ConfigProductWithSpecialPriceDetailPage configProductWithSpecialPrice;
    SimpleProduct3WithSpecialPriceDetailPage simpleProduct3WithSpecialPrice;
    SimpleProduct4WithOriginalPriceDetailPage simpleProduct4WithOriginalPrice;
    SpriiTopPicksCategory topPicks;
    ToysPage toysAndOutDoors;
    DiaperingPage diapering;
    MumsPage mums;
    HomeCategory atHome;
    FeedingPage feeding;
    BabyEssentialsCategory babyEssentials;
    BabyGearCategory babyGear;
    CartPage shoppingCart;
    Boolean isHeader1Available;
    Boolean isHeader2Available;
    Boolean isContent1Available;
    Boolean isContent2Available;
    Boolean isContent3Available;

    @BeforeClass
    public void beforeClass() throws Exception {
        SpriiTestFramework.getInstance().openBrowser();
    }

    @BeforeMethod
    public void setUp() throws Exception {
        SpriiTestFramework.getInstance().navigateToURL();
        home = new HomePage();
    }

    @Test(priority = 1)
    public void testClickOnSimpleProduct1Image() throws Exception {
        simpleProduct1WithOriginalPrice = home
                .clickOnSimpleProduct1Image();
    }

    @Test(priority = 2)
    public void testClickOnSimpleProduct1Name() throws Exception {
        simpleProduct1WithOriginalPrice = home
                .clickOnSimpleProduct1Name();
    }

    @Test(priority = 3)
    public void testClickOnSimpleProduct1AddToCartButton() throws Exception {
        shoppingCart = home
                .clickOnSimpleProduct1AddToCartButton();
    }

    @Test(priority = 4)
    public void testClickOnSimpleProduct2Image() throws Exception {
        simpleProductWithSpecialPrice = home
                .clickOnSimpleProduct2Image();
    }

    @Test(priority = 5)
    public void testClickOnSimpleProduct2Name() throws Exception {
        simpleProductWithSpecialPrice = home
                .clickOnSimpleProduct2Name();
    }

    @Test(priority = 6)
    public void testClickOnSimpleProduct2AddToCartButton() throws Exception {
        shoppingCart = home
                .clickOnSimpleProduct2AddToCartButton();
    }

    @Test(priority = 7)
    public void testClickOnConfigProduct1Image() throws Exception {
        configProduct1WithOriginalPrice = home
                .clickOnConfigProduct1Image();
    }

    @Test(priority = 8)
    public void testClickOnConfigProduct1Name() throws Exception {
        configProduct1WithOriginalPrice = home
                .clickOnConfigProduct1Name();
    }

    @Test(priority = 9)
    public void testClickOnConfigProduct1AddToCartButton() throws Exception {
        configProduct1WithOriginalPrice = home
                .clickOnConfigProduct1AddToCartButton();
    }

    @Test(priority = 10)
    public void testClickOnConfigProduct2Image() throws Exception {
        configProductWithSpecialPrice = home
                .clickOnConfigProduct2Image();
    }

    @Test(priority = 11)
    public void testClickOnConfigProduct2Name() throws Exception {
        configProductWithSpecialPrice = home
                .clickOnConfigProduct2Name();
    }

    @Test(priority = 12)
    public void testClickOnConfigProduct2AddToCartButton() throws Exception {
        configProductWithSpecialPrice = home
                .clickOnConfigProduct2AddToCartButton();
    }

    @Test(priority = 13)
    public void testClickOnSimpleProduct3Image() throws Exception {
        simpleProduct3WithSpecialPrice = home
                .clickOnSimpleProduct3Image();
    }

    @Test(priority = 14)
    public void testClickOnSimpleProduct3Name() throws Exception {
        simpleProduct3WithSpecialPrice = home
                .clickOnSimpleProduct3Name();
    }

    @Test(priority = 15)
    public void testClickOnSimpleProduct3AddToCartButton() throws Exception {
        shoppingCart = home
                .clickOnSimpleProduct3AddToCartButton();
    }

    @Test(priority = 16)
    public void testClickOnSimpleProduct4Image() throws Exception {
        simpleProduct4WithOriginalPrice = home
                .clickOnSimpleProduct4Image();
    }

    @Test(priority = 17)
    public void testClickOnSimpleProduct4Name() throws Exception {
        simpleProduct4WithOriginalPrice = home
                .clickOnSimpleProduct4Name();
    }

    @Test(priority = 18)
    public void testClickOnSimpleProduct4AddToCartButton() throws Exception {
        shoppingCart = home
                .clickOnSimpleProduct4AddToCartButton();
    }

    @Test(priority = 19)
    public void testShowAllBestSellersLink() throws Exception {
        topPicks = home
                .showAllBestSellersLink();
    }

    @Test(priority = 20)
    public void testShowAllToysAndOutDoorsLink() throws Exception {
        toysAndOutDoors = home
                .showAllToysAndOutDoorsLink();
    }

    @Test(priority = 21)
    public void testShowAllDiaperingLink() throws Exception {
        diapering = home
                .showAllDiaperingLink();
    }

    @Test(priority = 22)
    public void testShowAllAtHomeLink() throws Exception {
        atHome = home
                .showAllAtHomeLink();
    }

    @Test(priority = 23)
    public void testShowAllFeedingLink() throws Exception {
        feeding = home
                .showAllFeedingLink();
    }

    @Test(priority = 24)
    public void testShowAllBabyEssentialsLink() throws Exception {
        babyEssentials = home
                .showAllBabyEssentialsLink();
    }

    @Test(priority = 25)
    public void testShowAllBabyGearLink() throws Exception {
        babyGear = home
                .showAllBabyGearLink();
    }

    @Test(priority = 26)
    public void testShowAllMumsLink() throws Exception {
        mums = home
                .showAllMumsLink();
    }

    //Assertions
    @Test(priority = 27)
    public void testContentHeader1() throws Exception {
        isHeader1Available = home
                .contentHeading1IsAvailable();
        Assert.assertTrue(isHeader1Available);
    }

    @Test(priority = 28)
    public void testContentHeader2() throws Exception {
        isHeader2Available = home
                .contentHeading2IsAvailable();
        Assert.assertTrue(isHeader2Available);
    }

    @Test(priority = 29)
    public void testContent1() throws Exception {
        isContent1Available = home
                .content1IsAvailable();
        Assert.assertTrue(isContent1Available);
    }

    @Test(priority = 30)
    public void testContent2() throws Exception {
        isContent2Available = home
                .content2IsAvailable();
        Assert.assertTrue(isContent2Available);
    }

    @Test(priority = 31)
    public void testContent3() throws Exception {
        isContent3Available = home
                .content3IsAvailable();
        Assert.assertTrue(isContent3Available);
    }

    @AfterClass
    public void afterClass() throws Exception {
        SpriiTestFramework.getInstance().closeBrowser();
    }
}