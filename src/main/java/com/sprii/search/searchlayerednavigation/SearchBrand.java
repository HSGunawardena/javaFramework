package com.sprii.search.searchlayerednavigation;

import com.sprii.plp.layerednavigation.brand.Brand;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.PropertyFileReader;
import utils.SpriiTestFramework;

public class SearchBrand {
    WebDriver driver = SpriiTestFramework.getInstance().getDriver();
    PropertyFileReader prop = new PropertyFileReader();

    String brandTabElement = prop.getProperty("SearchBrand", "search.brand.tab.element");
    String brandTabBabyAliveElement = prop.getProperty("SearchBrand", "search.brand.tab.baby.alive.element");
    String brandTabBabyBrezzaElement = prop.getProperty("SearchBrand", "search.brand.tab.baby.brezza.element");
    String brandTabBabyDiorElement = prop.getProperty("SearchBrand", "search.brand.tab.baby.dior.element");
    String brandTabNerfSupersoakerElement = prop.getProperty("SearchBrand", "search.brand.tab.nerf.supersoaker.element");
    String brandTabOliveBabiesElement = prop.getProperty("SearchBrand", "search.brand.tab.olive.babies.element");
    String brandTabPetinoElement = prop.getProperty("SearchBrand", "search.brand.tab.petino.element");

    //remove elements
    String removeBrandTabBabyAliveElement = prop.getProperty("SearchBrand", "search.remove.baby.alive.brand.element");
    String removeBrandTabBabyBrezzaElement = prop.getProperty("SearchBrand", "search.remove.baby.brezza.brand.element");
    String removeBrandTabBabyDiorElement = prop.getProperty("SearchBrand", "search.remove.baby.dior.brand.element");
    String removeBrandTabNerfSupersoakerElement = prop.getProperty("SearchBrand", "search.remove.nerf.supersoaker.element");
    String removeBrandTabOliveBabiesElement = prop.getProperty("SearchBrand", "search.remove.olive.babies.element");
    String removeBrandTabPetinoElement = prop.getProperty("SearchBrand", "search.remove.petino.brand.element");
    String clearAllElement = prop.getProperty("SearchBrand", "search.brand.clear.all.element");

    //Select brand Tab in layered navigation
    public SearchBrand clickEventOnBrandTab() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(brandTabElement), 20);
        driver.findElement(By.xpath(brandTabElement)).click();
        return this;
    }

    //Select brand elements
    public SearchBrand selectBabyAliveBrand() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(brandTabBabyAliveElement), 20);
        driver.findElement(By.xpath(brandTabBabyAliveElement)).click();
        return this;
    }

    public SearchBrand selectBabyBrezzaBrand() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(brandTabBabyBrezzaElement), 20);
        driver.findElement(By.xpath(brandTabBabyBrezzaElement)).click();
        return this;
    }

    public SearchBrand selectBabyDiorBrand() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(brandTabBabyDiorElement), 20);
        driver.findElement(By.xpath(brandTabBabyDiorElement)).click();
        return this;
    }

    public SearchBrand selectNerfSupersoakerBrand() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(brandTabNerfSupersoakerElement), 20);
        driver.findElement(By.xpath(brandTabNerfSupersoakerElement)).click();
        return this;
    }

    public SearchBrand selectOliveBabiesBrand() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(brandTabOliveBabiesElement), 20);
        driver.findElement(By.xpath(brandTabOliveBabiesElement)).click();
        return this;
    }

    public SearchBrand selectPetinoBrand() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(brandTabPetinoElement), 20);
        driver.findElement(By.xpath(brandTabPetinoElement)).click();
        return this;
    }

    //Remove selected brand item
    public SearchBrand removeBabyAliveBrand() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(removeBrandTabBabyAliveElement), 20);
        driver.findElement(By.xpath(removeBrandTabBabyAliveElement)).click();
        return this;
    }

    public SearchBrand removeBabyBrezzaBrand() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(removeBrandTabBabyBrezzaElement), 20);
        driver.findElement(By.xpath(removeBrandTabBabyBrezzaElement)).click();
        return this;
    }

    public SearchBrand removeBabyDiorBrand() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(removeBrandTabBabyDiorElement), 20);
        driver.findElement(By.xpath(removeBrandTabBabyDiorElement)).click();
        return this;
    }

    public SearchBrand removeNerfSupersoakerBrand() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(removeBrandTabNerfSupersoakerElement), 20);
        driver.findElement(By.xpath(removeBrandTabNerfSupersoakerElement)).click();
        return this;
    }

    public SearchBrand removeOliveBabiesBrand() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(removeBrandTabOliveBabiesElement), 20);
        driver.findElement(By.xpath(removeBrandTabOliveBabiesElement)).click();
        return this;
    }

    public SearchBrand removePetinoBrand() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(removeBrandTabPetinoElement), 20);
        driver.findElement(By.xpath(removeBrandTabPetinoElement)).click();
        return this;
    }

    public SearchBrand clearAll() {
        SpriiTestFramework.getInstance().waitForElement(By.linkText(clearAllElement), 20);
        driver.findElement(By.linkText(clearAllElement)).click();
        return this;
    }
}
