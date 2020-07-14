package com.sprii.minicart;

import com.sprii.checkout.CheckoutGuestUserPage;
import com.sprii.checkout.CheckoutRegisteredUserPage;
import com.sprii.pdp.*;
import com.sprii.shoppingcart.ShoppingCartPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import utils.PropertyFileReader;
import utils.SpriiTestFramework;

public class MiniCartPage {

    WebDriver driver = SpriiTestFramework.getInstance().getDriver();
    PropertyFileReader prop = new PropertyFileReader();

    String miniCartButtonElement = prop.getProperty("MiniCartPage", "mini.cart.button.element");
    String removeButton1Element = prop.getProperty("MiniCartPage", "remove.button.1.element");
    String removeButton2Element = prop.getProperty("MiniCartPage", "remove.button.2.element");
    String removeButton3Element = prop.getProperty("MiniCartPage", "remove.button.3.element");
    String removeButton4Element = prop.getProperty("MiniCartPage", "remove.button.4.element");
    String removeButton5Element = prop.getProperty("MiniCartPage", "remove.button.5.element");
    String removeButton6Element = prop.getProperty("MiniCartPage", "remove.button.6.element");
    String configOriginalProductElement = prop.getProperty("MiniCartPage", "config.product.original.element");
    String simpleProduct1OriginalPriceElement = prop.getProperty("MiniCartPage", "simple.product.1.original.element");
    String simpleProduct4OriginalPriceElement = prop.getProperty("MiniCartPage", "simple.product.4.original.element");
    String configSpecialProductElement = prop.getProperty("MiniCartPage", "config.product.special.element");
    String simpleProduct3SpecialPriceElement = prop.getProperty("MiniCartPage", "simple.product.3.special.element");
    String simpleProductSpecialPriceElement = prop.getProperty("MiniCartPage", "simple.product.special.price.element");
    String popUpOkButtonElement = prop.getProperty("MiniCartPage", "pop.up.ok.button.element");
    String quantity1stElement = prop.getProperty("MiniCartPage", "quantity.1.st.element");
    String quantity2ndElement = prop.getProperty("MiniCartPage", "quantity.2.nd.element");
    String quantity3rdElement = prop.getProperty("MiniCartPage", "quantity.3.rd.element");
    String quantity4thElement = prop.getProperty("MiniCartPage", "quantity.4.th.element");
    String quantity5thElement = prop.getProperty("MiniCartPage", "quantity.5.th.element");
    String quantity6thElement = prop.getProperty("MiniCartPage", "quantity.6.th.element");
    String goToCheckoutButtonElement = prop.getProperty("MiniCartPage", "go.to.checkout.button.element");
    String viewAndEditCartElement = prop.getProperty("MiniCartPage", "view.and.edit.cart.element");


