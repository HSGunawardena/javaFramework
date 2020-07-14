package com.sprii.test.shippingDashboardMigrationToGCP;

import com.sprii.header.Header;
import com.sprii.plp.ProductListingPage;
import com.sprii.shoppingcart.ShoppingCartPage;
import org.testng.Assert;
import org.testng.annotations.*;
import utils.FileWriter;
import utils.SpriiTestFramework;

public class FetchrCourierOrderPlacementTest {
    private ShoppingCartPage shoppingCartPage;
    private ProductListingPage productListingPage;
    private FileWriter fileWriter;
    private String orderID;
    private String methodName;

    @BeforeClass
    public void setUp() {
        Header header;
        boolean titleAvailability;
        SpriiTestFramework.getInstance().openBrowser();
        SpriiTestFramework.getInstance().navigateToSaudiURL();
        header = new Header();
        titleAvailability = header.redirectToSignInPage()
                .loginSuccess("saliya+12345@sprii.com", "12345")
                .titleIsAvailable();
        Assert.assertTrue(titleAvailability);
        shoppingCartPage = new ShoppingCartPage();
        productListingPage = new ProductListingPage();
        fileWriter = new FileWriter();

    }

    @BeforeMethod
    public void beforeMethod() throws Exception {
        shoppingCartPage.clearShoppingCartSaudi();
    }

    // Guest user/ CC payment/ Full shipment
    @Test(priority = 1, groups = {"reg", "smoke"})
    public void test01SimpleProductCheckout() throws Exception {
        SpriiTestFramework.getInstance().navigateToTestAutomationCategorySaudi();
         orderID = productListingPage
                .addToCartButtonEventForSimpleProduct3WithSpecialPrice()
                .proceedToCheckoutAsRegisterdUser()
                .selectStandardDeliveryMethod()
                .selectPaymentMethodAsCC()
                .placeOrderWithThreeDSCheckout().getOrderID();
        methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
    }

    // Guest user/ CC payment/ Partial Shipment
    @Test(priority = 2, groups = {"reg", "smoke"})
    public void test02SimpleProductCheckout() throws Exception {
        SpriiTestFramework.getInstance().navigateToTestAutomationCategorySaudi();
        orderID = productListingPage
                .addToCartButtonEventForSimpleProduct3WithSpecialPrice()
                .selectContinueShoppingToSimpleProductWithSpecialPriceDetailPage()
                .addToCartButtonEventForSimpleProductWithOriginalPrice()
                .proceedToCheckoutAsRegisterdUser()
                .selectStandardDeliveryMethod()
                .selectPaymentMethodAsCC()
                .placeOrderWithThreeDSCheckout().getOrderID();
        methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
    }

    // Guest user/ CC payment/ Full shipment
    @Test(priority = 3, groups = {"reg", "smoke"})
    public void test03SimpleProductCheckout() throws Exception {
        SpriiTestFramework.getInstance().navigateToTestAutomationCategorySaudi();
        orderID = productListingPage
                .addToCartButtonEventForSimpleProduct3WithSpecialPrice()
                .proceedToCheckoutAsRegisterdUser()
                .selectStandardDeliveryMethod()
                .selectPaymentMethodAsCC()
                .placeOrderWithThreeDSCheckout().getOrderID();
        methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
    }

    // Guest user/ COD payment/ Full shipment
    @Test(priority = 4, groups = {"reg", "smoke"})
    public void test04SimpleProductCheckout() throws Exception {
        SpriiTestFramework.getInstance().navigateToTestAutomationCategorySaudi();
        orderID = productListingPage
                .addToCartButtonEventForSimpleProduct3WithSpecialPrice()
                .proceedToCheckoutAsGuestUser()
                .selectStandardDeliveryMethod()
                .selectPaymentMethodAsCOD()
                .placeOrder().getOrderID();
        methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
    }

    // Guest user/ COD payment/ Partial Shipment
    @Test(priority = 5, groups = {"reg", "smoke"})
    public void test05SimpleProductCheckout() throws Exception {
        SpriiTestFramework.getInstance().navigateToTestAutomationCategorySaudi();
        orderID = productListingPage
                .addToCartButtonEventForSimpleProduct3WithSpecialPrice()
                .selectContinueShoppingToSimpleProductWithSpecialPriceDetailPage()
                .addToCartButtonEventForSimpleProductWithOriginalPrice()
                .proceedToCheckoutAsGuestUser()
                .selectStandardDeliveryMethod()
                .selectPaymentMethodAsCOD()
                .placeOrder().getOrderID();
        methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();

    }

