package com.sprii.pdp;

import com.sprii.login.LoginPage;
import com.sprii.myaccount.MyWishListPage;
import com.sprii.plp.CartPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.PropertyFileReader;
import utils.SpriiTestFramework;

public class SimpleProductWithSpecialPriceDetailPage {

    WebDriver driver = SpriiTestFramework.getInstance().getDriver();
    PropertyFileReader prop = new PropertyFileReader();

    String addToCartElement = prop.getProperty("SimpleProductWithSpecialPriceDetailPage", "add.to.cart.element");
    String addToWishListElement = prop.getProperty("SimpleProductWithSpecialPriceDetailPage", "add.to.wishlist.element");
    String simpleProductBaseImageElement = prop.getProperty("SimpleProductWithSpecialPriceDetailPage", "simple.product.base.image.element");
    String simpleProductBaseImageZoomElement = prop.getProperty("SimpleProductWithSpecialPriceDetailPage", "simple.product.base.image.zoom.element");
    String simpleProductBaseImageLeftScrollArrowElement = prop.getProperty("SimpleProductWithSpecialPriceDetailPage", "simple.product.base.image.left.scroll.arrow.element");
    String simpleProductBaseImageRightScrollArrowElement = prop.getProperty("SimpleProductWithSpecialPriceDetailPage", "simple.product.base.image.right.scroll.arrow.element");
    String simpleProductFirstThumbnailImageElement = prop.getProperty("SimpleProductWithSpecialPriceDetailPage", "simple.product.first.thumbnail.image.element");
    String simpleProductSecondThumbnailImageElement = prop.getProperty("SimpleProductWithSpecialPriceDetailPage", "simple.product.second.thumbnail.image.element");
    String simpleProductThirdThumbnailImageElement = prop.getProperty("SimpleProductWithSpecialPriceDetailPage", "simple.product.third.thumbnail.image.element");
    String simpleProductFourthThumbnailImageElement = prop.getProperty("SimpleProductWithSpecialPriceDetailPage", "simple.product.fourth.thumbnail.image.element");
    String simpleProductFifthThumbnailImageElement = prop.getProperty("SimpleProductWithSpecialPriceDetailPage", "simple.product..fifth.thumbnail.image.element");

