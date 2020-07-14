package com.sprii.checkout;

import com.sprii.forgotpassword.ForgotYourPassword;
import com.sprii.ordersuccess.OrderPlacementSuccessPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utils.PropertyFileReader;
import utils.SpriiTestFramework;

public class CheckoutGuestUserPage {
    private WebDriver driver = SpriiTestFramework.getInstance().getDriver();
    private PropertyFileReader prop = new PropertyFileReader();

    private String guestUserEmailElement = prop.getProperty("CheckoutGuestUserPage", "checkout.guest.email.element");
    private String guestUserFirstNameElement = prop.getProperty("CheckoutGuestUserPage", "checkout.guest.first.name.element");
    private String guestUserLastNameElement = prop.getProperty("CheckoutGuestUserPage", "checkout.guest.last.name.element");
    private String guestUserCityDropDownElement = prop.getProperty("CheckoutGuestUserPage", "checkout.guest.city.dropdown.element");
    private String guestUserAreaElement = prop.getProperty("CheckoutGuestUserPage", "checkout.guest.area.element");
    private String guestUserStreetNameElement = prop.getProperty("CheckoutGuestUserPage", "checkout.guest.street.name.element");
    private String guestUserBuildingNameElement = prop.getProperty("CheckoutGuestUserPage", "checkout.guest.building.name.element");
    private String guestUserTelephoneNumberElement = prop.getProperty("CheckoutGuestUserPage", "checkout.guest.telephone.number.element");
    private String guestUserCODPaymentMethodElement = prop.getProperty("CheckoutGuestUserPage", "checkout.guest.cod.payment.method.element");
    private String guestUserCCPaymentMethodElement = prop.getProperty("CheckoutGuestUserPage", "checkout.guest.cc.payment.method.element");
    private String guestUserDiscountCodeFieldElement = prop.getProperty("CheckoutGuestUserPage", "checkout.guest.discount.code.field.element");
    private String guestUserApplyDiscountButtonElement = prop.getProperty("CheckoutGuestUserPage", "checkout.guest.apply.discount.button.element");
    private String guestUserApplyDiscountDropdownElement = prop.getProperty("CheckoutGuestUserPage", "checkout.guest.apply.discount.dropdown.element");
    private String guestUserStandardShippingRadioButtonElement = prop.getProperty("CheckoutGuestUserPage", "checkout.guest.standard.shipping.radio.button.element");
    private String guestUserNewDeliveryByTodayRadioButtonElement = prop.getProperty("CheckoutGuestUserPage", "checkout.guest.new.delivery.by.today.radio.button.element");
    private String guestUserAlreadyRegisteredLinkElement = prop.getProperty("CheckoutGuestUserPage", "checkout.guest.already.registered.link.element");
    private String guestUserPasswordFieldElement = prop.getProperty("CheckoutGuestUserPage", "checkout.guest.password.field.element");
    private String guestUserForgotPasswordLinkElement = prop.getProperty("CheckoutGuestUserPage", "checkout.guest.forgot.password.link.element");
    private String guestUserLoginButtonElement = prop.getProperty("CheckoutGuestUserPage", "checkout.guest.login.button.element");
    private String guestUserConfigProductViewDetailsDropdownElement = prop.getProperty("CheckoutGuestUserPage", "checkout.guest.config.product.view.details.dropdown.element");
    private String guestUserPlaceOrderButtonElement = prop.getProperty("CheckoutGuestUserPage", "checkout.guest.place.order.button.element");
    private String guestUserTDSCheckoutFieldElement = prop.getProperty("CheckoutGuestUserPage", "checkout.guest.three.ds.checkout.field.element");
    private String guestUserTDSCheckoutButtonElement = prop.getProperty("CheckoutGuestUserPage", "checkout.guest.three.ds.checkout.button.element");
    private String guestUserCCCardNumberFieldElement = prop.getProperty("CheckoutGuestUserPage", "checkout.guest.cc.card.number.text.field.element");
    private String guestUserCCExpDateElement = prop.getProperty("CheckoutGuestUserPage", "checkout.guest.cc.exp.date.element");
    private String guestUserCCCvvElement = prop.getProperty("CheckoutGuestUserPage", "checkout.guest.cc.cvv.no.element");

