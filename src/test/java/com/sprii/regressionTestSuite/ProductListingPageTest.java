package com.sprii.regressionTestSuite;

import com.sprii.home.HomePage;
import com.sprii.navigate.NavigationPage;
import com.sprii.navigate.diapering.DiaperingPage;
import com.sprii.navigate.diapering.DiapersAndWipesPage;
import com.sprii.pdp.*;
import com.sprii.plp.ProductListingPage;
import com.sprii.plp.TestAutomationCategory;
import com.sprii.plp.layerednavigation.brand.Brand;
import com.sprii.plp.layerednavigation.collection.Collection;
import com.sprii.plp.layerednavigation.color.Colour;
import com.sprii.plp.layerednavigation.deliverytime.DeliveryTime;
import com.sprii.plp.layerednavigation.gender.Gender;
import com.sprii.shoppingcart.ShoppingCartPage;
import org.testng.Assert;
import org.testng.annotations.*;
import utils.SpriiTestFramework;

public class ProductListingPageTest {

    ProductListingPage plp;
    HomePage home;
    NavigationPage navigation;
    TestAutomationCategory testAutomationCategory;
    SimpleProductWithSpecialPriceDetailPage simpleProduct2WithSpecialPrice;
    ShoppingCartPage shoppingCart;
    SimpleProduct1WithOriginalPriceDetailPage simpleProduct1WithOriginalPrice;
    ConfigProductWithOriginalPriceDetailPage configProductWithOriginalPrice;
    ConfigProductWithSpecialPriceDetailPage configProductWithSpecialPrice;
    SimpleProduct3WithSpecialPriceDetailPage simpleProduct3WithSpecialPrice;
    SimpleProduct4WithOriginalPriceDetailPage simpleProduct4WithOriginalPrice;
    Collection collection;
    DeliveryTime deliveryTime;
    Brand brand;
    Gender gender;
    Colour colour;
    DiaperingPage diaperingPage;
    DiapersAndWipesPage diapersAndWipesPage;
    Boolean productListingPageHeading;
    ShoppingCartPage cartPage;

    @BeforeClass
    public void beforeClass() throws Exception {
        SpriiTestFramework.getInstance().openBrowser();
    }

    @BeforeMethod
    public void setUp() throws Exception {
        SpriiTestFramework.getInstance().navigateToURL();
        home = new HomePage();
        navigation = new NavigationPage();
        plp = new ProductListingPage();
        collection = new Collection();
        deliveryTime = new DeliveryTime();
        brand = new Brand();
        gender = new Gender();
        colour = new Colour();

        plp = navigation
                .selectDiapersAndWipesShopAllPageInDiapering()
                .directToTestAutomationCategory();
    }

    @Test(priority = 1)
    public void testSortingOptionsDropDown() throws Exception {
        plp
                .sortingOptionsDropDown("Price")
                .sortingOptionsDropDown("New")
                .sortingOptionsDropDown("Size")
                .sortingOptionsDropDown("Featured");
    }

    @Test(priority = 2)
    public void testClickEventOnSimpleProductSpecialPriceName() throws Exception {
        simpleProduct2WithSpecialPrice = plp
                .clickEventOnSimpleProductSpecialPriceName();
    }

    @Test(priority = 3)
    public void testClickEventOnSimpleProductSpecialPriceImage() throws Exception {
        simpleProduct2WithSpecialPrice = plp
                .clickEventOnSimpleProductSpecialPriceImage();
    }

    @Test(priority = 4)
    public void testAddToCartButtonEventForSimpleProductWithSpecialPrice() throws Exception {
        shoppingCart = plp
                .addToCartSimpleProductWithSpecialPrice();
    }

    @Test(priority = 5)
    public void testClickEventOnSimpleProductOriginalPriceName() throws Exception {
        simpleProduct1WithOriginalPrice = plp
                .clickEventOnSimpleProductOriginalPriceName();
    }

    @Test(priority = 6)
    public void testClickEventOnSimpleProductOriginalPriceImage() throws Exception {
        simpleProduct1WithOriginalPrice = plp
                .clickEventOnSimpleProductOriginalPriceImage();
    }

    @Test(priority = 7)
    public void testAddToCartButtonEventForSimpleProductWithOriginalPrice() throws Exception {
        shoppingCart = plp
                .addToCartButtonEventForSimpleProductWithOriginalPrice();
    }

    @Test(priority = 8)
    public void testClickEventOnConfigProductOriginalPriceName() throws Exception {
        configProductWithOriginalPrice = plp
                .clickEventOnConfigProductOriginalPriceName();
    }

    @Test(priority = 9)
    public void testClickEventOnConfigProductOriginalPriceImage() throws Exception {
        configProductWithOriginalPrice = plp
                .clickEventOnConfigProductOriginalPriceImage();
    }

    @Test(priority = 10)
    public void testAddToCartButtonEventForConfigProductWithOriginalPrice() throws Exception {
        configProductWithOriginalPrice = plp
                .addToCartButtonEventForConfigProductWithOriginalPrice();
    }

