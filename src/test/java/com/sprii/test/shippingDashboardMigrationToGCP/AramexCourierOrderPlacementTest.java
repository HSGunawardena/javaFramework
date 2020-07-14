package com.sprii.test.shippingDashboardMigrationToGCP;

import com.sprii.header.Header;
import com.sprii.plp.ProductListingPage;
import com.sprii.shoppingcart.ShoppingCartPage;
import org.testng.Assert;
import org.testng.annotations.*;
import utils.FileWriter;
import utils.SpriiTestFramework;

public class AramexCourierOrderPlacementTest {
    private ShoppingCartPage shoppingCartPage;
    private ProductListingPage productListingPage;
    private FileWriter fileWriter;
    String orderID;
    String methodName;

    @BeforeClass
    public void beforeClass() throws Exception {
        Header header;
        boolean titleAvailability;
        SpriiTestFramework.getInstance().openBrowser();
        SpriiTestFramework.getInstance().navigateToURL();
        header = new Header();
        titleAvailability = header.redirectToSignInPage()
                .loginSuccess("sureni+1@sprii.com", "surenisprii@#123")
                .titleIsAvailable();
        Assert.assertTrue(titleAvailability);
        shoppingCartPage = new ShoppingCartPage();
        productListingPage = new ProductListingPage();
        fileWriter = new FileWriter();
    }

    @BeforeMethod
    public void setUp() throws Exception {
        shoppingCartPage.clearShoppingCart();
        SpriiTestFramework.getInstance().navigateToTestAutomationCategory();
    }

    //Guest user/ CC Payment/ Full Shipment/ Ref ID 301
    @Test(priority = 1, groups = {"reg", "smoke"})
    public void test1SimpleProductCheckout() throws Exception {
        orderID = productListingPage
                .addToCartButtonEventForSimpleProduct3WithSpecialPrice()
                .proceedToCheckoutAsRegisterdUser()
                .selectStandardDeliveryMethod()
                .selectPaymentMethodAsCC()
                .placeOrder().getOrderID();
        methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
    }

    //Guest user/ CC Payment/ Partial Shipment/ Ref ID 302
    @Test(priority = 2, groups = {"reg", "smoke"})
    public void test2SimpleProductsCheckout() throws Exception {
        orderID = productListingPage
                .addToCartButtonEventForSimpleProduct3WithSpecialPrice()
                .selectContinueShoppingToSimpleProductWithSpecialPriceDetailPage()
                .addToCartButtonEventForSimpleProductWithOriginalPrice()
                .selectContinueShoppingToSimpleProductWithSpecialPriceDetailPage()
                .addToCartButtonEventForSimpleProduct4WithOriginalPrice()
                .proceedToCheckoutAsRegisterdUser()
                .selectStandardDeliveryMethod()
                .selectPaymentMethodAsCC()
                .placeOrder().getOrderID();
        methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
    }

    //Guest user/ CC Payment/ Full Shipment/ Ref ID 303
    @Test(priority = 3, groups = {"reg", "smoke"})
    public void test3SimpleProductCheckout() throws Exception {
        orderID = productListingPage
                .addToCartButtonEventForSimpleProduct3WithSpecialPrice()
                .proceedToCheckoutAsRegisterdUser()
                .selectStandardDeliveryMethod()
                .selectPaymentMethodAsCC()
                .placeOrder().getOrderID();
        methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
    }

    //Guest user/ CC Payment/ Full Shipment/ Ref ID 304
    @Test(priority = 4, groups = {"reg", "smoke"})
    public void test4SimpleProductCheckout() throws Exception {
        orderID = productListingPage
                .addToCartButtonEventForSimpleProduct3WithSpecialPrice()
                .proceedToCheckoutAsGuestUser()
                .selectStandardDeliveryMethod()
                .selectPaymentMethodAsCOD()
                .placeOrder().getOrderID();
        methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
    }

    //Guest user/ CC Payment/ Partial Shipment/ Ref ID 305
    @Test(priority = 5, groups = {"reg", "smoke"})
    public void test5SimpleProductsCheckout() throws Exception {
        orderID = productListingPage
                .addToCartButtonEventForSimpleProduct3WithSpecialPrice()
                .selectContinueShoppingToSimpleProductWithSpecialPriceDetailPage()
                .addToCartButtonEventForSimpleProductWithOriginalPrice()
                .selectContinueShoppingToSimpleProductWithSpecialPriceDetailPage()
                .addToCartButtonEventForSimpleProduct4WithOriginalPrice()
                .proceedToCheckoutAsGuestUser()
                .selectStandardDeliveryMethod()
                .selectPaymentMethodAsCOD()
                .placeOrder().getOrderID();
        methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
    }

