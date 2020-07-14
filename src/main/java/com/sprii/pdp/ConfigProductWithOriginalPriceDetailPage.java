package com.sprii.pdp;

import com.sprii.login.LoginPage;
import com.sprii.myaccount.MyWishListPage;
import com.sprii.plp.CartPage;
import com.sprii.shoppingcart.ShoppingCartPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utils.PropertyFileReader;
import utils.SpriiTestFramework;

public class ConfigProductWithOriginalPriceDetailPage {

    WebDriver driver = SpriiTestFramework.getInstance().getDriver();
    PropertyFileReader prop = new PropertyFileReader();

    String addToCartElement = prop.getProperty("ConfigProductWithOriginalPriceDetailPage", "add.to.cart.element");
    String addToWishListElement = prop.getProperty("ConfigProductWithOriginalPriceDetailPage", "add.to.wishlist.element");
    String configProductBaseImageElement = prop.getProperty("ConfigProductWithOriginalPriceDetailPage", "config.product.base.image.element");
    String configProductBaseImageZoomElement = prop.getProperty("ConfigProductWithOriginalPriceDetailPage", "config.product.base.image.zoom.element");
    String configProductBaseImageLeftScrollArrowElement = prop.getProperty("ConfigProductWithOriginalPriceDetailPage", "config.product.base.image.left.scroll.arrow.element");
    String configProductBaseImageRightScrollArrowElement = prop.getProperty("ConfigProductWithOriginalPriceDetailPage", "config.product.base.image.right.scroll.arrow.element");
    String configProductFirstThumbnailImageElement = prop.getProperty("ConfigProductWithOriginalPriceDetailPage", "config.product.first.thumbnail.image.element");
    String configProductSecondThumbnailImageElement = prop.getProperty("ConfigProductWithOriginalPriceDetailPage", "config.product.second.thumbnail.image.element");
    String configProductThirdThumbnailImageElement = prop.getProperty("ConfigProductWithOriginalPriceDetailPage", "config.product.third.thumbnail.image.element");
    String configProductFourthThumbnailImageElement = prop.getProperty("ConfigProductWithOriginalPriceDetailPage", "config.product.fourth.thumbnail.image.element");
    String configProductFifthThumbnailImageElement = prop.getProperty("ConfigProductWithOriginalPriceDetailPage", "config.product.fifth.thumbnail.image.element");
    String configProductSixthThumbnailImageElement = prop.getProperty("ConfigProductWithOriginalPriceDetailPage", "config.product.sixth.thumbnail.image.element");
    String configProductSeventhThumbnailImageElement = prop.getProperty("ConfigProductWithOriginalPriceDetailPage", "config.product.seventh.thumbnail.image.element");
    String configProductThumbnailLowerScrollArrowElement = prop.getProperty("ConfigProductWithOriginalPriceDetailPage", "config.product.thumbnail.lower.scroll.arrow.element");
    String configProductThumbnailUpperScrollArrowElement = prop.getProperty("ConfigProductWithOriginalPriceDetailPage", "config.product.thumbnail.upper.scroll.arrow.element");
    String configProductConfigOptionsNameElement = prop.getProperty("ConfigProductWithOriginalPriceDetailPage", "config.product1.config.options.dropdown.name.element");

