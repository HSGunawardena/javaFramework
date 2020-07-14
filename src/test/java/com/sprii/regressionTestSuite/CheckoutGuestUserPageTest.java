package com.sprii.regressionTestSuite;

import com.sprii.checkout.CheckoutGuestUserPage;
import com.sprii.header.Header;
import com.sprii.pdp.ConfigProductWithSpecialPriceDetailPage;
import com.sprii.pdp.SimpleProduct1WithOriginalPriceDetailPage;
import com.sprii.pdp.SimpleProduct3WithSpecialPriceDetailPage;
import com.sprii.pdp.SimpleProduct4WithOriginalPriceDetailPage;
import com.sprii.search.Search;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.SpriiTestFramework;

import java.util.Random;

public class CheckoutGuestUserPageTest {
    private CheckoutGuestUserPage checkoutGuestUserPage;
    private Search search;
    private SimpleProduct1WithOriginalPriceDetailPage pdp;
    private ConfigProductWithSpecialPriceDetailPage pdpForConfig2;
    private SimpleProduct3WithSpecialPriceDetailPage pdpForSimple3;
    private SimpleProduct4WithOriginalPriceDetailPage pdpForSimple4;
    private Header header;

    private boolean emptyEmailFieldValidation;
    private boolean emptyFNameFieldValidation;
    private boolean emptyLNameFieldValidation;
    private boolean emptyCityFieldValidation;
    private boolean emptyAreaFieldValidation;
    private boolean emptyStreetNameFieldValidation;
    private boolean emptyBuildingNameFieldValidation;
    private boolean emptyPhoneNumberFieldValidation;
    private boolean invalidEmailFieldValidation;
    private boolean invalidPhoneNumberWithMoreNumbers;
    private boolean invalidPhoneNumberWithLessNumbers;
    private boolean invalidPhoneNumberWithCharacters;

    private Random randomGenerator = new Random();
    private int randomInt = randomGenerator.nextInt(1000);
    private String userEmail = "sureni+" + randomInt + "@sprii.com";

    @BeforeClass
    public void beforeClass() throws Exception {
        SpriiTestFramework.getInstance().openBrowser();
    }

    @BeforeMethod
    public void setUp() throws Exception {
        SpriiTestFramework.getInstance().navigateToURL();
        checkoutGuestUserPage = new CheckoutGuestUserPage();
        search = new Search();
        pdp = new SimpleProduct1WithOriginalPriceDetailPage();
        pdpForConfig2 = new ConfigProductWithSpecialPriceDetailPage();
        pdpForSimple3 = new SimpleProduct3WithSpecialPriceDetailPage();
        pdpForSimple4 = new SimpleProduct4WithOriginalPriceDetailPage();
        header = new Header();
    }

    //COD checkout (Single Product)
    @Test(priority = 1)
    public void testCheckoutFromCOD() throws Exception {
        search
                .selectSimpleProduct1FromPredictiveSearchWindow("Test Simple Product 1");
        Thread.sleep(5000);
        pdp
                .addToCartButtonClick()
                .proceedToCheckoutAsGuestUser();
        Thread.sleep(10000);
        checkoutGuestUserPage
                .addNewEmailAddress(userEmail)
                .addFirstName("Sureni")
                .addLastName("Test")
                .selectCity("Ajman")
                .addArea("Test Area")
                .addStreetName("Test Street")
                .addBuildingName("Test Building")
                .addPhoneNumber("585092040")
                .selectPaymentMethodAsCOD()
                .placeOrder()
                .clickContinueShoppingLink();
        Thread.sleep(5000);
        header
                .clickLogout();
    }