    //Guest user/ CC Payment/ Full Shipment/ Ref ID 306
    @Test(priority = 6, groups = {"reg", "smoke"})
    public void test6SimpleProductCheckout() throws Exception {
        orderID = productListingPage
                .addToCartButtonEventForSimpleProduct3WithSpecialPrice()
                .proceedToCheckoutAsGuestUser()
                .selectStandardDeliveryMethod()
                .selectPaymentMethodAsCOD()
                .placeOrder().getOrderID();
        methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
    }

    //Guest user/ CC Payment/ Full Shipment/ Ref ID 307
    @Test(priority = 7, groups = {"reg", "smoke"})
    public void test7SimpleProductCheckout() throws Exception {
        orderID = productListingPage
                .addToCartButtonEventForSimpleProduct4WithOriginalPrice()
                .proceedToCheckoutAsGuestUser()
                .selectStandardDeliveryMethod()
                .addCouponCode("testcoupon")
                .placeOrder().getOrderID();
        methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
    }

    //Guest user/ CC Payment/ Partial Shipment/ Ref ID 308
    @Test(priority = 8, groups = {"reg", "smoke"})
    public void test8SimpleProductCheckout() throws Exception {
        orderID = productListingPage
                .addToCartButtonEventForSimpleProduct4WithOriginalPrice()
                .selectContinueShoppingToSimpleProduct4WithOriginalPriceDetailPage()
                .addToCartSimpleProductWithSpecialPrice()
                .proceedToCheckoutAsGuestUser()
                .selectStandardDeliveryMethod()
                .addCouponCode("testcoupon")
                .placeOrder().getOrderID();
        methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
    }

    //Guest user/ CC Payment/ Full Shipment/ Ref ID 309
    @Test(priority = 9, groups = {"reg", "smoke"})
    public void test9SimpleProductCheckout() throws Exception {
        orderID = productListingPage
                .addToCartButtonEventForSimpleProduct4WithOriginalPrice()
                .selectContinueShoppingToSimpleProduct4WithOriginalPriceDetailPage()
                .addToCartSimpleProductWithSpecialPrice()
                .proceedToCheckoutAsGuestUser()
                .selectStandardDeliveryMethod()
                .addCouponCode("testcoupon")
                .placeOrder().getOrderID();
        methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
    }

    //Guest user/ CC Payment/ Full Shipment/ Ref ID 310
    @Test(priority = 10, groups = {"reg", "smoke"})
    public void test10SimpleProductCheckout() throws Exception {
        orderID = productListingPage
                .addToCartButtonEventForSimpleProduct4WithOriginalPrice()
                .maxStoreCredit()
                .proceedToCheckoutAsGuestUser()
                .selectStandardDeliveryMethod()
                .placeOrder().getOrderID();
        methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
    }

    //Guest user/ Max Store Credit - No Payment Required/ Partial Shipment/ Ref ID 311
    @Test(priority = 11, groups = {"reg", "smoke"})
    public void test11SimpleProductCheckout() throws Exception {
        orderID = productListingPage
                .addToCartButtonEventForSimpleProduct4WithOriginalPrice()
                .selectContinueShoppingToSimpleProduct4WithOriginalPriceDetailPage()
                .addToCartSimpleProductWithSpecialPrice()
                .maxStoreCredit()
                .proceedToCheckoutAsGuestUser()
                .selectStandardDeliveryMethod()
                .placeOrder().getOrderID();
        methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
    }

    //Guest user/ CC Payment/ Full Shipment/ Ref ID 312
    @Test(priority = 12, groups = {"reg", "smoke"})
    public void test12SimpleProductCheckout() throws Exception {
        orderID = productListingPage
                .addToCartButtonEventForSimpleProduct4WithOriginalPrice()
                .maxStoreCredit()
                .proceedToCheckoutAsGuestUser()
                .selectStandardDeliveryMethod()
                .placeOrder().getOrderID();
        methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
    }