    //Assertions
    private String checkoutEmailEmptyValidationElement = prop.getProperty("CheckoutGuestUserPage", "checkout.email.empty.validation.element");
    private String checkoutFNameEmptyValidationElement = prop.getProperty("CheckoutGuestUserPage", "checkout.fName.empty.validation.element");
    private String checkoutLNameEmptyValidationElement = prop.getProperty("CheckoutGuestUserPage", "checkout.lName.empty.validation.element");
    private String checkoutCityEmptyValidationElement = prop.getProperty("CheckoutGuestUserPage", "checkout.city.empty.validation.element");
    private String checkoutAreaEmptyValidationElement = prop.getProperty("CheckoutGuestUserPage", "checkout.area.empty.validation.element");
    private String checkoutStreetNameEmptyValidationElement = prop.getProperty("CheckoutGuestUserPage", "checkout.streetName.empty.validation.element");
    private String checkoutBuildingNameEmptyValidationElement = prop.getProperty("CheckoutGuestUserPage", "checkout.buildingName.empty.validation.element");
    private String checkoutPhoneNumberEmptyValidationElement = prop.getProperty("CheckoutGuestUserPage", "checkout.phoneNumber.empty.validation.element");
    private String checkoutEmailInvalidValidationElement = prop.getProperty("CheckoutGuestUserPage", "checkout.email.invalid.validation.element");
    private String checkoutFNameEmptyValidationMsgElement = prop.getProperty("CheckoutGuestUserPage", "checkout.fName.empty.validation.msg.element");
    private String checkoutLNameEmptyValidationMsgElement = prop.getProperty("CheckoutGuestUserPage", "checkout.lName.empty.validation.msg.element");
    private String checkoutCityEmptyValidationMsgElement = prop.getProperty("CheckoutGuestUserPage", "checkout.city.empty.validation.msg.element");
    private String checkoutAreaEmptyValidationMsgElement = prop.getProperty("CheckoutGuestUserPage", "checkout.area.empty.validation.msg.element");
    private String checkoutStreetNameEmptyValidationMsgElement = prop.getProperty("CheckoutGuestUserPage", "checkout.streetName.empty.validation.msg.element");
    private String checkoutBuildingNameEmptyValidationMsgElement = prop.getProperty("CheckoutGuestUserPage", "checkout.buildingName.empty.validation.msg.element");
    private String checkoutPhoneNumberEmptyValidationMsgElement = prop.getProperty("CheckoutGuestUserPage", "checkout.phoneNumber.empty.validation.msg.element");
    private String checkoutPhoneNumberInvalidValidationElement = prop.getProperty("CheckoutGuestUserPage", "checkout.phoneNumber.invalid.validation.element");
    private String checkoutPhoneNumberInvalidValidationMsgElement = prop.getProperty("CheckoutGuestUserPage", "checkout.phoneNumber.invalid.validation.msg.element");

