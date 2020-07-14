package com.sprii.regressionTestSuite;

import com.sprii.header.Header;
import com.sprii.home.HomePage;
import com.sprii.login.LoginPage;
import com.sprii.login.LogoutSuccessPage;
import com.sprii.login.MyAccount;
import com.sprii.myaccount.AccountDashboardPage;
import com.sprii.myaccount.MyWishListPage;
import com.sprii.navigate.NavigationPage;
import com.sprii.navigate.NerfSupersoakerCategoryPage;
import com.sprii.navigate.diapering.DiaperingPage;
import com.sprii.navigate.diapering.DiapersAndWipesPage;
import com.sprii.ordersuccess.OrderPlacementSuccessPage;
import com.sprii.pdp.*;
import com.sprii.plp.CartPage;
import com.sprii.plp.ProductListingPage;
import com.sprii.shoppingcart.ShoppingCartPage;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.SpriiTestFramework;

public class ProductDetailPageTest {

    ProductListingPage plp;
    NavigationPage navigation;
    SimpleProduct1WithOriginalPriceDetailPage simpleProduct1;
    SimpleProductWithSpecialPriceDetailPage simpleProduct2;
    ConfigProductWithOriginalPriceDetailPage configProduct1;
    ConfigProductWithSpecialPriceDetailPage configProduct2;
    ShoppingCartPage cartPage;
    LoginPage loginPage;
    MyWishListPage wishListPage;
    Header header;
    MyAccount myAccount;
    NerfSupersoakerCategoryPage nerfSupersoakerCategoryPage;
    HomePage home;
    DiaperingPage diaperingPage;
    DiapersAndWipesPage diapersAndWipesPage;
    ProductGalleryPage productGalleryPage;
    AccountDashboardPage accountDashboardPage;
    LogoutSuccessPage logoutSuccessPage;
    OrderPlacementSuccessPage orderSuccessPage;
    Boolean isSimpleProduct1NameAvailable;
    Boolean isSimpleProduct1PriceAvailable;
    Boolean isSimpleProduct1VatIncludedTextAvailable;
    Boolean isSimpleProduct1DeliveryTimeLabelAvailable;
    Boolean isSimpleProduct1SkuLabelAvailable;
    Boolean isSimpleProduct1SkuValueAvailable;
    Boolean isSimpleProduct1BrandLabelAvailable;
    Boolean isSimpleProduct1BrandValueAvailable;
    Boolean isSimpleProduct1SizeAndAgeLabelAvailable;
    Boolean isSimpleProduct1SizeAndAgeValueAvailable;
    Boolean isSimpleProduct1CollectionLabelAvailable;
    Boolean isSimpleProduct1CollectionValueAvailable;
    Boolean isSimpleProduct1FreeShippingLabelAvailable;
    Boolean isSimpleProduct1OnAllOrdersLabelAvailable;
    Boolean isSimpleProduct1FreeReturnsLabelAvailable;
    Boolean isSimpleProduct1WithinDaysLabelAvailable;
    Boolean isSimpleProduct1CashOnDeliveryLabelAvailable;
    Boolean isSimpleProduct1AvailableLabelAvailable;
    Boolean isSimpleProduct1PriceMatchLabelAvailable;
    Boolean isSimpleProduct1OnAllProductsLabelAvailable;
    Boolean isSimpleProduct1CustomersAlsoBoughtTitleAvailable;
    Boolean isSimpleProduct2SpecialPriceIsAvailable;
    Boolean isSimpleProduct2OriginalPriceIsAvailable;
    Boolean isSimpleProduct2VatIncludedLabelIsAvailable;
    Boolean isSimpleProduct2YouSaveLabelIsAvailable;
    Boolean isSimpleProduct2YouSavePriceISAvailable;
    Boolean isSimpleProduct2YouSavePercentageIsAvailable;
    Boolean isConfigProduct1NameAvailable;
    Boolean isConfigProduct1PriceAvailable;
    Boolean isConfigProduct1VatIncludedTextAvailable;
    Boolean isConfigProduct1DeliveryTimeLabelAvailable;
    Boolean isConfigProduct1SkuLabelAvailable;
    Boolean isConfigProduct1SkuValueAvailable;
    Boolean isConfigProduct1BrandLabelAvailable;
    Boolean isConfigProduct1BrandValueAvailable;
    Boolean isConfigProduct1SizeAndAgeLabelAvailable;
    Boolean isConfigProduct1SizeAndAgeValueAvailable;
    Boolean isConfigProduct1CollectionLabelAvailable;
    Boolean isConfigProduct1CollectionValueAvailable;
    Boolean isConfigProduct1FreeShippingLabelAvailable;
    Boolean isConfigProduct1OnAllOrdersLabelAvailable;
    Boolean isConfigProduct1FreeReturnsLabelAvailable;
    Boolean isConfigProduct1WithinDaysLabelAvailable;
    Boolean isConfigProduct1CashOnDeliveryLabelAvailable;
    Boolean isConfigProduct1AvailableLabelAvailable;
    Boolean isConfigProduct1PriceMatchLabelAvailable;
    Boolean isConfigProduct1OnAllProductsLabelAvailable;
    Boolean isConfigProduct1CustomersAlsoBoughtTitleAvailable;
    Boolean isConfigProduct2SpecialPriceIsAvailable;
    Boolean isConfigProduct2OriginalPriceIsAvailable;
    Boolean isConfigProduct2VatIncludedLabelIsAvailable;
    Boolean isConfigProduct2YouSaveLabelIsAvailable;
    Boolean isConfigProduct2YouSavePriceISAvailable;
    Boolean isConfigProduct2YouSavePercentageIsAvailable;
    Boolean isGuestUserWishListMsgAvailableAtLogin;
    Boolean isLoggedUserWishListMsgAvailableAtWishListPage;


