package com.sprii.shoppingcart;

import com.sprii.checkout.CheckoutGuestUserPage;
import com.sprii.checkout.CheckoutRegisteredUserPage;
import com.sprii.home.HomePage;
import com.sprii.pdp.*;
import com.sprii.plp.ProductListingPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import utils.PropertyFileReader;
import utils.SpriiTestFramework;

public class ShoppingCartPage {

    WebDriver driver = SpriiTestFramework.getInstance().getDriver();
    PropertyFileReader prop = new PropertyFileReader();

    private String simpleProduct4OriginalPriceElement = prop.getProperty("ShoppingCartPage", "simple.product4.original.price.element");
    private String simpleProduct3SpecialPriceElement = prop.getProperty("ShoppingCartPage", "simple.product3.special.price.element");
    private String testSimpleProductSpecialPriceElement = prop.getProperty("ShoppingCartPage", "test.simple.product.special.price.element");
    private String simpleProduct1OriginalPriceElement = prop.getProperty("ShoppingCartPage", "simple.product1.original.price.element");
    private String configProduct1OriginalPriceElement = prop.getProperty("ShoppingCartPage", "config.product1.original.price.element");
    private String configProduct2SpecialPriceElement = prop.getProperty("ShoppingCartPage", "config.product2.special.price.element");
    private String simpleProduct4OriginalElement = prop.getProperty("ShoppingCartPage", "simple.product4.original.element");
    private String simpleProduct3SpecialElement = prop.getProperty("ShoppingCartPage", "simple.product3.special.element");
    private String simpleProductSpecialElement = prop.getProperty("ShoppingCartPage", "simple.product.special.element");
    private String simpleProduct1OriginalElement = prop.getProperty("ShoppingCartPage", "simple.product1.original.element");
    private String configProduct1OriginalElement = prop.getProperty("ShoppingCartPage", "config.product1.original.element");
    private String configProduct2SpecialElement = prop.getProperty("ShoppingCartPage", "config.product2.special.element");
    private String simpleProduct4OriginalDropdownElement = prop.getProperty("ShoppingCartPage", "simple.product4.original.dropdown.element");
    private String simpleProduct3SpecialDropdownElement = prop.getProperty("ShoppingCartPage", "simple.product3.special.dropdown.element");
    private String simpleProductSpecialDropdownElement = prop.getProperty("ShoppingCartPage", "simple.product.special.dropdown.element");
    private String simpleProduct1OriginalDropdownElement = prop.getProperty("ShoppingCartPage", "simple.product1.original.dropdown.element");
    private String configProduct1OriginalDropdownElement = prop.getProperty("ShoppingCartPage", "config.product1.original.dropdown.element");
    private String configProduct2SpecialDropdownElement = prop.getProperty("ShoppingCartPage", "config.product2.special.dropdown.element");
    private String continueShoppingButtonElement = prop.getProperty("ShoppingCartPage", "continue.shopping.button.element");
    private String ProceedToCheckoutButtonElement = prop.getProperty("ShoppingCartPage", "proceed.to.checkout.element");
    private String removeProductElement = prop.getProperty("ShoppingCartPage", "remove.product.element");
    private String removeProduct1Element = prop.getProperty("ShoppingCartPage", "remove.product1.element");
    private String removeProduct2Element = prop.getProperty("ShoppingCartPage", "remove.product2.element");
    private String removeProduct3Element = prop.getProperty("ShoppingCartPage", "remove.product3.element");
    private String removeProduct4Element = prop.getProperty("ShoppingCartPage", "remove.product4.element");
    private String removeProduct5Element = prop.getProperty("ShoppingCartPage", "remove.product5.element");
    private String removeProduct6Element = prop.getProperty("ShoppingCartPage", "remove.product6.element");
    private String emptyPageHereLinkElement = prop.getProperty("ShoppingCartPage", "empty.page.here.link.element");
    private String useMaxStoreCreditButtonElement = prop.getProperty("ShoppingCartPage", "max.store.credit.button.element");
    private String creditAmountElement = prop.getProperty("ShoppingCartPage", "credit.amount.element");
    private String useStoreCreditElement = prop.getProperty("ShoppingCartPage", "use.store.credit.element");
    String enterStoreCreditElement = prop.getProperty("ShoppingCartPage", "enter.store.credit.element");
    String maxStoreCreditElement = prop.getProperty("ShoppingCartPage", "max.store.credit.element");

