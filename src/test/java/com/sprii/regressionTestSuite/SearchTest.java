package com.sprii.regressionTestSuite;

import com.sprii.pdp.SimpleProduct1WithOriginalPriceDetailPage;
import com.sprii.search.Search;
import com.sprii.search.SearchResultCategoryPage;
import com.sprii.search.searchlayerednavigation.SearchBrand;
import com.sprii.search.searchlayerednavigation.SearchCategory;
import com.sprii.search.searchlayerednavigation.SearchCollection;
import com.sprii.shoppingcart.ShoppingCartPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.SpriiTestFramework;

public class SearchTest {
    Search search;
    SearchResultCategoryPage searchResultCategoryPage;
    SimpleProduct1WithOriginalPriceDetailPage simpleProduct1WithOriginalPriceDetailPage;
    SearchCategory searchCategory;
    SearchCollection searchCollection;
    SearchBrand searchBrand;
    ShoppingCartPage shoppingCartPage;

    @BeforeClass
    public void beforeClass() throws Exception {
        SpriiTestFramework.getInstance().openBrowser();
    }

    @BeforeMethod
    public void setUp() throws Exception {
        SpriiTestFramework.getInstance().navigateToURL();
        search = new Search();
        searchCategory = new SearchCategory();
        searchCollection = new SearchCollection();
        searchBrand = new SearchBrand();
    }

    @Test(priority = 1)
    public void testSearchResultNavigationToCategoryPage() throws Exception {
        searchResultCategoryPage = search
                .goToTestAutomationCategoryUsingSearch("Test Automation");
    }

    @Test(priority = 2)
    public void testSearchResultNavigationToDetailForSimpleProduct1() throws Exception {
        simpleProduct1WithOriginalPriceDetailPage = search
                .selectSimpleProduct1FromPredictiveSearchWindow("Test Simple Product 1");
    }

    @Test(priority = 3)
    public void testSearchResultCategoryPage() throws Exception {
        search
                .goToTestAutomationCategoryUsingSearch("Test Automation")
                .addToCartButtonEventForSimpleProductWithOriginalPrice()
                .selectClickHereToContinueShopping();
    }

    @Test(priority = 4)
    public void testSearchResultCategoryPageLayeredNavigation() throws Exception {
        search
                .goToTestAutomationCategoryUsingSearch("Test Automation");
        searchCategory
                .SelectDiaperingCategoryTabInLayeredNavigation();
        searchCollection
                .showMoreButtonClickEvent()
                .selectWoodenCollection();
        searchBrand
                .selectBabyAliveBrand()
                .removeBabyAliveBrand()
                .clearAll();
    }

    @Test(priority = 5)
    public void testSearchResultDetailPage() throws Exception {
         shoppingCartPage = search
                .selectSimpleProduct1FromPredictiveSearchWindow("Test Simple Product 1")
                .clickEventOnFourthImage()
                .clickEventOnSecondImage()
                .addToCartButtonClick();
    }
}