    //Guest user/ CC Payment/ Full Shipment/ Ref ID 313
    @Test(priority = 13, groups = {"reg", "smoke"})
    public void test13SimpleProductCheckout() throws Exception {
        orderID = productListingPage
                .addToCartButtonEventForSimpleProduct3WithSpecialPrice()
                .proceedToCheckoutAsRegisterdUser()
                .addCouponCode("testcoupon")
                .selectPaymentMethodAsCC()
                .selectStandardDeliveryMethod()
                .placeOrder().getOrderID();
        methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
    }

    //Guest user/ CC Payment/ Partial Shipment/ Ref ID 314
    @Test(priority = 14, groups = {"reg", "smoke"})
    public void test14SimpleProductCheckout() throws Exception {
        orderID = productListingPage
                .addToCartButtonEventForSimpleProduct3WithSpecialPrice()
                .selectContinueShoppingToSimpleProduct4WithOriginalPriceDetailPage()
                .addToCartSimpleProductWithSpecialPrice()
                .proceedToCheckoutAsRegisterdUser()
                .selectPaymentMethodAsCC()
                .addCouponCode("testcoupon")
                .selectStandardDeliveryMethod()
                .placeOrder().getOrderID();
        methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
    }

    //Guest user/ COD Payment/ Full Shipment/ Ref ID 315
    @Test(priority = 15, groups = {"reg", "smoke"})
    public void test15SimpleProductCheckout() throws Exception {
        orderID = productListingPage
                .addToCartButtonEventForSimpleProduct3WithSpecialPrice()
                .selectContinueShoppingToSimpleProduct4WithOriginalPriceDetailPage()
                .addToCartSimpleProductWithSpecialPrice()
                .proceedToCheckoutAsGuestUser()
                .selectPaymentMethodAsCOD()
                .addCouponCode("testcoupon")
                .selectStandardDeliveryMethod()
                .placeOrder().getOrderID();
        methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
    }

    //Guest user/ COD Payment/ Partial Shipment/ Ref ID 316
    @Test(priority = 16, groups = {"reg", "smoke"})
    public void test16SimpleProductCheckout() throws Exception {
        orderID = productListingPage
                .addToCartButtonEventForSimpleProduct3WithSpecialPrice()
                .selectContinueShoppingToSimpleProduct4WithOriginalPriceDetailPage()
                .addToCartSimpleProductWithSpecialPrice()
                .selectContinueShoppingToSimpleProductWithSpecialPriceDetailPage()
                .addToCartButtonEventForSimpleProductWithOriginalPrice()
                .proceedToCheckoutAsGuestUser()
                .selectPaymentMethodAsCOD()
                .addCouponCode("testcoupon")
                .selectStandardDeliveryMethod()
                .placeOrder().getOrderID();
        methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
    }

    //Guest user/ SC + Coupon code - No Payment required/ Full Shipment/ Ref ID 317
    @Test(priority = 17, groups = {"reg", "smoke"})
    public void test17SimpleProductCheckout() throws Exception {
        orderID = productListingPage
                .addToCartButtonEventForSimpleProduct4WithOriginalPrice()
                .selectContinueShoppingToSimpleProduct4WithOriginalPriceDetailPage()
                .addToCartSimpleProductWithSpecialPrice()
                .selectContinueShoppingToSimpleProductWithSpecialPriceDetailPage()
                .addToCartButtonEventForSimpleProductWithOriginalPrice()
                .partialStoreCredit("50")
                .proceedToCheckoutAsGuestUser()
                .addCouponCode("testcoupon")
                .selectStandardDeliveryMethod()
                .placeOrder().getOrderID();
        methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
    }

    //Guest user/ SC + Coupon code - No Payment required/ Partial Shipment/ Ref ID 318
    @Test(priority = 18, groups = {"reg", "smoke"})
    public void test18SimpleProductCheckout() throws Exception {
        orderID = productListingPage
                .addToCartButtonEventForSimpleProduct4WithOriginalPrice()
                .selectContinueShoppingToSimpleProduct4WithOriginalPriceDetailPage()
                .addToCartSimpleProductWithSpecialPrice()
                .selectContinueShoppingToSimpleProductWithSpecialPriceDetailPage()
                .addToCartButtonEventForSimpleProductWithOriginalPrice()
                .partialStoreCredit("50")
                .proceedToCheckoutAsGuestUser()
                .addCouponCode("testcoupon")
                //        .selectStandardDeliveryMethod()
                .placeOrder().getOrderID();
        methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
    }