    //Assertions
    String configProduct1NameElement = prop.getProperty("ConfigProductWithOriginalPriceDetailPage", "config.product1.name.element");
    String configProduct1PriceElement= prop.getProperty("ConfigProductWithOriginalPriceDetailPage", "config.product1.price.element");
    String configProduct1VatIncludedTextElement = prop.getProperty("ConfigProductWithOriginalPriceDetailPage", "config.product1.vat.included.text.element");
    String configProduct1DeliveryTimeElement = prop.getProperty("ConfigProductWithOriginalPriceDetailPage", "config.product1.delivery.time.element");
    String configProduct1SkuTitleElement = prop.getProperty("ConfigProductWithOriginalPriceDetailPage", "config.product1.sku.title.element");
    String configProduct1SkuValueElement = prop.getProperty("ConfigProductWithOriginalPriceDetailPage", "config.product1.sku.value.element");
    String configProduct1BrandTitleElement = prop.getProperty("ConfigProductWithOriginalPriceDetailPage", "config.product1.brand.title.element");
    String configProduct1BrandValueElement = prop.getProperty("ConfigProductWithOriginalPriceDetailPage", "config.product1.brand.value.element");
    String configProduct1SizeAgeTitleElement = prop.getProperty("ConfigProductWithOriginalPriceDetailPage", "config.product1.size.age.title.element");
    String configProduct1SizeAgeValueElement = prop.getProperty("ConfigProductWithOriginalPriceDetailPage", "config.product1.size.age.value.element");
    String configProduct1CollectionTitleElement = prop.getProperty("ConfigProductWithOriginalPriceDetailPage", "config.product1.collection.title.element");
    String configProduct1CollectionValueElement = prop.getProperty("ConfigProductWithOriginalPriceDetailPage", "config.product1.collection.value.element");
    String configProduct1GuestFreeShippingIconElement = prop.getProperty("ConfigProductWithOriginalPriceDetailPage", "config.product1.guest.user.free.shipping.icon.element");
    String configProduct1GuestFreeShippingTextElement = prop.getProperty("ConfigProductWithOriginalPriceDetailPage", "config.product1.guest.user.free.shipping.text.element");
    String configProduct1GuestOnAllOrdersElement = prop.getProperty("ConfigProductWithOriginalPriceDetailPage", "config.product1.guest.user.on.all.orders.text.element");
    String configProduct1GuestFreeReturnsIconElement = prop.getProperty("ConfigProductWithOriginalPriceDetailPage", "config.product1.guest.user.free.returns.icon.element");
    String configProduct1GuestFreeReturnsLabelElement = prop.getProperty("ConfigProductWithOriginalPriceDetailPage", "config.product1.guest.user.free.returns.label.element");
    String configProduct1GuestWithinDaysLabelElement = prop.getProperty("ConfigProductWithOriginalPriceDetailPage", "config.product1.guest.user.within.days.label.element");
    String configProduct1GuestCashOnDeliveryIconElement = prop.getProperty("ConfigProductWithOriginalPriceDetailPage", "config.product1.guest.user.cash.on.delivery.icon.element");
    String configProduct1GuestCashOnDeliveryLabelElement = prop.getProperty("ConfigProductWithOriginalPriceDetailPage", "config.product1.guest.user.cash.on.delivery.label.element");
    String configProduct1GuestAvailableLabelElement = prop.getProperty("ConfigProductWithOriginalPriceDetailPage", "config.product1.guest.user.available.label.element");
    String configProduct1GuestPriceMatchIconElement = prop.getProperty("ConfigProductWithOriginalPriceDetailPage", "config.product1.guest.user.price.match.icon.element");
    String configProduct1GuestPriceMatchLabelElement = prop.getProperty("ConfigProductWithOriginalPriceDetailPage", "config.product1.guest.user.price.match.label.element");
    String configProduct1GuestOnAllProductsLabelElement = prop.getProperty("ConfigProductWithOriginalPriceDetailPage", "config.product1.guest.user.on.all.products.label.element");
    String configProduct1GuestCustomerAlsoBoughtSection = prop.getProperty("ConfigProductWithOriginalPriceDetailPage", "config.product.1.customer.also.bought.label.element");