    // Click the product image of SimpleProduct4WithOriginalPriceDetail
    public SimpleProduct4WithOriginalPriceDetailPage selectSimpleProduct4WithOriginalPriceDetailImage() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProduct4OriginalPriceElement), 20);
        driver.findElement(By.xpath(simpleProduct4OriginalPriceElement)).click();
        return new SimpleProduct4WithOriginalPriceDetailPage();
    }

    // Click the product image of SimpleProduct3WithSpecialPriceDetail
    public SimpleProduct3WithSpecialPriceDetailPage selectSimpleProduct3WithSpecialPriceDetailImage() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProduct3SpecialPriceElement), 20);
        driver.findElement(By.xpath(simpleProduct3SpecialPriceElement)).click();
        return new SimpleProduct3WithSpecialPriceDetailPage();
    }

    // Click the product image of SimpleProductWithSpecialPriceDetail
    public SimpleProductWithSpecialPriceDetailPage selectSimpleProductWithSpecialPriceDetailImage() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(testSimpleProductSpecialPriceElement), 20);
        driver.findElement(By.xpath(testSimpleProductSpecialPriceElement)).click();
        return new SimpleProductWithSpecialPriceDetailPage();
    }

    // Click the product image of SimpleProduct1WithOriginalPriceDetail
    public SimpleProduct1WithOriginalPriceDetailPage selectSimpleProduct1WithOriginalPriceDetailPageImage() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProduct1OriginalPriceElement), 20);
        driver.findElement(By.xpath(simpleProduct1OriginalPriceElement)).click();
        return new SimpleProduct1WithOriginalPriceDetailPage();
    }

    // Click the product image of SimpleProduct1WithOriginalPriceDetail
    public ConfigProductWithOriginalPriceDetailPage selectSConfigProductWithOriginalPriceDetailPageImage() { //
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProduct1OriginalPriceElement), 20);
        driver.findElement(By.xpath(configProduct1OriginalPriceElement)).click();
        return new ConfigProductWithOriginalPriceDetailPage();
    }

    // Click the product image of  ConfigProductWithSpecialPriceDetail
    public ConfigProductWithSpecialPriceDetailPage selectConfigProductWithSpecialPriceDetailPageImage() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProduct2SpecialPriceElement), 20);
        driver.findElement(By.xpath(configProduct2SpecialPriceElement)).click();
        return new ConfigProductWithSpecialPriceDetailPage();
    }

    // Click the product name of SimpleProduct4WithOriginalPriceDetail
    public SimpleProduct4WithOriginalPriceDetailPage SimpleProduct4WithOriginalPriceDetailName() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProduct4OriginalElement), 20);
        driver.findElement(By.xpath(simpleProduct4OriginalElement)).click();
        return new SimpleProduct4WithOriginalPriceDetailPage();
    }

    // Click the product name of SimpleProduct3WithSpecialPriceDetail
    public SimpleProduct3WithSpecialPriceDetailPage SimpleProduct3WithSpecialPriceDetailPageName() {
        SpriiTestFramework.getInstance().waitForElement(By.linkText(simpleProduct3SpecialElement), 20);
        driver.findElement(By.linkText(simpleProduct3SpecialElement)).click();
        return new SimpleProduct3WithSpecialPriceDetailPage();
    }

    // Click the product name of  SimpleProductWithSpecialPriceDetail
    public SimpleProductWithSpecialPriceDetailPage SimpleProductWithSpecialPriceDetailPageName() {
        SpriiTestFramework.getInstance().waitForElement(By.linkText(simpleProductSpecialElement), 20);
        driver.findElement(By.linkText(simpleProductSpecialElement)).click();
        return new SimpleProductWithSpecialPriceDetailPage();
    }

    // Click the product name of  SimpleProduct1WithOriginalPriceDetail
    public SimpleProduct1WithOriginalPriceDetailPage SimpleProduct1WithOriginalPriceDetailPageName() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProduct1OriginalElement), 20);
        driver.findElement(By.xpath(simpleProduct1OriginalElement)).click();
        return new SimpleProduct1WithOriginalPriceDetailPage();
    }

    // Click the product name of  ConfigProductWithOriginalPriceDetail
    public ConfigProductWithOriginalPriceDetailPage ConfigProductWithOriginalPriceDetailPageName() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProduct1OriginalElement), 20);
        driver.findElement(By.xpath(configProduct1OriginalElement)).click();
        return new ConfigProductWithOriginalPriceDetailPage();
    }

    // Click the product name of ConfigProductWithSpecialPriceDetail
    public ConfigProductWithSpecialPriceDetailPage ConfigProductWithSpecialPriceDetailPageName() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProduct2SpecialElement), 20);
        driver.findElement(By.xpath(configProduct2SpecialElement)).click();
        return new ConfigProductWithSpecialPriceDetailPage();
    }

    // Increase the quantity of SimpleProduct4WithOriginalPriceDetail
    public ShoppingCartPage SimpleProduct4WithOriginalPriceDetailDropDown(int qty) {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProduct4OriginalDropdownElement), 20);
        Select quantity = new Select(driver.findElement(By.xpath(simpleProduct4OriginalDropdownElement)));
        quantity.selectByIndex(qty);
        return this;
    }

    // Increase the quantity of SimpleProduct3WithSpecialPriceDetail
    public ShoppingCartPage SimpleProduct3WithSpecialPriceDetailDropDown(int qty) {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProduct3SpecialDropdownElement), 20);
        Select quantity = new Select(driver.findElement(By.xpath(simpleProduct3SpecialDropdownElement)));
        quantity.selectByIndex(qty);
        return this;
    }

    // Increase the quantity of SimpleProductWithSpecialPriceDetail
    public ShoppingCartPage SimpleProductWithSpecialPriceDetailDropDown(int qty) {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProductSpecialDropdownElement), 20);
        Select quantity = new Select(driver.findElement(By.xpath(simpleProductSpecialDropdownElement)));
        quantity.selectByIndex(qty);
        return this;
    }

    // Increase the quantity of SimpleProduct1WithOriginalPriceDetail
    public ShoppingCartPage SimpleProduct1WithOriginalPriceDetailDropDown(int qty) {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProduct1OriginalDropdownElement), 20);
        Select quantity = new Select(driver.findElement(By.xpath(simpleProduct1OriginalDropdownElement)));
        quantity.selectByIndex(qty);
        return this;
    }

    // Increase the quantity of ConfigProductWithOriginalPriceDetail
    public ShoppingCartPage ConfigProductWithOriginalPriceDetailDropDown(int qty) {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProduct1OriginalDropdownElement), 20);
        Select quantity = new Select(driver.findElement(By.xpath(configProduct1OriginalDropdownElement)));
        quantity.selectByIndex(qty);
        return this;
    }

    // Increase the quantity of ConfigProductWithSpecialPriceDetail
    public ShoppingCartPage ConfigProductWithSpecialPriceDetailDropDown(int qty) {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProduct2SpecialDropdownElement), 20);
        Select quantity = new Select(driver.findElement(By.xpath(configProduct2SpecialDropdownElement)));
        quantity.selectByIndex(qty);
        return this;
    }

    // Selection of continue shopping button will go to Home Page
    public HomePage selectContinueShoppingButton() {
        HomePage myHomePage = new HomePage();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(continueShoppingButtonElement), 20);
        driver.findElement(By.xpath(continueShoppingButtonElement)).click();
        return new HomePage();
    }

    // Selection of continue shopping button will go to ProductListingPage
    public ProductListingPage selectContinueShoppingToSimpleProduct4WithOriginalPriceDetailPage() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(continueShoppingButtonElement), 20);
        driver.findElement(By.xpath(continueShoppingButtonElement)).click();
        return new ProductListingPage();
    }

    // Selection of continue shopping button will go to ProductListingPage
    public ProductListingPage SelectContinueShoppingToSimpleProduct3WithSpecialPriceDetailPage() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(continueShoppingButtonElement), 20);
        driver.findElement(By.xpath(continueShoppingButtonElement)).click();
        return new ProductListingPage();
    }

    // Selection of continue shopping button will go to ProductListingPage
    public ProductListingPage selectContinueShoppingToSimpleProductWithSpecialPriceDetailPage() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(continueShoppingButtonElement), 40);
        driver.findElement(By.xpath(continueShoppingButtonElement)).click();
        return new ProductListingPage();
    }

    // Selection of continue shopping button will go to ProductListingPage
    public ProductListingPage SelectContinueShoppingToSimpleProduct1WithOriginalPriceDetailPage() {
        driver.navigate().refresh();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(continueShoppingButtonElement), 20);
        driver.findElement(By.xpath(continueShoppingButtonElement)).click();
        return new ProductListingPage();
    }

    // Selection of continue shopping button will go to ConfigProductWithOriginalPriceDetailPage
    public ConfigProductWithOriginalPriceDetailPage SelectContinueShoppingToConfigProductWithOriginalPriceDetailPage() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(continueShoppingButtonElement), 20);
        driver.findElement(By.xpath(continueShoppingButtonElement)).click();
        return new ConfigProductWithOriginalPriceDetailPage();
    }

    // Selection of continue shopping button will go to ConfigProductWithSpecialPriceDetailPage
    public ConfigProductWithSpecialPriceDetailPage SelectContinueShoppingToConfigProductWithSpecialPriceDetailPage() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(continueShoppingButtonElement), 20);
        driver.findElement(By.xpath(continueShoppingButtonElement)).click();
        return new ConfigProductWithSpecialPriceDetailPage();
    }

    // Checkout for guest user
    public CheckoutGuestUserPage SelectProceedToCheckoutGuestUser() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(ProceedToCheckoutButtonElement), 20);
        driver.findElement(By.xpath(ProceedToCheckoutButtonElement)).click();
        return new CheckoutGuestUserPage();
    }

    // Checkout for registered user
    public CheckoutRegisteredUserPage SelectProceedToCheckoutRegisteredUser() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(ProceedToCheckoutButtonElement), 20);
        driver.findElement(By.xpath(ProceedToCheckoutButtonElement)).click();
        return new CheckoutRegisteredUserPage();
    }

    // Remove first item from the shopping cart
    public ShoppingCartPage selectRemoveButtonOfProduct1() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(removeProduct1Element), 100);
        driver.findElement(By.xpath(removeProduct1Element)).click();
        return this;
    }

    // Remove second item from the shopping cart
    public ShoppingCartPage selectRemoveButtonOfProduct2() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(removeProduct2Element), 100);
        driver.findElement(By.xpath(removeProduct2Element)).click();
        return this;
    }

    // Remove third item from the shopping cart
    public ShoppingCartPage selectRemoveButtonOfProduct3() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(removeProduct3Element), 20);
        driver.findElement(By.xpath(removeProduct3Element)).click();
        return this;
    }

    // Remove fourth item from the shopping cart
    public ShoppingCartPage selectRemoveButtonOfProduct4() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(removeProduct4Element), 20);
        driver.findElement(By.xpath(removeProduct4Element)).click();
        return this;
    }

    // Remove fifth item from the shopping cart
    public ShoppingCartPage selectRemoveButtonOfProduct5() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(removeProduct5Element), 20);
        driver.findElement(By.xpath(removeProduct5Element)).click();
        return this;
    }

    // Remove sixth item from the shopping cart
    public ShoppingCartPage selectRemoveButtonOfProduct6() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(removeProduct6Element), 20);
        driver.findElement(By.xpath(removeProduct6Element)).click();
        return this;
    }

    // Move to home page when there is no items in the cart by clicking "Here"
    public HomePage selectClickHereToContinueShopping() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(emptyPageHereLinkElement), 20);
        driver.findElement(By.xpath(emptyPageHereLinkElement)).click();
        return new HomePage();
    }

    public CheckoutGuestUserPage proceedToCheckoutAsGuestUser() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(ProceedToCheckoutButtonElement), 40);
        driver.findElement(By.xpath(ProceedToCheckoutButtonElement)).click();
        return new CheckoutGuestUserPage();
    }

    public CheckoutRegisteredUserPage proceedToCheckoutAsRegisterdUser() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(ProceedToCheckoutButtonElement), 20);
        driver.findElement(By.xpath(ProceedToCheckoutButtonElement)).click();
        return new CheckoutRegisteredUserPage();
    }

    public boolean isRemoveButtonAvailable() {
        try {
            SpriiTestFramework.getInstance().waitForElement(By.xpath(removeProductElement), 5);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void clearShoppingCart() {
        SpriiTestFramework.getInstance().navigateToCartPage();
        while (isRemoveButtonAvailable())
            driver.findElement(By.xpath(removeProductElement)).click();
    }

    public void clearShoppingCartSaudi() {
        SpriiTestFramework.getInstance().navigateToCartPageSaudi();
        while (isRemoveButtonAvailable())
            driver.findElement(By.xpath(removeProductElement)).click();
    }

    public ShoppingCartPage partialStoreCredit(String amount) {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(enterStoreCreditElement), 15);
        driver.findElement(By.xpath(enterStoreCreditElement)).sendKeys(amount);
        SpriiTestFramework.getInstance().waitForElement(By.xpath(useStoreCreditElement), 20);
        driver.findElement(By.xpath(useStoreCreditElement)).click();
        return this;
    }

    public ShoppingCartPage maxStoreCredit() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(maxStoreCreditElement), 15);
        driver.findElement(By.xpath(maxStoreCreditElement)).click();
        return this;
    }
}