    public CheckoutGuestUserPage addNewEmailAddress(String email) {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(guestUserEmailElement), 5000);
        driver.findElement(By.xpath(guestUserEmailElement)).sendKeys(email);
        return this;
    }

    public CheckoutGuestUserPage addFirstName(String fName) {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(guestUserFirstNameElement), 20);
        driver.findElement(By.xpath(guestUserFirstNameElement)).sendKeys(fName);
        return this;
    }

    public CheckoutGuestUserPage addLastName(String lName) {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(guestUserLastNameElement), 20);
        driver.findElement(By.xpath(guestUserLastNameElement)).sendKeys(lName);
        return this;
    }

    public CheckoutGuestUserPage selectCity(String cityValue) {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(guestUserCityDropDownElement), 20);
        Select city = new Select(driver.findElement(By.xpath(guestUserCityDropDownElement)));
        city.selectByVisibleText(cityValue);
        return this;
    }

    public CheckoutGuestUserPage addArea(String area) {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(guestUserAreaElement), 20);
        driver.findElement(By.xpath(guestUserAreaElement)).sendKeys(area);
        return this;
    }

    public CheckoutGuestUserPage addStreetName(String sName) {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(guestUserStreetNameElement), 20);
        driver.findElement(By.xpath(guestUserStreetNameElement)).sendKeys(sName);
        return this;
    }

    public CheckoutGuestUserPage addBuildingName(String bName) {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(guestUserBuildingNameElement), 20);
        driver.findElement(By.xpath(guestUserBuildingNameElement)).sendKeys(bName);
        return this;
    }

    public CheckoutGuestUserPage addPhoneNumber(String telNo) {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(guestUserTelephoneNumberElement), 500);
        driver.findElement(By.xpath(guestUserTelephoneNumberElement)).sendKeys(telNo);
        return this;
    }

    public CheckoutGuestUserPage addPassword(String password) {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(guestUserPasswordFieldElement), 20);
        driver.findElement(By.xpath(guestUserPasswordFieldElement)).sendKeys(password);
        return this;
    }

    public CheckoutGuestUserPage clickLoginButton() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(guestUserLoginButtonElement), 20);
        driver.findElement(By.xpath(guestUserLoginButtonElement)).click();
        return this;
    }

    public ForgotYourPassword clickForgotPasswordLink() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(guestUserForgotPasswordLinkElement), 20);
        driver.findElement(By.xpath(guestUserForgotPasswordLinkElement)).click();
        return new ForgotYourPassword();
    }

    public CheckoutGuestUserPage clickAlreadyRegisteredLink() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(guestUserAlreadyRegisteredLinkElement), 20);
        driver.findElement(By.xpath(guestUserAlreadyRegisteredLinkElement)).click();
        return this;
    }

    public CheckoutGuestUserPage clickViewDetailsInConfigProduct() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(guestUserConfigProductViewDetailsDropdownElement), 20);
        driver.findElement(By.xpath(guestUserConfigProductViewDetailsDropdownElement)).click();
        return this;
    }

    public CheckoutGuestUserPage selectStandardDeliveryMethod() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(guestUserStandardShippingRadioButtonElement), 10);
        if (!driver.findElement(By.xpath(guestUserStandardShippingRadioButtonElement)).isSelected()) {
//            driver.findElement(By.xpath(deliveryMethodStandardElement)).click();
            WebElement stdRadioButton = driver.findElement(By.xpath(guestUserStandardShippingRadioButtonElement));
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", stdRadioButton);
            return this;
        } else {
            return this;
        }
    }

    public CheckoutGuestUserPage selectPaymentMethodAsCOD() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(guestUserCODPaymentMethodElement), 15);
        if (!driver.findElement(By.xpath(guestUserCODPaymentMethodElement)).isSelected()) {
//            driver.findElement(By.id(paymentMethodCODElement)).click();
            WebElement codRadioButton = driver.findElement(By.xpath(guestUserCODPaymentMethodElement));
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", codRadioButton);
            return this;
        } else {
            return this;
        }
    }

    public CheckoutGuestUserPage selectPaymentMethodAsCC(){
        SpriiTestFramework.getInstance().waitForElement(By.xpath(guestUserCCPaymentMethodElement), 15);
        if (!driver.findElement(By.xpath(guestUserCCPaymentMethodElement)).isSelected()) {
//            driver.findElement(By.id(paymentMethodCCElement)).click();
            WebElement ccRadioButton = driver.findElement(By.xpath(guestUserCCPaymentMethodElement));
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

    public CheckoutGuestUserPage addCCCardNoExpDateAndCvv(String cardNo, String expDate, String cvv){
        SpriiTestFramework.getInstance().waitForElement(By.xpath(guestUserCCCardNumberFieldElement), 200);
        driver.findElement(By.xpath(guestUserCCCardNumberFieldElement)).sendKeys(cardNo);
        SpriiTestFramework.getInstance().waitForElement(By.xpath(guestUserCCExpDateElement), 20);
        driver.findElement(By.xpath(guestUserCCExpDateElement)).sendKeys(expDate);
        SpriiTestFramework.getInstance().waitForElement(By.xpath(guestUserCCCvvElement), 20);
        driver.findElement(By.xpath(guestUserCCCvvElement)).sendKeys(cvv);
        return this;
    }

    public CheckoutGuestUserPage addCouponCode(String code) throws Exception {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(guestUserApplyDiscountDropdownElement), 15);
        SpriiTestFramework.getInstance().waitTillClickable(By.xpath(guestUserApplyDiscountDropdownElement), 15);
        //       driver.findElement(By.xpath(discountCodeElement)).click();
        WebElement addcoupon = driver.findElement(By.xpath(guestUserApplyDiscountDropdownElement));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", addcoupon);
        Thread.sleep(5000);
        SpriiTestFramework.getInstance().waitForElement(By.xpath(guestUserDiscountCodeFieldElement), 100);
        driver.findElement(By.xpath(guestUserDiscountCodeFieldElement)).sendKeys(code);
        Thread.sleep(5000);
        driver.findElement(By.xpath(guestUserApplyDiscountButtonElement)).click();
        Thread.sleep(5000);
        return this;
    }

    public OrderPlacementSuccessPage placeOrder() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(guestUserPlaceOrderButtonElement), 20);
        SpriiTestFramework.getInstance().waitTillClickable(By.xpath(guestUserPlaceOrderButtonElement), 20);
