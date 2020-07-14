package com.sprii.plp.layerednavigation.collection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utils.PropertyFileReader;
import utils.SpriiTestFramework;

public class Collection {

    WebDriver driver = SpriiTestFramework.getInstance().getDriver();
    PropertyFileReader prop = new PropertyFileReader();

    String collectionTabElement = prop.getProperty("Collection", "collection.tab.element");
    String collectionTabShowMoreButtonElement = prop.getProperty("Collection", "collection.tab.show.more.button.element");
    String collectionTabShowLessButtonElement = prop.getProperty("Collection", "collection.tab.show.less.button.element");
    String collectionTabOrganicAndNaturalElement = prop.getProperty("Collection", "collection.tab.organic.and.natural.element");
    String collectionTabWoodenElement = prop.getProperty("Collection", "collection.tab.wooden.element");
    String collectionTabBPAFreeElement = prop.getProperty("Collection", "collection.tab.bpa.free.element");
    String collectionTabRubberElement = prop.getProperty("Collection", "collection.tab.rubber.element");
    String collectionTabPremiumCareElement = prop.getProperty("Collection", "collection.tab.premium.care.element");
    String collectionTabBabyDryElement = prop.getProperty("Collection", "collection.tab.baby.dry.element");
    String collectionTabMusicalElement = prop.getProperty("Collection", "collection.tab.musical.element");
    String collectionTabBabyCareElement = prop.getProperty("Collection", "collection.tab.baby.care.element");
    String collectionTabParentingElement = prop.getProperty("Collection", "collection.tab.parenting.element");
    String collectionTabStarWarsElement = prop.getProperty("Collection", "collection.tab.star.wars.element");
    String collectionTabMinionsElement = prop.getProperty("Collection", "collection.tab.minions.element");
    String collectionTabThunderBirdsElement = prop.getProperty("Collection", "collection.tab.thunderbirds.element");
    String collectionTabSpriiFashionElement = prop.getProperty("Collection", "collection.tab.sprii.fashion.element");
    String collectionTabKnittingElement = prop.getProperty("Collection", "collection.tab.knitting.element");
    String collectionTabEmbroideryElement = prop.getProperty("Collection", "collection.tab.embroidery.element");
    String collectionTabAnimalsElement = prop.getProperty("Collection", "collection.tab.animals.element");
    String collectionTabUniformElement = prop.getProperty("Collection", "collection.tab.uniform.element");
    String collectionTabHalloweenElement = prop.getProperty("Collection", "collection.tab.halloween.accessories.element");
    String collectionTabLastChanceDfsElement = prop.getProperty("Collection", "collection.tab.last.chance.dsf.element");
    String collectionTabValentinesElement = prop.getProperty("Collection", "collection.tab.valentines.element");
    String collectionTabDoubleGiantBoxElement = prop.getProperty("Collection", "collection.tab.double.giant.box.element");
    String collectionTabOrganicCottonElement = prop.getProperty("Collection", "collection.tab.organic.cotton.element");
    String collectionTabRamadanCookWearElement = prop.getProperty("Collection", "collection.tab.ramadan.cookware.element");
    String collectionTabRamadanAppliancesElement = prop.getProperty("Collection", "collection.tab.ramadan.appliances.element");
    String collectionTabSinglePackElement = prop.getProperty("Collection", "collection.tab.single.pack.element");
    String collectionTabArchitectureElement = prop.getProperty("Collection", "collection.tab.architecture.element");
    String collectionTabCityElement = prop.getProperty("Collection", "collection.tab.city.element");
    String collectionTabJuniorsElement = prop.getProperty("Collection", "collection.tab.juniors.element");
    String collectionTabMiniFiguresElement = prop.getProperty("Collection", "collection.tab.minifigures.element");
    String collectionTabUnikittyElement = prop.getProperty("Collection", "collection.tab.unikitty.element");
    String collectionTabJurasicWorldElement = prop.getProperty("Collection", "collection.tab.jurasic.world.element");
    String collectionTabClassicElement = prop.getProperty("Collection", "collection.tab.classic.element");
    String collectionTabTheLegoMovieElement = prop.getProperty("Collection", "collection.tab.the.lego.movie.element");
    String collectionTabPantsElement = prop.getProperty("Collection", "collection.tab.pants.element");
    String collectionTabBaseElement = prop.getProperty("Collection", "collection.tab.base.element");

