package com.sprii.checkout;

import com.sprii.ordersuccess.OrderPlacementSuccessPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.PropertyFileReader;
import utils.SpriiTestFramework;

public class CheckoutRegisteredUserPage {
    WebDriver driver = SpriiTestFramework.getInstance().getDriver();
    PropertyFileReader propertyFileReader = new PropertyFileReader();

    private String paymentMethodCODElement = propertyFileReader.getProperty(
            "CheckoutRegisteredUserPage",
            "payment.method.cod.element");
    private String paymentMethodCCElement = propertyFileReader.getProperty(
            "CheckoutRegisteredUserPage",
            "payment.method.cc.element");
    private String deliveryMethodStandardElement = propertyFileReader.getProperty(
            "CheckoutRegisteredUserPage",
            "delivery.method.standard.element");
    private String placeOrderButtonElement = propertyFileReader.getProperty(
            "CheckoutRegisteredUserPage",
            "place.order.button.element");
    private String tdsCheckoutFieldElement = propertyFileReader.getProperty(
            "CheckoutRegisteredUserPage",
            "three.ds.checkout.field.element");
    private String tdsCheckoutButtonElement = propertyFileReader.getProperty(
            "CheckoutRegisteredUserPage",
            "three.ds.checkout.button.element");
    String cardNumberElement = propertyFileReader.getProperty(
            "CheckoutRegisteredUserPage",
            "card.number.element");
    String monthElement = propertyFileReader.getProperty(
            "CheckoutRegisteredUserPage",
            "month.element");
    String yearElement = propertyFileReader.getProperty(
            "CheckoutRegisteredUserPage",
            "year.element");
    String cvvElement = propertyFileReader.getProperty(
            "CheckoutRegisteredUserPage",
            "cvv.element");
    String discountCodeElement = propertyFileReader.getProperty(
            "CheckoutRegisteredUserPage",
            "discount.code.element");
    String discountFieldElement = propertyFileReader.getProperty(
            "CheckoutRegisteredUserPage",
            "discount.field.element");
    String applyCouponElement = propertyFileReader.getProperty(
            "CheckoutRegisteredUserPage",
            "apply.coupon.element");
    String storeCreditDropdownElement = propertyFileReader.getProperty(
            "CheckoutRegisteredUserPage",
            "store.credit.dropdown.element");
    String storeCreditButtonElement = propertyFileReader.getProperty(
            "CheckoutRegisteredUserPage",
            "store.credit.button");


    public CheckoutRegisteredUserPage selectStandardDeliveryMethod() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(deliveryMethodStandardElement), 10);
        if (!driver.findElement(By.xpath(deliveryMethodStandardElement)).isSelected()) {
//            driver.findElement(By.xpath(deliveryMethodStandardElement)).click();
            WebElement stdRadioButton = driver.findElement(By.xpath(deliveryMethodStandardElement));
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", stdRadioButton);
            return this;
        } else {
            return this;
        }
    }

    public CheckoutRegisteredUserPage selectPaymentMethodAsCOD() {
        SpriiTestFramework.getInstance().waitForElement(By.id(paymentMethodCODElement), 15);
        if (!driver.findElement(By.id(paymentMethodCODElement)).isSelected()) {
//            driver.findElement(By.id(paymentMethodCODElement)).click();
            WebElement codRadioButton = driver.findElement(By.id(paymentMethodCODElement));
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", codRadioButton);
            return this;
        } else {
            return this;
        }
    }

    public CheckoutRegisteredUserPage selectPaymentMethodAsCC() {
        SpriiTestFramework.getInstance().waitForElement(By.id(paymentMethodCCElement), 15);
        if (!driver.findElement(By.id(paymentMethodCCElement)).isSelected()) {
//            driver.findElement(By.id(paymentMethodCCElement)).click();
            WebElement ccRadioButton = driver.findElement(By.id(paymentMethodCCElement));
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", ccRadioButton);
//            SpriiTestFramework.getInstance().waitForElement(By.xpath(cardNumberElement), 15);
//            driver.findElement(By.xpath(cardNumberElement)).sendKeys(cardNumber);
//            driver.findElement(By.xpath(monthElement)).sendKeys(month);
//            driver.findElement(By.xpath(yearElement)).sendKeys(year);
//            driver.findElement(By.xpath(cvvElement)).sendKeys(cvv);
            return this;
        } else {
            return this;
        }
    }

    public CheckoutRegisteredUserPage addCouponCode(String code) throws Exception {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(discountCodeElement), 15);
        SpriiTestFramework.getInstance().waitTillClickable(By.xpath(discountCodeElement), 15);
        //       driver.findElement(By.xpath(discountCodeElement)).click();
        WebElement addcoupon = driver.findElement(By.xpath(discountCodeElement));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", addcoupon);
        Thread.sleep(5000);
        SpriiTestFramework.getInstance().waitForElement(By.id(discountFieldElement), 15);
        driver.findElement(By.id(discountFieldElement)).sendKeys(code);
        Thread.sleep(5000);
        driver.findElement(By.xpath(applyCouponElement)).click();
        Thread.sleep(5000);
        return this;
    }

    public CheckoutRegisteredUserPage addMaxStoreCredit() throws Exception {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(storeCreditDropdownElement), 20);
        SpriiTestFramework.getInstance().waitTillClickable(By.xpath(storeCreditDropdownElement), 20);
        WebElement addStoreCredit = driver.findElement(By.xpath(storeCreditDropdownElement));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", addStoreCredit);
        SpriiTestFramework.getInstance().waitForElement(By.id(storeCreditButtonElement), 60);
        driver.findElement(By.id(storeCreditButtonElement)).click();
        return this;
    }

    public OrderPlacementSuccessPage placeOrder() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(placeOrderButtonElement), 5);
        SpriiTestFramework.getInstance().waitTillClickable(By.xpath(placeOrderButtonElement), 5);
//        driver.findElement(By.xpath(placeOrderButtonElement)).click();
        try {
            WebElement placeOrderButton = driver.findElement(By.xpath(placeOrderButtonElement));
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", placeOrderButton);
            return new OrderPlacementSuccessPage();
        } catch (Exception e) {
            e.printStackTrace();
            return new OrderPlacementSuccessPage();
        }
    }

    public OrderPlacementSuccessPage placeOrderWithThreeDSCheckout() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(placeOrderButtonElement), 5);
        SpriiTestFramework.getInstance().waitTillClickable(By.xpath(placeOrderButtonElement), 5);
//        driver.findElement(By.xpath(placeOrderButtonElement)).click();
        try {
            WebElement placeOrderButton = driver.findElement(By.xpath(placeOrderButtonElement));
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", placeOrderButton);

            SpriiTestFramework.getInstance().waitForElement(By.id(tdsCheckoutFieldElement), 15);
            driver.findElement(By.id(tdsCheckoutFieldElement)).sendKeys("Checkout1!");
            SpriiTestFramework.getInstance().waitForElement(By.id(tdsCheckoutButtonElement), 5);
            driver.findElement(By.id(tdsCheckoutButtonElement)).click();
            return new OrderPlacementSuccessPage();
        } catch (Exception e) {
            e.printStackTrace();
            return new OrderPlacementSuccessPage();
        }
    }
}