    // Guest user/ COD payment/ Full shipment
    @Test(priority = 6, groups = {"reg", "smoke"})
    public void test06SimpleProductCheckout() throws Exception {
        SpriiTestFramework.getInstance().navigateToTestAutomationCategorySaudi();
        orderID = productListingPage
                .addToCartButtonEventForSimpleProduct3WithSpecialPrice()
                .proceedToCheckoutAsGuestUser()
                .selectStandardDeliveryMethod()
                .selectPaymentMethodAsCOD()
                .placeOrder().getOrderID();
        methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
    }


    // Guest user/ coupon code/ Full shipment
    @Test(priority = 7, groups = {"reg", "smoke"})
    public void test07SimpleProductCheckout() throws Exception {
        SpriiTestFramework.getInstance().navigateToTestAutomationCategorySaudi();
        orderID = productListingPage
                .addToCartSimpleProductWithSpecialPrice()
                .proceedToCheckoutAsGuestUser()
                .selectStandardDeliveryMethod()
                .selectPaymentMethodAsCOD()
                .addCouponCode("testcoupon")
                .placeOrder().getOrderID();
        methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
    }

    // Guest user/ coupon code/ Partial shipment
    @Test(priority = 8, groups = {"reg", "smoke"})
    public void test08SimpleProductCheckout() throws Exception {
        SpriiTestFramework.getInstance().navigateToTestAutomationCategorySaudi();
        orderID = productListingPage
                .addToCartSimpleProductWithSpecialPrice()
                .selectContinueShoppingToSimpleProductWithSpecialPriceDetailPage()
                .addToCartSimpleProductWithSpecialPrice()
                .proceedToCheckoutAsGuestUser()
                .selectStandardDeliveryMethod()
                .selectPaymentMethodAsCOD()
                .addCouponCode("testcoupon")
                .placeOrder().getOrderID();
        methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();

    }

    // Guest user/ coupon code/ Full shipment
    @Test(priority = 9, groups = {"reg", "smoke"})
    public void test09SimpleProductCheckout() throws Exception {
        SpriiTestFramework.getInstance().navigateToTestAutomationCategorySaudi();
        orderID = productListingPage
                .addToCartSimpleProductWithSpecialPrice()
                .proceedToCheckoutAsGuestUser()
//                .selectStandardDeliveryMethod()
                .selectPaymentMethodAsCOD()
                .addCouponCode("testcoupon")
                .placeOrder().getOrderID();
        methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
    }

    // Registered user/ store credit/ Full shipment
    @Test(priority = 10, groups = {"reg", "smoke"})
    public void test10SimpleProductCheckout() throws Exception {
        SpriiTestFramework.getInstance().navigateToTestAutomationCategorySaudi();
        orderID = productListingPage
                .addToCartSimpleProductWithSpecialPrice()
                .maxStoreCredit()
                .proceedToCheckoutAsRegisterdUser()
//                .selectStandardDeliveryMethod()
                .placeOrder().getOrderID();
        methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
    }

    // Registered user/ store credit/ Partial shipment
    @Test(priority = 11, groups = {"reg", "smoke"})
    public void test11SimpleProductCheckout() throws Exception {
        SpriiTestFramework.getInstance().navigateToTestAutomationCategorySaudi();
        orderID = productListingPage
                .addToCartSimpleProductWithSpecialPrice()
                .selectContinueShoppingToSimpleProductWithSpecialPriceDetailPage()
                .addToCartSimpleProductWithSpecialPrice()
                .maxStoreCredit()
                .proceedToCheckoutAsRegisterdUser()
//                .selectStandardDeliveryMethod()
                .placeOrder().getOrderID();
        methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
    }

    // Registered user/ store credit/ Full shipment
    @Test(priority = 12, groups = {"reg", "smoke"})
    public void test12SimpleProductCheckout() throws Exception {
        SpriiTestFramework.getInstance().navigateToTestAutomationCategorySaudi();
        orderID = productListingPage
                .addToCartSimpleProductWithSpecialPrice()
                .maxStoreCredit()
                .proceedToCheckoutAsRegisterdUser()
//                .selectStandardDeliveryMethod()
                .placeOrder().getOrderID();
        methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
    }