    @BeforeClass
    public void beforeClass() throws Exception {
        SpriiTestFramework.getInstance().openBrowser();
    }

    @BeforeMethod
    public void setUp() throws Exception {
        SpriiTestFramework.getInstance().navigateToURL();
        navigation = new NavigationPage();
        loginPage = new LoginPage();
        plp = new ProductListingPage();
        header = new Header();
        wishListPage = new MyWishListPage();
        simpleProduct1 = new SimpleProduct1WithOriginalPriceDetailPage();
        simpleProduct2 = new SimpleProductWithSpecialPriceDetailPage();
        configProduct1 = new ConfigProductWithOriginalPriceDetailPage();
        configProduct2 = new ConfigProductWithSpecialPriceDetailPage();

        plp = navigation
                .selectDiapersAndWipesShopAllPageInDiapering()
                .directToTestAutomationCategory();
    }

    //Simple product with original price detail page
    @Test(priority = 1)
    public void testSimpleProductAddToCart() throws Exception {
        cartPage = plp
                .clickEventOnSimpleProductOriginalPriceName()
                .addToCartButtonClick();
    }

    @Test(priority = 2)
    public void testAddToWishListForGuest() throws Exception {
        isGuestUserWishListMsgAvailableAtLogin = plp
                .clickEventOnSimpleProductOriginalPriceName()
                .addToWishListByGuestUser()
                .msgForGuestUserWishListIsAvailable();
        Assert.assertTrue(isGuestUserWishListMsgAvailableAtLogin);
    }

    @Test(priority = 38)
    public void testAddToWishListForLoggedUserAfterRedirectingToLogin() throws Exception {
        wishListPage = plp
                .clickEventOnSimpleProductOriginalPriceName()
                .addToWishListByGuestUser()
                .loginSuccessForGuestWishList("sureni+1@sprii.com", "surenisprii@#123");
    }

