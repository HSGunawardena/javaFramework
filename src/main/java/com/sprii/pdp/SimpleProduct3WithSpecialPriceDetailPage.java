package com.sprii.pdp;

import com.sprii.login.LoginPage;
import com.sprii.myaccount.MyWishListPage;
import com.sprii.plp.CartPage;
import com.sprii.shoppingcart.ShoppingCartPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.PropertyFileReader;
import utils.SpriiTestFramework;

public class SimpleProduct3WithSpecialPriceDetailPage {

    private WebDriver driver = SpriiTestFramework.getInstance().getDriver();
    private PropertyFileReader prop = new PropertyFileReader();

    private String addToCartElement = prop.getProperty("SimpleProduct3WithSpecialPriceDetailPage", "add.to.cart.element");
    private String addToWishListElement = prop.getProperty("SimpleProduct3WithSpecialPriceDetailPage", "add.to.wishlist.element");
    private String simpleProductBaseImageElement = prop.getProperty("SimpleProduct3WithSpecialPriceDetailPage", "simple.product.base.image.element");
    private String simpleProductBaseImageZoomElement = prop.getProperty("SimpleProduct3WithSpecialPriceDetailPage", "simple.product.base.image.zoom.element");
    private String simpleProductBaseImageLeftScrollArrowElement = prop.getProperty("SimpleProduct3WithSpecialPriceDetailPage", "simple.product.base.image.left.scroll.arrow.element");
    private String simpleProductBaseImageRightScrollArrowElement = prop.getProperty("SimpleProduct3WithSpecialPriceDetailPage", "simple.product.base.image.right.scroll.arrow.element");
    private String simpleProductFirstThumbnailImageElement = prop.getProperty("SimpleProduct3WithSpecialPriceDetailPage", "simple.product.first.thumbnail.image.element");
    private String simpleProductSecondThumbnailImageElement = prop.getProperty("SimpleProduct3WithSpecialPriceDetailPage", "simple.product.second.thumbnail.image.element");
    private String simpleProductThirdThumbnailImageElement = prop.getProperty("SimpleProduct3WithSpecialPriceDetailPage", "simple.product.third.thumbnail.image.element");
    private String simpleProductFourthThumbnailImageElement = prop.getProperty("SimpleProduct3WithSpecialPriceDetailPage", "simple.product.fourth.thumbnail.image.element");
    private String simpleProductFifthThumbnailImageElement = prop.getProperty("SimpleProduct3WithSpecialPriceDetailPage", "simple.product..fifth.thumbnail.image.element");

    //Any product add to cart button click
    public ShoppingCartPage addToCartButtonClick() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(addToCartElement), 20);
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
    public SimpleProduct3WithSpecialPriceDetailPage productScrollWithLeftArrow() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProductBaseImageElement), 20);
        Actions actions = new Actions(driver);
        WebElement target = driver.findElement(By.xpath(simpleProductBaseImageElement));
        actions.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProductBaseImageLeftScrollArrowElement), 20);
        driver.findElement(By.xpath(simpleProductBaseImageLeftScrollArrowElement)).click();
        return this;
    }

    //Simple Product right arrow scrolls
    public SimpleProduct3WithSpecialPriceDetailPage productScrollWithRightArrow() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProductBaseImageElement), 20);
        Actions actions = new Actions(driver);
        WebElement target = driver.findElement(By.xpath(simpleProductBaseImageElement));
        actions.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProductBaseImageRightScrollArrowElement), 20);
        driver.findElement(By.xpath(simpleProductBaseImageRightScrollArrowElement)).click();
        return this;
    }

    //Simple Product thumbnail images clicks
    public SimpleProduct3WithSpecialPriceDetailPage clickEventOnFirstThumbnailImage() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProductFirstThumbnailImageElement), 20);
        driver.findElement(By.xpath(simpleProductFirstThumbnailImageElement)).click();
        return this;
    }

    public SimpleProduct3WithSpecialPriceDetailPage clickEventOnSecondImage() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProductSecondThumbnailImageElement), 20);
        driver.findElement(By.xpath(simpleProductSecondThumbnailImageElement)).click();
        return this;
    }

    public SimpleProduct3WithSpecialPriceDetailPage clickEventOnThirdImage() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProductThirdThumbnailImageElement), 20);
        driver.findElement(By.xpath(simpleProductThirdThumbnailImageElement)).click();
        return this;
    }

    public SimpleProduct3WithSpecialPriceDetailPage clickEventOnFourthImage() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProductFourthThumbnailImageElement), 20);
        driver.findElement(By.xpath(simpleProductFourthThumbnailImageElement)).click();
        return this;
    }

    public SimpleProduct3WithSpecialPriceDetailPage clickEventOnFifthImage() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProductFifthThumbnailImageElement), 20);
        driver.findElement(By.xpath(simpleProductFifthThumbnailImageElement)).click();
        return this;
    }

    //Thumbnail images scroll arrows
//    public SimpleProduct3WithSpecialPriceDetailPage clickEventOnThumbnailLowerScrollArrow() {
//        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProductThumbnailLowerScrollArrowElement), 20);
//        driver.findElement(By.xpath(configProductThumbnailLowerScrollArrowElement)).click();
//        return this;
//    }

//    public SimpleProduct3WithSpecialPriceDetailPage clickEventOnThumbnailUpperScrollArrow() {
//        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProductThumbnailUpperScrollArrowElement), 20);
//        driver.findElement(By.xpath(configProductThumbnailUpperScrollArrowElement)).click();
//        return this;
//    }

    //Add to cart button click event without selecting config option for config product
    public SimpleProduct3WithSpecialPriceDetailPage addToCartWithoutSelectingConfigOption() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(addToCartElement), 20);
        driver.findElement(By.xpath(addToCartElement)).click();
        return this;
    }
}