    //COD + Coupon Code
    @Test(priority = 2)
    public void testCheckoutFromCODWithCouponCode() throws Exception {
        search
                .selectSimpleProduct1FromPredictiveSearchWindow("Test Simple Product 1");
        Thread.sleep(5000);
        pdp
                .addToCartButtonClick()
                .proceedToCheckoutAsGuestUser();
        Thread.sleep(5000);
        checkoutGuestUserPage
                .addNewEmailAddress(userEmail)
                .addFirstName("Sureni")
                .addLastName("Test")
                .selectCity("Ajman")
                .addArea("Test Area")
                .addStreetName("Test Street")
                .addBuildingName("Test Building")
                .addPhoneNumber("585092040")
                .selectPaymentMethodAsCOD()
                .addCouponCode("testcoupon")
                .placeOrder()
                .clickContinueShoppingLink();
        Thread.sleep(5000);
        header
                .clickLogout();
    }

    //COD + Coupon Code (With multiple products including config and simple)
    @Test(priority = 3)
    public void testCheckoutFromCODWithMultipleProducts() throws Exception {
        search
                .selectConfigProduct2FromPredictiveSearchWindow("Test Configurable Product 2 - Special Price");
        Thread.sleep(5000);
        pdpForConfig2
                .selectColorFromConfigProduct("Brown")
                .addToCartButtonClick();
        Thread.sleep(5000);
        search
                .selectSimpleProduct3FromPredictiveSearchWindow("Test Simple Product 3 - Special Price");
        Thread.sleep(5000);
        pdpForSimple3
                .addToCartButtonClick()
                .proceedToCheckoutAsGuestUser();
        Thread.sleep(5000);
        checkoutGuestUserPage
                .addNewEmailAddress(userEmail)
                .addFirstName("Sureni")
                .addLastName("Test")
                .selectCity("Ajman")
                .addArea("Test Area")
                .addStreetName("Test Street")
                .addBuildingName("Test Building")
                .addPhoneNumber("585092040")
                .selectPaymentMethodAsCOD()
                .addCouponCode("testcoupon")
                .placeOrder()
                .clickContinueShoppingLink();
        Thread.sleep(5000);
        header
                .clickLogout();
    }

    //NPR payment method with Coupon Code
    @Test(priority = 4)
    public void testCheckoutFromNPR() throws Exception {
        search
                .selectSimpleProduct4FromPredictiveSearchWindow("Test Simple Product 4 - Original Price");
        Thread.sleep(5000);
        pdpForSimple4
                .addToCartButtonClick()
                .proceedToCheckoutAsGuestUser();
        Thread.sleep(10000);
        checkoutGuestUserPage
                .addNewEmailAddress(userEmail)
                .addFirstName("Sureni")
                .addLastName("Test")
                .selectCity("Ajman")
                .addArea("Test Area")
                .addStreetName("Test Street")
                .addBuildingName("Test Building")
                .addPhoneNumber("585092040")
                //.selectStandardDeliveryMethod()
                .addCouponCode("testautomation")
                .placeOrder()
                .clickContinueShoppingLink();
        Thread.sleep(5000);
        header
                .clickLogout();
    }


    //Validation message for empty email field
    @Test(priority = 5)
    public void testEmptyEmailValidation() throws Exception {
        search
                .selectSimpleProduct4FromPredictiveSearchWindow("Test Simple Product 4 - Original Price");
        Thread.sleep(5000);
        pdpForSimple4
                .addToCartButtonClick()
                .proceedToCheckoutAsGuestUser();
        Thread.sleep(10000);
        emptyEmailFieldValidation = checkoutGuestUserPage
                .placeOrderWithoutUserDetails()
                .emptyEmailValidation();
        Assert.assertTrue(emptyEmailFieldValidation);
    }

    //Validation message for empty FName field
    @Test(priority = 6)
    public void testEmptyFNameValidation() throws Exception {
        search
                .selectSimpleProduct4FromPredictiveSearchWindow("Test Simple Product 4 - Original Price");
        Thread.sleep(5000);
        pdpForSimple4
                .addToCartButtonClick()
                .proceedToCheckoutAsGuestUser();
        Thread.sleep(10000);
        emptyFNameFieldValidation = checkoutGuestUserPage
                .placeOrderWithoutUserDetails()
                .emptyFNameValidation();
        Thread.sleep(5000);
        Assert.assertTrue(emptyFNameFieldValidation);
    }