    @Test(dependsOnMethods = {"testAddToWishListForLoggedUserAfterRedirectingToLogin"})
    public void testAddToWishListForLoggedUser() throws Exception {
        isLoggedUserWishListMsgAvailableAtWishListPage = plp
                .clickEventOnSimpleProductOriginalPriceName()
                .addToWishListByLoggedUser()
                .wishListAddingMsgForLoggedUser();
        Assert.assertTrue(isLoggedUserWishListMsgAvailableAtWishListPage);

        wishListPage
                .selectLogout();
    }

    @Test(priority = 5)
    public void testViewAll() throws Exception {
        nerfSupersoakerCategoryPage = plp
                .clickEventOnSimpleProductOriginalPriceName()
                .clickViewallNerfSupersoakerproductsLink();
    }

    @Test(priority = 6)
    public void testHomePageBreadcrumb() throws Exception {
        home = plp
                .clickEventOnSimpleProductOriginalPriceName()
                .selectHomePageBreadcrumb();
    }

    @Test(priority = 7)
    public void testDiaperingCategoryBreadcrumb() throws Exception {
        diaperingPage = plp
                .clickEventOnSimpleProductOriginalPriceName()
                .selectDiaperingBreadcrumb();
    }

    @Test(priority = 8)
    public void testDiapersAndWipesCategoryBreadcrumb() throws Exception {
        diapersAndWipesPage = plp
                .clickEventOnSimpleProductOriginalPriceName()
                .selectDiapersAndWipesBreadcrumb();
    }

    @Test(priority = 9)
    public void testSimpleProduct1ZoomAndProductGallery() throws Exception {
        simpleProduct1 = plp
                .clickEventOnSimpleProductOriginalPriceName()
                .zoomTheSimpleProduct()
                .clickOnLeftScrollArrow()
                .clickOnRightScrollArrow()
                .clickOnRightScrollArrow()
                .firstImageClick()
                .fourthImageClick()
                .zoomIn()
                .zoomOut()
                .removeProductGalleryFromSimpleProduct1tWithOriginalPrice();
    }

    @Test(priority = 10)
    public void testSimpleProduct1ThumbnailImage1ClickAndScroll() throws Exception {
        simpleProduct1 = plp
                .clickEventOnSimpleProductOriginalPriceName()
                .clickEventOnFourthImage()
                .clickEventOnThirdImage()
                .clickEventOnSecondImage()
                .productScrollWithRightArrow();
    }

    @Test(priority = 11)
    public void testSimpleProduct1ScrollWithArrows() throws Exception {
        simpleProduct1 = plp
                .clickEventOnSimpleProductOriginalPriceName()
                .productScrollWithLeftArrow()
                .productScrollWithLeftArrow()
                .productScrollWithRightArrow();
    }

    @Test(priority = 12)
    public void testSimpleProduct1NameAvailability() throws Exception {
        isSimpleProduct1NameAvailable = plp
                .clickEventOnSimpleProductOriginalPriceName()
                .productNameIsAvailable();
        Assert.assertTrue(isSimpleProduct1NameAvailable);
    }

    @Test(priority = 13)
    public void testSimpleProduct1PriceAvailability() throws Exception {
        isSimpleProduct1PriceAvailable = plp
                .clickEventOnSimpleProductOriginalPriceName()
                .productPriceIsAvailable();
        Assert.assertTrue(isSimpleProduct1PriceAvailable);
    }

    @Test(priority = 14)
    public void testSimpleProduct1VatIncludedTextAvailability() throws Exception {
        isSimpleProduct1VatIncludedTextAvailable = plp
                .clickEventOnSimpleProductOriginalPriceName()
                .productVATTextIsAvailable();
        Assert.assertTrue(isSimpleProduct1VatIncludedTextAvailable);
    }

    @Test(priority = 15)
    public void testSimpleProduct1DeliveryTextAvailability() throws Exception {
        isSimpleProduct1DeliveryTimeLabelAvailable = plp
                .clickEventOnSimpleProductOriginalPriceName()
                .productDeliveryTimeIsAvailable();
        Assert.assertTrue(isSimpleProduct1DeliveryTimeLabelAvailable);
    }