    //Remove collection items
    String collectionRemoveOrganicAndNaturalItemElement = prop.getProperty("Collection", "collection.remove.organic.and.natural.item.element");
    String collectionRemoveWoodenItemElement = prop.getProperty("Collection", "collection.remove.wooden.element");
    String collectionRemoveBPAFreeItemElement = prop.getProperty("Collection", "collection.remove.BPA.element");
    String collectionRemoveRubberItemElement = prop.getProperty("Collection", "collection.remove.rubber.element");
    String collectionRemovePremiumCareItemElement = prop.getProperty("Collection", "collection.remove.premium.care.element");
    String collectionRemoveBabyDryItemElement = prop.getProperty("Collection", "collection.remove.baby.dry.element");
    String collectionRemoveMusicalItemElement = prop.getProperty("Collection", "collection.remove.musical.element");
    String collectionRemoveBabyCareItemElement = prop.getProperty("Collection", "collection.remove.baby.care.element");
    String collectionRemoveParentingItemElement = prop.getProperty("Collection", "collection.remove.parenting.element");
    String collectionRemoveStarWarsItemElement = prop.getProperty("Collection", "collection.remove.star.wars.element");
    String collectionRemoveMinionsItemElement = prop.getProperty("Collection", "collection.remove.minions.element");
    String collectionRemoveThunderbirdsItemElement = prop.getProperty("Collection", "collection.remove.thunderbirds.element");
    String collectionRemoveSpriiFashionItemElement = prop.getProperty("Collection", "collection.remove.sprii.fashion.element");
    String collectionRemoveKnittingItemElement = prop.getProperty("Collection", "collection.remove.knitting.element");
    String collectionRemoveEmbroideryItemElement = prop.getProperty("Collection", "collection.remove.embroidery.element");
    String collectionRemoveAnimalsItemElement = prop.getProperty("Collection", "collection.remove.animals.element");
    String collectionRemoveUniformsItemElement = prop.getProperty("Collection", "collection.remove.uniforms.element");
    String collectionRemoveHalloweenAccessoriesItemElement = prop.getProperty("Collection", "collection.remove.halloween.accessories.element");
    String collectionRemoveLastChanceDfsItemElement = prop.getProperty("Collection", "collection.remove.last.chance.dfs.element");
    String collectionRemoveValentinesItemElement = prop.getProperty("Collection", "collection.remove.valentines.element");
    String collectionRemoveDoubleGiantBoxItemElement = prop.getProperty("Collection", "collection.remove.double.giant.box.element");
    String collectionRemoveOrganicCottonItemElement = prop.getProperty("Collection", "collection.remove.organic.cotton.element");
    String collectionRemoveRamadanCookwareItemElement = prop.getProperty("Collection", "collection.remove.ramadan.cookware.element");
    String collectionRemoveRamadanAppliancesItemElement = prop.getProperty("Collection", "collection.remove.ramadan.appliances.element");
    String collectionRemoveSingleItemElement = prop.getProperty("Collection", "collection.remove.single.pack.element");
    String collectionRemoveArchitectureItemElement = prop.getProperty("Collection", "collection.remove.architecture.element");
    String collectionRemoveCityItemElement = prop.getProperty("Collection", "collection.remove.city.element");
    String collectionRemoveJuniorsItemElement = prop.getProperty("Collection", "collection.remove.juniors.element");
    String collectionRemoveMinifiguresItemElement = prop.getProperty("Collection", "collection.remove.mini.figures.element");
    String collectionRemoveUnikittyItemElement = prop.getProperty("Collection", "collection.remove.unikitty.element");
    String collectionRemoveJurasicWorldItemElement = prop.getProperty("Collection", "collection.remove.jurasic.world.element");
    String collectionRemoveClassicItemElement = prop.getProperty("Collection", "collection.remove.classic.element");
    String collectionRemoveLegoMovieItemElement = prop.getProperty("Collection", "collection.remove.the.lego.movie.element");
    String collectionRemovePantsItemElement = prop.getProperty("Collection", "collection.remove.pants.element");
    String collectionRemoveBaseItemElement = prop.getProperty("Collection", "collection.remove.base.element");
    String collectionClearAllElement = prop.getProperty("Collection", "collection.clear.all.element");