    //Validation message for empty LName field
    @Test(priority = 7)
    public void testEmptyLNameValidation() throws Exception {
        search
                .selectSimpleProduct4FromPredictiveSearchWindow("Test Simple Product 4 - Original Price");
        Thread.sleep(5000);
        pdpForSimple4
                .addToCartButtonClick()
                .proceedToCheckoutAsGuestUser();
        Thread.sleep(10000);
        emptyLNameFieldValidation = checkoutGuestUserPage
                .placeOrderWithoutUserDetails()
                .emptyLNameValidation();
        Assert.assertTrue(emptyLNameFieldValidation);
    }

    //Validation message for empty City field
    @Test(priority = 8)
    public void testEmptyCityValidation() throws Exception {
        search
                .selectSimpleProduct4FromPredictiveSearchWindow("Test Simple Product 4 - Original Price");
        Thread.sleep(5000);
        pdpForSimple4
                .addToCartButtonClick()
                .proceedToCheckoutAsGuestUser();
        Thread.sleep(10000);
        emptyCityFieldValidation = checkoutGuestUserPage
                .placeOrderWithoutUserDetails()
                .emptyCityValidation();
        Assert.assertTrue(emptyCityFieldValidation);
    }

    //Validation message for empty Area field
    @Test(priority = 9)
    public void testEmptyAreaValidation() throws Exception {
        search
                .selectSimpleProduct4FromPredictiveSearchWindow("Test Simple Product 4 - Original Price");
        Thread.sleep(5000);
        pdpForSimple4
                .addToCartButtonClick()
                .proceedToCheckoutAsGuestUser();
        Thread.sleep(10000);
        emptyAreaFieldValidation = checkoutGuestUserPage
                .placeOrderWithoutUserDetails()
                .emptyAreaValidation();
        Assert.assertTrue(emptyAreaFieldValidation);
    }

    //Validation message for empty Street Name field
    @Test(priority = 10)
    public void testEmptyStreetNameValidation() throws Exception {
        search
                .selectSimpleProduct4FromPredictiveSearchWindow("Test Simple Product 4 - Original Price");
        Thread.sleep(5000);
        pdpForSimple4
                .addToCartButtonClick()
                .proceedToCheckoutAsGuestUser();
        Thread.sleep(10000);
        emptyStreetNameFieldValidation = checkoutGuestUserPage
                .placeOrderWithoutUserDetails()
                .emptyStreetNameValidation();
        Assert.assertTrue(emptyStreetNameFieldValidation);
    }

    //Validation message for empty Building Name field
    @Test(priority = 11)
    public void testEmptyBuildingNameValidation() throws Exception {
        search
                .selectSimpleProduct4FromPredictiveSearchWindow("Test Simple Product 4 - Original Price");
        Thread.sleep(5000);
        pdpForSimple4
                .addToCartButtonClick()
                .proceedToCheckoutAsGuestUser();
        Thread.sleep(10000);
        emptyBuildingNameFieldValidation = checkoutGuestUserPage
                .placeOrderWithoutUserDetails()
                .emptyBuildingNameValidation();
        Assert.assertTrue(emptyBuildingNameFieldValidation);
    }

    //Validation message for empty Phone Number field
    @Test(priority = 12)
    public void testEmptyPhoneNumberValidation() throws Exception {
        search
                .selectSimpleProduct4FromPredictiveSearchWindow("Test Simple Product 4 - Original Price");
        Thread.sleep(5000);
        pdpForSimple4
                .addToCartButtonClick()
                .proceedToCheckoutAsGuestUser();
        Thread.sleep(10000);
        emptyPhoneNumberFieldValidation = checkoutGuestUserPage
                .placeOrderWithoutUserDetails()
                .emptyPhoneNumberValidation();
        Assert.assertTrue(emptyPhoneNumberFieldValidation);
    }