    @Test(priority = 16)
    public void testSimpleProduct1DetailsAvailability() throws Exception {
        isSimpleProduct1SkuLabelAvailable = plp
                .clickEventOnSimpleProductOriginalPriceName()
                .productSKULabelIsAvailable();
        Assert.assertTrue(isSimpleProduct1SkuLabelAvailable);

        isSimpleProduct1SkuValueAvailable = simpleProduct1
                .productSKUValueIsAvailable();
        Assert.assertTrue(isSimpleProduct1SkuValueAvailable);

        isSimpleProduct1BrandLabelAvailable = simpleProduct1
                .productBrandLabelIsAvailable();
        Assert.assertTrue(isSimpleProduct1BrandLabelAvailable);

        isSimpleProduct1BrandValueAvailable = simpleProduct1
                .productBrandValueIsAvailable();
        Assert.assertTrue(isSimpleProduct1BrandValueAvailable);

        isSimpleProduct1SizeAndAgeLabelAvailable = simpleProduct1
                .productSizeAndAgeLabelIsAvailable();
        Assert.assertTrue(isSimpleProduct1SizeAndAgeLabelAvailable);

        isSimpleProduct1SizeAndAgeValueAvailable = simpleProduct1
                .productSizeAndAgeValueIsAvailable();
        Assert.assertTrue(isSimpleProduct1SizeAndAgeValueAvailable);

        isSimpleProduct1CollectionLabelAvailable = simpleProduct1
                .productCollectionLabelIsAvailable();
        Assert.assertTrue(isSimpleProduct1CollectionLabelAvailable);

        isSimpleProduct1CollectionValueAvailable = simpleProduct1
                .productCollectionValueIsAvailable();
        Assert.assertTrue(isSimpleProduct1CollectionValueAvailable);
    }

    @Test(priority = 17)
    public void testSimpleProduct1GuestUserBlockAvailability() throws Exception {
        isSimpleProduct1FreeShippingLabelAvailable = plp
                .clickEventOnSimpleProductOriginalPriceName()
                .guestUserFreeShippingLabelIsAvailable();
        Assert.assertTrue(isSimpleProduct1FreeShippingLabelAvailable);

        isSimpleProduct1OnAllOrdersLabelAvailable = simpleProduct1
                .guestUserOnAllOrderTextIsAvailable();
        Assert.assertTrue(isSimpleProduct1OnAllOrdersLabelAvailable);

        isSimpleProduct1FreeReturnsLabelAvailable = simpleProduct1
                .guestUserFreeReturnsLabelIsAvailable();
        Assert.assertTrue(isSimpleProduct1FreeReturnsLabelAvailable);

        isSimpleProduct1WithinDaysLabelAvailable = simpleProduct1
                .guestUserWithin7DaysTextIsAvailable();
        Assert.assertTrue(isSimpleProduct1WithinDaysLabelAvailable);

        isSimpleProduct1CashOnDeliveryLabelAvailable = simpleProduct1
                .guestUserCashOnDeliveryLabelIsAvailable();
        Assert.assertTrue(isSimpleProduct1CashOnDeliveryLabelAvailable);

        isSimpleProduct1AvailableLabelAvailable = simpleProduct1
                .guestUserAvailableLabelIsAvailable();
        Assert.assertTrue(isSimpleProduct1AvailableLabelAvailable);

        isSimpleProduct1PriceMatchLabelAvailable = simpleProduct1
                .guestUserPriceMatchLabelIsAvailable();
        Assert.assertTrue(isSimpleProduct1PriceMatchLabelAvailable);

        isSimpleProduct1OnAllProductsLabelAvailable = simpleProduct1
                .guestUserOnAllProductsLabelIsAvailable();
        Assert.assertTrue(isSimpleProduct1OnAllProductsLabelAvailable);
    }

