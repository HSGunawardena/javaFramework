package com.sprii.search.searchlayerednavigation;

import com.sprii.plp.layerednavigation.collection.Collection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.PropertyFileReader;
import utils.SpriiTestFramework;

public class SearchCollection {
    WebDriver driver = SpriiTestFramework.getInstance().getDriver();
    PropertyFileReader prop = new PropertyFileReader();

    String collectionTabElement = prop.getProperty("SearchCollection", "search.collection.tab.element");
    String collectionTabShowMoreButtonElement = prop.getProperty("SearchCollection", "search.collection.tab.show.more.button.element");
    String collectionTabShowLessButtonElement = prop.getProperty("SearchCollection", "search.collection.tab.show.less.button.element");
    String collectionTabOrganicAndNaturalElement = prop.getProperty("SearchCollection", "search.collection.tab.organic.and.natural.element");
    String collectionTabWoodenElement = prop.getProperty("SearchCollection", "search.collection.tab.wooden.element");
    String collectionTabBPAFreeElement = prop.getProperty("SearchCollection", "search.collection.tab.bpa.free.element");
    String collectionTabRubberElement = prop.getProperty("SearchCollection", "search.collection.tab.rubber.element");
    String collectionTabPremiumCareElement = prop.getProperty("SearchCollection", "search.collection.tab.premium.care.element");
    String collectionTabBabyDryElement = prop.getProperty("SearchCollection", "search.collection.tab.baby.dry.element");
    String collectionTabMusicalElement = prop.getProperty("SearchCollection", "search.collection.tab.musical.element");
    String collectionTabBabyCareElement = prop.getProperty("SearchCollection", "search.collection.tab.baby.care.element");
    String collectionTabParentingElement = prop.getProperty("SearchCollection", "search.collection.tab.parenting.element");
    String collectionTabStarWarsElement = prop.getProperty("SearchCollection", "search.collection.tab.star.wars.element");
    String collectionTabMinionsElement = prop.getProperty("SearchCollection", "search.collection.tab.minions.element");
    String collectionTabThunderBirdsElement = prop.getProperty("SearchCollection", "search.collection.tab.thunderbirds.element");
    String collectionTabSpriiFashionElement = prop.getProperty("SearchCollection", "search.collection.tab.sprii.fashion.element");
    String collectionTabKnittingElement = prop.getProperty("SearchCollection", "search.collection.tab.knitting.element");
    String collectionTabEmbroideryElement = prop.getProperty("SearchCollection", "search.collection.tab.embroidery.element");
    String collectionTabAnimalsElement = prop.getProperty("SearchCollection", "search.collection.tab.animals.element");
    String collectionTabUniformElement = prop.getProperty("SearchCollection", "search.collection.tab.uniform.element");
    String collectionTabHalloweenElement = prop.getProperty("SearchCollection", "search.collection.tab.halloween.accessories.element");
    String collectionTabLastChanceDfsElement = prop.getProperty("SearchCollection", "search.collection.tab.last.chance.dsf.element");
    String collectionTabValentinesElement = prop.getProperty("SearchCollection", "search.collection.tab.valentines.element");
    String collectionTabDoubleGiantBoxElement = prop.getProperty("SearchCollection", "search.collection.tab.double.giant.box.element");
    String collectionTabOrganicCottonElement = prop.getProperty("SearchCollection", "search.collection.tab.organic.cotton.element");
    String collectionTabRamadanCookWearElement = prop.getProperty("SearchCollection", "search.collection.tab.ramadan.cookware.element");
    String collectionTabRamadanAppliancesElement = prop.getProperty("SearchCollection", "search.collection.tab.ramadan.appliances.element");
    String collectionTabSinglePackElement = prop.getProperty("SearchCollection", "search.collection.tab.single.pack.element");
    String collectionTabArchitectureElement = prop.getProperty("SearchCollection", "search.collection.tab.architecture.element");
    String collectionTabCityElement = prop.getProperty("SearchCollection", "search.collection.tab.city.element");
    String collectionTabJuniorsElement = prop.getProperty("SearchCollection", "search.collection.tab.juniors.element");
    String collectionTabMiniFiguresElement = prop.getProperty("SearchCollection", "search.collection.tab.minifigures.element");
    String collectionTabUnikittyElement = prop.getProperty("SearchCollection", "search.collection.tab.unikitty.element");
    String collectionTabJurasicWorldElement = prop.getProperty("SearchCollection", "search.collection.tab.jurasic.world.element");
    String collectionTabClassicElement = prop.getProperty("SearchCollection", "search.collection.tab.classic.element");
    String collectionTabTheLegoMovieElement = prop.getProperty("SearchCollection", "search.collection.tab.the.lego.movie.element");
    String collectionTabPantsElement = prop.getProperty("SearchCollection", "search.collection.tab.pants.element");
    String collectionTabBaseElement = prop.getProperty("SearchCollection", "search.collection.tab.base.element");

