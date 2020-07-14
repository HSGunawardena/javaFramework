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

public class ConfigProductWithSpecialPriceDetailPage {

    private WebDriver driver = SpriiTestFramework.getInstance().getDriver();
    private PropertyFileReader prop = new PropertyFileReader();

    private String addToCartElement = prop.getProperty("ConfigProductWithSpecialPriceDetailPage", "add.to.cart.element");
    private String addToWishListElement = prop.getProperty("ConfigProductWithSpecialPriceDetailPage", "add.to.wishlist.element");
    private String configProductBaseImageElement = prop.getProperty("ConfigProductWithSpecialPriceDetailPage", "config.product.base.image.element");
    private String configProductBaseImageZoomElement = prop.getProperty("ConfigProductWithSpecialPriceDetailPage", "config.product.base.image.zoom.element");
    private String configProductBaseImageLeftScrollArrowElement = prop.getProperty("ConfigProductWithSpecialPriceDetailPage", "config.product.base.image.left.scroll.arrow.element");
    private String configProductBaseImageRightScrollArrowElement = prop.getProperty("ConfigProductWithSpecialPriceDetailPage", "config.product.base.image.right.scroll.arrow.element");
    private String configProductFirstThumbnailImageElement = prop.getProperty("ConfigProductWithSpecialPriceDetailPage", "config.product.first.thumbnail.image.element");
    private String configProductSecondThumbnailImageElement = prop.getProperty("ConfigProductWithSpecialPriceDetailPage", "config.product.second.thumbnail.image.element");
    private String configProductThirdThumbnailImageElement = prop.getProperty("ConfigProductWithSpecialPriceDetailPage", "config.product.third.thumbnail.image.element");
    private String configProductFourthThumbnailImageElement = prop.getProperty("ConfigProductWithSpecialPriceDetailPage", "config.product.fourth.thumbnail.image.element");
    private String configProductFifthThumbnailImageElement = prop.getProperty("ConfigProductWithSpecialPriceDetailPage", "config.product.fifth.thumbnail.image.element");
    private String configProductSixthThumbnailImageElement = prop.getProperty("ConfigProductWithSpecialPriceDetailPage", "config.product.sixth.thumbnail.image.element");
    private String configProductSeventhThumbnailImageElement = prop.getProperty("ConfigProductWithSpecialPriceDetailPage", "config.product.seventh.thumbnail.image.element");
    private String configProductThumbnailLowerScrollArrowElement = prop.getProperty("ConfigProductWithSpecialPriceDetailPage", "config.product.thumbnail.lower.scroll.arrow.element");
    private String configProductThumbnailUpperScrollArrowElement = prop.getProperty("ConfigProductWithSpecialPriceDetailPage", "config.product.thumbnail.upper.scroll.arrow.element");
    private String configProductConfigOptionsNameElement = prop.getProperty("ConfigProductWithSpecialPriceDetailPage", "config.product.config.options.dropdown.name.element");