    @Test(priority = 18)
    public void testSimpleProduct1CustomerAlsoBoughtSectionAvailability() throws Exception {
        isSimpleProduct1CustomersAlsoBoughtTitleAvailable = plp
                .clickEventOnSimpleProductOriginalPriceName()
                .guestUserCustomerAlsoBoughtTitleIsAvailable();
        Assert.assertTrue(isSimpleProduct1CustomersAlsoBoughtTitleAvailable);
    }

    //Simple product with special price detail page
    @Test(priority = 19)
    public void testSimpleProduct2SpecialPriceAvailabilityAndOtherInfo() throws Exception {
        isSimpleProduct2SpecialPriceIsAvailable = plp
                .clickEventOnSimpleProductSpecialPriceName()
                .simpleProduct2SpecialPriceIsAvailable();
        Assert.assertTrue(isSimpleProduct2SpecialPriceIsAvailable);

        isSimpleProduct2OriginalPriceIsAvailable = simpleProduct2
                .simpleProduct2OriginalPriceIsAvailable();
        Assert.assertTrue(isSimpleProduct2OriginalPriceIsAvailable);

        isSimpleProduct2VatIncludedLabelIsAvailable = simpleProduct2
                .simpleProduct2VatIncludedLabelIsAvailable();
        Assert.assertTrue(isSimpleProduct2VatIncludedLabelIsAvailable);

        isSimpleProduct2YouSaveLabelIsAvailable = simpleProduct2
                .simpleProduct2SaveLabelIsAvailable();
        Assert.assertTrue(isSimpleProduct2YouSaveLabelIsAvailable);

        isSimpleProduct2YouSavePriceISAvailable = simpleProduct2
                .simpleProduct2SavePriceIsAvailable();
        Assert.assertTrue(isSimpleProduct2YouSavePriceISAvailable);

        isSimpleProduct2YouSavePercentageIsAvailable = simpleProduct2
                .simpleProduct2SavePercentageIsAvailable();
        Assert.assertTrue(isSimpleProduct2YouSavePercentageIsAvailable);
    }

    //Configurable product with original price detail page
    @Test(priority = 20)
    public void testConfigurableProductAddToCart() throws Exception {
        cartPage = plp
                .clickEventOnConfigProductOriginalPriceName()
                .addToCartButtonClick();
    }

    @Test(priority = 21)
    public void testConfigProductAddToWishListForGuest() throws Exception {
        loginPage = plp
                .clickEventOnConfigProductOriginalPriceName()
                .addToWishListByGuestUser();
    }

    @Test(priority = 40)
    public void testConfigProductAddToWishListForLoggedUserAfterRedirectingToLogin() throws Exception {
        wishListPage = plp
                .clickEventOnConfigProductOriginalPriceName()
                .addToWishListByGuestUser()
                .loginSuccessForGuestWishList("sureni+1@sprii.com", "surenisprii@#123");
    }

    @Test(dependsOnMethods = {"testConfigProductAddToWishListForLoggedUserAfterRedirectingToLogin"})
    public void testConfigProductAddToWishListForLoggedUser() throws Exception {
        logoutSuccessPage = plp
                .clickEventOnConfigProductOriginalPriceName()
                .addToWishListByLoggedUser()
                .selectLogout();
    }

    @Test(priority = 24)
    public void testConfigProduct2ZoomAndProductGallery() throws Exception {
        configProduct2 = plp
                .clickEventOnConfigProductSpecialPriceName()
                .zoomConfigProduct()
                .clickOnLeftScrollArrow()
                .clickOnRightScrollArrow()
                .clickOnRightScrollArrow()
                .firstImageClick()
                .fourthImageClick()
                .removeProductGalleryFromConfigProductWithSpecialPrice();
    }