    //Assertions
    String simpleProduct2NameElement = prop.getProperty("SimpleProductWithSpecialPriceDetailPage", "simple.product2.name.element");
    String simpleProduct2SpecialPriceElement = prop.getProperty("SimpleProductWithSpecialPriceDetailPage", "simple.product2.special.price.element");
    String simpleProduct2VatIncludedLabelElement = prop.getProperty("SimpleProductWithSpecialPriceDetailPage", "simple.product2.vat.included.label.element");
    String simpleProduct2OriginalPriceElement = prop.getProperty("SimpleProductWithSpecialPriceDetailPage", "simple.product2.original.price.element");
    String simpleProduct2YouSaveLabelElement = prop.getProperty("SimpleProductWithSpecialPriceDetailPage", "simple.product2.you.save.label.element");
    String simpleProduct2SavePriceElement = prop.getProperty("SimpleProductWithSpecialPriceDetailPage", "simple.product2.save.price.element");
    String simpleProduct2SavePercentageValueElement = prop.getProperty("SimpleProductWithSpecialPriceDetailPage", "simple.product2.save.percentage.value");
    String simpleProduct2SkuTitleElement = prop.getProperty("SimpleProductWithSpecialPriceDetailPage", "simple.product2.sku.title.element");
    String simpleProduct2SkuValueElement = prop.getProperty("SimpleProductWithSpecialPriceDetailPage", "simple.product2.sku.value.element");
    String simpleProduct2BrandTitleElement = prop.getProperty("SimpleProductWithSpecialPriceDetailPage", "simple.product2.brand.title.element");
    String simpleProduct2BrandValueElement = prop.getProperty("SimpleProductWithSpecialPriceDetailPage", "simple.product2.brand.value.element");
    String simpleProduct2SizeAgeTitleElement = prop.getProperty("SimpleProductWithSpecialPriceDetailPage", "simple.product2.size.age.title.element");
    String simpleProduct2SizeAgeValueElement = prop.getProperty("SimpleProductWithSpecialPriceDetailPage", "simple.product2.size.age.value.element");
    String simpleProduct2CollectionTitleElement = prop.getProperty("SimpleProductWithSpecialPriceDetailPage", "simple.product2.collection.title.element");
    String simpleProduct2CollectionValueElement = prop.getProperty("SimpleProductWithSpecialPriceDetailPage", "simple.product2.collection.value.element");
    String simpleProduct2GuestFreeShippingIconElement = prop.getProperty("SimpleProductWithSpecialPriceDetailPage", "simple.product2.guest.user.free.shipping.icon.element");
    String simpleProduct2GuestFreeShippingTextElement = prop.getProperty("SimpleProductWithSpecialPriceDetailPage", "simple.product2.guest.user.free.shipping.text.element");
    String simpleProduct2GuestOnAllOrdersElement = prop.getProperty("SimpleProductWithSpecialPriceDetailPage", "simple.product2.guest.user.on.all.orders.text.element");
    String simpleProduct2GuestFreeReturnsIconElement = prop.getProperty("SimpleProductWithSpecialPriceDetailPage", "simple.product2.guest.user.free.returns.icon.element");
    String simpleProduct2GuestFreeReturnsLabelElement = prop.getProperty("SimpleProductWithSpecialPriceDetailPage", "simple.product2.guest.user.free.returns.label.element");
    String simpleProduct2GuestWithinDaysLabelElement = prop.getProperty("SimpleProductWithSpecialPriceDetailPage", "simple.product2.guest.user.within.days.label.element");
    String simpleProduct21GuestCashOnDeliveryIconElement = prop.getProperty("SimpleProductWithSpecialPriceDetailPage", "simple.product2.guest.user.cash.on.delivery.icon.element");
    String simpleProduct2GuestCashOnDeliveryLabelElement = prop.getProperty("SimpleProductWithSpecialPriceDetailPage", "simple.product2.guest.user.cash.on.delivery.label.element");
    String simpleProduct2GuestAvailableLabelElement = prop.getProperty("SimpleProductWithSpecialPriceDetailPage", "simple.product2.guest.user.available.label.element");
    String simpleProduct2GuestPriceMatchIconElement = prop.getProperty("SimpleProductWithSpecialPriceDetailPage", "simple.product2.guest.user.price.match.icon.element");
    String simpleProduct2GuestPriceMatchLabelElement = prop.getProperty("SimpleProductWithSpecialPriceDetailPage", "simple.product2.guest.user.price.match.label.element");
    String simpleProduct2GuestOnAllProductsLabelElement = prop.getProperty("SimpleProductWithSpecialPriceDetailPage", "simple.product2.guest.user.on.all.products.label.element");
    String simpleProduct2GuestCustomerAlsoBoughtSection = prop.getProperty("SimpleProductWithSpecialPriceDetailPage", "simple.product2.customer.also.bought.label.element");