    //  Select mini cart button
    public MiniCartPage selectMiniCart() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(miniCartButtonElement), 50);
        driver.findElement(By.xpath(miniCartButtonElement)).click();
        return this;
    }


    // Remove product 1 from mini cart
    public MiniCartPage removeProduct1() throws Exception {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(removeButton1Element), 1000);
        driver.findElement(By.xpath(removeButton1Element)).click();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(popUpOkButtonElement), 1000);
        String parentHandle = driver.getWindowHandle(); // switching to new window

        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
            driver.findElement(By.xpath(popUpOkButtonElement)).click();
        }
        return this;
    }

    // Remove product 2 from mini cart
    public MiniCartPage removeProduct2() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(removeButton2Element), 20);
        driver.findElement(By.xpath(removeButton2Element)).click();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(popUpOkButtonElement), 100);
        String parentHandle = driver.getWindowHandle();
        driver.findElement(By.xpath(popUpOkButtonElement)).click();
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        return this;
    }

    // Remove product 3 from mini cart
    public MiniCartPage removeProduct3() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(removeButton3Element), 20);
        driver.findElement(By.xpath(removeButton3Element)).click();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(popUpOkButtonElement), 100);
        String parentHandle = driver.getWindowHandle(); // switching to new window
        driver.findElement(By.xpath(popUpOkButtonElement)).click();
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        return this;
    }

    // Remove product 4 from mini cart
    public MiniCartPage removeProduct4() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(removeButton4Element), 20);
        driver.findElement(By.xpath(removeButton4Element)).click();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(popUpOkButtonElement), 100);
        String parentHandle = driver.getWindowHandle(); // switching to new window
        driver.findElement(By.xpath(popUpOkButtonElement)).click();
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        return this;
    }

    // Remove product 5 from mini cart
    public MiniCartPage removeProduct5() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(removeButton5Element), 20);
        driver.findElement(By.xpath(removeButton2Element)).click();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(popUpOkButtonElement), 100);
        String parentHandle = driver.getWindowHandle(); // switching to new window
        driver.findElement(By.xpath(popUpOkButtonElement)).click();
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        return this;
    }

    // Remove product 6 from mini cart
    public MiniCartPage removeProduct6() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(removeButton6Element), 20);
        driver.findElement(By.xpath(removeButton6Element)).click();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(popUpOkButtonElement), 100);
        String parentHandle = driver.getWindowHandle(); // switching to new window
        driver.findElement(By.xpath(popUpOkButtonElement)).click();
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        return this;
    }

    //Go to ConfigProductWithOriginalPriceDetailPage
    public ConfigProductWithOriginalPriceDetailPage selectConfigProductWithOriginalPriceDetailPage() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configOriginalProductElement), 1000);
        driver.findElement(By.xpath(configOriginalProductElement)).click();
        return new ConfigProductWithOriginalPriceDetailPage();
    }

    //Go to SimpleProduct1WithOriginalPriceDetailPage
    public SimpleProduct1WithOriginalPriceDetailPage selectSimpleProduct1WithOriginalPriceDetailPage() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProduct1OriginalPriceElement), 1000);
        driver.findElement(By.xpath(simpleProduct1OriginalPriceElement)).click();
        return new SimpleProduct1WithOriginalPriceDetailPage();
    }

    // Go to SimpleProduct4WithOriginalPriceDetailPage
    public SimpleProduct4WithOriginalPriceDetailPage selectSimpleProduct4WithOriginalPriceDetailPage() {
        SpriiTestFramework.getInstance().waitForElement(By.linkText(simpleProduct4OriginalPriceElement), 20);
        driver.findElement(By.linkText(simpleProduct4OriginalPriceElement)).click();
        return new SimpleProduct4WithOriginalPriceDetailPage();
    }

    // Go to ConfigProductWithSpecialPriceDetailPage
    public ConfigProductWithSpecialPriceDetailPage selectConfigProductWithSpecialPriceDetailPage() {
        SpriiTestFramework.getInstance().waitForElement(By.linkText(configSpecialProductElement), 20);
        driver.findElement(By.linkText(configSpecialProductElement)).click();
        return new ConfigProductWithSpecialPriceDetailPage();
    }

    // Go to SimpleProduct3WithSpecialPriceDetailPage
    public SimpleProduct3WithSpecialPriceDetailPage selectSimpleProduct3WithSpecialPriceDetailPage() {
        SpriiTestFramework.getInstance().waitForElement(By.linkText(simpleProduct3SpecialPriceElement), 20);
        driver.findElement(By.linkText(simpleProduct3SpecialPriceElement)).click();
        return new SimpleProduct3WithSpecialPriceDetailPage();
    }

    // Go to SimpleProductWithSpecialPriceDetailPage
    public SimpleProductWithSpecialPriceDetailPage selectSimpleProductWithSpecialPriceDetailPage() {
        SpriiTestFramework.getInstance().waitForElement(By.linkText(simpleProductSpecialPriceElement), 20);
        driver.findElement(By.linkText(simpleProductSpecialPriceElement)).click();
        return new SimpleProductWithSpecialPriceDetailPage();
    }

    //  Increase the quantity of product 1
    public MiniCartPage selectQuantityFromDropDownForProduct1(int qty) {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(quantity1stElement), 2000);
        Select quantity = new Select(driver.findElement(By.xpath(quantity1stElement)));
        quantity.selectByIndex(qty);
        return this;
    }

    //  Increase the quantity of product 2
    public MiniCartPage selectQuantityFromDropDownForProduct2(int qty) {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(quantity2ndElement), 20);
        Select quantity = new Select(driver.findElement(By.xpath(quantity2ndElement)));
        quantity.selectByIndex(qty);
        return this;
    }

    //  Increase the quantity of product 3
    public MiniCartPage selectQuantityFromDropDownForProduct3(int qty) {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(quantity3rdElement), 200);
        Select quantity = new Select(driver.findElement(By.xpath(quantity3rdElement)));
        quantity.selectByIndex(qty);
        return this;
    }

    //  Increase the quantity of product 4
    public MiniCartPage selectQuantityFromDropDownForProduct4(int qty) {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(quantity4thElement), 20);
        Select quantity = new Select(driver.findElement(By.xpath(quantity4thElement)));
        quantity.selectByIndex(qty);
        return this;
    }

    //  Increase the quantity of product 5
    public MiniCartPage selectQuantityFromDropDownForProduct5(int qty) {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(quantity5thElement), 20);
        Select quantity = new Select(driver.findElement(By.xpath(quantity5thElement)));
        quantity.selectByIndex(qty);
        return this;
    }

    //  Increase the quantity of product 6
    public MiniCartPage selectQuantityFromDropDownForProduct6(int qty) {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(quantity6thElement), 20);
        Select quantity = new Select(driver.findElement(By.xpath(quantity6thElement)));
        quantity.selectByIndex(qty);
        return this;
    }

    // Checkout as a guest user
    public CheckoutGuestUserPage selectCheckoutButtonForGuestUser() {
        SpriiTestFramework.getInstance().waitForElement(By.id(goToCheckoutButtonElement), 20);
        driver.findElement(By.id(goToCheckoutButtonElement)).click();
        return new CheckoutGuestUserPage();
    }

    // Checkout as a registered user
    public CheckoutRegisteredUserPage selectCheckoutButtonForRegisteredUser() {
        SpriiTestFramework.getInstance().waitForElement(By.id(goToCheckoutButtonElement), 20);
        driver.findElement(By.id(goToCheckoutButtonElement)).click();
        return new CheckoutRegisteredUserPage();
    }

    // Select view and edit shopping cart button
    public ShoppingCartPage selectViewAndEditCartButton() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(viewAndEditCartElement), 200);
        driver.findElement(By.xpath(viewAndEditCartElement)).click();
        return new ShoppingCartPage();
    }
}