    @Test(priority = 11)
    public void testClickEventOnConfigProductSpecialPriceName() throws Exception {
        configProductWithSpecialPrice = plp
                .clickEventOnConfigProductSpecialPriceName();
    }

    @Test(priority = 12)
    public void testClickEventOnConfigProductSpecialPriceImage() throws Exception {
        configProductWithSpecialPrice = plp
                .clickEventOnConfigProductSpecialPriceImage();
    }

    @Test(priority = 13)
    public void addToAddToCartButtonEventForConfigProductWithSpecialPrice() throws Exception {
        configProductWithSpecialPrice = plp
                .addToCartButtonEventForConfigProductWithSpecialPrice();
    }

    @Test(priority = 14)
    public void testClickEventOnSimpleProduct3SpecialPriceName() throws Exception {
        simpleProduct3WithSpecialPrice = plp
                .clickEventOnSimpleProduct3SpecialPriceName();
    }

    @Test(priority = 15)
    public void testClickEventOnSimpleProduct3SpecialPriceImage() throws Exception {
        simpleProduct3WithSpecialPrice = plp
                .clickEventOnSimpleProduct3SpecialPriceImage();
    }

    @Test(priority = 16)
    public void testAddToAddToCartButtonEventForSimpleProduct3WithSpecialPrice() throws Exception {
        shoppingCart = plp
                .addToCartButtonEventForSimpleProduct3WithSpecialPrice();
    }

    @Test(priority = 17)
    public void testClickEventOnSimpleProduct4OriginalPriceName() throws Exception {
        simpleProduct4WithOriginalPrice = plp
                .clickEventOnSimpleProduct4OriginalPriceName();
    }

    @Test(priority = 18)
    public void testClickEventOnSimpleProduct4OriginalPriceImage() throws Exception {
        simpleProduct4WithOriginalPrice = plp
                .clickEventOnSimpleProduct4OriginalPriceImage();
    }

    @Test(priority = 19)
    public void testAddToAddToCartButtonEventForSimpleProduct4WithOriginalPrice() throws Exception {
        shoppingCart = plp
                .addToCartButtonEventForSimpleProduct4WithOriginalPrice();
    }

    @Test(priority = 20)
    public void testLayeredNavigationCollectionSelect() throws Exception {
        collection
                .showMoreButtonClickEvent()
                .selectStarWarsCollection()
                .showMoreButtonClickEvent()
                .showLessButtonClickEvent()
                .removeCollectionStarWarsItem();
    }

    @Test(priority = 21)
    public void testSelectMoreThan1FiltersAndRemoveAll() throws Exception {
        deliveryTime
                .select24HoursDeliveryTime();
        collection
                .showMoreButtonClickEvent()
                .selectWoodenCollection();
        brand
                .selectBabyAliveBrand()
                .clearAll();
    }

    @Test(priority = 22)
    public void testSelectMoreThan1FiltersAndRemoveOne() throws Exception {
        deliveryTime
                .select24HoursDeliveryTime();
        collection
                .showMoreButtonClickEvent()
                .selectWoodenCollection();
        brand
                .selectBabyAliveBrand();
        collection
                .removeCollectionWoodenItem();
    }

    @Test(priority = 23)
    public void testSortingMethodsAndFiltersAndRemoveOneFilter() throws Exception {
        plp
                .sortingOptionsDropDown("Price");
        deliveryTime
                .select24HoursDeliveryTime();
        brand
                .selectBabyAliveBrand()
                .removeBabyAliveBrand();
    }

    @Test(priority = 24)
    public void testSortingMethodsAndFiltersAndChangeSort() throws Exception {
        plp
                .sortingOptionsDropDown("Price");
        deliveryTime
                .select24HoursDeliveryTime();
        plp
                .sortingOptionsDropDown("New");
    }

    @Test(priority = 25)
    public void testGenderAndColourFilters() throws Exception {
        gender
                .clickEventOnGenderTab()
                .showMoreButtonClickEvent()
                .selectUnisexGender();
        colour
                .selectColourElement()
                .showMoreButtonClickEvent()
                .selectSilverColor();
    }

    @Test(priority = 26)
    public void testHomePageBreadcrumb() throws Exception {
        home = plp
                .selectHomePageBreadcrumb();
    }

    @Test(priority = 27)
    public void testDiaperingCategoryBreadcrumb() throws Exception {
        diaperingPage = plp
                .selectDiaperingBreadcrumb();
    }

    @Test(priority = 28)
    public void testDiapersAndWipesCategoryBreadcrumb() throws Exception {
        diapersAndWipesPage = plp
                .selectDiapersAndWipesBreadcrumb();
    }

    @Test(priority = 29)
    public void testProductListingCategoryNameIsAvailable() throws Exception {
        productListingPageHeading = plp
                .productListingCategoryName();
        Assert.assertTrue(productListingPageHeading);
    }

    @AfterClass
    public void afterClass() throws Exception {
        SpriiTestFramework.getInstance().closeBrowser();
    }
}