    //Select collection Tab on layered navigation
    public Collection clickEventOnCollectTab() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(collectionTabElement), 20);
        driver.findElement(By.xpath(collectionTabElement)).click();
        return this;
    }

    //Show More button
    public Collection showMoreButtonClickEvent() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(collectionTabShowMoreButtonElement), 20);
        driver.findElement(By.xpath(collectionTabShowMoreButtonElement)).click();
        return this;
    }

    //Show Less button
    public Collection showLessButtonClickEvent() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(collectionTabShowLessButtonElement), 20);
        driver.findElement(By.xpath(collectionTabShowLessButtonElement)).click();
        return this;
    }

    //Select collection items
    public Collection selectOrganicAnaNaturalCollection() {
        WebElement checkbox1 = driver.findElement(By.xpath(collectionTabOrganicAndNaturalElement));
        checkbox1.click();
        return this;
    }

    public Collection selectWoodenCollection() {
        WebElement checkbox2 = driver.findElement(By.xpath(collectionTabWoodenElement));
        checkbox2.click();
        return this;
    }

    public Collection selectBPAFreeCollection() {
        WebElement checkbox3 = driver.findElement(By.xpath(collectionTabBPAFreeElement));
        checkbox3.click();
        return this;
    }

    public Collection selectRubberCollection() {
        WebElement checkbox4 = driver.findElement(By.xpath(collectionTabRubberElement));
        checkbox4.click();
        return this;
    }

    public Collection selectPremiumCareCollection() {
        WebElement checkbox5 = driver.findElement(By.xpath(collectionTabPremiumCareElement));
        checkbox5.click();
        return this;
    }

    public Collection selectBabyDryCollection() {
        WebElement checkbox6 = driver.findElement(By.xpath(collectionTabBabyDryElement));
        checkbox6.click();
        return this;
    }

    public Collection selectMusicalCollection() {
        WebElement checkbox7 = driver.findElement(By.xpath(collectionTabMusicalElement));
        checkbox7.click();
        return this;
    }

    public Collection selectBabyCareCollection() {
        WebElement checkbox8 = driver.findElement(By.xpath(collectionTabBabyCareElement));
        checkbox8.click();
        return this;
    }

    public Collection selectParentingCollection() {
        WebElement checkbox9 = driver.findElement(By.xpath(collectionTabParentingElement));
        checkbox9.click();
        return this;
    }

    public Collection selectStarWarsCollection() {
        WebElement checkbox10 = driver.findElement(By.xpath(collectionTabStarWarsElement));
        checkbox10.click();
        return this;
    }

    public Collection selectMinionsCollection() {
        WebElement checkbox11 = driver.findElement(By.xpath(collectionTabMinionsElement));
        checkbox11.click();
        return this;
    }

    public Collection selectThunderBirdsCollection() {
        WebElement checkbox12 = driver.findElement(By.xpath(collectionTabThunderBirdsElement));
        checkbox12.click();
        return this;
    }

    public Collection selectSpriiFashionCollection() {
        WebElement checkbox13 = driver.findElement(By.xpath(collectionTabSpriiFashionElement));
        checkbox13.click();
        return this;
    }

    public Collection selectKnittingCollection() {
        WebElement checkbox14 = driver.findElement(By.xpath(collectionTabKnittingElement));
        checkbox14.click();
        return this;
    }

    public Collection selectEmbroideryCollection() {
        WebElement checkbox15 = driver.findElement(By.xpath(collectionTabEmbroideryElement));
        checkbox15.click();
        return this;
    }

    public Collection selectAnimalsCollection() {
        WebElement checkbox16 = driver.findElement(By.xpath(collectionTabAnimalsElement));
        checkbox16.click();
        return this;
    }

    public Collection selectUniformCollection() {
        WebElement checkbox17 = driver.findElement(By.xpath(collectionTabUniformElement));
        checkbox17.click();
        return this;
    }

    public Collection selectHalloweenCollection() {
        WebElement checkbox18 = driver.findElement(By.xpath(collectionTabHalloweenElement));
        checkbox18.click();
        return this;
    }

    public Collection selectLastChanceDfsCollection() {
        WebElement checkbox19 = driver.findElement(By.xpath(collectionTabLastChanceDfsElement));
        checkbox19.click();
        return this;
    }

    public Collection selectValentinesCollection() {
        WebElement checkbox20 = driver.findElement(By.xpath(collectionTabValentinesElement));
        checkbox20.click();
        return this;
    }

    public Collection selectDoubleGiantBoxCollection() {
        WebElement checkbox21 = driver.findElement(By.xpath(collectionTabDoubleGiantBoxElement));
        checkbox21.click();
        return this;
    }

    public Collection selectOrganicCottonCollection() {
        WebElement checkbox22 = driver.findElement(By.xpath(collectionTabOrganicCottonElement));
        checkbox22.click();
        return this;
    }

    public Collection selectRamadanCookWearCollection() {
        WebElement checkbox23 = driver.findElement(By.xpath(collectionTabRamadanCookWearElement));
        checkbox23.click();
        return this;
    }

    public Collection selectRamadanAppliancesCollection() {
        WebElement checkbox24 = driver.findElement(By.xpath(collectionTabRamadanAppliancesElement));
        checkbox24.click();
        return this;
    }

    public Collection selectSinglePackCollection() {
        WebElement checkbox25 = driver.findElement(By.xpath(collectionTabSinglePackElement));
        checkbox25.click();
        return this;
    }

    public Collection selectArchitectureCollection() {
        WebElement checkbox26 = driver.findElement(By.xpath(collectionTabArchitectureElement));
        checkbox26.click();
        return this;
    }

    public Collection selectCityCollection() {
        WebElement checkbox27 = driver.findElement(By.xpath(collectionTabCityElement));
        checkbox27.click();
        return this;
    }

    public Collection selectJuniorsCollection() {
        WebElement checkbox28 = driver.findElement(By.xpath(collectionTabJuniorsElement));
        checkbox28.click();
        return this;
    }

    public Collection selectMiniFiguresCollection() {
        WebElement checkbox29 = driver.findElement(By.xpath(collectionTabMiniFiguresElement));
        checkbox29.click();
        return this;
    }

    public Collection selectUnikittyCollection() {
        WebElement checkbox30 = driver.findElement(By.xpath(collectionTabUnikittyElement));
        checkbox30.click();
        return this;
    }

    public Collection selectJurasicWorldCollection() {
        WebElement checkbox31 = driver.findElement(By.xpath(collectionTabJurasicWorldElement));
        checkbox31.click();
        return this;
    }

    public Collection selectClassicCollection() {
        WebElement checkbox32 = driver.findElement(By.xpath(collectionTabClassicElement));
        checkbox32.click();
        return this;
    }

    public Collection selectTheLegoMovieCollection() {
        WebElement checkbox33 = driver.findElement(By.xpath(collectionTabTheLegoMovieElement));
        checkbox33.click();
        return this;
    }

    public Collection selectPantsCollection() {
        WebElement checkbox34 = driver.findElement(By.xpath(collectionTabPantsElement));
        checkbox34.click();
        return this;
    }

    public Collection selectBaseCollection() {
        WebElement checkbox34 = driver.findElement(By.xpath(collectionTabBaseElement));
        checkbox34.click();
        return this;
    }

    //Remove collection items
    public Collection removeCollectionOrganicAndNaturalItem() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(collectionRemoveOrganicAndNaturalItemElement), 20);
        driver.findElement(By.xpath(collectionRemoveOrganicAndNaturalItemElement)).click();
        return this;
    }

    public Collection removeCollectionWoodenItem() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(collectionRemoveWoodenItemElement), 20);
        driver.findElement(By.xpath(collectionRemoveWoodenItemElement)).click();
        return this;
    }

    public Collection removeCollectionBPAFreeItem() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(collectionRemoveBPAFreeItemElement), 20);
        driver.findElement(By.xpath(collectionRemoveBPAFreeItemElement)).click();
        return this;
    }

    public Collection removeCollectionRubberItem() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(collectionRemoveRubberItemElement), 20);
        driver.findElement(By.xpath(collectionRemoveRubberItemElement)).click();
        return this;
    }

    public Collection removeCollectionPremiumCareItem() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(collectionRemovePremiumCareItemElement), 20);
        driver.findElement(By.xpath(collectionRemovePremiumCareItemElement)).click();
        return this;
    }

    public Collection removeCollectionBabyDryItem() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(collectionRemoveBabyDryItemElement), 20);
        driver.findElement(By.xpath(collectionRemoveBabyDryItemElement)).click();
        return this;
    }

    public Collection removeCollectionMusicalItem() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(collectionRemoveMusicalItemElement), 20);
        driver.findElement(By.xpath(collectionRemoveMusicalItemElement)).click();
        return this;
    }

    public Collection removeCollectionBabyCareItem() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(collectionRemoveBabyCareItemElement), 20);
        driver.findElement(By.xpath(collectionRemoveBabyCareItemElement)).click();
        return this;
    }

    public Collection removeCollectionParentingItem() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(collectionRemoveParentingItemElement), 20);
        driver.findElement(By.xpath(collectionRemoveParentingItemElement)).click();
        return this;
    }

    public Collection removeCollectionStarWarsItem() {
        SpriiTestFramework.getInstance().waitTillClickable(By.xpath(collectionRemoveStarWarsItemElement), 20);
        WebElement target = driver.findElement(By.xpath(collectionRemoveStarWarsItemElement));
        Actions builder = new Actions(driver);
        builder.moveToElement(target).click().build().perform();
        return this;
    }

    public Collection removeCollectionMinionsItem() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(collectionRemoveMinionsItemElement), 20);
        driver.findElement(By.xpath(collectionRemoveMinionsItemElement)).click();
        return this;
    }

    public Collection removeCollectionThunderbirdsItem() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(collectionRemoveThunderbirdsItemElement), 20);
        driver.findElement(By.xpath(collectionRemoveThunderbirdsItemElement)).click();
        return this;
    }

    public Collection removeCollectionSpriiFashionItem() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(collectionRemoveSpriiFashionItemElement), 20);
        driver.findElement(By.xpath(collectionRemoveSpriiFashionItemElement)).click();
        return this;
    }

    public Collection removeCollectionKnittingItem() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(collectionRemoveKnittingItemElement), 20);
        driver.findElement(By.xpath(collectionRemoveKnittingItemElement)).click();
        return this;
    }

    public Collection removeCollectionEmbroideryItem() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(collectionRemoveEmbroideryItemElement), 20);
        driver.findElement(By.xpath(collectionRemoveEmbroideryItemElement)).click();
        return this;
    }

    public Collection removeCollectionAnimalsItem() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(collectionRemoveAnimalsItemElement), 20);
        driver.findElement(By.xpath(collectionRemoveAnimalsItemElement)).click();
        return this;
    }

    public Collection removeCollectionUniformItem() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(collectionRemoveUniformsItemElement), 20);
        driver.findElement(By.xpath(collectionRemoveUniformsItemElement)).click();
        return this;
    }

    public Collection removeCollectionHalloweenAccessoriesItem() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(collectionRemoveHalloweenAccessoriesItemElement), 20);
        driver.findElement(By.xpath(collectionRemoveHalloweenAccessoriesItemElement)).click();
        return this;
    }

    public Collection removeCollectionLastChanceDfsItem() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(collectionRemoveLastChanceDfsItemElement), 20);
        driver.findElement(By.xpath(collectionRemoveLastChanceDfsItemElement)).click();
        return this;
    }

    public Collection removeCollectionValentinesItem() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(collectionRemoveValentinesItemElement), 20);
        driver.findElement(By.xpath(collectionRemoveValentinesItemElement)).click();
        return this;
    }

    public Collection removeCollectionDoubleGiantBoxItem() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(collectionRemoveDoubleGiantBoxItemElement), 20);
        driver.findElement(By.xpath(collectionRemoveDoubleGiantBoxItemElement)).click();
        return this;
    }

    public Collection removeCollectionOrganicCottonItem() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(collectionRemoveOrganicCottonItemElement), 20);
        driver.findElement(By.xpath(collectionRemoveOrganicCottonItemElement)).click();
        return this;
    }

    public Collection removeCollectionRamadanCookwareItem() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(collectionRemoveRamadanCookwareItemElement), 20);
        driver.findElement(By.xpath(collectionRemoveRamadanCookwareItemElement)).click();
        return this;
    }

    public Collection removeCollectionRamadanAppliancesItem() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(collectionRemoveRamadanAppliancesItemElement), 20);
        driver.findElement(By.xpath(collectionRemoveRamadanAppliancesItemElement)).click();
        return this;
    }

    public Collection removeCollectionSinglePackItem() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(collectionRemoveSingleItemElement), 20);
        driver.findElement(By.xpath(collectionRemoveSingleItemElement)).click();
        return this;
    }

    public Collection removeCollectionArchitectureItem() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(collectionRemoveArchitectureItemElement), 20);
        driver.findElement(By.xpath(collectionRemoveArchitectureItemElement)).click();
        return this;
    }

    public Collection removeCollectionCityItem() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(collectionRemoveCityItemElement), 20);
        driver.findElement(By.xpath(collectionRemoveCityItemElement)).click();
        return this;
    }

    public Collection removeCollectionJuniorsItem() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(collectionRemoveJuniorsItemElement), 20);
        driver.findElement(By.xpath(collectionRemoveJuniorsItemElement)).click();
        return this;
    }

    public Collection removeCollectionMinifiguresItem() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(collectionRemoveMinifiguresItemElement), 20);
        driver.findElement(By.xpath(collectionRemoveMinifiguresItemElement)).click();
        return this;
    }

    public Collection removeCollectionUnikittyItem() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(collectionRemoveUnikittyItemElement), 20);
        driver.findElement(By.xpath(collectionRemoveUnikittyItemElement)).click();
        return this;
    }

    public Collection removeCollectionJurasicWorldItem() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(collectionRemoveJurasicWorldItemElement), 20);
        driver.findElement(By.xpath(collectionRemoveJurasicWorldItemElement)).click();
        return this;
    }

    public Collection removeCollectionClassicItem() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(collectionRemoveClassicItemElement), 20);
        driver.findElement(By.xpath(collectionRemoveClassicItemElement)).click();
        return this;
    }

    public Collection removeCollectionTheLegoMovieItem() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(collectionRemoveLegoMovieItemElement), 20);
        driver.findElement(By.xpath(collectionRemoveLegoMovieItemElement)).click();
        return this;
    }

    public Collection removeCollectionPantsItem() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(collectionRemovePantsItemElement), 20);
        driver.findElement(By.xpath(collectionRemovePantsItemElement)).click();
        return this;
    }

    public Collection removeCollectionBaseItem() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(collectionRemoveBaseItemElement), 20);
        driver.findElement(By.xpath(collectionRemoveBaseItemElement)).click();
        return this;
    }

    //Remove all selected items
    public Collection clearAll() {
        SpriiTestFramework.getInstance().waitForElement(By.linkText(collectionClearAllElement), 20);
        driver.findElement(By.linkText(collectionClearAllElement)).click();
        return this;
    }

}