    @Test(priority = 25)
    public void testConfigProduct2ThumbnailImage1ClickAndScroll() throws Exception {
        configProduct2 = plp
                .clickEventOnConfigProductSpecialPriceName()
                .clickEventOnThirdImageConfigProduct()
                .clickEventOnFifthImageConfigProduct()
                .clickEventOnFirstThumbnailImageConfigProduct()
                .clickEventOnSecondImageConfigProduct()
                .configProductScrollWithRightArrow();
    }

    @Test(priority = 26)
    public void testConfigProduct1ScrollWithArrows() throws Exception {
        configProduct2 = plp
                .clickEventOnConfigProductSpecialPriceName()
                .configProductScrollWithLeftArrow()
                .configProductScrollWithLeftArrow()
                .configProductScrollWithRightArrow();
    }

    @Test(priority = 27)
    public void testConfigProduct1NameAvailability() throws Exception {
        isConfigProduct1NameAvailable = plp
                .clickEventOnConfigProductOriginalPriceName()
                .product3NameIsAvailable();
        Assert.assertTrue(isConfigProduct1NameAvailable);
    }

    @Test(priority = 28)
    public void testConfigProduct1PriceAvailability() throws Exception {
        isConfigProduct1PriceAvailable = plp
                .clickEventOnConfigProductOriginalPriceName()
                .product3PriceIsAvailable();
        Assert.assertTrue(isConfigProduct1PriceAvailable);
    }

    @Test(priority = 29)
    public void testConfigProduct1VatIncludedTextAvailability() throws Exception {
        isConfigProduct1VatIncludedTextAvailable = plp
                .clickEventOnConfigProductOriginalPriceName()
                .product3VATTextIsAvailable();
        Assert.assertTrue(isConfigProduct1VatIncludedTextAvailable);
    }

    @Test(priority = 30)
    public void testConfigProduct1DeliveryTextAvailability() throws Exception {
        isConfigProduct1DeliveryTimeLabelAvailable = plp
                .clickEventOnConfigProductOriginalPriceName()
                .product3DeliveryTimeIsAvailable();
        Assert.assertTrue(isConfigProduct1DeliveryTimeLabelAvailable);
    }

    @Test(priority = 31)
    public void testConfigProduct1DetailsAvailability() throws Exception {
        isConfigProduct1SkuLabelAvailable = plp
                .clickEventOnConfigProductOriginalPriceName()
                .product3SKULabelIsAvailable();
        Assert.assertTrue(isConfigProduct1SkuLabelAvailable);

        isConfigProduct1SkuValueAvailable = configProduct1
                .product3SKUValueIsAvailable();
        Assert.assertTrue(isConfigProduct1SkuValueAvailable);

        isConfigProduct1BrandLabelAvailable = configProduct1
                .product3BrandLabelIsAvailable();
        Assert.assertTrue(isConfigProduct1BrandLabelAvailable);

        isConfigProduct1BrandValueAvailable = configProduct1
                .product3BrandValueIsAvailable();
        Assert.assertTrue(isConfigProduct1BrandValueAvailable);

        isConfigProduct1SizeAndAgeLabelAvailable = configProduct1
                .product3SizeAndAgeLabelIsAvailable();
        Assert.assertTrue(isConfigProduct1SizeAndAgeLabelAvailable);

        isConfigProduct1SizeAndAgeValueAvailable = configProduct1
                .product3SizeAndAgeValueIsAvailable();
        Assert.assertTrue(isConfigProduct1SizeAndAgeValueAvailable);

        isConfigProduct1CollectionLabelAvailable = configProduct1
                .product3CollectionLabelIsAvailable();
        Assert.assertTrue(isConfigProduct1CollectionLabelAvailable);

        isConfigProduct1CollectionValueAvailable = configProduct1
                .product3CollectionValueIsAvailable();
        Assert.assertTrue(isConfigProduct1CollectionValueAvailable);
    }