    //Any product add to cart button click
    public CartPage addToCartButtonClick() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(addToCartElement), 20);
        driver.findElement(By.xpath(addToCartElement)).click();
        return new CartPage();
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

    //Simple product zoom image
    public ProductGalleryPage zoomTheSimpleProduct() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProductBaseImageElement), 20);
        Actions actions = new Actions(driver);
        WebElement target = driver.findElement(By.xpath(simpleProductBaseImageElement));
        actions.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProductBaseImageZoomElement), 20);
        driver.findElement(By.xpath(simpleProductBaseImageZoomElement)).click();
        return new ProductGalleryPage();
    }

    //Simple Product left arrow scrolls
    public SimpleProductWithSpecialPriceDetailPage productScrollWithLeftArrow() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProductBaseImageElement), 20);
        Actions actions = new Actions(driver);
        WebElement target = driver.findElement(By.xpath(simpleProductBaseImageElement));
        actions.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProductBaseImageLeftScrollArrowElement), 20);
        driver.findElement(By.xpath(simpleProductBaseImageLeftScrollArrowElement)).click();
        return this;
    }

    //Simple Product right arrow scrolls
    public SimpleProductWithSpecialPriceDetailPage productScrollWithRightArrow() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProductBaseImageElement), 20);
        Actions actions = new Actions(driver);
        WebElement target = driver.findElement(By.xpath(simpleProductBaseImageElement));
        actions.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProductBaseImageRightScrollArrowElement), 20);
        driver.findElement(By.xpath(simpleProductBaseImageRightScrollArrowElement)).click();
        return this;
    }

    //Simple Product thumbnail images clicks
    public SimpleProductWithSpecialPriceDetailPage clickEventOnFirstThumbnailImage() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProductFirstThumbnailImageElement), 20);
        driver.findElement(By.xpath(simpleProductFirstThumbnailImageElement)).click();
        return this;
    }

    public SimpleProductWithSpecialPriceDetailPage clickEventOnSecondImage() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProductSecondThumbnailImageElement), 20);
        driver.findElement(By.xpath(simpleProductSecondThumbnailImageElement)).click();
        return this;
    }

    public SimpleProductWithSpecialPriceDetailPage clickEventOnThirdImage() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProductThirdThumbnailImageElement), 20);
        driver.findElement(By.xpath(simpleProductThirdThumbnailImageElement)).click();
        return this;
    }

    public SimpleProductWithSpecialPriceDetailPage clickEventOnFourthImage() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProductFourthThumbnailImageElement), 20);
        driver.findElement(By.xpath(simpleProductFourthThumbnailImageElement)).click();
        return this;
    }

    public SimpleProductWithSpecialPriceDetailPage clickEventOnFifthImage() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProductFifthThumbnailImageElement), 20);
        driver.findElement(By.xpath(simpleProductFifthThumbnailImageElement)).click();
        return this;
    }

    //Thumbnail images scroll arrows
//    public SimpleProductWithSpecialPriceDetailPage clickEventOnThumbnailLowerScrollArrow() {
//        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProductThumbnailLowerScrollArrowElement), 20);
//        driver.findElement(By.xpath(configProductThumbnailLowerScrollArrowElement)).click();
//        return this;
//    }

