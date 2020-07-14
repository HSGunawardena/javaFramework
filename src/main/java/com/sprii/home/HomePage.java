package com.sprii.home;

import com.sprii.navigate.diapering.DiaperingPage;
import com.sprii.navigate.feeding.FeedingPage;
import com.sprii.navigate.mums.MumsPage;
import com.sprii.navigate.toys.ToysPage;
import com.sprii.pdp.*;
import com.sprii.plp.CartPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.PropertyFileReader;
import utils.SpriiTestFramework;

public class HomePage {

    WebDriver driver = SpriiTestFramework.getInstance().getDriver();
    PropertyFileReader prop = new PropertyFileReader();

    String simpleProduct1WithOriginalPriceImageElement = prop.getProperty("HomePage", "simple.product1.with.original.price.image.element");
    String simpleProduct1WithOriginalPriceNameElement = prop.getProperty("HomePage", "simple.product1.with.original.price.name.element");
    String simpleProduct1WithOriginalPriceAddToCartButtonElement = prop.getProperty("HomePage", "simple.product1.with.original.price.add.to.cart.button.element");
    String simpleProduct2WithSpecialPriceImageElement = prop.getProperty("HomePage", "simple.product2.with.special.price.image.element");
    String simpleProduct21WithSpecialPriceNameElement = prop.getProperty("HomePage", "simple.product2.with.special.price.name.element");
    String simpleProduct2WithSpecialPriceAddToCartButtonElement = prop.getProperty("HomePage", "simple.product2.with.special.price.add.to.cart.button.element");
    String configProduct1WithOriginalPriceImageElement = prop.getProperty("HomePage", "config.product1.with.original.price.image.element");
    String configProduct1WithOriginalPriceNameElement = prop.getProperty("HomePage", "config.product1.with.original.price.name.element");
    String configProduct1WithOriginalPriceAddToCartButtonElement = prop.getProperty("HomePage", "config.product1.with.original.price.add.to.cart.button.element");
    String configProduct2WithSpecialPriceImageElement = prop.getProperty("HomePage", "config.product2.with.special.price.image.element");
    String configProduct21WithSpecialPriceNameElement = prop.getProperty("HomePage", "config.product2.with.special.price.name.element");
    String configProduct2WithSpecialPriceAddToCartButtonElement = prop.getProperty("HomePage", "config.product2.with.special.price.add.to.cart.button.element");
    String simpleProduct3WithSpecialPriceImageElement = prop.getProperty("HomePage", "simple.product3.with.special.price.image.element");
    String simpleProduct31WithSpecialPriceNameElement = prop.getProperty("HomePage", "simple.product3.with.special.price.name.element");
    String simpleProduct3WithSpecialPriceAddToCartButtonElement = prop.getProperty("HomePage", "simple.product3.with.special.price.add.to.cart.button.element");
    String simpleProduct4WithOriginalPriceImageElement = prop.getProperty("HomePage", "simple.product4.with.original.price.image.element");
    String simpleProduct4WithOriginalPriceNameElement = prop.getProperty("HomePage", "simple.product4.with.original.price.name.element");
    String simpleProduct4WithOriginalPriceAddToCartButtonElement = prop.getProperty("HomePage", "simple.product4.with.original.price.add.to.cart.button.element");
    String showAllBestSellersElement = prop.getProperty("HomePage", "show.all.best.sellers.element");
    String showAllToysAndOutdoorsElement = prop.getProperty("HomePage", "show.all.toys.and.outdoors.element");
    String showAllDiaperingElement = prop.getProperty("HomePage", "show.all.diapering.element");
    String showAllMumsElement = prop.getProperty("HomePage", "show.all.mums.element");
    String showAllAtHomeElement = prop.getProperty("HomePage", "show.all.at.home.element");
    String showAllFeedingElement = prop.getProperty("HomePage", "show.all.feeding.element");
    String showAllBabyEssentialsElement = prop.getProperty("HomePage", "show.all.baby.essentials.element");
    String showAllBabyGearElement = prop.getProperty("HomePage", "show.all.baby.gear.element");

    //Assertions
    String heading1Element = prop.getProperty("HomePage", "heading1.content.element");
    String heading2Element = prop.getProperty("HomePage", "heading2.content.element");
    String content1Element = prop.getProperty("HomePage", "content1.element");
    String content2Element = prop.getProperty("HomePage", "content2.element");
    String content3Element = prop.getProperty("HomePage", "content3.element");