    @Test(priority = 32)
    public void testConfigProduct1GuestUserBlockAvailability() throws Exception {
        isConfigProduct1FreeShippingLabelAvailable = plp
                .clickEventOnConfigProductOriginalPriceName()
                .guestUserFreeShippingLabelIsAvailable();
        Assert.assertTrue(isConfigProduct1FreeShippingLabelAvailable);

        isConfigProduct1OnAllOrdersLabelAvailable = configProduct1
                .guestUserOnAllOrderTextIsAvailable();
        Assert.assertTrue(isConfigProduct1OnAllOrdersLabelAvailable);

        isConfigProduct1FreeReturnsLabelAvailable = configProduct1
                .guestUserFreeReturnsLabelIsAvailable();
        Assert.assertTrue(isConfigProduct1FreeReturnsLabelAvailable);

        isConfigProduct1WithinDaysLabelAvailable = configProduct1
                .guestUserWithin7DaysTextIsAvailable();
        Assert.assertTrue(isConfigProduct1WithinDaysLabelAvailable);

        isConfigProduct1CashOnDeliveryLabelAvailable = configProduct1
                .guestUserCashOnDeliveryLabelIsAvailable();
        Assert.assertTrue(isConfigProduct1CashOnDeliveryLabelAvailable);

        isConfigProduct1AvailableLabelAvailable = configProduct1
                .guestUserAvailableLabelIsAvailable();
        Assert.assertTrue(isConfigProduct1AvailableLabelAvailable);

        isConfigProduct1PriceMatchLabelAvailable = configProduct1
                .guestUserPriceMatchLabelIsAvailable();
        Assert.assertTrue(isConfigProduct1PriceMatchLabelAvailable);

        isConfigProduct1OnAllProductsLabelAvailable = configProduct1
                .guestUserOnAllProductsLabelIsAvailable();
        Assert.assertTrue(isConfigProduct1OnAllProductsLabelAvailable);
    }

    @Test(priority = 33)
    public void testConfigProduct1CustomerAlsoBoughtSectionAvailability() throws Exception {
        isConfigProduct1CustomersAlsoBoughtTitleAvailable = plp
                .clickEventOnConfigProductOriginalPriceName()
                .guestUserCustomerAlsoBoughtTitleIsAvailable();
        Assert.assertTrue(isConfigProduct1CustomersAlsoBoughtTitleAvailable);
    }

    //Config product with special price detail page
    @Test(priority = 34)
    public void testConfigProduct2SpecialPriceAvailabilityAndOtherInfo() throws Exception {
        isConfigProduct2SpecialPriceIsAvailable = plp
                .clickEventOnConfigProductSpecialPriceName()
                .configProduct2SpecialPriceIsAvailable();
        Assert.assertTrue(isConfigProduct2SpecialPriceIsAvailable);

        isConfigProduct2OriginalPriceIsAvailable = configProduct2
                .configProduct2OriginalPriceIsAvailable();
        Assert.assertTrue(isConfigProduct2OriginalPriceIsAvailable);

        isConfigProduct2VatIncludedLabelIsAvailable = configProduct2
                .configProduct2VatIncludedLabelIsAvailable();
        Assert.assertTrue(isConfigProduct2VatIncludedLabelIsAvailable);

        isConfigProduct2YouSaveLabelIsAvailable = configProduct2
                .configProduct2SaveLabelIsAvailable();
        Assert.assertTrue(isConfigProduct2YouSaveLabelIsAvailable);

        isConfigProduct2YouSavePriceISAvailable = configProduct2
                .configProduct2SavePriceIsAvailable();
        Assert.assertTrue(isConfigProduct2YouSavePriceISAvailable);

        isConfigProduct2YouSavePercentageIsAvailable = configProduct2
                .configProduct2SavePercentageIsAvailable();
        Assert.assertTrue(isConfigProduct2YouSavePercentageIsAvailable);
    }

