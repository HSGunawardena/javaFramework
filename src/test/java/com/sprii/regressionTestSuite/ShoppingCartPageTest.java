package com.sprii.regressionTestSuite;

import com.sprii.header.Header;
import com.sprii.home.HomePage;
import com.sprii.login.LoginPage;
import com.sprii.navigate.NavigationPage;
import com.sprii.pdp.*;
import com.sprii.plp.ProductListingPage;
import com.sprii.plp.TestAutomationCategory;
import com.sprii.shoppingcart.ShoppingCartPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.SpriiTestFramework;

public class ShoppingCartPageTest {

    private ConfigProductWithSpecialPriceDetailPage configSpecialPage;
    private ConfigProductWithOriginalPriceDetailPage configOriginalPage;
    private SimpleProduct1WithOriginalPriceDetailPage simple1originalPage;
    private SimpleProduct3WithSpecialPriceDetailPage simple3SpecialPage;
    private SimpleProduct4WithOriginalPriceDetailPage simple4OriginalPage;
    private SimpleProductWithSpecialPriceDetailPage simpleProductSpecialPage;
    private ShoppingCartPage shoppingCartPage;
    private NavigationPage navigationPage;
    private ProductListingPage plpPage;
    private TestAutomationCategory testAutomationCategory;
    private LoginPage loginPage;
    private HomePage homePage;
    private Header header;


    @BeforeClass
    public void beforeClass() {
        SpriiTestFramework.getInstance().openBrowser();
        SpriiTestFramework.getInstance().navigateToURL();
        configSpecialPage = new ConfigProductWithSpecialPriceDetailPage();
        configOriginalPage = new ConfigProductWithOriginalPriceDetailPage();
        simple1originalPage = new SimpleProduct1WithOriginalPriceDetailPage();
        simple3SpecialPage = new SimpleProduct3WithSpecialPriceDetailPage();
        simple4OriginalPage = new SimpleProduct4WithOriginalPriceDetailPage();
        simpleProductSpecialPage = new SimpleProductWithSpecialPriceDetailPage();
        shoppingCartPage = new ShoppingCartPage();
        navigationPage = new NavigationPage();
        plpPage = new ProductListingPage();
        loginPage = new LoginPage();
        homePage = new HomePage();
        header = new Header();

        header.redirectToSignInPage();
        loginPage.loginSuccess("sanuja+311@sprii.com", "sprii123");
        shoppingCartPage = navigationPage
                .selectDiapersAndWipesShopAllPageInDiapering()
                .directToTestAutomationCategory()
                .addToCartSimpleProductWithSpecialPrice()
                .selectContinueShoppingToSimpleProductWithSpecialPriceDetailPage()
                .addToCartButtonEventForSimpleProductWithOriginalPrice();

    }

    // Remove a product from shopping cart
    @Test
    public void testRemoveButton() {
        shoppingCartPage.selectRemoveButtonOfProduct2();
    }

    // Increase the quantity of a product
    @Test
    public void testIncreaseQuantity() {
        shoppingCartPage.SimpleProductWithSpecialPriceDetailDropDown(2);
    }

    // Select continue shopping button
    @Test
    public void testContinueShopping() {
        shoppingCartPage.selectContinueShoppingToSimpleProductWithSpecialPriceDetailPage();
        plpPage.addToCartButtonEventForSimpleProductWithOriginalPrice();
    }

    // Manually enter store credit limit
    @Test
    public void testEnterStoreCreditLimit() {
        shoppingCartPage.partialStoreCredit("100");
    }

    // Click max store credit button
    @Test
    public void testMaxStoreCredit() {
        shoppingCartPage.maxStoreCredit();
    }

    // Select Proceed To Checkout button
    @Test
    public void testProceedToCheckout() {
        shoppingCartPage.SelectProceedToCheckoutGuestUser();
    }

    // Select Click Here To Continue Shopping Button (Empty Cart)
    @Test
    public void testClickHereToContinueShopping() {
        shoppingCartPage.selectRemoveButtonOfProduct1()
                .selectRemoveButtonOfProduct1()
                .selectClickHereToContinueShopping();
    }

    @AfterClass
    public void afterClass() {
        SpriiTestFramework.getInstance().closeBrowser();
    }
}