//        driver.findElement(By.xpath(placeOrderButtonElement)).click();
        try {
            WebElement placeOrderButton = driver.findElement(By.xpath(guestUserPlaceOrderButtonElement));
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", placeOrderButton);
            return new OrderPlacementSuccessPage();
        } catch (Exception e) {
            e.printStackTrace();
            return new OrderPlacementSuccessPage();
        }
    }

    public CheckoutGuestUserPage placeOrderWithoutUserDetails() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(guestUserPlaceOrderButtonElement), 20);
        SpriiTestFramework.getInstance().waitTillClickable(By.xpath(guestUserPlaceOrderButtonElement), 20);
//        driver.findElement(By.xpath(placeOrderButtonElement)).click();
        try {
            WebElement placeOrderButton = driver.findElement(By.xpath(guestUserPlaceOrderButtonElement));
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", placeOrderButton);
            return this;
        } catch (Exception e) {
            e.printStackTrace();
            return this;
        }
    }

    public OrderPlacementSuccessPage placeOrderWithThreeDSCheckout() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(guestUserPlaceOrderButtonElement), 5);
        SpriiTestFramework.getInstance().waitTillClickable(By.xpath(guestUserPlaceOrderButtonElement), 5);
//        driver.findElement(By.xpath(placeOrderButtonElement)).click();
        try {
            WebElement placeOrderButton = driver.findElement(By.xpath(guestUserPlaceOrderButtonElement));
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", placeOrderButton);

            SpriiTestFramework.getInstance().waitForElement(By.id(guestUserTDSCheckoutFieldElement), 15);
            driver.findElement(By.id(guestUserTDSCheckoutFieldElement)).sendKeys("Checkout1!");
            SpriiTestFramework.getInstance().waitForElement(By.id(guestUserTDSCheckoutButtonElement), 5);
            driver.findElement(By.id(guestUserTDSCheckoutButtonElement)).click();
            return new OrderPlacementSuccessPage();
        } catch (Exception e) {
            e.printStackTrace();
            return new OrderPlacementSuccessPage();
        }
    }

    //Assertions
    public boolean emptyEmailValidation() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(checkoutEmailEmptyValidationElement), 20);
        Actions actions = new Actions(driver);
        WebElement target = driver.findElement(By.xpath(checkoutEmailEmptyValidationElement));
        actions.moveToElement(target).perform();
        String msgForEmptyEmail = driver.findElement(By.xpath(checkoutEmailEmptyValidationElement)).getText();
        if (msgForEmptyEmail.equals("This is a required field.")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean emptyFNameValidation() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(checkoutFNameEmptyValidationElement), 20);
        Actions actions = new Actions(driver);
        WebElement target = driver.findElement(By.xpath(checkoutFNameEmptyValidationElement));
        actions.moveToElement(target).perform();
        //driver.findElement(By.xpath(checkoutFNameEmptyValidationElement)).click();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(checkoutFNameEmptyValidationMsgElement), 20);
        String msgForEmptyEmail = driver.findElement(By.xpath(checkoutFNameEmptyValidationMsgElement)).getText();
        if (msgForEmptyEmail.equals("This is a required field.")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean emptyLNameValidation() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(checkoutLNameEmptyValidationElement), 20);
        Actions actions = new Actions(driver);
        WebElement target = driver.findElement(By.xpath(checkoutLNameEmptyValidationElement));
        actions.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(checkoutLNameEmptyValidationMsgElement), 20);
        String msgForEmptyEmail = driver.findElement(By.xpath(checkoutLNameEmptyValidationMsgElement)).getText();
        if (msgForEmptyEmail.equals("This is a required field.")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean emptyCityValidation() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(checkoutCityEmptyValidationElement), 20);
        Actions actions = new Actions(driver);
        WebElement target = driver.findElement(By.xpath(checkoutCityEmptyValidationElement));
        actions.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(checkoutCityEmptyValidationMsgElement), 20);
        String msgForEmptyEmail = driver.findElement(By.xpath(checkoutCityEmptyValidationMsgElement)).getText();
        if (msgForEmptyEmail.equals("This is a required field.")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean emptyAreaValidation() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(checkoutAreaEmptyValidationElement), 20);
        Actions actions = new Actions(driver);
        WebElement target = driver.findElement(By.xpath(checkoutAreaEmptyValidationElement));
        actions.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(checkoutAreaEmptyValidationMsgElement), 20);
        String msgForEmptyEmail = driver.findElement(By.xpath(checkoutAreaEmptyValidationMsgElement)).getText();
        if (msgForEmptyEmail.equals("This is a required field.")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean emptyStreetNameValidation() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(checkoutStreetNameEmptyValidationElement), 20);
        Actions actions = new Actions(driver);
        WebElement target = driver.findElement(By.xpath(checkoutStreetNameEmptyValidationElement));
        actions.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(checkoutStreetNameEmptyValidationMsgElement), 20);
        String msgForEmptyEmail = driver.findElement(By.xpath(checkoutStreetNameEmptyValidationMsgElement)).getText();
        if (msgForEmptyEmail.equals("This is a required field.")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean emptyBuildingNameValidation() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(checkoutBuildingNameEmptyValidationElement), 20);
        Actions actions = new Actions(driver);
        WebElement target = driver.findElement(By.xpath(checkoutBuildingNameEmptyValidationElement));
        actions.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(checkoutBuildingNameEmptyValidationMsgElement), 20);
        String msgForEmptyEmail = driver.findElement(By.xpath(checkoutBuildingNameEmptyValidationMsgElement)).getText();
        if (msgForEmptyEmail.equals("This is a required field.")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean emptyPhoneNumberValidation() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(checkoutPhoneNumberEmptyValidationElement), 20);
        Actions actions = new Actions(driver);
        WebElement target = driver.findElement(By.xpath(checkoutPhoneNumberEmptyValidationElement));
        actions.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(checkoutPhoneNumberEmptyValidationMsgElement), 20);
        String msgForEmptyEmail = driver.findElement(By.xpath(checkoutPhoneNumberEmptyValidationMsgElement)).getText();
        if (msgForEmptyEmail.equals("This is a required field.")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean invalidPhoneNumberValidation() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(checkoutPhoneNumberInvalidValidationElement), 20);
        Actions actions = new Actions(driver);
        WebElement target = driver.findElement(By.xpath(checkoutPhoneNumberInvalidValidationElement));
        actions.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(checkoutPhoneNumberInvalidValidationMsgElement), 20);
        String msgForEmptyEmail = driver.findElement(By.xpath(checkoutPhoneNumberInvalidValidationMsgElement)).getText();
        if (msgForEmptyEmail.equals("Please specify a valid phone number")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean invalidEmailValidation() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(checkoutEmailInvalidValidationElement), 20);
        Actions actions = new Actions(driver);
        WebElement target = driver.findElement(By.xpath(checkoutEmailInvalidValidationElement));
        actions.moveToElement(target).perform();
        String msgForEmptyEmail = driver.findElement(By.xpath(checkoutEmailInvalidValidationElement)).getText();
        if (msgForEmptyEmail.equals("Please enter a valid email address (Ex: johndoe@domain.com).")) {
            return true;
        } else {
            return false;
        }
    }
}