    //Registered user simple product instant checkout at PDP from COD
    @Test(priority = 35)
    public void testCheckoutByCODForRegistered() throws Exception {
        accountDashboardPage = header
                .redirectToSignInPage()
                .loginSuccess("sureni+1@sprii.com", "surenisprii@#123");

        simpleProduct1 = navigation
                .selectDiapersAndWipesShopAllPageInDiapering()
                .directToTestAutomationCategory()
                .clickEventOnSimpleProductOriginalPriceName()
                .selectPaymentMethodAsCOD();
        Thread.sleep(5000);
        orderSuccessPage = simpleProduct1
                .clickInstantCheckoutButton();

        logoutSuccessPage = header
                .clickLogout();
    }

    //Registered user simple product instant checkout at PDP from CC
    @Test(priority = 36)
    public void testCheckoutByCCForRegistered() throws Exception {
        accountDashboardPage = header
                .redirectToSignInPage()
                .loginSuccess("sureni+1@sprii.com", "surenisprii@#123");

        simpleProduct1 = navigation
                .selectDiapersAndWipesShopAllPageInDiapering()
                .directToTestAutomationCategory()
                .clickEventOnSimpleProductOriginalPriceName()
                .selectPaymentMethodAsCC();
        Thread.sleep(5000);
        orderSuccessPage = simpleProduct1
                .clickInstantCheckoutButton();

        logoutSuccessPage = header
                .clickLogout();
    }

    //Registered user config product instant checkout unavailability
    @Test(priority = 37)
    public void testConfigProduct1InstantCheckoutUnavailability() throws Exception {
        accountDashboardPage = header
                .redirectToSignInPage()
                .loginSuccess("sureni+1@sprii.com", "surenisprii@#123");

        configProduct1 = navigation
                .selectDiapersAndWipesShopAllPageInDiapering()
                .directToTestAutomationCategory()
                .clickEventOnConfigProductOriginalPriceName();

        isConfigProduct1FreeShippingLabelAvailable = configProduct1
                .guestUserFreeShippingLabelIsAvailable();
        Assert.assertTrue(isConfigProduct1FreeShippingLabelAvailable);

        isConfigProduct1OnAllOrdersLabelAvailable = configProduct1
                .guestUserOnAllOrderTextIsAvailable();
        Assert.assertTrue(isConfigProduct1OnAllOrdersLabelAvailable);

        isConfigProduct1FreeReturnsLabelAvailable = configProduct1
                .guestUserFreeReturnsLabelIsAvailable();
        Assert.assertTrue(isConfigProduct1FreeReturnsLabelAvailable);

        isConfigProduct1WithinDaysLabelAvailable = configProduct1
                .guestUserWithin7DaysTextIsAvailable();
        Assert.assertTrue(isConfigProduct1WithinDaysLabelAvailable);

        isConfigProduct1CashOnDeliveryLabelAvailable = configProduct1
                .guestUserCashOnDeliveryLabelIsAvailable();
        Assert.assertTrue(isConfigProduct1CashOnDeliveryLabelAvailable);

        isConfigProduct1AvailableLabelAvailable = configProduct1
                .guestUserAvailableLabelIsAvailable();
        Assert.assertTrue(isConfigProduct1AvailableLabelAvailable);

        isConfigProduct1PriceMatchLabelAvailable = configProduct1
                .guestUserPriceMatchLabelIsAvailable();
        Assert.assertTrue(isConfigProduct1PriceMatchLabelAvailable);

        isConfigProduct1OnAllProductsLabelAvailable = configProduct1
                .guestUserOnAllProductsLabelIsAvailable();
        Assert.assertTrue(isConfigProduct1OnAllProductsLabelAvailable);

        logoutSuccessPage = header
                .clickLogout();
    }

    @Test(priority = 42)
    public void testConfigProductAddToCart() throws Exception {
        cartPage = plp
                .clickEventOnConfigProductOriginalPriceName()
                .selectConfigOptionFromConfigProduct("2-24 months")
                .addToCartButtonClick();
    }

    @AfterClass
    public void afterClass() throws Exception {
        SpriiTestFramework.getInstance().closeBrowser();
    }
}