    // Guest user/ CC + Coupon/ Full shipment
    @Test(priority = 13, groups = {"reg", "smoke"})
    public void test13SimpleProductCheckout() throws Exception {
        SpriiTestFramework.getInstance().navigateToTestAutomationCategorySaudi();
        orderID = productListingPage
                .addToCartButtonEventForSimpleProduct3WithSpecialPrice()
                .proceedToCheckoutAsRegisterdUser()
//                .selectStandardDeliveryMethod()
                .selectPaymentMethodAsCC()
                .addCouponCode("testcoupon")
                .placeOrderWithThreeDSCheckout().getOrderID();
        methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
    }

    // Guest user/ CC + Coupon / Partial shipment
    @Test(priority = 14, groups = {"reg", "smoke"})
    public void test14SimpleProductCheckout() throws Exception {
        SpriiTestFramework.getInstance().navigateToTestAutomationCategorySaudi();
        orderID = productListingPage
                .addToCartButtonEventForSimpleProduct3WithSpecialPrice()
                .selectContinueShoppingToSimpleProductWithSpecialPriceDetailPage()
                .addToCartButtonEventForSimpleProduct3WithSpecialPrice()
                .proceedToCheckoutAsRegisterdUser()
//                 .selectStandardDeliveryMethod()
                .selectPaymentMethodAsCC()
                .addCouponCode("testcoupon")
                .placeOrderWithThreeDSCheckout().getOrderID();
        methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
    }

    // Guest user/ COD payment + Coupon / Full shipment
    @Test(priority = 15, groups = {"reg", "smoke"})
    public void test15SimpleProductCheckout() throws Exception {
        SpriiTestFramework.getInstance().navigateToTestAutomationCategorySaudi();
        orderID = productListingPage
                .addToCartButtonEventForSimpleProduct3WithSpecialPrice()
                .proceedToCheckoutAsGuestUser()
//                .selectStandardDeliveryMethod()
                .selectPaymentMethodAsCOD()
                .addCouponCode("testcoupon")
                .placeOrder().getOrderID();
        methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
    }

    // Guest user/ COD payment + Coupon/ Partial shipment
    @Test(priority = 16, groups = {"reg", "smoke"})
    public void test16SimpleProductCheckout() throws Exception {
        SpriiTestFramework.getInstance().navigateToTestAutomationCategorySaudi();
        orderID = productListingPage
                .addToCartButtonEventForSimpleProduct3WithSpecialPrice()
                .selectContinueShoppingToSimpleProductWithSpecialPriceDetailPage()
                .addToCartButtonEventForSimpleProduct3WithSpecialPrice()
                .proceedToCheckoutAsRegisterdUser()
//                .selectStandardDeliveryMethod()
                .selectPaymentMethodAsCOD()
                .addCouponCode("testcoupon")
                .placeOrder().getOrderID();
        methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
    }

    // Registered user/ SC + Coupon/ full shipment
    @Test(priority = 17, groups = {"reg", "smoke"})
    public void test17SimpleProductCheckout() throws Exception {
        SpriiTestFramework.getInstance().navigateToTestAutomationCategorySaudi();
        orderID = productListingPage
                .addToCartButtonEventForSimpleProduct3WithSpecialPrice()
                .selectContinueShoppingToSimpleProductWithSpecialPriceDetailPage()
                .addToCartButtonEventForSimpleProduct3WithSpecialPrice()
                .partialStoreCredit("700")
                .proceedToCheckoutAsRegisterdUser()
//                .selectStandardDeliveryMethod()
                .addCouponCode("testcoupon")
                .placeOrder().getOrderID();
        methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
    }

    // Registered user/ SC + Coupon/ partial shipment
    @Test(priority = 18, groups = {"reg", "smoke"})
    public void test18SimpleProductCheckout() throws Exception {
        SpriiTestFramework.getInstance().navigateToTestAutomationCategorySaudi();
        orderID = productListingPage
                .addToCartButtonEventForSimpleProduct3WithSpecialPrice()
                .selectContinueShoppingToSimpleProductWithSpecialPriceDetailPage()
                .addToCartButtonEventForSimpleProduct3WithSpecialPrice()
                .partialStoreCredit("700")
                .proceedToCheckoutAsRegisterdUser()
//                .selectStandardDeliveryMethod()
                .addCouponCode("testcoupon")
                .placeOrder().getOrderID();
        methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
    }