    //Guest user/ SC + CC/ Full Shipment/ Ref ID 319
    @Test(priority = 19, groups = {"reg", "smoke"})
    public void test19SimpleProductCheckout() throws Exception {
        orderID = productListingPage
                .addToCartButtonEventForSimpleProduct4WithOriginalPrice()
                .selectContinueShoppingToSimpleProduct4WithOriginalPriceDetailPage()
                .addToCartSimpleProductWithSpecialPrice()
                .partialStoreCredit("50")
                .proceedToCheckoutAsRegisterdUser()
                .selectPaymentMethodAsCC()
                .selectStandardDeliveryMethod()
                .placeOrder().getOrderID();
        methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
    }

    //Guest user/ SC + CC/ Partial Shipment/ Ref ID 320
    @Test(priority = 20, groups = {"reg", "smoke"})
    public void test20SimpleProductCheckout() throws Exception {
        orderID = productListingPage
                .addToCartButtonEventForSimpleProduct4WithOriginalPrice()
                .selectContinueShoppingToSimpleProduct4WithOriginalPriceDetailPage()
                .addToCartSimpleProductWithSpecialPrice()
                .partialStoreCredit("50")
                .proceedToCheckoutAsRegisterdUser()
                .selectPaymentMethodAsCC()
                .selectStandardDeliveryMethod()
                .placeOrder().getOrderID();
        methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
    }

    //Guest user/ SC + CC + Coupon Code - NPR/ Full Shipment/ Ref ID 321
    @Test(priority = 21, groups = {"reg", "smoke"})
    public void test21SimpleProductCheckout() throws Exception {
        orderID = productListingPage
                .addToCartButtonEventForSimpleProduct3WithSpecialPrice()
                .partialStoreCredit("50")
                .proceedToCheckoutAsRegisterdUser()
                .selectPaymentMethodAsCC()
                .addCouponCode("testcoupon")
                .selectStandardDeliveryMethod()
                .placeOrder().getOrderID();
        methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
    }

    //Guest user/ SC + CC + Coupon Code - NPR/ Partial Shipment/ Ref ID 322
    @Test(priority = 22, groups = {"reg", "smoke"})
    public void test22SimpleProductCheckout() throws Exception {
        orderID = productListingPage
                .addToCartButtonEventForSimpleProduct3WithSpecialPrice()
                .selectContinueShoppingToSimpleProduct4WithOriginalPriceDetailPage()
                .addToCartSimpleProductWithSpecialPrice()
                .partialStoreCredit("50")
                .proceedToCheckoutAsRegisterdUser()
                .selectPaymentMethodAsCC()
                .addCouponCode("testcoupon")
                .selectStandardDeliveryMethod()
                .placeOrder().getOrderID();
        methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
    }

    //Guest user/ SC + COD + Coupon Code - NPR/ Full Shipment/ Ref ID 323
    @Test(priority = 23, groups = {"reg", "smoke"})
    public void test23SimpleProductCheckout() throws Exception {
        orderID = productListingPage
                .addToCartButtonEventForSimpleProduct3WithSpecialPrice()
                .partialStoreCredit("50")
                .proceedToCheckoutAsGuestUser()
                .selectPaymentMethodAsCOD()
                .addCouponCode("testcoupon")
                .selectStandardDeliveryMethod()
                .placeOrder().getOrderID();
        methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
    }

    //Guest user/ SC + COD + Coupon Code / Partial Shipment/ Ref ID 324
    @Test(priority = 24, groups = {"reg", "smoke"})
    public void test24SimpleProductCheckout() throws Exception {
        orderID = productListingPage
                .addToCartButtonEventForSimpleProduct3WithSpecialPrice()
                .selectContinueShoppingToSimpleProduct4WithOriginalPriceDetailPage()
                .addToCartSimpleProductWithSpecialPrice()
                .partialStoreCredit("50")
                .proceedToCheckoutAsGuestUser()
                .selectPaymentMethodAsCOD()
                .addCouponCode("testcoupon")
                .selectStandardDeliveryMethod()
                .placeOrder().getOrderID();
        methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
    }

    @AfterMethod
    public void tearDown() throws Exception {
        fileWriter.saveOrderIDsforAramex(methodName, orderID);
    }

    @AfterClass
    public void afterClass() throws Exception {
        SpriiTestFramework.getInstance().closeBrowser();
    }
}
