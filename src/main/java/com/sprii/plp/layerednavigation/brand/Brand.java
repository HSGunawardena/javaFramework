package com.sprii.plp.layerednavigation.brand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.PropertyFileReader;
import utils.SpriiTestFramework;

public class Brand {

    WebDriver driver = SpriiTestFramework.getInstance().getDriver();
    PropertyFileReader prop = new PropertyFileReader();

    String brandTabElement = prop.getProperty("Brand", "brand.tab.element");
    String brandTabBabyAliveElement = prop.getProperty("Brand", "brand.tab.baby.alive.element");
    String brandTabBabyBrezzaElement = prop.getProperty("Brand", "brand.tab.baby.brezza.element");
    String brandTabBabyDiorElement = prop.getProperty("Brand", "brand.tab.baby.dior.element");
    String brandTabNerfSupersoakerElement = prop.getProperty("Brand", "brand.tab.nerf.supersoaker.element");
    String brandTabOliveBabiesElement = prop.getProperty("Brand", "brand.tab.olive.babies.element");
    String brandTabPetinoElement = prop.getProperty("Brand", "brand.tab.petino.element");

    //remove elements
    String removeBrandTabBabyAliveElement = prop.getProperty("Brand", "remove.baby.alive.brand.element");
    String removeBrandTabBabyBrezzaElement = prop.getProperty("Brand", "remove.baby.brezza.brand.element");
    String removeBrandTabBabyDiorElement = prop.getProperty("Brand", "remove.baby.dior.brand.element");
    String removeBrandTabNerfSupersoakerElement = prop.getProperty("Brand", "remove.nerf.supersoaker.element");
    String removeBrandTabOliveBabiesElement = prop.getProperty("Brand", "remove.olive.babies.element");
    String removeBrandTabPetinoElement = prop.getProperty("Brand", "remove.petino.brand.element");
    String clearAllElement = prop.getProperty("Brand", "brand.clear.all.element");

    //Select brand Tab in layered navigation
    public Brand clickEventOnBrandTab() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(brandTabElement), 20);
        driver.findElement(By.xpath(brandTabElement)).click();
        return this;
    }

    //Select brand elements
    public Brand selectBabyAliveBrand() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(brandTabBabyAliveElement), 20);
        driver.findElement(By.xpath(brandTabBabyAliveElement)).click();
        return this;
    }

    public Brand selectBabyBrezzaBrand() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(brandTabBabyBrezzaElement), 20);
        driver.findElement(By.xpath(brandTabBabyBrezzaElement)).click();
        return this;
    }

    public Brand selectBabyDiorBrand() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(brandTabBabyDiorElement), 20);
        driver.findElement(By.xpath(brandTabBabyDiorElement)).click();
        return this;
    }

    public Brand selectNerfSupersoakerBrand() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(brandTabNerfSupersoakerElement), 20);
        driver.findElement(By.xpath(brandTabNerfSupersoakerElement)).click();
        return this;
    }

    public Brand selectOliveBabiesBrand() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(brandTabOliveBabiesElement), 20);
        driver.findElement(By.xpath(brandTabOliveBabiesElement)).click();
        return this;
    }

    public Brand selectPetinoBrand() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(brandTabPetinoElement), 20);
        driver.findElement(By.xpath(brandTabPetinoElement)).click();
        return this;
    }

    //Remove selected brand item
    public Brand removeBabyAliveBrand() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(removeBrandTabBabyAliveElement), 20);
        driver.findElement(By.xpath(removeBrandTabBabyAliveElement)).click();
        return this;
    }

    public Brand removeBabyBrezzaBrand() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(removeBrandTabBabyBrezzaElement), 20);
        driver.findElement(By.xpath(removeBrandTabBabyBrezzaElement)).click();
        return this;
    }

    public Brand removeBabyDiorBrand() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(removeBrandTabBabyDiorElement), 20);
        driver.findElement(By.xpath(removeBrandTabBabyDiorElement)).click();
        return this;
    }

    public Brand removeNerfSupersoakerBrand() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(removeBrandTabNerfSupersoakerElement), 20);
        driver.findElement(By.xpath(removeBrandTabNerfSupersoakerElement)).click();
        return this;
    }

    public Brand removeOliveBabiesBrand() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(removeBrandTabOliveBabiesElement), 20);
        driver.findElement(By.xpath(removeBrandTabOliveBabiesElement)).click();
        return this;
    }

    public Brand removePetinoBrand() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(removeBrandTabPetinoElement), 20);
        driver.findElement(By.xpath(removeBrandTabPetinoElement)).click();
        return this;
    }

    public Brand clearAll() {
        SpriiTestFramework.getInstance().waitForElement(By.linkText(clearAllElement), 20);
        driver.findElement(By.linkText(clearAllElement)).click();
        return this;
    }
}