    //Validation message for invalid Email field
    @Test(priority = 13)
    public void testInvalidEmailValidation() throws Exception {
        search
                .selectSimpleProduct4FromPredictiveSearchWindow("Test Simple Product 4 - Original Price");
        Thread.sleep(5000);
        pdpForSimple4
                .addToCartButtonClick()
                .proceedToCheckoutAsGuestUser();
        Thread.sleep(10000);
        invalidEmailFieldValidation = checkoutGuestUserPage
                .addNewEmailAddress("addad")
                .placeOrderWithoutUserDetails()
                .invalidEmailValidation();
        Assert.assertTrue(invalidEmailFieldValidation);
    }

    //Validation message for invalid Phone Number - more than required
    @Test(priority = 14)
    public void testInvalidPhoneNumberValidation1() throws Exception {
        search
                .selectSimpleProduct4FromPredictiveSearchWindow("Test Simple Product 4 - Original Price");
        Thread.sleep(5000);
        pdpForSimple4
                .addToCartButtonClick()
                .proceedToCheckoutAsGuestUser();
        Thread.sleep(10000);
        checkoutGuestUserPage
                .addNewEmailAddress(userEmail)
                .addFirstName("Sureni")
                .addLastName("Test")
                .selectCity("Ajman")
                .addArea("Test Area")
                .addStreetName("Test Street")
                .addBuildingName("Test Building")
                .addPhoneNumber("5850920404");
        Thread.sleep(5000);
        invalidPhoneNumberWithMoreNumbers = checkoutGuestUserPage
                .invalidPhoneNumberValidation();
        Assert.assertTrue(invalidPhoneNumberWithMoreNumbers);
    }

    //Validation message for invalid Phone Number - less than required
    @Test(priority = 15)
    public void testInvalidPhoneNumberValidation2() throws Exception {
        search
                .selectSimpleProduct4FromPredictiveSearchWindow("Test Simple Product 4 - Original Price");
        Thread.sleep(5000);
        pdpForSimple4
                .addToCartButtonClick()
                .proceedToCheckoutAsGuestUser();
        Thread.sleep(10000);
        invalidPhoneNumberWithLessNumbers = checkoutGuestUserPage
                .addNewEmailAddress(userEmail)
                .addFirstName("Sureni")
                .addLastName("Test")
                .selectCity("Ajman")
                .addArea("Test Area")
                .addStreetName("Test Street")
                .addBuildingName("Test Building")
                .addPhoneNumber("58509204")
                .invalidPhoneNumberValidation();
        Assert.assertTrue(invalidPhoneNumberWithLessNumbers);
    }

    //Validation message for invalid Phone Number - With characters
    @Test(priority = 16)
    public void testInvalidPhoneNumberValidation3() throws Exception {
        search
                .selectSimpleProduct4FromPredictiveSearchWindow("Test Simple Product 4 - Original Price");
        Thread.sleep(5000);
        pdpForSimple4
                .addToCartButtonClick()
                .proceedToCheckoutAsGuestUser();
        Thread.sleep(10000);
        invalidPhoneNumberWithCharacters = checkoutGuestUserPage
                .addNewEmailAddress(userEmail)
                .addFirstName("Sureni")
                .addLastName("Test")
                .selectCity("Ajman")
                .addArea("Test Area")
                .addStreetName("Test Street")
                .addBuildingName("Test Building")
                .addPhoneNumber("585ajjdad")
                .invalidPhoneNumberValidation();
        Assert.assertTrue(invalidPhoneNumberWithCharacters);
    }

    //CC checkout
    /*@Test(priority = 2)
    public void testCheckoutFromCC() throws Exception {
        checkoutGuestUserPage
                .addNewEmailAddress("sureni+1010@sprii.com")
                .addFirstName("Sureni")
                .addLastName("Test")
                .selectCity("Ajman")
                .addArea("Test Area")
                .addStreetName("Test Street")
                .addBuildingName("Test Building")
                .addPhoneNumber("+971545654426")
                .selectPaymentMethodAsCC();
        Thread.sleep(5000);
        checkoutGuestUserPage
                .addCCCardNoExpDateAndCvv("4242 4242 4242 4242", "03/29", "100");
    }*/


}