    //Remove collection items
    String collectionRemoveOrganicAndNaturalItemElement = prop.getProperty("SearchCollection", "search.collection.remove.organic.and.natural.item.element");
    String collectionRemoveWoodenItemElement = prop.getProperty("SearchCollection", "search.collection.remove.wooden.element");
    String collectionRemoveBPAFreeItemElement = prop.getProperty("SearchCollection", "search.collection.remove.BPA.element");
    String collectionRemoveRubberItemElement = prop.getProperty("SearchCollection", "search.collection.remove.rubber.element");
    String collectionRemovePremiumCareItemElement = prop.getProperty("SearchCollection", "search.collection.remove.premium.care.element");
    String collectionRemoveBabyDryItemElement = prop.getProperty("SearchCollection", "search.collection.remove.baby.dry.element");
    String collectionRemoveMusicalItemElement = prop.getProperty("SearchCollection", "search.collection.remove.musical.element");
    String collectionRemoveBabyCareItemElement = prop.getProperty("SearchCollection", "search.collection.remove.baby.care.element");
    String collectionRemoveParentingItemElement = prop.getProperty("SearchCollection", "search.collection.remove.parenting.element");
    String collectionRemoveStarWarsItemElement = prop.getProperty("SearchCollection", "search.collection.remove.star.wars.element");
    String collectionRemoveMinionsItemElement = prop.getProperty("SearchCollection", "search.collection.remove.minions.element");
    String collectionRemoveThunderbirdsItemElement = prop.getProperty("SearchCollection", "search.collection.remove.thunderbirds.element");
    String collectionRemoveSpriiFashionItemElement = prop.getProperty("SearchCollection", "search.collection.remove.sprii.fashion.element");
    String collectionRemoveKnittingItemElement = prop.getProperty("SearchCollection", "search.collection.remove.knitting.element");
    String collectionRemoveEmbroideryItemElement = prop.getProperty("SearchCollection", "search.collection.remove.embroidery.element");
    String collectionRemoveAnimalsItemElement = prop.getProperty("SearchCollection", "search.collection.remove.animals.element");
    String collectionRemoveUniformsItemElement = prop.getProperty("SearchCollection", "search.collection.remove.uniforms.element");
    String collectionRemoveHalloweenAccessoriesItemElement = prop.getProperty("SearchCollection", "search.collection.remove.halloween.accessories.element");
    String collectionRemoveLastChanceDfsItemElement = prop.getProperty("SearchCollection", "search.collection.remove.last.chance.dfs.element");
    String collectionRemoveValentinesItemElement = prop.getProperty("SearchCollection", "search.collection.remove.valentines.element");
    String collectionRemoveDoubleGiantBoxItemElement = prop.getProperty("SearchCollection", "search.collection.remove.double.giant.box.element");
    String collectionRemoveOrganicCottonItemElement = prop.getProperty("SearchCollection", "search.collection.remove.organic.cotton.element");
    String collectionRemoveRamadanCookwareItemElement = prop.getProperty("SearchCollection", "search.collection.remove.ramadan.cookware.element");
    String collectionRemoveRamadanAppliancesItemElement = prop.getProperty("SearchCollection", "search.collection.remove.ramadan.appliances.element");
    String collectionRemoveSingleItemElement = prop.getProperty("SearchCollection", "search.collection.remove.single.pack.element");
    String collectionRemoveArchitectureItemElement = prop.getProperty("SearchCollection", "search.collection.remove.architecture.element");
    String collectionRemoveCityItemElement = prop.getProperty("SearchCollection", "search.collection.remove.city.element");
    String collectionRemoveJuniorsItemElement = prop.getProperty("SearchCollection", "search.collection.remove.juniors.element");
    String collectionRemoveMinifiguresItemElement = prop.getProperty("SearchCollection", "search.collection.remove.mini.figures.element");
    String collectionRemoveUnikittyItemElement = prop.getProperty("SearchCollection", "search.collection.remove.unikitty.element");
    String collectionRemoveJurasicWorldItemElement = prop.getProperty("SearchCollection", "search.collection.remove.jurasic.world.element");
    String collectionRemoveClassicItemElement = prop.getProperty("SearchCollection", "search.collection.remove.classic.element");
    String collectionRemoveLegoMovieItemElement = prop.getProperty("SearchCollection", "search.collection.remove.the.lego.movie.element");
    String collectionRemovePantsItemElement = prop.getProperty("SearchCollection", "search.collection.remove.pants.element");
    String collectionRemoveBaseItemElement = prop.getProperty("SearchCollection", "search.collection.remove.base.element");
    String collectionClearAllElement = prop.getProperty("SearchCollection", "search.collection.clear.all.element");