    // Registered user/ CC + SC/ full shipment
    @Test(priority = 19, groups = {"reg", "smoke"})
    public void test19SimpleProductCheckout() throws Exception {
        SpriiTestFramework.getInstance().navigateToTestAutomationCategorySaudi();
        orderID = productListingPage
                .addToCartSimpleProductWithSpecialPrice()
                .partialStoreCredit("20")
                .proceedToCheckoutAsRegisterdUser()
//                .selectStandardDeliveryMethod()
                .selectPaymentMethodAsCC()
                .placeOrderWithThreeDSCheckout().getOrderID();
        methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
    }

    // Registered user/ CC + SC/ partial shipment
    @Test(priority = 20, groups = {"reg", "smoke"})
    public void test20SimpleProductCheckout() throws Exception {
        SpriiTestFramework.getInstance().navigateToTestAutomationCategorySaudi();
        orderID = productListingPage
                .addToCartSimpleProductWithSpecialPrice()
                .selectContinueShoppingToSimpleProductWithSpecialPriceDetailPage()
                .addToCartButtonEventForSimpleProduct3WithSpecialPrice()
                .partialStoreCredit("20")
                .proceedToCheckoutAsRegisterdUser()
//                .selectStandardDeliveryMethod()
                .selectPaymentMethodAsCC()
                .placeOrderWithThreeDSCheckout().getOrderID();
        methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
    }

    // Registered user/ CC + coupon/ full shipment
    @Test(priority = 21, groups = {"reg", "smoke"})
    public void test21SimpleProductCheckout() throws Exception {
        SpriiTestFramework.getInstance().navigateToTestAutomationCategorySaudi();
        orderID = productListingPage
                .addToCartButtonEventForSimpleProduct3WithSpecialPrice()
                .proceedToCheckoutAsRegisterdUser()
//                .selectStandardDeliveryMethod()
                .selectPaymentMethodAsCC()
                .addCouponCode("testcoupon")
                .placeOrderWithThreeDSCheckout().getOrderID();
        methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
    }

    // Registered user/ CC + coupon/ partial shipment
    @Test(priority = 22, groups = {"reg", "smoke"})
    public void test22SimpleProductCheckout() throws Exception {
        SpriiTestFramework.getInstance().navigateToTestAutomationCategorySaudi();
        orderID = productListingPage
                .addToCartButtonEventForSimpleProduct3WithSpecialPrice()
                .selectContinueShoppingToSimpleProductWithSpecialPriceDetailPage()
                .addToCartButtonEventForSimpleProduct3WithSpecialPrice()
                .proceedToCheckoutAsRegisterdUser()
//                .selectStandardDeliveryMethod()
                .selectPaymentMethodAsCC()
                .addCouponCode("testcoupon")
                .placeOrderWithThreeDSCheckout().getOrderID();
        methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
    }

    // Registered user/ COD + SC + Coupon/ full shipment
    @Test(priority = 23, groups = {"reg", "smoke"})
    public void test23SimpleProductCheckout() throws Exception {
        SpriiTestFramework.getInstance().navigateToTestAutomationCategorySaudi();
        orderID = productListingPage
                .addToCartButtonEventForSimpleProduct3WithSpecialPrice()
                .partialStoreCredit("20")
                .proceedToCheckoutAsRegisterdUser()
//                .selectStandardDeliveryMethod()
                .selectPaymentMethodAsCOD()
                .addCouponCode("testcoupon")
                .placeOrder().getOrderID();
        methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
    }

    // Registered user/ CC + SC/ partial shipment
    @Test(priority = 24, groups = {"reg", "smoke"})
    public void test24SimpleProductCheckout() throws Exception {
        SpriiTestFramework.getInstance().navigateToTestAutomationCategorySaudi();
        orderID = productListingPage
                .addToCartButtonEventForSimpleProduct3WithSpecialPrice()
                .selectContinueShoppingToSimpleProductWithSpecialPriceDetailPage()
                .addToCartButtonEventForSimpleProduct3WithSpecialPrice()
                .partialStoreCredit("20")
                .proceedToCheckoutAsRegisterdUser()
//                .selectStandardDeliveryMethod()
                .selectPaymentMethodAsCOD()
                .addCouponCode("testcoupon")
                .placeOrder().getOrderID();
        methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
    }

    @AfterMethod
    public void tearDown() throws Exception {
        fileWriter.saveOrderIDs(methodName, orderID);
    }

    @AfterClass
    public void afterClass() throws Exception {
        //       SpriiTestFramework.getInstance().closeBrowser();
    }
}