//    public SimpleProductWithSpecialPriceDetailPage clickEventOnThumbnailUpperScrollArrow() {
//        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProductThumbnailUpperScrollArrowElement), 20);
//        driver.findElement(By.xpath(configProductThumbnailUpperScrollArrowElement)).click();
//        return this;
//    }

    //Add to cart button click event without selecting config option for config product
    public SimpleProductWithSpecialPriceDetailPage addToCartWithoutSelectingConfigOption() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(addToCartElement), 20);
        driver.findElement(By.xpath(addToCartElement)).click();
        return this;
    }

    // Assertions
    public boolean simpleProduct2NameIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProduct2NameElement), 20);
        String simpleProduct2Name= driver.findElement(By.xpath(simpleProduct2NameElement)).getText();
        if(simpleProduct2Name.equals("Test Simple Product - Special Price")){
            return true;
        }else{
            return false;
        }
    }

    public boolean simpleProduct2SpecialPriceIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProduct2SpecialPriceElement), 20);
        String simpleProduct2SpecialPrice= driver.findElement(By.xpath(simpleProduct2SpecialPriceElement)).getText();
        if(simpleProduct2SpecialPrice.equals("AED 95.03")){
            return true;
        }else{
            return false;
        }
    }

    public boolean simpleProduct2VatIncludedLabelIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProduct2VatIncludedLabelElement), 20);
        String simpleProduct2VatIncludedLabel = driver.findElement(By.xpath(simpleProduct2VatIncludedLabelElement)).getText();
        if(simpleProduct2VatIncludedLabel.equals("VAT included")){
            return true;
        }else{
            return false;
        }
    }

    public boolean simpleProduct2OriginalPriceIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProduct2OriginalPriceElement), 20);
        String simpleProduct2OriginalPrice = driver.findElement(By.xpath(simpleProduct2OriginalPriceElement)).getText();
        if(simpleProduct2OriginalPrice.equals("AED 210")){
            return true;
        }else{
            return false;
        }
    }

    public boolean simpleProduct2SaveLabelIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProduct2YouSaveLabelElement), 20);
        String simpleProduct2SaveLabel = driver.findElement(By.xpath(simpleProduct2YouSaveLabelElement)).getText();
        if(simpleProduct2SaveLabel.equals("You save")){
            return true;
        }else{
            return false;
        }
    }

    public boolean simpleProduct2SavePriceIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProduct2SavePriceElement), 20);
        String simpleProduct2SavePrice = driver.findElement(By.xpath(simpleProduct2SavePriceElement)).getText();
        if(simpleProduct2SavePrice.equals("AED 115")){
            return true;
        }else{
            return false;
        }
    }

    public boolean simpleProduct2SavePercentageIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProduct2SavePercentageValueElement), 20);
        String simpleProduct2SavePercentage = driver.findElement(By.xpath(simpleProduct2SavePercentageValueElement)).getText();
        if(simpleProduct2SavePercentage.equals("(55%)")){
            return true;
        }else{
            return false;
        }
    }

    public boolean product2SKULabelIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProduct2SkuTitleElement), 20);
        String productSKULabel = driver.findElement(By.xpath(simpleProduct2SkuTitleElement)).getText();
        if(productSKULabel.equals("SKU")){
            return true;
        }else{
            return false;
        }
    }

    public boolean product2SKUValueIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProduct2SkuValueElement), 20);
        String productSKUValue = driver.findElement(By.xpath(simpleProduct2SkuValueElement)).getText();
        if(productSKUValue.equals("TestSimpleProduct-OriginalPrice")){
            return true;
        }else{
            return false;
        }
    }

    public boolean product2BrandLabelIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProduct2BrandTitleElement), 20);
        String productBrandLabel = driver.findElement(By.xpath(simpleProduct2BrandTitleElement)).getText();
        if(productBrandLabel.equals("Brand")){
            return true;
        }else{
            return false;
        }
    }

    public boolean product2BrandValueIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProduct2BrandValueElement), 20);
        String productBrandValue = driver.findElement(By.xpath(simpleProduct2BrandValueElement)).getText();
        if(productBrandValue.equals("Nerf Supersoaker")){
            return true;
        }else{
            return false;
        }
    }

    public boolean product2SizeAndAgeLabelIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProduct2SizeAgeTitleElement), 20);
        String productSizeAndAgeLabel = driver.findElement(By.xpath(simpleProduct2SizeAgeTitleElement)).getText();
        if(productSizeAndAgeLabel.equals("Size/Age")){
            return true;
        }else{
            return false;
        }
    }

    public boolean product2SizeAndAgeValueIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProduct2SizeAgeValueElement), 20);
        String productSizeAndAgeValue = driver.findElement(By.xpath(simpleProduct2SizeAgeValueElement)).getText();
        if(productSizeAndAgeValue.equals("25cm x 30cm, 50cm x 80cm")){
            return true;
        }else{
            return false;
        }
    }

    public boolean product2CollectionLabelIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProduct2CollectionTitleElement), 20);
        String productCollectionLabel = driver.findElement(By.xpath(simpleProduct2CollectionTitleElement)).getText();
        if(productCollectionLabel.equals("Collection")){
            return true;
        }else{
            return false;
        }
    }

    public boolean product2CollectionValueIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProduct2CollectionValueElement), 20);
        String productCollectionValue= driver.findElement(By.xpath(simpleProduct2CollectionValueElement)).getText();
        if(productCollectionValue.equals("Premium Care, Baby-Dry, Embroidery, Animals")){
            return true;
        }else{
            return false;
        }
    }

    public boolean guestUserFreeShippingLabelIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProduct2GuestFreeShippingTextElement), 20);
        String guestUserFreeShippingLabel= driver.findElement(By.xpath(simpleProduct2GuestFreeShippingTextElement)).getText();
        if(guestUserFreeShippingLabel.equals("FREE SHIPPING")){
            return true;
        }else{
            return false;
        }
    }

    public boolean guestUserOnAllOrderTextIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProduct2GuestOnAllOrdersElement), 20);
        String guestUserOnAllOrders= driver.findElement(By.xpath(simpleProduct2GuestOnAllOrdersElement)).getText();
        if(guestUserOnAllOrders.equals("On All Orders!")){
            return true;
        }else{
            return false;
        }
    }

    public boolean guestUserFreeReturnsLabelIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProduct2GuestFreeReturnsLabelElement), 20);
        String guestUserFreeReturnsLabel= driver.findElement(By.xpath(simpleProduct2GuestFreeReturnsLabelElement)).getText();
        if(guestUserFreeReturnsLabel.equals("FREE RETURNS")){
            return true;
        }else{
            return false;
        }
    }

    public boolean guestUserWithin7DaysTextIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProduct2GuestWithinDaysLabelElement), 20);
        String guestUserWithinDaysLabel= driver.findElement(By.xpath(simpleProduct2GuestWithinDaysLabelElement)).getText();
        if(guestUserWithinDaysLabel.equals("Within 7 Days")){
            return true;
        }else{
            return false;
        }
    }

    public boolean guestUserCashOnDeliveryLabelIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProduct2GuestCashOnDeliveryLabelElement), 20);
        String guestUserCashOnDeliveryLabel= driver.findElement(By.xpath(simpleProduct2GuestCashOnDeliveryLabelElement)).getText();
        if(guestUserCashOnDeliveryLabel.equals("CASH ON DELIVERY")){
            return true;
        }else{
            return false;
        }
    }

    public boolean guestUserAvailableLabelIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProduct2GuestAvailableLabelElement), 20);
        String guestUserAvailableLabel= driver.findElement(By.xpath(simpleProduct2GuestAvailableLabelElement)).getText();
        if(guestUserAvailableLabel.equals("Available")){
            return true;
        }else{
            return false;
        }
    }

    public boolean guestUserPriceMatchLabelIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProduct2GuestPriceMatchLabelElement), 20);
        String guestUserAvailableLabel= driver.findElement(By.xpath(simpleProduct2GuestPriceMatchLabelElement)).getText();
        if(guestUserAvailableLabel.equals("PRICE MATCH")){
            return true;
        }else{
            return false;
        }
    }

    public boolean guestUserOnAllProductsLabelIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProduct2GuestOnAllProductsLabelElement), 20);
        String guestUserOnAllProductsLabel= driver.findElement(By.xpath(simpleProduct2GuestOnAllProductsLabelElement)).getText();
        if(guestUserOnAllProductsLabel.equals("On All Products")){
            return true;
        }else{
            return false;
        }
    }

    public boolean guestUserCustomerAlsoBoughtTitleIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProduct2GuestCustomerAlsoBoughtSection), 20);
        String guestUserCustomerAlsoBoughtTitle= driver.findElement(By.xpath(simpleProduct2GuestCustomerAlsoBoughtSection)).getText();
        if(guestUserCustomerAlsoBoughtTitle.equals("CUSTOMERS ALSO BOUGHT:")){
            return true;
        }else{
            return false;
        }
    }
}