    //Simple product 1 with original price Image click
    public SimpleProduct1WithOriginalPriceDetailPage clickOnSimpleProduct1Image() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProduct1WithOriginalPriceImageElement), 20);
        driver.findElement(By.xpath(simpleProduct1WithOriginalPriceImageElement)).click();
        return new SimpleProduct1WithOriginalPriceDetailPage();
    }

    //Simple product 1 with original price Name click
    public SimpleProduct1WithOriginalPriceDetailPage clickOnSimpleProduct1Name() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProduct1WithOriginalPriceNameElement), 20);
        driver.findElement(By.xpath(simpleProduct1WithOriginalPriceNameElement)).click();
        return new SimpleProduct1WithOriginalPriceDetailPage();
    }

    //Simple product 1 with original price add to cart button click
    public CartPage clickOnSimpleProduct1AddToCartButton() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProduct1WithOriginalPriceAddToCartButtonElement), 20);
        driver.findElement(By.xpath(simpleProduct1WithOriginalPriceAddToCartButtonElement)).click();
        return new CartPage();
    }

    //Simple product 2 with special price Image click
    public SimpleProductWithSpecialPriceDetailPage clickOnSimpleProduct2Image() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProduct2WithSpecialPriceImageElement), 20);
        driver.findElement(By.xpath(simpleProduct2WithSpecialPriceImageElement)).click();
        return new SimpleProductWithSpecialPriceDetailPage();
    }

    //Simple product 2 with special price Name click
    public SimpleProductWithSpecialPriceDetailPage clickOnSimpleProduct2Name() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProduct21WithSpecialPriceNameElement), 20);
        driver.findElement(By.xpath(simpleProduct21WithSpecialPriceNameElement)).click();
        return new SimpleProductWithSpecialPriceDetailPage();
    }

    //Simple product 2 with special price add to cart button click
    public CartPage clickOnSimpleProduct2AddToCartButton() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProduct2WithSpecialPriceAddToCartButtonElement), 20);
        driver.findElement(By.xpath(simpleProduct2WithSpecialPriceAddToCartButtonElement)).click();
        return new CartPage();
    }

    //Config product 1 with original price Image click
    public ConfigProductWithOriginalPriceDetailPage clickOnConfigProduct1Image() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProduct1WithOriginalPriceImageElement), 20);
        driver.findElement(By.xpath(configProduct1WithOriginalPriceImageElement)).click();
        return new ConfigProductWithOriginalPriceDetailPage();
    }

    //Config product 1 with original price Name click
    public ConfigProductWithOriginalPriceDetailPage clickOnConfigProduct1Name() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProduct1WithOriginalPriceNameElement), 20);
        driver.findElement(By.xpath(configProduct1WithOriginalPriceNameElement)).click();
        return new ConfigProductWithOriginalPriceDetailPage();
    }

    //Config product 1 with original price add to cart button click
    public ConfigProductWithOriginalPriceDetailPage clickOnConfigProduct1AddToCartButton() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProduct1WithOriginalPriceAddToCartButtonElement), 20);
        driver.findElement(By.xpath(configProduct1WithOriginalPriceAddToCartButtonElement)).click();
        return new ConfigProductWithOriginalPriceDetailPage();
    }

    //Config product 2 with special price Image click
    public ConfigProductWithSpecialPriceDetailPage clickOnConfigProduct2Image() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProduct2WithSpecialPriceImageElement), 20);
        driver.findElement(By.xpath(configProduct1WithOriginalPriceImageElement)).click();
        return new ConfigProductWithSpecialPriceDetailPage();
    }

    //Config product 2 with special price Name click
    public ConfigProductWithSpecialPriceDetailPage clickOnConfigProduct2Name() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProduct21WithSpecialPriceNameElement), 20);
        driver.findElement(By.xpath(configProduct21WithSpecialPriceNameElement)).click();
        return new ConfigProductWithSpecialPriceDetailPage();
    }

    //Config product 2 with special price add to cart button click
    public ConfigProductWithSpecialPriceDetailPage clickOnConfigProduct2AddToCartButton() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProduct2WithSpecialPriceAddToCartButtonElement), 20);
        driver.findElement(By.xpath(configProduct2WithSpecialPriceAddToCartButtonElement)).click();
        return new ConfigProductWithSpecialPriceDetailPage();
    }

    //Simple product 3 with special price Image click
    public SimpleProduct3WithSpecialPriceDetailPage clickOnSimpleProduct3Image() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProduct3WithSpecialPriceImageElement), 20);
        driver.findElement(By.xpath(simpleProduct3WithSpecialPriceImageElement)).click();
        return new SimpleProduct3WithSpecialPriceDetailPage();
    }

    //Simple product 3 with special price Name click
    public SimpleProduct3WithSpecialPriceDetailPage clickOnSimpleProduct3Name() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProduct31WithSpecialPriceNameElement), 20);
        driver.findElement(By.xpath(simpleProduct31WithSpecialPriceNameElement)).click();
        return new SimpleProduct3WithSpecialPriceDetailPage();
    }

    //Simple product 3 with special price add to cart button click
    public CartPage clickOnSimpleProduct3AddToCartButton() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProduct3WithSpecialPriceAddToCartButtonElement), 20);
        driver.findElement(By.xpath(simpleProduct3WithSpecialPriceAddToCartButtonElement)).click();
        return new CartPage();
    }

    //Simple product 4 with original price Image click
    public SimpleProduct4WithOriginalPriceDetailPage clickOnSimpleProduct4Image() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProduct4WithOriginalPriceImageElement), 20);
        driver.findElement(By.xpath(simpleProduct4WithOriginalPriceImageElement)).click();
        return new SimpleProduct4WithOriginalPriceDetailPage();
    }

    //Simple product 4 with original price Name click
    public SimpleProduct4WithOriginalPriceDetailPage clickOnSimpleProduct4Name() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProduct4WithOriginalPriceNameElement), 20);
        driver.findElement(By.xpath(simpleProduct4WithOriginalPriceNameElement)).click();
        return new SimpleProduct4WithOriginalPriceDetailPage();
    }

    //Simple product 4 with original price add to cart button click
    public CartPage clickOnSimpleProduct4AddToCartButton() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProduct4WithOriginalPriceAddToCartButtonElement), 20);
        driver.findElement(By.xpath(simpleProduct4WithOriginalPriceAddToCartButtonElement)).click();
        return new CartPage();
    }

    //Show all link on Best Sellers
    public SpriiTopPicksCategory showAllBestSellersLink() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(showAllBestSellersElement), 20);
        driver.findElement(By.xpath(showAllBestSellersElement)).click();
        return new SpriiTopPicksCategory();
    }

    //Show all link on ToysAndOutDoors
    public ToysPage showAllToysAndOutDoorsLink() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(showAllToysAndOutdoorsElement), 20);
        driver.findElement(By.xpath(showAllToysAndOutdoorsElement)).click();
        return new ToysPage();
    }

    //Show all link on Diapering
    public DiaperingPage showAllDiaperingLink() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(showAllDiaperingElement), 20);
        driver.findElement(By.xpath(showAllDiaperingElement)).click();
        return new DiaperingPage();
    }

    //Show all link on Mums
    public MumsPage showAllMumsLink() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(showAllMumsElement), 20);
        driver.findElement(By.xpath(showAllMumsElement)).click();
        return new MumsPage();
    }

    //Show all link on At Home
    public HomeCategory showAllAtHomeLink() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(showAllAtHomeElement), 20);
        driver.findElement(By.xpath(showAllAtHomeElement)).click();
        return new HomeCategory();
    }

    //Show all link on At Feeding
    public FeedingPage showAllFeedingLink() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(showAllFeedingElement), 20);
        driver.findElement(By.xpath(showAllFeedingElement)).click();
        return new FeedingPage();
    }

    //Show all link on Baby Essentials
    public BabyEssentialsCategory showAllBabyEssentialsLink() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(showAllBabyEssentialsElement), 20);
        driver.findElement(By.xpath(showAllBabyEssentialsElement)).click();
        return new BabyEssentialsCategory();
    }

    //Show all link on Baby Gear
    public BabyGearCategory showAllBabyGearLink() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(showAllBabyGearElement), 20);
        driver.findElement(By.xpath(showAllBabyGearElement)).click();
        return new BabyGearCategory();
    }

    //Assertions
    public boolean contentHeading1IsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(heading1Element), 20);
        String contentHeading1 = driver.findElement(By.xpath(heading1Element)).getText();
        if (contentHeading1.equals("The Sprii.com Online Baby Shop")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean contentHeading2IsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(heading2Element), 20);
        String contentHeading2 = driver.findElement(By.xpath(heading2Element)).getText();
        if (contentHeading2.equals("EVERYTHING FOR MUMS IN DUBAI, UAE")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean content1IsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(content1Element), 20);
        String content1 = driver.findElement(By.xpath(content1Element)).getText();
        if (content1.equals("Welcome to Sprii.com, the #1 shopping spree destination providing Everything For Mums in the Middle East! If this sounds like the " +
                "place for you, then read on and find out just what we’re all about…")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean content2IsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(content2Element), 20);
        String content2 = driver.findElement(By.xpath(content2Element)).getText();
        if (content2.equals("Our ethos is a simple one - to make life as easy as possible for busy mums. Shop for best baby products from over 1000 major" +
                " international brands in one place, right from your screen so you don’t have to spend hours combing through many shops for the perfect item. " +
                "We have everything you need to help you make your life easy and your baby’s life more comfortable and safe. Find everything on your baby’s checklist " +
                "within minutes at the comfort of your own home with Sprii - the number one online baby shop in UAE.")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean content3IsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(content3Element), 20);
        String content3 = driver.findElement(By.xpath(content3Element)).getText();
        if (content3.equals("Whether you want to discover the latest products to help you bloom during your pregnancy, stock up on baby essentials, kit " +
                "yourself out for pre-natal Yoga, create fun family moments together in the kitchen, or you just want to treat yourself for a random shopping spree, " +
                "Sprii.com has got you covered. We’re very glad to have you here, go on indulge in your much deserved shopping spree!")) {
            return true;
        } else {
            return false;
        }
    }

}