    //Select collection Tab on layered navigation
    public SearchCollection clickEventOnCollectTab() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(collectionTabElement), 20);
        driver.findElement(By.xpath(collectionTabElement)).click();
        return this;
    }

    //Show More button
    public SearchCollection showMoreButtonClickEvent() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(collectionTabShowMoreButtonElement), 20);
        driver.findElement(By.xpath(collectionTabShowMoreButtonElement)).click();
        return this;
    }

    //Show Less button
    public SearchCollection showLessButtonClickEvent() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(collectionTabShowLessButtonElement), 20);
        driver.findElement(By.xpath(collectionTabShowLessButtonElement)).click();
        return this;
    }

    //Select SearchCollection items
    public SearchCollection selectOrganicAnaNaturalCollection() {
        WebElement checkbox1 = driver.findElement(By.xpath(collectionTabOrganicAndNaturalElement));
        checkbox1.click();
        return this;
    }

    public SearchCollection selectWoodenCollection() {
        WebElement checkbox2 = driver.findElement(By.xpath(collectionTabWoodenElement));
        checkbox2.click();
        return this;
    }

    public SearchCollection selectBPAFreeCollection() {
        WebElement checkbox3 = driver.findElement(By.xpath(collectionTabBPAFreeElement));
        checkbox3.click();
        return this;
    }

    public SearchCollection selectRubberCollection() {
        WebElement checkbox4 = driver.findElement(By.xpath(collectionTabRubberElement));
        checkbox4.click();
        return this;
    }

    public SearchCollection selectPremiumCareCollection() {
        WebElement checkbox5 = driver.findElement(By.xpath(collectionTabPremiumCareElement));
        checkbox5.click();
        return this;
    }

    public SearchCollection selectBabyDryCollection() {
        WebElement checkbox6 = driver.findElement(By.xpath(collectionTabBabyDryElement));
        checkbox6.click();
        return this;
    }

    public SearchCollection selectMusicalCollection() {
        WebElement checkbox7 = driver.findElement(By.xpath(collectionTabMusicalElement));
        checkbox7.click();
        return this;
    }

    public SearchCollection selectBabyCareCollection() {
        WebElement checkbox8 = driver.findElement(By.xpath(collectionTabBabyCareElement));
        checkbox8.click();
        return this;
    }

    public SearchCollection selectParentingCollection() {
        WebElement checkbox9 = driver.findElement(By.xpath(collectionTabParentingElement));
        checkbox9.click();
        return this;
    }

    public SearchCollection selectStarWarsCollection() {
        WebElement checkbox10 = driver.findElement(By.xpath(collectionTabStarWarsElement));
        checkbox10.click();
        return this;
    }

    public SearchCollection selectMinionsCollection() {
        WebElement checkbox11 = driver.findElement(By.xpath(collectionTabMinionsElement));
        checkbox11.click();
        return this;
    }

    public SearchCollection selectThunderBirdsCollection() {
        WebElement checkbox12 = driver.findElement(By.xpath(collectionTabThunderBirdsElement));
        checkbox12.click();
        return this;
    }

    public SearchCollection selectSpriiFashionCollection() {
        WebElement checkbox13 = driver.findElement(By.xpath(collectionTabSpriiFashionElement));
        checkbox13.click();
        return this;
    }

    public SearchCollection selectKnittingCollection() {
        WebElement checkbox14 = driver.findElement(By.xpath(collectionTabKnittingElement));
        checkbox14.click();
        return this;
    }

    public SearchCollection selectEmbroideryCollection() {
        WebElement checkbox15 = driver.findElement(By.xpath(collectionTabEmbroideryElement));
        checkbox15.click();
        return this;
    }

    public SearchCollection selectAnimalsCollection() {
        WebElement checkbox16 = driver.findElement(By.xpath(collectionTabAnimalsElement));
        checkbox16.click();
        return this;
    }

    public SearchCollection selectUniformCollection() {
        WebElement checkbox17 = driver.findElement(By.xpath(collectionTabUniformElement));
        checkbox17.click();
        return this;
    }

    public SearchCollection selectHalloweenCollection() {
        WebElement checkbox18 = driver.findElement(By.xpath(collectionTabHalloweenElement));
        checkbox18.click();
        return this;
    }

    public SearchCollection selectLastChanceDfsCollection() {
        WebElement checkbox19 = driver.findElement(By.xpath(collectionTabLastChanceDfsElement));
        checkbox19.click();
        return this;
    }

    public SearchCollection selectValentinesCollection() {
        WebElement checkbox20 = driver.findElement(By.xpath(collectionTabValentinesElement));
        checkbox20.click();
        return this;
    }

    public SearchCollection selectDoubleGiantBoxCollection() {
        WebElement checkbox21 = driver.findElement(By.xpath(collectionTabDoubleGiantBoxElement));
        checkbox21.click();
        return this;
    }

    public SearchCollection selectOrganicCottonCollection() {
        WebElement checkbox22 = driver.findElement(By.xpath(collectionTabOrganicCottonElement));
        checkbox22.click();
        return this;
    }

    public SearchCollection selectRamadanCookWearCollection() {
        WebElement checkbox23 = driver.findElement(By.xpath(collectionTabRamadanCookWearElement));
        checkbox23.click();
        return this;
    }

    public SearchCollection selectRamadanAppliancesCollection() {
        WebElement checkbox24 = driver.findElement(By.xpath(collectionTabRamadanAppliancesElement));
        checkbox24.click();
        return this;
    }

    public SearchCollection selectSinglePackCollection() {
        WebElement checkbox25 = driver.findElement(By.xpath(collectionTabSinglePackElement));
        checkbox25.click();
        return this;
    }

    public SearchCollection selectArchitectureCollection() {
        WebElement checkbox26 = driver.findElement(By.xpath(collectionTabArchitectureElement));
        checkbox26.click();
        return this;
    }

    public SearchCollection selectCityCollection() {
        WebElement checkbox27 = driver.findElement(By.xpath(collectionTabCityElement));
        checkbox27.click();
        return this;
    }

    public SearchCollection selectJuniorsCollection() {
        WebElement checkbox28 = driver.findElement(By.xpath(collectionTabJuniorsElement));
        checkbox28.click();
        return this;
    }

    public SearchCollection selectMiniFiguresCollection() {
        WebElement checkbox29 = driver.findElement(By.xpath(collectionTabMiniFiguresElement));
        checkbox29.click();
        return this;
    }

    public SearchCollection selectUnikittyCollection() {
        WebElement checkbox30 = driver.findElement(By.xpath(collectionTabUnikittyElement));
        checkbox30.click();
        return this;
    }

    public SearchCollection selectJurasicWorldCollection() {
        WebElement checkbox31 = driver.findElement(By.xpath(collectionTabJurasicWorldElement));
        checkbox31.click();
        return this;
    }

    public SearchCollection selectClassicCollection() {
        WebElement checkbox32 = driver.findElement(By.xpath(collectionTabClassicElement));
        checkbox32.click();
        return this;
    }

    public SearchCollection selectTheLegoMovieCollection() {
        WebElement checkbox33 = driver.findElement(By.xpath(collectionTabTheLegoMovieElement));
        checkbox33.click();
        return this;
    }

    public SearchCollection selectPantsCollection() {
        WebElement checkbox34 = driver.findElement(By.xpath(collectionTabPantsElement));
        checkbox34.click();
        return this;
    }

    public SearchCollection selectBaseCollection() {
        WebElement checkbox34 = driver.findElement(By.xpath(collectionTabBaseElement));
        checkbox34.click();
        return this;
    }

    //Remove SearchCollection items
    public SearchCollection removeCollectionOrganicAndNaturalItem() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(collectionRemoveOrganicAndNaturalItemElement), 20);
        driver.findElement(By.xpath(collectionRemoveOrganicAndNaturalItemElement)).click();
        return this;
    }

    public SearchCollection removeCollectionWoodenItem() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(collectionRemoveWoodenItemElement), 20);
        driver.findElement(By.xpath(collectionRemoveWoodenItemElement)).click();
        return this;
    }

    public SearchCollection removeCollectionBPAFreeItem() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(collectionRemoveBPAFreeItemElement), 20);
        driver.findElement(By.xpath(collectionRemoveBPAFreeItemElement)).click();
        return this;
    }

    public SearchCollection removeCollectionRubberItem() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(collectionRemoveRubberItemElement), 20);
        driver.findElement(By.xpath(collectionRemoveRubberItemElement)).click();
        return this;
    }

    public SearchCollection removeCollectionPremiumCareItem() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(collectionRemovePremiumCareItemElement), 20);
        driver.findElement(By.xpath(collectionRemovePremiumCareItemElement)).click();
        return this;
    }

    public SearchCollection removeCollectionBabyDryItem() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(collectionRemoveBabyDryItemElement), 20);
        driver.findElement(By.xpath(collectionRemoveBabyDryItemElement)).click();
        return this;
    }

    public SearchCollection removeCollectionMusicalItem() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(collectionRemoveMusicalItemElement), 20);
        driver.findElement(By.xpath(collectionRemoveMusicalItemElement)).click();
        return this;
    }

    public SearchCollection removeCollectionBabyCareItem() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(collectionRemoveBabyCareItemElement), 20);
        driver.findElement(By.xpath(collectionRemoveBabyCareItemElement)).click();
        return this;
    }

    public SearchCollection removeCollectionParentingItem() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(collectionRemoveParentingItemElement), 20);
        driver.findElement(By.xpath(collectionRemoveParentingItemElement)).click();
        return this;
    }

    public SearchCollection removeCollectionStarWarsItem() {
        SpriiTestFramework.getInstance().waitTillClickable(By.xpath(collectionRemoveStarWarsItemElement), 20);
        WebElement target = driver.findElement(By.xpath(collectionRemoveStarWarsItemElement));
        Actions builder = new Actions(driver);
        builder.moveToElement(target).click().build().perform();
        return this;
    }

    public SearchCollection removeCollectionMinionsItem() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(collectionRemoveMinionsItemElement), 20);
        driver.findElement(By.xpath(collectionRemoveMinionsItemElement)).click();
        return this;
    }

    public SearchCollection removeCollectionThunderbirdsItem() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(collectionRemoveThunderbirdsItemElement), 20);
        driver.findElement(By.xpath(collectionRemoveThunderbirdsItemElement)).click();
        return this;
    }

    public SearchCollection removeCollectionSpriiFashionItem() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(collectionRemoveSpriiFashionItemElement), 20);
        driver.findElement(By.xpath(collectionRemoveSpriiFashionItemElement)).click();
        return this;
    }

    public SearchCollection removeCollectionKnittingItem() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(collectionRemoveKnittingItemElement), 20);
        driver.findElement(By.xpath(collectionRemoveKnittingItemElement)).click();
        return this;
    }

    public SearchCollection removeCollectionEmbroideryItem() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(collectionRemoveEmbroideryItemElement), 20);
        driver.findElement(By.xpath(collectionRemoveEmbroideryItemElement)).click();
        return this;
    }

    public SearchCollection removeCollectionAnimalsItem() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(collectionRemoveAnimalsItemElement), 20);
        driver.findElement(By.xpath(collectionRemoveAnimalsItemElement)).click();
        return this;
    }

    public SearchCollection removeCollectionUniformItem() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(collectionRemoveUniformsItemElement), 20);
        driver.findElement(By.xpath(collectionRemoveUniformsItemElement)).click();
        return this;
    }

    public SearchCollection removeCollectionHalloweenAccessoriesItem() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(collectionRemoveHalloweenAccessoriesItemElement), 20);
        driver.findElement(By.xpath(collectionRemoveHalloweenAccessoriesItemElement)).click();
        return this;
    }

    public SearchCollection removeCollectionLastChanceDfsItem() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(collectionRemoveLastChanceDfsItemElement), 20);
        driver.findElement(By.xpath(collectionRemoveLastChanceDfsItemElement)).click();
        return this;
    }

    public SearchCollection removeCollectionValentinesItem() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(collectionRemoveValentinesItemElement), 20);
        driver.findElement(By.xpath(collectionRemoveValentinesItemElement)).click();
        return this;
    }

    public SearchCollection removeCollectionDoubleGiantBoxItem() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(collectionRemoveDoubleGiantBoxItemElement), 20);
        driver.findElement(By.xpath(collectionRemoveDoubleGiantBoxItemElement)).click();
        return this;
    }

    public SearchCollection removeCollectionOrganicCottonItem() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(collectionRemoveOrganicCottonItemElement), 20);
        driver.findElement(By.xpath(collectionRemoveOrganicCottonItemElement)).click();
        return this;
    }

    public SearchCollection removeCollectionRamadanCookwareItem() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(collectionRemoveRamadanCookwareItemElement), 20);
        driver.findElement(By.xpath(collectionRemoveRamadanCookwareItemElement)).click();
        return this;
    }

    public SearchCollection removeCollectionRamadanAppliancesItem() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(collectionRemoveRamadanAppliancesItemElement), 20);
        driver.findElement(By.xpath(collectionRemoveRamadanAppliancesItemElement)).click();
        return this;
    }

    public SearchCollection removeCollectionSinglePackItem() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(collectionRemoveSingleItemElement), 20);
        driver.findElement(By.xpath(collectionRemoveSingleItemElement)).click();
        return this;
    }

    public SearchCollection removeCollectionArchitectureItem() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(collectionRemoveArchitectureItemElement), 20);
        driver.findElement(By.xpath(collectionRemoveArchitectureItemElement)).click();
        return this;
    }

    public SearchCollection removeCollectionCityItem() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(collectionRemoveCityItemElement), 20);
        driver.findElement(By.xpath(collectionRemoveCityItemElement)).click();
        return this;
    }

    public SearchCollection removeCollectionJuniorsItem() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(collectionRemoveJuniorsItemElement), 20);
        driver.findElement(By.xpath(collectionRemoveJuniorsItemElement)).click();
        return this;
    }

    public SearchCollection removeCollectionMinifiguresItem() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(collectionRemoveMinifiguresItemElement), 20);
        driver.findElement(By.xpath(collectionRemoveMinifiguresItemElement)).click();
        return this;
    }

    public SearchCollection removeCollectionUnikittyItem() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(collectionRemoveUnikittyItemElement), 20);
        driver.findElement(By.xpath(collectionRemoveUnikittyItemElement)).click();
        return this;
    }

    public SearchCollection removeCollectionJurasicWorldItem() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(collectionRemoveJurasicWorldItemElement), 20);
        driver.findElement(By.xpath(collectionRemoveJurasicWorldItemElement)).click();
        return this;
    }

    public SearchCollection removeCollectionClassicItem() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(collectionRemoveClassicItemElement), 20);
        driver.findElement(By.xpath(collectionRemoveClassicItemElement)).click();
        return this;
    }

    public SearchCollection removeCollectionTheLegoMovieItem() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(collectionRemoveLegoMovieItemElement), 20);
        driver.findElement(By.xpath(collectionRemoveLegoMovieItemElement)).click();
        return this;
    }

    public SearchCollection removeCollectionPantsItem() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(collectionRemovePantsItemElement), 20);
        driver.findElement(By.xpath(collectionRemovePantsItemElement)).click();
        return this;
    }

    public SearchCollection removeCollectionBaseItem() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(collectionRemoveBaseItemElement), 20);
        driver.findElement(By.xpath(collectionRemoveBaseItemElement)).click();
        return this;
    }

    //Remove all selected items
    public SearchCollection clearAll() {
        SpriiTestFramework.getInstance().waitForElement(By.linkText(collectionClearAllElement), 20);
        driver.findElement(By.linkText(collectionClearAllElement)).click();
        return this;
    }

}