    //Assertions
    private String configProduct2NameElement = prop.getProperty("ConfigProductWithSpecialPriceDetailPage", "config.product2.name.element");
    private String configProduct2SpecialPriceElement = prop.getProperty("ConfigProductWithSpecialPriceDetailPage", "config.product2.special.price.element");
    private String configProduct2VatIncludedLabelElement = prop.getProperty("ConfigProductWithSpecialPriceDetailPage", "config.product2.vat.included.label.element");
    private String configProduct2OriginalPriceElement = prop.getProperty("ConfigProductWithSpecialPriceDetailPage", "config.product2.original.price.element");
    private String configProduct2YouSaveLabelElement = prop.getProperty("ConfigProductWithSpecialPriceDetailPage", "config.product2.you.save.label.element");
    private String configProduct2SavePriceElement = prop.getProperty("ConfigProductWithSpecialPriceDetailPage", "config.product2.save.price.element");
    private String configProduct2SavePercentageValueElement = prop.getProperty("ConfigProductWithSpecialPriceDetailPage", "config.product2.save.percentage.value");
    private String configProduct2SkuTitleElement = prop.getProperty("ConfigProductWithSpecialPriceDetailPage", "config.product2.sku.title.element");
    private String configProduct2SkuValueElement = prop.getProperty("ConfigProductWithSpecialPriceDetailPage", "config.product2.sku.value.element");
    private String configProduct2BrandTitleElement = prop.getProperty("ConfigProductWithSpecialPriceDetailPage", "config.product2.brand.title.element");
    private String configProduct2BrandValueElement = prop.getProperty("ConfigProductWithSpecialPriceDetailPage", "config.product2.brand.value.element");
    private String configProduct2SizeAgeTitleElement = prop.getProperty("ConfigProductWithSpecialPriceDetailPage", "config.product2.size.age.title.element");
    private String configProduct2SizeAgeValueElement = prop.getProperty("ConfigProductWithSpecialPriceDetailPage", "config.product2.size.age.value.element");
    private String configProduct2CollectionTitleElement = prop.getProperty("ConfigProductWithSpecialPriceDetailPage", "config.product2.collection.title.element");
    private String configProduct2CollectionValueElement = prop.getProperty("ConfigProductWithSpecialPriceDetailPage", "config.product2.collection.value.element");
    private String configProduct2GuestFreeShippingIconElement = prop.getProperty("ConfigProductWithSpecialPriceDetailPage", "config.product2.guest.user.free.shipping.icon.element");
    private String configProduct2GuestFreeShippingTextElement = prop.getProperty("ConfigProductWithSpecialPriceDetailPage", "config.product2.guest.user.free.shipping.text.element");
    private String configProduct2GuestOnAllOrdersElement = prop.getProperty("ConfigProductWithSpecialPriceDetailPage", "config.product2.guest.user.on.all.orders.text.element");
    private String configProduct2GuestFreeReturnsIconElement = prop.getProperty("ConfigProductWithSpecialPriceDetailPage", "config.product2.guest.user.free.returns.icon.element");
    private String configProduct2GuestFreeReturnsLabelElement = prop.getProperty("ConfigProductWithSpecialPriceDetailPage", "config.product2.guest.user.free.returns.label.element");
    private String configProduct2GuestWithinDaysLabelElement = prop.getProperty("ConfigProductWithSpecialPriceDetailPage", "config.product2.guest.user.within.days.label.element");
    private String configProduct21GuestCashOnDeliveryIconElement = prop.getProperty("ConfigProductWithSpecialPriceDetailPage", "config.product2.guest.user.cash.on.delivery.icon.element");
    private String configProduct2GuestCashOnDeliveryLabelElement = prop.getProperty("ConfigProductWithSpecialPriceDetailPage", "config.product2.guest.user.cash.on.delivery.label.element");
    private String configProduct2GuestAvailableLabelElement = prop.getProperty("ConfigProductWithSpecialPriceDetailPage", "config.product2.guest.user.available.label.element");
    private String configProduct2GuestPriceMatchIconElement = prop.getProperty("ConfigProductWithSpecialPriceDetailPage", "config.product2.guest.user.price.match.icon.element");
    private String configProduct2GuestPriceMatchLabelElement = prop.getProperty("ConfigProductWithSpecialPriceDetailPage", "config.product2.guest.user.price.match.label.element");
    private String configProduct2GuestOnAllProductsLabelElement = prop.getProperty("ConfigProductWithSpecialPriceDetailPage", "config.product2.guest.user.on.all.products.label.element");
    private String configProduct2GuestCustomerAlsoBoughtSection = prop.getProperty("ConfigProductWithSpecialPriceDetailPage", "config.product2.customer.also.bought.label.element");

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
    public ConfigProductWithSpecialPriceDetailPage configProductScrollWithLeftArrow() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProductBaseImageElement), 20);
        Actions actions = new Actions(driver);
        WebElement target = driver.findElement(By.xpath(configProductBaseImageElement));
        actions.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProductBaseImageLeftScrollArrowElement), 20);
        driver.findElement(By.xpath(configProductBaseImageLeftScrollArrowElement)).click();
        return this;
    }

    //Config product right arrow scrolls
    public ConfigProductWithSpecialPriceDetailPage configProductScrollWithRightArrow() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProductBaseImageElement), 20);
        Actions actions = new Actions(driver);
        WebElement target = driver.findElement(By.xpath(configProductBaseImageElement));
        actions.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProductBaseImageRightScrollArrowElement), 100);
        driver.findElement(By.xpath(configProductBaseImageRightScrollArrowElement)).click();
        return this;
    }

    //Config Product thumbnail images clicks
    public ConfigProductWithSpecialPriceDetailPage clickEventOnFirstThumbnailImageConfigProduct() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProductFirstThumbnailImageElement), 20);
        driver.findElement(By.xpath(configProductFirstThumbnailImageElement)).click();
        return this;
    }

    public ConfigProductWithSpecialPriceDetailPage clickEventOnSecondImageConfigProduct() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProductSecondThumbnailImageElement), 20);
        driver.findElement(By.xpath(configProductSecondThumbnailImageElement)).click();
        return this;
    }

    public ConfigProductWithSpecialPriceDetailPage clickEventOnThirdImageConfigProduct() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProductThirdThumbnailImageElement), 20);
        driver.findElement(By.xpath(configProductThirdThumbnailImageElement)).click();
        return this;
    }

    public ConfigProductWithSpecialPriceDetailPage clickEventOnFourthImageConfigProduct() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProductFourthThumbnailImageElement), 20);
        driver.findElement(By.xpath(configProductFourthThumbnailImageElement)).click();
        return this;
    }

    public ConfigProductWithSpecialPriceDetailPage clickEventOnFifthImageConfigProduct() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProductFifthThumbnailImageElement), 20);
        driver.findElement(By.xpath(configProductFifthThumbnailImageElement)).click();
        return this;
    }

    public ConfigProductWithSpecialPriceDetailPage clickEventOnSixthImageConfigProduct() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProductSixthThumbnailImageElement), 20);
        driver.findElement(By.xpath(configProductSixthThumbnailImageElement)).click();
        return this;
    }

    public ConfigProductWithSpecialPriceDetailPage clickEventOnSeventhImageConfigProduct() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProductSeventhThumbnailImageElement), 20);
        driver.findElement(By.xpath(configProductSeventhThumbnailImageElement)).click();
        return this;
    }

    //Thumbnail images scroll arrows
    public ConfigProductWithSpecialPriceDetailPage clickEventOnThumbnailLowerScrollArrow() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProductThumbnailLowerScrollArrowElement), 20);
        driver.findElement(By.xpath(configProductThumbnailLowerScrollArrowElement)).click();
        return this;
    }

    public ConfigProductWithSpecialPriceDetailPage clickEventOnThumbnailUpperScrollArrow() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProductThumbnailUpperScrollArrowElement), 20);
        driver.findElement(By.xpath(configProductThumbnailUpperScrollArrowElement)).click();
        return this;
    }

    //Select config options from color dropdown
    public ConfigProductWithSpecialPriceDetailPage selectColorFromConfigProduct(String colorConfig) {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProductConfigOptionsNameElement), 100);
        Select color = new Select(driver.findElement(By.xpath(configProductConfigOptionsNameElement)));
        color.selectByVisibleText(colorConfig);
        return this;
    }

    //Add to cart button click event without selecting config option for config product
    public ConfigProductWithSpecialPriceDetailPage addToCartWithoutSelectingConfigOption() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(addToCartElement), 20);
        driver.findElement(By.xpath(addToCartElement)).click();
        return this;
    }

    // Assertions
    public boolean configProduct2NameIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProduct2NameElement), 20);
        String configProduct2Name= driver.findElement(By.xpath(configProduct2NameElement)).getText();
        if(configProduct2Name.equals("Test Configurable Product 2 - Special Price")){
            return true;
        }else{
            return false;
        }
    }

    public boolean configProduct2SpecialPriceIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProduct2SpecialPriceElement), 20);
        String configProduct2SpecialPrice= driver.findElement(By.xpath(configProduct2SpecialPriceElement)).getText();
        if(configProduct2SpecialPrice.equals("AED 105.84")){
            return true;
        }else{
            return false;
        }
    }

    public boolean configProduct2VatIncludedLabelIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProduct2VatIncludedLabelElement), 20);
        String configProduct2VatIncludedLabel = driver.findElement(By.xpath(configProduct2VatIncludedLabelElement)).getText();
        if(configProduct2VatIncludedLabel.equals("VAT included")){
            return true;
        }else{
            return false;
        }
    }

    public boolean configProduct2OriginalPriceIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProduct2OriginalPriceElement), 20);
        String configProduct2OriginalPrice = driver.findElement(By.xpath(configProduct2OriginalPriceElement)).getText();
        if(configProduct2OriginalPrice.equals("AED 787.85")){
            return true;
        }else{
            return false;
        }
    }

    public boolean configProduct2SaveLabelIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProduct2YouSaveLabelElement), 20);
        String configProduct2SaveLabel = driver.findElement(By.xpath(configProduct2YouSaveLabelElement)).getText();
        if(configProduct2SaveLabel.equals("You save")){
            return true;
        }else{
            return false;
        }
    }

    public boolean configProduct2SavePriceIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProduct2SavePriceElement), 20);
        String configProduct2SavePriceLabel = driver.findElement(By.xpath(configProduct2SavePriceElement)).getText();
        if(configProduct2SavePriceLabel.equals("AED 682")){
            return true;
        }else{
            return false;
        }
    }

    public boolean configProduct2SavePercentageIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProduct2SavePercentageValueElement), 20);
        String configProduct2SavePercentage = driver.findElement(By.xpath(configProduct2SavePercentageValueElement)).getText();
        if(configProduct2SavePercentage.equals("(87%)")){
            return true;
        }else{
            return false;
        }
    }

    public boolean product3SKULabelIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProduct2SkuTitleElement), 20);
        String productSKULabel = driver.findElement(By.xpath(configProduct2SkuTitleElement)).getText();
        if(productSKULabel.equals("SKU")){
            return true;
        }else{
            return false;
        }
    }

    public boolean product3SKUValueIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProduct2SkuValueElement), 20);
        String productSKUValue = driver.findElement(By.xpath(configProduct2SkuValueElement)).getText();
        if(productSKUValue.equals("TestConfigurableProduct2-SpecialPrice")){
            return true;
        }else{
            return false;
        }
    }

    public boolean product3BrandLabelIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProduct2BrandTitleElement), 20);
        String productBrandLabel = driver.findElement(By.xpath(configProduct2BrandTitleElement)).getText();
        if(productBrandLabel.equals("Brand")){
            return true;
        }else{
            return false;
        }
    }

    public boolean product3BrandValueIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProduct2BrandValueElement), 20);
        String productBrandValue = driver.findElement(By.xpath(configProduct2BrandValueElement)).getText();
        if(productBrandValue.equals("Baby Brezza")){
            return true;
        }else{
            return false;
        }
    }

    public boolean product3SizeAndAgeLabelIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProduct2SizeAgeTitleElement), 20);
        String productSizeAndAgeLabel = driver.findElement(By.xpath(configProduct2SizeAgeTitleElement)).getText();
        if(productSizeAndAgeLabel.equals("Size/Age")){
            return true;
        }else{
            return false;
        }
    }

    public boolean product3SizeAndAgeValueIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProduct2SizeAgeValueElement), 20);
        String productSizeAndAgeValue = driver.findElement(By.xpath(configProduct2SizeAgeValueElement)).getText();
        if(productSizeAndAgeValue.equals("35cm x 35cm, 50cm x 80cm, 80cm x 80cm")){
            return true;
        }else{
            return false;
        }
    }

    public boolean product3CollectionLabelIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProduct2CollectionTitleElement), 20);
        String productCollectionLabel = driver.findElement(By.xpath(configProduct2CollectionTitleElement)).getText();
        if(productCollectionLabel.equals("Collection")){
            return true;
        }else{
            return false;
        }
    }

    public boolean product3CollectionValueIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProduct2CollectionValueElement), 20);
        String productCollectionValue= driver.findElement(By.xpath(configProduct2CollectionValueElement)).getText();
        if(productCollectionValue.equals("Organic and Natural, Wooden, BPA Free, Rubber, Star Wars, Minions, Thunderbirds, Sprii Fashion, Last Chance DSF, Valentines, Double Giant Box, Organic Cotton, Ramadan Cookware, Ramadan Appliances, Single Pack, Architecture, City, Juniors, Minifigures, Unikitty, Jurassic World, Classic, The Lego Movie, Pants")){
            return true;
        }else{
            return false;
        }
    }

    public boolean guestUserFreeShippingLabelIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProduct2GuestFreeShippingTextElement), 20);
        String guestUserFreeShippingLabel= driver.findElement(By.xpath(configProduct2GuestFreeShippingTextElement)).getText();
        if(guestUserFreeShippingLabel.equals("FREE SHIPPING")){
            return true;
        }else{
            return false;
        }
    }

    public boolean guestUserOnAllOrderTextIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProduct2GuestOnAllOrdersElement), 20);
        String guestUserOnAllOrders= driver.findElement(By.xpath(configProduct2GuestOnAllOrdersElement)).getText();
        if(guestUserOnAllOrders.equals("On All Orders!")){
            return true;
        }else{
            return false;
        }
    }

    public boolean guestUserFreeReturnsLabelIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProduct2GuestFreeReturnsLabelElement), 20);
        String guestUserFreeReturnsLabel= driver.findElement(By.xpath(configProduct2GuestFreeReturnsLabelElement)).getText();
        if(guestUserFreeReturnsLabel.equals("FREE RETURNS")){
            return true;
        }else{
            return false;
        }
    }

    public boolean guestUserWithin7DaysTextIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProduct2GuestWithinDaysLabelElement), 20);
        String guestUserWithinDaysLabel= driver.findElement(By.xpath(configProduct2GuestWithinDaysLabelElement)).getText();
        if(guestUserWithinDaysLabel.equals("Within 7 Days")){
            return true;
        }else{
            return false;
        }
    }

    public boolean guestUserCashOnDeliveryLabelIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProduct2GuestCashOnDeliveryLabelElement), 20);
        String guestUserCashOnDeliveryLabel= driver.findElement(By.xpath(configProduct2GuestCashOnDeliveryLabelElement)).getText();
        if(guestUserCashOnDeliveryLabel.equals("CASH ON DELIVERY")){
            return true;
        }else{
            return false;
        }
    }

    public boolean guestUserAvailableLabelIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProduct2GuestAvailableLabelElement), 20);
        String guestUserAvailableLabel= driver.findElement(By.xpath(configProduct2GuestAvailableLabelElement)).getText();
        if(guestUserAvailableLabel.equals("Available")){
            return true;
        }else{
            return false;
        }
    }

    public boolean guestUserPriceMatchLabelIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProduct2GuestPriceMatchLabelElement), 20);
        String guestUserAvailableLabel= driver.findElement(By.xpath(configProduct2GuestPriceMatchLabelElement)).getText();
        if(guestUserAvailableLabel.equals("PRICE MATCH")){
            return true;
        }else{
            return false;
        }
    }

    public boolean guestUserOnAllProductsLabelIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProduct2GuestOnAllProductsLabelElement), 20);
        String guestUserOnAllProductsLabel= driver.findElement(By.xpath(configProduct2GuestOnAllProductsLabelElement)).getText();
        if(guestUserOnAllProductsLabel.equals("On All Products")){
            return true;
        }else{
            return false;
        }
    }

    public boolean guestUserCustomerAlsoBoughtTitleIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProduct2GuestCustomerAlsoBoughtSection), 20);
        String guestUserCustomerAlsoBoughtTitle= driver.findElement(By.xpath(configProduct2GuestCustomerAlsoBoughtSection)).getText();
        if(guestUserCustomerAlsoBoughtTitle.equals("CUSTOMERS ALSO BOUGHT:")){
            return true;
        }else{
            return false;
        }
    }
}