    //Any product add to cart button click
    public ShoppingCartPage addToCartButtonClick() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(addToCartElement), 200);
        driver.findElement(By.xpath(addToCartElement)).click();
        return new ShoppingCartPage();
    }

    //Guest user add to wishlist for all products
    public LoginPage addToWishListByGuestUser() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(addToWishListElement), 20);
        driver.findElement(By.xpath(addToWishListElement)).click();
        return new LoginPage();
    }

    //Logged user add to wishlist for all products
    public MyWishListPage addToWishListByLoggedUser() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(addToWishListElement), 20);
        driver.findElement(By.xpath(addToWishListElement)).click();
        return new MyWishListPage();
    }

    //Config product zoom image
    public ProductGalleryPage zoomConfigProduct() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProductBaseImageElement), 20);
        Actions actions = new Actions(driver);
        WebElement target = driver.findElement(By.xpath(configProductBaseImageElement));
        actions.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProductBaseImageElement), 20);
        driver.findElement(By.xpath(configProductBaseImageZoomElement)).click();
        return new ProductGalleryPage();
    }

    //Config product left arrow scrolls
    public ConfigProductWithOriginalPriceDetailPage configProductScrollWithLeftArrow() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProductBaseImageElement), 20);
        Actions actions = new Actions(driver);
        WebElement target = driver.findElement(By.xpath(configProductBaseImageElement));
        actions.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProductBaseImageLeftScrollArrowElement), 20);
        driver.findElement(By.xpath(configProductBaseImageLeftScrollArrowElement)).click();
        return this;
    }

    //Config product right arrow scrolls
    public ConfigProductWithOriginalPriceDetailPage configProductScrollWithRightArrow() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProductBaseImageElement), 20);
        Actions actions = new Actions(driver);
        WebElement target = driver.findElement(By.xpath(configProductBaseImageElement));
        actions.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProductBaseImageRightScrollArrowElement), 20);
        driver.findElement(By.xpath(configProductBaseImageRightScrollArrowElement)).click();
        return this;
    }

    //Config Product thumbnail images clicks
    public ConfigProductWithOriginalPriceDetailPage clickEventOnFirstThumbnailImageConfigProduct() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProductFirstThumbnailImageElement), 20);
        driver.findElement(By.xpath(configProductFirstThumbnailImageElement)).click();
        return this;
    }

    public ConfigProductWithOriginalPriceDetailPage clickEventOnSecondImageConfigProduct() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProductSecondThumbnailImageElement), 20);
        driver.findElement(By.xpath(configProductSecondThumbnailImageElement)).click();
        return this;
    }

    public ConfigProductWithOriginalPriceDetailPage clickEventOnThirdImageConfigProduct() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProductThirdThumbnailImageElement), 20);
        driver.findElement(By.xpath(configProductThirdThumbnailImageElement)).click();
        return this;
    }

    public ConfigProductWithOriginalPriceDetailPage clickEventOnFourthImageConfigProduct() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProductFourthThumbnailImageElement), 20);
        driver.findElement(By.xpath(configProductFourthThumbnailImageElement)).click();
        return this;
    }

    public ConfigProductWithOriginalPriceDetailPage clickEventOnFifthImageConfigProduct() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProductFifthThumbnailImageElement), 20);
        driver.findElement(By.xpath(configProductFifthThumbnailImageElement)).click();
        return this;
    }

    public ConfigProductWithOriginalPriceDetailPage clickEventOnSixthImageConfigProduct() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProductSixthThumbnailImageElement), 20);
        driver.findElement(By.xpath(configProductSixthThumbnailImageElement)).click();
        return this;
    }

    public ConfigProductWithOriginalPriceDetailPage clickEventOnSeventhImageConfigProduct() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProductSeventhThumbnailImageElement), 20);
        driver.findElement(By.xpath(configProductSeventhThumbnailImageElement)).click();
        return this;
    }

    //Thumbnail images scroll arrows
    public ConfigProductWithOriginalPriceDetailPage clickEventOnThumbnailLowerScrollArrow() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProductThumbnailLowerScrollArrowElement), 20);
        driver.findElement(By.xpath(configProductThumbnailLowerScrollArrowElement)).click();
        return this;
    }

    public ConfigProductWithOriginalPriceDetailPage clickEventOnThumbnailUpperScrollArrow() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProductThumbnailUpperScrollArrowElement), 20);
        driver.findElement(By.xpath(configProductThumbnailUpperScrollArrowElement)).click();
        return this;
    }

    //Select config options from color dropdown
    public ConfigProductWithOriginalPriceDetailPage selectConfigOptionFromConfigProduct(String ConfigOption) {
        SpriiTestFramework.getInstance().waitForElement(By.name(configProductConfigOptionsNameElement), 20);
        Select option = new Select(driver.findElement(By.name(configProductConfigOptionsNameElement)));
        option.selectByVisibleText(ConfigOption);
        return this;
    }

    //Add to cart button click event without selecting config option for config product
    public ConfigProductWithOriginalPriceDetailPage addToCartWithoutSelectingConfigOption() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(addToCartElement), 20);
        driver.findElement(By.xpath(addToCartElement)).click();
        return this;
    }

    //Assertions
    public boolean product3NameIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProduct1NameElement), 20);
        String productName = driver.findElement(By.xpath(configProduct1NameElement)).getText();
        if(productName.equals("Test Config Product 1 - Original Price")){
            return true;
        }else{
            return false;
        }
    }

    public boolean product3PriceIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProduct1PriceElement), 20);
        String productPrice = driver.findElement(By.xpath(configProduct1PriceElement)).getText();
        if(productPrice.equals("AED 525")){
            return true;
        }else{
            return false;
        }
    }

    public boolean product3VATTextIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProduct1VatIncludedTextElement), 20);
        String productVATIncludedText = driver.findElement(By.xpath(configProduct1VatIncludedTextElement)).getText();
        if(productVATIncludedText.equals("VAT included")){
            return true;
        }else{
            return false;
        }
    }

    public boolean product3DeliveryTimeIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProduct1DeliveryTimeElement), 20);
        String productDeliveryTimeLabel = driver.findElement(By.xpath(configProduct1DeliveryTimeElement)).getText();
        if(productDeliveryTimeLabel.equals("Delivery Time: 6-8 business days")){
            return true;
        }else{
            return false;
        }
    }

    public boolean product3SKULabelIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProduct1SkuTitleElement), 20);
        String productSKULabel = driver.findElement(By.xpath(configProduct1SkuTitleElement)).getText();
        if(productSKULabel.equals("SKU")){
            return true;
        }else{
            return false;
        }
    }

    public boolean product3SKUValueIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProduct1SkuValueElement), 20);
        String productSKUValue = driver.findElement(By.xpath(configProduct1SkuValueElement)).getText();
        if(productSKUValue.equals("TestConfigProduct1-OriginalPrice")){
            return true;
        }else{
            return false;
        }
    }

    public boolean product3BrandLabelIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProduct1BrandTitleElement), 20);
        String productBrandLabel = driver.findElement(By.xpath(configProduct1BrandTitleElement)).getText();
        if(productBrandLabel.equals("Brand")){
            return true;
        }else{
            return false;
        }
    }

    public boolean product3BrandValueIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProduct1BrandValueElement), 20);
        String productBrandValue = driver.findElement(By.xpath(configProduct1BrandValueElement)).getText();
        if(productBrandValue.equals("Baby Dior")){
            return true;
        }else{
            return false;
        }
    }

    public boolean product3SizeAndAgeLabelIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProduct1SizeAgeTitleElement), 20);
        String productSizeAndAgeLabel = driver.findElement(By.xpath(configProduct1SizeAgeTitleElement)).getText();
        if(productSizeAndAgeLabel.equals("Size/Age")){
            return true;
        }else{
            return false;
        }
    }

    public boolean product3SizeAndAgeValueIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProduct1SizeAgeValueElement), 20);
        String productSizeAndAgeValue = driver.findElement(By.xpath(configProduct1SizeAgeValueElement)).getText();
        if(productSizeAndAgeValue.equals("14/16, 25cm x 30cm, 35cm x 35cm, 50cm x 80cm, 70cm x 100cm, 80cm x 80cm, 100cm x 100cm, 100cm x 140cm, Infant, Newborn, Newborn - Small Baby, 0 month, 0-3 months, 0-4 months, 0-5 months, 0-6 months, 0-8 months, 0-9 months, 0-10 months, 0-12 months, 0-15 months, 0-16 months, 0-18 months, 0-24 months, 0-30 months, 0-36 months, 1 month, 1-3 months, 1-9 months, 2-4 months, 2-24 months")){
            return true;
        }else{
            return false;
        }
    }

    public boolean product3CollectionLabelIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProduct1CollectionTitleElement), 20);
        String productCollectionLabel = driver.findElement(By.xpath(configProduct1CollectionTitleElement)).getText();
        if(productCollectionLabel.equals("Collection")){
            return true;
        }else{
            return false;
        }
    }

    public boolean product3CollectionValueIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProduct1CollectionValueElement), 20);
        String productCollectionValue= driver.findElement(By.xpath(configProduct1CollectionValueElement)).getText();
        if(productCollectionValue.equals("Wooden, Musical, Baby Care, Parenting")){
            return true;
        }else{
            return false;
        }
    }

    public boolean guestUserFreeShippingLabelIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProduct1GuestFreeShippingTextElement), 20);
        String guestUserFreeShippingLabel= driver.findElement(By.xpath(configProduct1GuestFreeShippingTextElement)).getText();
        if(guestUserFreeShippingLabel.equals("FREE SHIPPING")){
            return true;
        }else{
            return false;
        }
    }

    public boolean guestUserOnAllOrderTextIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProduct1GuestOnAllOrdersElement), 20);
        String guestUserOnAllOrders= driver.findElement(By.xpath(configProduct1GuestOnAllOrdersElement)).getText();
        if(guestUserOnAllOrders.equals("On All Orders!")){
            return true;
        }else{
            return false;
        }
    }

    public boolean guestUserFreeReturnsLabelIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProduct1GuestFreeReturnsLabelElement), 20);
        String guestUserFreeReturnsLabel= driver.findElement(By.xpath(configProduct1GuestFreeReturnsLabelElement)).getText();
        if(guestUserFreeReturnsLabel.equals("FREE RETURNS")){
            return true;
        }else{
            return false;
        }
    }

    public boolean guestUserWithin7DaysTextIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProduct1GuestWithinDaysLabelElement), 20);
        String guestUserWithinDaysLabel= driver.findElement(By.xpath(configProduct1GuestWithinDaysLabelElement)).getText();
        if(guestUserWithinDaysLabel.equals("Within 7 Days")){
            return true;
        }else{
            return false;
        }
    }

    public boolean guestUserCashOnDeliveryLabelIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProduct1GuestCashOnDeliveryLabelElement), 20);
        String guestUserCashOnDeliveryLabel= driver.findElement(By.xpath(configProduct1GuestCashOnDeliveryLabelElement)).getText();
        if(guestUserCashOnDeliveryLabel.equals("CASH ON DELIVERY")){
            return true;
        }else{
            return false;
        }
    }

    public boolean guestUserAvailableLabelIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProduct1GuestAvailableLabelElement), 20);
        String guestUserAvailableLabel= driver.findElement(By.xpath(configProduct1GuestAvailableLabelElement)).getText();
        if(guestUserAvailableLabel.equals("Available")){
            return true;
        }else{
            return false;
        }
    }

    public boolean guestUserPriceMatchLabelIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProduct1GuestPriceMatchLabelElement), 20);
        String guestUserAvailableLabel= driver.findElement(By.xpath(configProduct1GuestPriceMatchLabelElement)).getText();
        if(guestUserAvailableLabel.equals("PRICE MATCH")){
            return true;
        }else{
            return false;
        }
    }

    public boolean guestUserOnAllProductsLabelIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProduct1GuestOnAllProductsLabelElement), 20);
        String guestUserOnAllProductsLabel= driver.findElement(By.xpath(configProduct1GuestOnAllProductsLabelElement)).getText();
        if(guestUserOnAllProductsLabel.equals("On All Products")){
            return true;
        }else{
            return false;
        }
    }

    public boolean guestUserCustomerAlsoBoughtTitleIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProduct1GuestCustomerAlsoBoughtSection), 20);
        String guestUserCustomerAlsoBoughtTitle= driver.findElement(By.xpath(configProduct1GuestCustomerAlsoBoughtSection)).getText();
        if(guestUserCustomerAlsoBoughtTitle.equals("CUSTOMERS ALSO BOUGHT:")){
            return true;
        }else{
            return false;
        }
    }
}
