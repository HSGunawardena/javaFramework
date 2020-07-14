package com.sprii.header;

import com.sprii.home.HomePage;
import com.sprii.login.CreateAnAccount;
import com.sprii.login.LoginPage;
import com.sprii.login.LogoutSuccessPage;
import com.sprii.minicart.MiniCartPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.PropertyFileReader;
import utils.SpriiTestFramework;

public class Header {

    WebDriver driver = SpriiTestFramework.getInstance().getDriver();
    PropertyFileReader prop = new PropertyFileReader();

    String arabicHomePageElement = prop.getProperty("Header", "arabic.home.page.element");
    String uaeCountryElement = prop.getProperty("Header", "uae.country.element");
    String ksaCountryElement = prop.getProperty("Header", "ksa.country.element");
    String bhCountryElement = prop.getProperty("Header", "bh.country.element");
    String kwCountryElement = prop.getProperty("Header", "kw.country.element");
    String createAnAccountLinkElement = prop.getProperty("Header", "create.an.account.link.element");
    String signInElement = prop.getProperty("Header", "sign.in.element");
    String miniCartElement = prop.getProperty("Header", "mini.cart.element");
    String spriiLogoElement = prop.getProperty("Header", "sprii.logo.element");
    String logoutElement = prop.getProperty("Header", "logout.element");

    //Assertions
    String freeShippingOnAllOrdersLabelElement = prop.getProperty("Header", "free.shipping.on.all.orders.label.element");
    String priceMatchGuaranteeLabelElement = prop.getProperty("Header", "price.match.guarantee.label.element");
    String spriiComEverythingForMumLabelElement = prop.getProperty("Header", "sprii.com.everything.for.mums.element");

    public ArabicHomePage homeArabicLink() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(arabicHomePageElement), 20);
        driver.findElement(By.xpath(arabicHomePageElement)).click();
        return new ArabicHomePage();
    }

    public SAHomePgae redirectToSAHome() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(uaeCountryElement), 20);
        Actions actions = new Actions(driver);
        WebElement target = driver.findElement(By.xpath(uaeCountryElement));
        actions.moveToElement(target).perform();

        SpriiTestFramework.getInstance().waitForElement(By.linkText(ksaCountryElement), 50);
        driver.findElement(By.linkText(ksaCountryElement)).click();
        return new SAHomePgae();
    }

    public BHHomePage redirectToBHHome() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(uaeCountryElement), 100);
        Actions actions = new Actions(driver);
        WebElement target = driver.findElement(By.xpath(uaeCountryElement));
        actions.moveToElement(target).perform();

        SpriiTestFramework.getInstance().waitForElement(By.xpath(bhCountryElement), 100);
        driver.findElement(By.xpath(bhCountryElement)).click();
        return new BHHomePage();
    }

    public KWHomePage redirectToKWHome() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(uaeCountryElement), 100);
        Actions actions = new Actions(driver);
        WebElement target = driver.findElement(By.xpath(uaeCountryElement));
        actions.moveToElement(target).perform();

        SpriiTestFramework.getInstance().waitForElement(By.xpath(kwCountryElement), 100);
        driver.findElement(By.xpath(kwCountryElement)).click();
        return new KWHomePage();
    }

    public CreateAnAccount redirectingToCreateAnAccount() {
        SpriiTestFramework.getInstance().waitForElement(By.linkText(createAnAccountLinkElement), 20);
        driver.findElement(By.linkText(createAnAccountLinkElement)).click();
        return new CreateAnAccount();
    }

    public LoginPage redirectToSignInPage() {
        SpriiTestFramework.getInstance().waitForElement(By.linkText(signInElement), 20);
        driver.findElement(By.linkText(signInElement)).click();
        return new LoginPage();
    }

    public Header expandEmptyMiniCart() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(miniCartElement), 20);
        driver.findElement(By.xpath(miniCartElement)).click();
        return this;
    }

    public MiniCartPage expandMiniCartWithProducts() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(miniCartElement), 20);
        driver.findElement(By.xpath(miniCartElement)).click();
        return new MiniCartPage();
    }

    //Logo click event from other pages besides home page
    public HomePage clickOnLogoFromOtherPages() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(spriiLogoElement), 20);
        driver.findElement(By.xpath(spriiLogoElement)).click();
        return new HomePage();
    }

    //Logo click from home page
    public Header clickOnLogoFromHomePage() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(spriiLogoElement), 20);
        driver.findElement(By.xpath(spriiLogoElement)).click();
        return this;
    }

    //User logout
    public LogoutSuccessPage clickLogout() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(logoutElement), 1000);
        driver.findElement(By.xpath(logoutElement)).click();
        return new LogoutSuccessPage();
    }

    //Assertions
    public boolean freeShippingOnAllOrdersTitleIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(freeShippingOnAllOrdersLabelElement), 20);
        String freeShippingOnAllOrdersTitle = driver.findElement(By.xpath(freeShippingOnAllOrdersLabelElement)).getText();
        if (freeShippingOnAllOrdersTitle.equals("FREE SHIPPING ON ALL ORDERS! THERE'S NO CATCH!")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean priceMatchGuaranteeTitleIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(priceMatchGuaranteeLabelElement), 1000);
        String priceMatchGuaranteeTitle = driver.findElement(By.xpath(priceMatchGuaranteeLabelElement)).getText();
        if (priceMatchGuaranteeTitle.equals("PRICE MATCH GUARANTEE")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean spriiComEverythingForMumsTitleIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(spriiComEverythingForMumLabelElement), 20);
        String spriiComEverythingForMumTitle = driver.findElement(By.xpath(spriiComEverythingForMumLabelElement)).getText();
        if (spriiComEverythingForMumTitle.equals("Sprii.com, Everything for Mums")) {
            return true;
        } else {
            return false;
        }
    }
}


