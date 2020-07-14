package com.sprii.regressionTestSuite;

import com.sprii.header.Header;
import com.sprii.home.HomePage;
import com.sprii.minicart.MiniCartPage;
import com.sprii.navigate.NavigationPage;
import com.sprii.pdp.ConfigProductWithOriginalPriceDetailPage;
import com.sprii.pdp.SimpleProduct1WithOriginalPriceDetailPage;
import com.sprii.plp.ProductListingPage;
import com.sprii.shoppingcart.ShoppingCartPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.SpriiTestFramework;

public class MiniCartPageTest {
    private ProductListingPage plp;
    private NavigationPage navigation;
    private ShoppingCartPage cart;
    private Header header;
    private HomePage home;
    private SimpleProduct1WithOriginalPriceDetailPage simpleProduct1;
    private ConfigProductWithOriginalPriceDetailPage configProduct1;
    private MiniCartPage miniCartPage;

    @BeforeClass
    public void beforeClass() {
        SpriiTestFramework.getInstance().openBrowser();
    }

    @BeforeMethod
    public void setUp() {
        SpriiTestFramework.getInstance().navigateToURL();
        navigation = new NavigationPage();
        header = new Header();
        plp = new ProductListingPage();
        miniCartPage = new MiniCartPage();
        plp = navigation
                .selectDiapersAndWipesShopAllPageInDiapering()
                .directToTestAutomationCategory();
    }

    @Test(priority = 1)
    public void testSMiniCartFunctionalityForSimpleProduct1() throws Exception {
        home = plp
                .addToCartButtonEventForSimpleProductWithOriginalPrice()
                .selectContinueShoppingButton();
        simpleProduct1 = header
                .expandMiniCartWithProducts()
                .selectSimpleProduct1WithOriginalPriceDetailPage();
        header
                .expandMiniCartWithProducts()
                .selectQuantityFromDropDownForProduct1(1)
                .removeProduct1();
    }

    @Test(priority = 2)
    public void testSMiniCartFunctionalityForConfigProduct1() throws Exception {
        home = plp
                .addToCartButtonEventForConfigProductWithOriginalPrice()
                .selectConfigOptionFromConfigProduct("0-3 months")
                .addToCartButtonClick()
                .selectContinueShoppingButton();
        configProduct1 = header
                .expandMiniCartWithProducts()
                .selectConfigProductWithOriginalPriceDetailPage();
        header
                .expandMiniCartWithProducts()
                .removeProduct1();
    }

    @Test(priority = 3)
    public void testViewAndEditCartButtonClick() {
        plp
                .addToCartSimpleProductWithSpecialPrice()
                .selectContinueShoppingButton();
        header
                .expandMiniCartWithProducts()
                .selectViewAndEditCartButton();
    }

    @Test(priority = 4)
    public void testGoToCheckoutButtonClick() {
        plp
                .addToCartButtonEventForConfigProductWithSpecialPrice()
                .selectColorFromConfigProduct("Brown")
                .addToCartButtonClick()
                .selectContinueShoppingButton();
        header
                .expandMiniCartWithProducts()
                .selectCheckoutButtonForGuestUser();
    }

    @AfterClass
    public void afterClass() {
        SpriiTestFramework.getInstance().closeBrowser();
    }
}
