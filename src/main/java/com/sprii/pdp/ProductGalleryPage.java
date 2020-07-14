package com.sprii.pdp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.PropertyFileReader;
import utils.SpriiTestFramework;

public class ProductGalleryPage {

    WebDriver driver = SpriiTestFramework.getInstance().getDriver();
    PropertyFileReader prop = new PropertyFileReader();

    String removeElement = prop.getProperty("ProductGalleryPage", "product.gallery.remove.element");
    String leftScrollArrowElement = prop.getProperty("ProductGalleryPage", "product.gallery.left.scroll.element");
    String rightScrollArrowElement = prop.getProperty("ProductGalleryPage", "product.gallery.right.scroll.element");
    String zoomInElement = prop.getProperty("ProductGalleryPage", "product.gallery.zoom.in.element");
    String zoomOutElement = prop.getProperty("ProductGalleryPage", "product.gallery.zoom.out.element");
    String firstImageElement = prop.getProperty("ProductGalleryPage", "product.gallery.first.image.click.element");
    String secondImageElement = prop.getProperty("ProductGalleryPage", "product.gallery.second.image.click.element");
    String thirdImageElement = prop.getProperty("ProductGalleryPage", "product.gallery.third.image.click.element");
    String fourthImageElement = prop.getProperty("ProductGalleryPage", "product.gallery.fourth.image.click.element");
    String fifthImageElement = prop.getProperty("ProductGalleryPage", "product.gallery.fifth.image.click.element");
    String sixthImageElement = prop.getProperty("ProductGalleryPage", "product.gallery.sixth.image.click.element");
    String seventhImageElement = prop.getProperty("ProductGalleryPage", "product.gallery.seventh.image.click.element");

    //Config product with original price product gallery remove
    public ConfigProductWithOriginalPriceDetailPage removeProductGalleryFromConfigProductWithOriginalPrice() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(firstImageElement), 20);
        Actions actions = new Actions(driver);
        WebElement target = driver.findElement(By.xpath(firstImageElement));
        actions.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(removeElement), 20);
        driver.findElement(By.xpath(removeElement)).click();
        return new ConfigProductWithOriginalPriceDetailPage();
    }

    //Config product with special price product gallery remove
    public ConfigProductWithSpecialPriceDetailPage removeProductGalleryFromConfigProductWithSpecialPrice() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(firstImageElement), 20);
        Actions actions = new Actions(driver);
        WebElement target = driver.findElement(By.xpath(firstImageElement));
        actions.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(removeElement), 20);
        driver.findElement(By.xpath(removeElement)).click();
        return new ConfigProductWithSpecialPriceDetailPage();
    }

    //Simple product 1 with original price product gallery remove
    public SimpleProduct1WithOriginalPriceDetailPage removeProductGalleryFromSimpleProduct1tWithOriginalPrice() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(firstImageElement), 20);
        Actions actions = new Actions(driver);
        WebElement target = driver.findElement(By.xpath(firstImageElement));
        actions.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(removeElement), 20);
        driver.findElement(By.xpath(removeElement)).click();
        return new SimpleProduct1WithOriginalPriceDetailPage();
    }

    //Simple product 3 with special price product gallery remove
    public SimpleProduct3WithSpecialPriceDetailPage removeProductGalleryFromSimpleProduct3tWithSpecialPrice() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(firstImageElement), 20);
        Actions actions = new Actions(driver);
        WebElement target = driver.findElement(By.xpath(firstImageElement));
        actions.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(removeElement), 20);
        driver.findElement(By.xpath(removeElement)).click();
        return new SimpleProduct3WithSpecialPriceDetailPage();
    }

    //Simple product 4 with original price product gallery remove
    public SimpleProduct4WithOriginalPriceDetailPage removeProductGalleryFromSimpleProduct4tWithOriginalPrice() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(firstImageElement), 20);
        Actions actions = new Actions(driver);
        WebElement target = driver.findElement(By.xpath(firstImageElement));
        actions.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(removeElement), 20);
        driver.findElement(By.xpath(removeElement)).click();
        return new SimpleProduct4WithOriginalPriceDetailPage();
    }

    //Simple product with special price product gallery remove
    public SimpleProductWithSpecialPriceDetailPage removeProductGalleryFromSimpleProducttWithSpecialPrice() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(firstImageElement), 20);
        Actions actions = new Actions(driver);
        WebElement target = driver.findElement(By.xpath(firstImageElement));
        actions.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(removeElement), 20);
        driver.findElement(By.xpath(removeElement)).click();
        return new SimpleProductWithSpecialPriceDetailPage();
    }

    //Scroll arrows
    public ProductGalleryPage clickOnLeftScrollArrow() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(firstImageElement), 20);
        Actions actions = new Actions(driver);
        WebElement target = driver.findElement(By.xpath(firstImageElement));
        actions.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(leftScrollArrowElement), 20);
        driver.findElement(By.xpath(leftScrollArrowElement)).click();
        return this;
    }

    public ProductGalleryPage clickOnRightScrollArrow() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(firstImageElement), 20);
        Actions actions = new Actions(driver);
        WebElement target = driver.findElement(By.xpath(firstImageElement));
        actions.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(rightScrollArrowElement), 20);
        driver.findElement(By.xpath(rightScrollArrowElement)).click();
        return this;
    }

    //Zoom in and out
    public ProductGalleryPage zoomIn() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(zoomInElement), 2000);
        driver.findElement(By.xpath(zoomInElement)).click();
        return this;
    }

    public ProductGalleryPage zoomOut() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(zoomOutElement), 2000);
        driver.findElement(By.xpath(zoomOutElement)).click();
        return this;
    }

    //Thumbnail image clicks
    public ProductGalleryPage firstImageClick() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(firstImageElement), 20);
        driver.findElement(By.xpath(firstImageElement)).click();
        return this;
    }

    public ProductGalleryPage secondImageClick() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(secondImageElement), 20);
        driver.findElement(By.xpath(secondImageElement)).click();
        return this;
    }

    public ProductGalleryPage thirdImageClick() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(thirdImageElement), 20);
        driver.findElement(By.xpath(thirdImageElement)).click();
        return this;
    }

    public ProductGalleryPage fourthImageClick() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(fourthImageElement), 20);
        driver.findElement(By.xpath(fourthImageElement)).click();
        return this;
    }

    public ProductGalleryPage fifthImageClick() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(fifthImageElement), 20);
        driver.findElement(By.xpath(fifthImageElement)).click();
        return this;
    }

    public ProductGalleryPage sixthImageClick() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(sixthImageElement), 20);
        driver.findElement(By.xpath(sixthImageElement)).click();
        return this;
    }

    public ProductGalleryPage seventhImageClick() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(seventhImageElement), 20);
        driver.findElement(By.xpath(seventhImageElement)).click();
        return this;
    }
}
