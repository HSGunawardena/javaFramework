package com.sprii.navigate;

import com.sprii.navigate.appliances.*;
import com.sprii.navigate.bathandbabycare.*;
import com.sprii.navigate.diapering.*;
import com.sprii.navigate.feeding.*;
import com.sprii.navigate.gear.BoostersPage;
import com.sprii.navigate.gear.*;
import com.sprii.navigate.gifts.*;
import com.sprii.navigate.homeandlifestyle.*;
import com.sprii.navigate.kidsfashion.*;
import com.sprii.navigate.mums.*;
import com.sprii.navigate.outdoor.*;
import com.sprii.navigate.school.*;
import com.sprii.navigate.toys.PartyEssentialsPage;
import com.sprii.navigate.toys.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.PropertyFileReader;
import utils.SpriiTestFramework;

public class NavigationPage {

    private WebDriver driver = SpriiTestFramework.getInstance().getDriver();
    private PropertyFileReader prop = new PropertyFileReader();


    private String gearElement = prop.getProperty("NavigationPage", "gear.element");
    private String diaperingElement = prop.getProperty("NavigationPage", "diapering.element");
    private String feedingElement = prop.getProperty("NavigationPage", "feeding.element");
    private String toysElement = prop.getProperty("NavigationPage", "toys.element");
    private String outdoorElement = prop.getProperty("NavigationPage", "outdoor.element");
    private String bathBabyElement = prop.getProperty("NavigationPage", "bath.baby.element");
    private String mumsElement = prop.getProperty("NavigationPage", "mums.element");
    private String kidsFashionElement = prop.getProperty("NavigationPage", "kids.fashion.element");
    private String homeLifestyleElement = prop.getProperty("NavigationPage", "home.lifestyle.element");
    private String appliancesElement = prop.getProperty("NavigationPage", "appliances.element");
    private String schoolElement = prop.getProperty("NavigationPage", "school.element");
    private String giftsElement = prop.getProperty("NavigationPage", "gifts.element");
    private String strollerAccessoriesElement = prop.getProperty("NavigationPage", "stroller.accessories.element");
    private String carSeatsAccessoriesElement = prop.getProperty("NavigationPage", "car.seats.accessories.element");
    private String bedsAndCotsElement = prop.getProperty("NavigationPage", "beds.cots.element");
    private String travelElement = prop.getProperty("NavigationPage", "travel.element");
    private String activityCentersElement = prop.getProperty("NavigationPage", "activity.centers.element");
    private String topBrandsElement = prop.getProperty("NavigationPage", "top.brands.element");
    private String strollerElement = prop.getProperty("NavigationPage", "strollers.element");
    private String travelSystemsElement = prop.getProperty("NavigationPage", "travel.systems.element");
    private String twinStrollersElement = prop.getProperty("NavigationPage", "twin.strollers.element");
    private String sAndaAccessoriesElement = prop.getProperty("NavigationPage", "sAndA.accessories.element");
    private String sAndaShopAllElement = prop.getProperty("NavigationPage", "sAndA.shop.all.element");
    private String carSeatsElement = prop.getProperty("NavigationPage", "car.seats.element");
    private String carSeatToysElement = prop.getProperty("NavigationPage", "car.seats.toys.element");
    private String boostersElement = prop.getProperty("NavigationPage", "boosters.element");
    private String cSandAAccessoriesElement = prop.getProperty("NavigationPage", "cSandA.accessories.element");
    private String cSandAccessoriesShopAllElement = prop.getProperty("NavigationPage", "cSandA.Shop.all.element");
    private String cotsCribsAndBassinetsElement = prop.getProperty("NavigationPage", "cots.cribs.bassinets.element");
    private String podsAndNetsElement = prop.getProperty("NavigationPage", "pods.nets.element");
    private String beddingElement = prop.getProperty("NavigationPage", "bedding.element");
    private String muslinsAndSwaddlesElement = prop.getProperty("NavigationPage", "muslins.swaddles.element");
    private String bedsAndBedRailsElement = prop.getProperty("NavigationPage", "beds.bedrails.element");
    private String bAndCShopAllElement = prop.getProperty("NavigationPage", "beds.cots.shop.all.element");
    private String changingBagsElement = prop.getProperty("NavigationPage", "changing.bags.element");
    private String backpacksAndCarriersElement = prop.getProperty("NavigationPage", "backpacks.carriers.element");
    private String travelCotsElement = prop.getProperty("NavigationPage", "travel.cots.element");
    private String suitcaseElement = prop.getProperty("NavigationPage", "suitcases.element");
    private String travelShopAllElement = prop.getProperty("NavigationPage", "travel.shop.all.element");
    private String activityGymsElement = prop.getProperty("NavigationPage", "activity.gyms.element");
    private String playmatsElement = prop.getProperty("NavigationPage", "playmats.element");
    private String bouncersElement = prop.getProperty("NavigationPage", "bouncers.element");
    private String playpensElement = prop.getProperty("NavigationPage", "playpens.element");
    private String walkersElement = prop.getProperty("NavigationPage", "walkers.element");
    private String jumpersElement = prop.getProperty("NavigationPage", "jumpers.element");
    private String activityCenterShopAllElement = prop.getProperty("NavigationPage", "activity.center.shop.all.element");
    private String chiccoElement = prop.getProperty("NavigationPage", "chicco.element");
    private String babyzenElement = prop.getProperty("NavigationPage", "babyzen.element");
    private String maxicosiElement = prop.getProperty("NavigationPage", "maxi.cosi.element");
    private String sunvenoElement = prop.getProperty("NavigationPage", "sunveno.element");
    private String britaxElement = prop.getProperty("NavigationPage", "britax.element");
    private String gracoElement = prop.getProperty("NavigationPage", "graco.element");
    private String topBrandsShopAllElement = prop.getProperty("NavigationPage", "topbrands.shop.all.element");
    private String diaperWipesElement = prop.getProperty("NavigationPage", "diapers.wipes.element");
    private String diaperBinsRefillsElement = prop.getProperty("NavigationPage", "diaper.bins.refills.element");
    private String changingTableMatsElement = prop.getProperty("NavigationPage", "changing.tables.mats.element");
    private String creamsAndPowdersElement = prop.getProperty("NavigationPage", "creams.powders.element");
    private String diaperingTopBrandsElement = prop.getProperty("NavigationPage", "diapering.top.brands.element");
    private String disposableDiapersElement = prop.getProperty("NavigationPage", "disposable.diapers.element");
    private String swimmingDiapersElement = prop.getProperty("NavigationPage", "swimming.diapers.element");
    private String reusableDiapersElement = prop.getProperty("NavigationPage", "reusable.diapers.element");
    private String wipesElement = prop.getProperty("NavigationPage", "wipes.element");
    private String wipesPouchesElement = prop.getProperty("NavigationPage", "wipes.pouches.element");
    private String diapersWipesShopAllElement = prop.getProperty("NavigationPage", "diapers.wipes.shop.all.element");
    private String refillsElement = prop.getProperty("NavigationPage", "refills.element");
    private String diapersBinsElement = prop.getProperty("NavigationPage", "diaper.bins.element");
    private String diapersBinsRefillsShopAllElement = prop.getProperty("NavigationPage", "diaper.bins.refiils.shop.all.element");
    private String changingMatsElement = prop.getProperty("NavigationPage", "changing.mats.element");
    private String changingTablesElement = prop.getProperty("NavigationPage", "changing.tables.element");
    private String changingMatCoversElement = prop.getProperty("NavigationPage", "changing.mat.covers.element");
    private String changingTableMatsShopAll = prop.getProperty("NavigationPage", "changing.table.mats.shop.all.element");
    private String diaperRashCreamsElement = prop.getProperty("NavigationPage", "diaper.rash.creams.element");
    private String babyPowdersElement = prop.getProperty("NavigationPage", "baby.powders.element");
    private String creamsPowderShopAllElement = prop.getProperty("NavigationPage", "creams.powders.shop.all.element");
    private String pampersElement = prop.getProperty("NavigationPage", "pampers.element");
    private String waterWipesElement = prop.getProperty("NavigationPage", "water.wipes.element");
    private String pureBornElement = prop.getProperty("NavigationPage", "pure.born.element");
    private String tommeeTippeeElement = prop.getProperty("NavigationPage", "tommee.tippee.element");
    private String babyJoyElement = prop.getProperty("NavigationPage", "baby.joy.element");
    private String huggiesElement = prop.getProperty("NavigationPage", "huggies.element");
    private String breastFeedingElement = prop.getProperty("NavigationPage", "breastfeeding.element");
    private String babyFoodFormulaElement = prop.getProperty("NavigationPage", "baby.food.formula.element");
    private String bottleFeedingElement = prop.getProperty("NavigationPage", "bottle.feeding.element");
    private String solidFeedingElement = prop.getProperty("NavigationPage", "solid.feeding.element");
    private String highChairsBoostersElement = prop.getProperty("NavigationPage", "high.chairs.boosters.element");
    private String foodPreparationElement = prop.getProperty("NavigationPage", "food.preparation.element");
    private String breastPumpsElement = prop.getProperty("NavigationPage", "breast.pumps.element");
    private String nursingCoversBrasElement = prop.getProperty("NavigationPage", "nursing.covers.bras.element");
    private String breastmilkStorageBagsElement = prop.getProperty("NavigationPage", "breastmilk.storage.bags.element");
    private String breastShellsCreamsElement = prop.getProperty("NavigationPage", "breast.shells.creams.element");
    private String nursingPadsWipesElement = prop.getProperty("NavigationPage", "nursing.pads.wipes.element");
    private String breastfeedingShopAllElement = prop.getProperty("NavigationPage", "breastfeeding.shop.all.element");
    private String babyFormulaElement = prop.getProperty("NavigationPage", "baby.formula.element");
    private String babyFoodElement = prop.getProperty("NavigationPage", "baby.food.element");
    private String cerealsElement = prop.getProperty("NavigationPage", "cereals.element");
    private String bevaragesElement = prop.getProperty("NavigationPage", "bevarages.element");
    private String babyFoodFormulaShopAll = prop.getProperty("NavigationPage", "baby.food.formula.shop.all.element");
    private String bottlesElement = prop.getProperty("NavigationPage", "bottles.element");
    private String warmersSterilizersElement = prop.getProperty("NavigationPage", "warmers.sterilizers.element");
    private String bottleWashingDryingElement = prop.getProperty("NavigationPage", "bottle.washing.drying.element");
    private String nipplesElement = prop.getProperty("NavigationPage", "nipples.element");
    private String bottleAccessoriesElement = prop.getProperty("NavigationPage", "bottle.accessories.element");
    private String bottleFeedingShopAllElement = prop.getProperty("NavigationPage", "bottle.feeding.shop.all.element");
    private String beakersCupsElement = prop.getProperty("NavigationPage", "beakers.cups.element");
    private String platesBowlsSetsElement = prop.getProperty("NavigationPage", "plates.bowls.sets.element");
    private String bibsBurpClothsElement = prop.getProperty("NavigationPage", "bibs.burp.cloths.element");
    private String utensilsElement = prop.getProperty("NavigationPage", "utensils.element");
    private String feedersElement = prop.getProperty("NavigationPage", "feeders.element");
    private String solidFeedingShopAllElement = prop.getProperty("NavigationPage", "solid.feeding.shop.all.element");
    private String highChairsElement = prop.getProperty("NavigationPage", "high.chairs.element");
    private String boosterElement = prop.getProperty("NavigationPage", "booster.element");
    private String highChairsBoostersAccessoriesElement = prop.getProperty("NavigationPage", "high.chairs.boosters.accessories.element");
    private String highChairsBoostersShopAllElement = prop.getProperty("NavigationPage", "high.chairs.boosters.shop.all.element");
    private String babyFoodProcessorsElement = prop.getProperty("NavigationPage", "baby.food.processors.element");
    private String foodContainersElement = prop.getProperty("NavigationPage", "food.containers.element");
    private String foodPreparationShopAllElement = prop.getProperty("NavigationPage", "food.preparation.shop.all.element");
    private String dollsAndDollhousesElement =  prop.getProperty("NavigationPage", "dolls.dollhouses.element");
    private String dollhousesElement =  prop.getProperty("NavigationPage", "dollhouses.element");
    private String dollsPlaysetsElement =  prop.getProperty("NavigationPage", "dolls.playsets.element");
    private String babyDollsElement =  prop.getProperty("NavigationPage", "baby.dolls.element");
    private String fashionDollsElement =  prop.getProperty("NavigationPage", "fashion.dolls.element");
    private String dollsAccessoriesElement =  prop.getProperty("NavigationPage", "dolls.accessories.element");
    private String dollsDollhousesShopAllElement =  prop.getProperty("NavigationPage", "dolls.dollhouses.shop.all.element");
    private String vehiclesElement =  prop.getProperty("NavigationPage", "vehicles.element");
    private String carsElement =  prop.getProperty("NavigationPage", "cars.element");
    private String trucksElement =  prop.getProperty("NavigationPage", "trucks.element");
    private String remoteControlledVehiclesElement =  prop.getProperty("NavigationPage", "remote.controlled.vehicles.element");
    private String trainsElement =  prop.getProperty("NavigationPage", "trains.element");
    private String batteriesElement =  prop.getProperty("NavigationPage", "batteries.element");
    private String vehiclesShopAllElement =  prop.getProperty("NavigationPage", "vehicles.shop.all.element");
    private String rolePlayArtsElement =  prop.getProperty("NavigationPage", "role.play.arts.element");
    private String artsAndCraftElement =  prop.getProperty("NavigationPage", "arts.crafts.element");
    private String rolePlayElement =  prop.getProperty("NavigationPage", "role.play.element");
    private String partyEssentialsElement =  prop.getProperty("NavigationPage", "party.essentials.element");
    private String halloweenElement =  prop.getProperty("NavigationPage", "halloween.element");
    private String rolePlayArtsShopAllElement =  prop.getProperty("NavigationPage", "role.play.arts.shop.all.element");
    private String babyPreSchoolElement =  prop.getProperty("NavigationPage", "baby.pre.school.element");
    private String interactiveToysElement =  prop.getProperty("NavigationPage", "interactive.toys.element");
    private String bathToysElement =  prop.getProperty("NavigationPage", "bath.toys.element");
    private String stuffedToysElement =  prop.getProperty("NavigationPage", "stuffed.toys.element");
    private String rattlesElement =  prop.getProperty("NavigationPage", "rattles.element");
    private String strollerAndCarSeatToysElement =  prop.getProperty("NavigationPage", "stroller.car.seat.toys.element");
    private String babyAndPreSchoolShopAllElement =  prop.getProperty("NavigationPage", "baby.pre.school.shop.all.element");
    private String shopByCharacterElement =  prop.getProperty("NavigationPage", "shop.by.character.element");
    private String pjMasksElement =  prop.getProperty("NavigationPage", "pj.masks.element");
    private String legoElement =  prop.getProperty("NavigationPage", "lego.element");
    private String disneyElement =  prop.getProperty("NavigationPage", "disney.element");
    private String barbieElement =  prop.getProperty("NavigationPage", "barbie.element");
    private String frozenElement =  prop.getProperty("NavigationPage", "frozen.element");
    private String wweElement =  prop.getProperty("NavigationPage", "wwe.element");
    private String shopByCharacterShopAllElement =  prop.getProperty("NavigationPage", "shop.by.character.shop.all.element");
    private String toysTopBrandsElement =  prop.getProperty("NavigationPage", "toys.top.brands.element");
    private String kidkraftElement =  prop.getProperty("NavigationPage", "kidkraft.element");
    private String melissaAndDougElement =  prop.getProperty("NavigationPage", "melissa.and.doug.element");
    private String earlyLearningCentreElement =  prop.getProperty("NavigationPage", "early.learning.centre.element");
    private String lolSurprise =  prop.getProperty("NavigationPage", "lol.surprise.element");
    private String fisherPriceElement =  prop.getProperty("NavigationPage", "fisher.price.element");
    private String toysTopBrandsShopAllElement =  prop.getProperty("NavigationPage", "toys.top.brands.shop.all.element");
    private String swimmingPoolsElement =  prop.getProperty("NavigationPage", "swimming.pools.element");
    private String framePoolsElement =  prop.getProperty("NavigationPage", "frame.pools.element");
    private String inflatablePoolsElement =  prop.getProperty("NavigationPage", "inflatable.pools.element");
    private String lilosAndPoolInflatables =  prop.getProperty("NavigationPage", "lilos.and.pool.inflatables.element");
    private String poolAccessoriesElement =  prop.getProperty("NavigationPage", "pool.accessories.element");
    private String ballPitsElement =  prop.getProperty("NavigationPage", "ball.pits");
    private String swimmingPoolsShopAllElement =  prop.getProperty("NavigationPage", "swimming.pools.shop.all.element");
    private String swimmingSetsPlayhousesElement =  prop.getProperty("NavigationPage", "swimming.sets.playhouses.element");
    private String woodenSwingSetsElement =  prop.getProperty("NavigationPage", "wooden.swing.sets.element");
    private String plasticSwingSetsElement =  prop.getProperty("NavigationPage", "plastic.swing.sets.element");
    private String playhousesElement =  prop.getProperty("NavigationPage", "playhouses.element");
    private String trampolinesElement =  prop.getProperty("NavigationPage", "trampolines.element");
    private String waterSlidesBouncersElement =  prop.getProperty("NavigationPage", "water.slides.bouncers.element");
    private String swingSetsPlayhousesShopAllElement =  prop.getProperty("NavigationPage", "swing.sets.playhouses.shop.all.element");
    private String sandboxesWaterTablesElement =  prop.getProperty("NavigationPage", "sandboxes.water.tables.element");
    private String sandboxesElement =  prop.getProperty("NavigationPage", "sandboxes.element");
    private String waterTablesElement =  prop.getProperty("NavigationPage", "water.tables.element");
    private String bucketsSpadesElement =  prop.getProperty("NavigationPage", "buckets.spades.element");
    private String sandboxesWaterTablesShopAllElement =  prop.getProperty("NavigationPage", "sandboxes.water.tables.shop.all.element");
    private String rideonsBikesAndTricksElement =  prop.getProperty("NavigationPage", "ride-ons.bikes.and.tricks.element");
    private String electricRideonsElement =  prop.getProperty("NavigationPage", "electric.ride-ons.element");
    private String manualRideonsElement =  prop.getProperty("NavigationPage", "manual.ride-ons.element");
    private String bikesAndTricksElement =  prop.getProperty("NavigationPage", "bikes.and.tricks.element");
    private String scootersElement =  prop.getProperty("NavigationPage", "scooters.element");
    private String skatesAndWheeliesElement =  prop.getProperty("NavigationPage", "skates.and.wheelies.element");
    private String rideOnsBikesTricksShopAllElement =  prop.getProperty("NavigationPage", "ride-ons.bikes.tricks.shop.all.element");
    private String outdoorTopBrandsElement =  prop.getProperty("NavigationPage", "outdoor.top.brands.element");
    private String intexElement =  prop.getProperty("NavigationPage", "intex.element");
    private String bestwayElement =  prop.getProperty("NavigationPage", "bestway.element");
    private String megastarRideonsElement =  prop.getProperty("NavigationPage", "megastar.rideons.element");
    private String springfreeElement =  prop.getProperty("NavigationPage", "springfree.element");
    private String step2Element =  prop.getProperty("NavigationPage", "step2.element");
    private String canadianSwingsetsElement =  prop.getProperty("NavigationPage", "canadian.swingsets.element");
    private String outdoorTopBrandsShopAllElement =  prop.getProperty("NavigationPage", "outdoor.top.brands.shop.all.element");
    private String bathtimeElement =  prop.getProperty("NavigationPage", "bathtime.element");
    private String bathingTubsAndSeatsElement =  prop.getProperty("NavigationPage", "bathing.tubs.and.seats.element");
    private String babyWashesAndSoapsElement =  prop.getProperty("NavigationPage", "baby.washes.soaps.element");
    private String bathShowerFiltersElement =  prop.getProperty("NavigationPage", "bath.shower.filters.element");
    private String pottyTrainingElement =  prop.getProperty("NavigationPage", "potty.training.element");
    private String towelsAndFlannelsElement =  prop.getProperty("NavigationPage", "towels.and.flannels.element");
    private String bathtimeShopAllElement =  prop.getProperty("NavigationPage", "bathtime.shop.all.element");
    private String hairAndSkinCareElement =  prop.getProperty("NavigationPage", "hair.and.skin.care.element");
    private String oilsLotionsAndCreamsElement =  prop.getProperty("NavigationPage", "oils.lotions.and.creams.element");
    private String shampoosAndConditionersElement =  prop.getProperty("NavigationPage", "shampoos.and.conditioners.element");
    private String stylingAndOilsElement =  prop.getProperty("NavigationPage", "styling.and.oils.element");
    private String handWashesAndSanitisersElement =  prop.getProperty("NavigationPage", "hand.washes.and.sanitisers.element");
    private String hairAndSkinCareShopAllElement =  prop.getProperty("NavigationPage", "hair.and.skin.care.shop.all.element");
    private String healthAndBabyCareElement =  prop.getProperty("NavigationPage", "health.and.baby.care.element");
    private String humidifiersAndVaporizersElement =  prop.getProperty("NavigationPage", "humidifiers.and.vaporizers.element");
    private String travelCareElement =  prop.getProperty("NavigationPage", "travel.care.element");
    private String roomAndBodyThermometersElement =  prop.getProperty("NavigationPage", "room.and.body.thermometers.element");
    private String groomingElement =  prop.getProperty("NavigationPage", "grooming.element");
    private String medicalAndFirstAidElement =  prop.getProperty("NavigationPage", "medical.and.first.aid.element");
    private String healthAndBabyCareShopAllElement =  prop.getProperty("NavigationPage", "health.and.baby.care.shop.all.element");
    private String pacifiersAndTeethersElement =  prop.getProperty("NavigationPage", "pacifiers.and.teethers.element");
    private String pacifierElement =  prop.getProperty("NavigationPage", "pacifiers.element");
    private String teethersAndTeethingReliefElement =  prop.getProperty("NavigationPage", "teethers.and.teething.relief.element");
    private String pacifierBoxesAndHoldersElement =  prop.getProperty("NavigationPage", "pacifier.boxes.and.holders.element");
    private String pacifierClipsElement =  prop.getProperty("NavigationPage", "pacifier.clips.element");
    private String pacifiersShopAllElement =  prop.getProperty("NavigationPage", "pacifiers.shop.all.element");
    private String safetyElement =  prop.getProperty("NavigationPage", "safety.element");
    private String monitorsElement =  prop.getProperty("NavigationPage", "monitors.element");
    private String safetyGatesAndExtensionsElement =  prop.getProperty("NavigationPage", "safety.gates.and.extensions.element");
    private String childProofingElement =  prop.getProperty("NavigationPage", "child.proofing.element");
    private String travelSafetyElement =  prop.getProperty("NavigationPage", "travel.safety.element");
    private String safetyShopAllElement =  prop.getProperty("NavigationPage", "safety.shop.all.element");
    private String bathAndBabyCareTopBrandsElement =  prop.getProperty("NavigationPage", "bath.and.baby.care.top.brands.element");
    private String blueairElement =  prop.getProperty("NavigationPage", "blue.air.element");
    private String aveenoElement =  prop.getProperty("NavigationPage", "aveeno.element");
    private String bathAndBabyCareChiccoElement =  prop.getProperty("NavigationPage", "bath.and.baby.care.chicco.element");
    private String mustelaElement =  prop.getProperty("NavigationPage", "mustela.element");
    private String originalSproutElement =  prop.getProperty("NavigationPage", "original.sprout.element");
    private String bathAndBabyCareTopBrandsShopAllElement =  prop.getProperty("NavigationPage", "bath.care.and.top.brands.shop.all.element");
    private String duringPregnancyElement =  prop.getProperty("NavigationPage", "during.pregnancy.element");
    private String bodyElement =  prop.getProperty("NavigationPage", "body.element");
    private String faceCareElement =  prop.getProperty("NavigationPage", "face.care.element");
    private String dentalElement =  prop.getProperty("NavigationPage", "dental.care.element");
    private String vitaminsElement =  prop.getProperty("NavigationPage", "vitamins.element");
    private String pregnancyCushionsElement =  prop.getProperty("NavigationPage", "pregnancy.cushions.element");
    private String duringPregnancyShopAllElement =  prop.getProperty("NavigationPage", "during.pregnancy.shop.all.element");
    private String dressYourBumpElement =  prop.getProperty("NavigationPage", "dress.your.bump.element");
    private String underwearElement =  prop.getProperty("NavigationPage", "underwear.element");
    private String shapewearElement =  prop.getProperty("NavigationPage", "shapewear.element");
    private String sleepwearElement =  prop.getProperty("NavigationPage", "sleepwear.element");
    private String swimwearElement =  prop.getProperty("NavigationPage", "swimwear.element");
    private String maternityWearElement =  prop.getProperty("NavigationPage", "maternity.wear.element");
    private String dressYourBumpShopAllElement =  prop.getProperty("NavigationPage", "dress.your.bump.shop.all.element");
    private String getFitElement =  prop.getProperty("NavigationPage", "get.fit.element");
    private String wristMonitorsElement =  prop.getProperty("NavigationPage", "wrist.monitors.element");
    private String headphonesElement =  prop.getProperty("NavigationPage", "headphones.element");
    private String apparelElement =  prop.getProperty("NavigationPage", "apparel.element");
    private String equipmentElement =  prop.getProperty("NavigationPage", "equipment.element");
    private String getFitAccessoriesElement =  prop.getProperty("NavigationPage", "get.fit.accessories.element");
    private String getFitShopAllElement =  prop.getProperty("NavigationPage", "get.fit.shop.all.element");
    private String postPregnancyElement =  prop.getProperty("NavigationPage", "post.pregnancy.element");
    private String postPregnancyBodyElement =  prop.getProperty("NavigationPage", "post.pregnancy.body.element");
    private String faceAndTeethElement =  prop.getProperty("NavigationPage", "face.and.teeth.element");
    private String hairCareElement =  prop.getProperty("NavigationPage", "hair.care.element");
    private String postPregnancyVitaminsElement =  prop.getProperty("NavigationPage", "post.pregnancy.vitamins.element");
    private String postPregnancyShopAllElement =  prop.getProperty("NavigationPage", "post.pregnancy.shop.all.element");
    private String topMumsBrandsElement =  prop.getProperty("NavigationPage", "top.mums.brands.element");
    private String fitbitElement =  prop.getProperty("NavigationPage", "fitbit.element");
    private String mandukaElement =  prop.getProperty("NavigationPage", "manduka.element");
    private String naturesBountyElement =  prop.getProperty("NavigationPage", "nature's.bounty.element");
    private String oralBElement =  prop.getProperty("NavigationPage", "oral-B.element");
    private String bellyBanditElement =  prop.getProperty("NavigationPage", "belly.bandit.element");
    private String mumsAndBumpsElement =  prop.getProperty("NavigationPage", "mums.and.bumps.element");
    private String shopByElement =  prop.getProperty("NavigationPage", "shop.by.element");
    private String newInElement =  prop.getProperty("NavigationPage", "new.in.element");
    private String saleElement =  prop.getProperty("NavigationPage", "sale.element");
    private String girlsElement =  prop.getProperty("NavigationPage", "girls.element");
    private String girlsTopsAndTeesElement =  prop.getProperty("NavigationPage", "girls.tops.and.tess.element");
    private String girlsTrousersElement =  prop.getProperty("NavigationPage", "girls.trousers.element");
    private String dressElement =  prop.getProperty("NavigationPage", "dresses.element");
    private String setsAndOnePiecesElement =  prop.getProperty("NavigationPage", "sets.and.one.pieces.element");
    private String girlsSleepwearElement =  prop.getProperty("NavigationPage", "girls.sleepwear.element");
    private String girlsFootwearElement =  prop.getProperty("NavigationPage", "girls.footwear.element");
    private String girlsAccessoriesElement =  prop.getProperty("NavigationPage", "girls.accessories.element");
    private String girlsShopAllElement =  prop.getProperty("NavigationPage", "girls.shop.all.element");
    private String boysElement =  prop.getProperty("NavigationPage", "boys.element");
    private String boysTopsAndTeesElement =  prop.getProperty("NavigationPage", "boys.tops.and.tees.element");
    private String boysTrousersElement =  prop.getProperty("NavigationPage", "boys.trousers.element");
    private String boysSetsAndOnePiecesElement =  prop.getProperty("NavigationPage", "boys.sets.and.one.pieces.element");
    private String boysSleepwearElement =  prop.getProperty("NavigationPage", "boys.sleepwear.element");
    private String boysFootwearElement =  prop.getProperty("NavigationPage", "boys.footwear.element");
    private String boysAccessoriesElement =  prop.getProperty("NavigationPage", "boys.accessories.element");
    private String boysShopAllElement =  prop.getProperty("NavigationPage", "boys.shop.all.element");
    private String unisexElement =  prop.getProperty("NavigationPage", "unisex.element");
    private String unisexTopsAndTeesElement =  prop.getProperty("NavigationPage", "unisex.tops.and.tees.element");
    private String bodysuitsAndRompersElement =  prop.getProperty("NavigationPage", "bodysuits.and.rompers.element");
    private String hatsElement =  prop.getProperty("NavigationPage", "hats.element");
    private String socksElement =  prop.getProperty("NavigationPage", "socks.element");
    private String unisexShopAllElement =  prop.getProperty("NavigationPage", "unisex.shop.all.element");
    private String kidFashionSwimwearElement =  prop.getProperty("NavigationPage", "kids.fashion.swimwear.element");
    private String rashVestsAndShoesElement =  prop.getProperty("NavigationPage", "rash.vests.and.shoes.element");
    private String floatAidsElement =  prop.getProperty("NavigationPage", "float.aids.element");
    private String gogglesAndHatsElement =  prop.getProperty("NavigationPage", "goggles.and.hats.element");
    private String beachTowelsAndBlanketsElement =  prop.getProperty("NavigationPage", "beach.towels.and.blankets.elements");
    private String swimmingSuitsElement =  prop.getProperty("NavigationPage", "swimming.suits.element");
    private String swimwearShopAllElement =  prop.getProperty("NavigationPage", "swimwear.shop.all.element");
    private String kidsFashionTopBrandsElement =  prop.getProperty("NavigationPage", "kids.fashion.top.brands.element");
    private String twinkleHandsElement =  prop.getProperty("NavigationPage", "twinkle.hands.element");
    private String coegaElement =  prop.getProperty("NavigationPage", "coega.element");
    private String slipstopElement =  prop.getProperty("NavigationPage", "slipstop.element");
    private String pimpolhoElement =  prop.getProperty("NavigationPage", "pimpolho.element");
    private String absorbaElement =  prop.getProperty("NavigationPage", "absorba.element");
    private String kidFashionTopBrandsShopAllElement =  prop.getProperty("NavigationPage", "kids.fashion.top.brands.shop.all.element");
    private String kidsFashionShopByElement =  prop.getProperty("NavigationPage", "kids.fashion.shop.by.element");
    private String kidsFashionShopByNewInElement =  prop.getProperty("NavigationPage", "kids.fashion.new.in.element");
    private String kidsFashionSaleElement =  prop.getProperty("NavigationPage", "kids.fashion.sale.element");
    private String cleaningElement =  prop.getProperty("NavigationPage", "cleaning.element");
    private String householdCleanersElement =  prop.getProperty("NavigationPage", "household.cleaners.element");
    private String moppingElement =  prop.getProperty("NavigationPage", "mopping.element");
    private String trashBinsAndBagsElement =  prop.getProperty("NavigationPage", "trash.bins.and.bag.element");
    private String airfreshnersElement =  prop.getProperty("NavigationPage", "air.freshners.element");
    private String cleaningShopAllElement =  prop.getProperty("NavigationPage", "cleaning.shop.all.element");
    private String laundryElement =  prop.getProperty("NavigationPage", "laundry.element");
    private String detergentsAndConditionersElement =  prop.getProperty("NavigationPage", "detergents.and.conditioners.element");
    private String clothesDryingRacksElement =  prop.getProperty("NavigationPage", "cloths.drying.racks.element");
    private String ironingBoardsElement =  prop.getProperty("NavigationPage", "ironing.boards.element");
    private String laundryShopAllElement =  prop.getProperty("NavigationPage", "laundry.shop.all.element");
    private String nurseryFurnitureAndDecorElement =  prop.getProperty("NavigationPage", "nursery.furniture.and.decor.element");
    private String storageAndOrganizationElement =  prop.getProperty("NavigationPage", "storage.and.organization.element");
    private String lightAndLampsElement =  prop.getProperty("NavigationPage", "light.and.lamps.element");
    private String teepeesElement =  prop.getProperty("NavigationPage", "teepees.element");
    private String tableAndChairsElement =  prop.getProperty("NavigationPage", "tables.and.chairs.element");
    private String beanbagsElement =  prop.getProperty("NavigationPage", "beanbags.element");
    private String nurseryFurnitureAndDecorShopAllElement =  prop.getProperty("NavigationPage", "nursery.furniture.and.decor.shop.all.element");
    private String kitchenAndDiningElement =  prop.getProperty("NavigationPage", "kitchen.and.dining.element");
    private String cookwareElement =  prop.getProperty("NavigationPage", "cookware.element");
    private String preparationGadgetsElement =  prop.getProperty("NavigationPage", "preparation.gadgets.element");
    private String cuttingAndChoppingElement =  prop.getProperty("NavigationPage", "cutting.and.chopping.element");
    private String bakewareElement =  prop.getProperty("NavigationPage", "bakeware.element");
    private String weighingAndMeasuringElement =  prop.getProperty("NavigationPage", "weighing.and.measuring.element");
    private String kitchenAndDiningShopAllElement =  prop.getProperty("NavigationPage", "kitchen.and.dining.shop.all.element");
    private String homeAndLifestyleTopBrandsElement =  prop.getProperty("NavigationPage", "home.and.lifestyle.top.brands.element");
    private String arielElement =  prop.getProperty("NavigationPage", "ariel.element");
    private String viledaElement =  prop.getProperty("NavigationPage", "vileda.element");
    private String blackAndDeckerElement =  prop.getProperty("NavigationPage", "black.and.decker.element");
    private String ecoverElement =  prop.getProperty("NavigationPage", "ecover.element");
    private String tefalElement =  prop.getProperty("NavigationPage", "tefal.element");
    private String homeAndLifestyleTopBrandsShopAllElement =  prop.getProperty("NavigationPage", "home.and.lifestyle.top.brands.shop.all.element");
    private String homeAppliancesElement =  prop.getProperty("NavigationPage", "home.appliances.element");
    private String blendersElement =  prop.getProperty("NavigationPage", "blenders.element");
    private String fridgesElement =  prop.getProperty("NavigationPage", "fridges.element");
    private String mixersElement =  prop.getProperty("NavigationPage", "mixers.element");
    private String foodProcessorsElement =  prop.getProperty("NavigationPage", "food.processors.element");
    private String sandwichMakersElement =  prop.getProperty("NavigationPage", "sandwich.makers.element");
    private String vacuumCleanersElement =  prop.getProperty("NavigationPage", "vacuum.cleaners.element");
    private String ironsAndSteamersElement =  prop.getProperty("NavigationPage", "irons.and.steamers.element");
    private String homeAppliancesShopAllElement =  prop.getProperty("NavigationPage", "home.appliances.shop.all.element");
    private String coffeeMachinesAndAccessoriesElement =  prop.getProperty("NavigationPage", "coffee.machines.and.accessories.element");
    private String coffeeAndEspresssoMachinesElement =  prop.getProperty("NavigationPage", "coffee.and.espresso.machines.element");
    private String coffeeAndTeaMakersElement =  prop.getProperty("NavigationPage", "coffee.and.tea.makers.element");
    private String coffeeCapsulesElement =  prop.getProperty("NavigationPage", "coffee.capsules.element");
    private String kettlesElement =  prop.getProperty("NavigationPage", "kettles.element");
    private String coffeeMachinesAndAccessoriesShopAllElement =  prop.getProperty("NavigationPage", "coffee.machines.and.accessories.shop.all.element");
    private String appliancesTopBrandsElement =  prop.getProperty("NavigationPage", "appliances.top.brands.element");
    private String smegElement =  prop.getProperty("NavigationPage", "smeg.element");
    private String illyElement =  prop.getProperty("NavigationPage", "illy.element");
    private String brevilleElement =  prop.getProperty("NavigationPage", "breville.element");
    private String nespressoElement =  prop.getProperty("NavigationPage", "nespresso.element");
    private String kenwoodElement =  prop.getProperty("NavigationPage", "kenwood.element");
    private String appliancesBlackAndDeckerElement =  prop.getProperty("NavigationPage", "appliances.black.and.decker.element");
    private String appliancesTopbrandsShopAllElement =  prop.getProperty("NavigationPage", "appliances.top.brands.shop.all.element");
    private String childrensBooksElement =  prop.getProperty("NavigationPage", "children's.books.element");
    private String educationalElement =  prop.getProperty("NavigationPage", "educational.element");
    private String babiesAndToddlersElement =  prop.getProperty("NavigationPage", "babies.and.toddlers.element");
    private String preTeensElement =  prop.getProperty("NavigationPage", "pre.teens.element");
    private String childrensBoosShopAllElement =  prop.getProperty("NavigationPage", "children's.books.shop.all.element");
    private String schoolEsssentialsElement =  prop.getProperty("NavigationPage", "school.essentials.element");
    private String lunchBoxesElement =  prop.getProperty("NavigationPage", "lunch.boxes.element");
    private String lunchBagsElement =  prop.getProperty("NavigationPage", "lunch.bags.element");
    private String lunchSnacksElement =  prop.getProperty("NavigationPage", "lunch.snacks.element");
    private String waterBottlesElement =  prop.getProperty("NavigationPage", "water.bottles.element");
    private String stationaryElement =  prop.getProperty("NavigationPage", "stationary.element");
    private String pencilsAndPensElement =  prop.getProperty("NavigationPage", "pencils.and.pens.element");
    private String colouringToolsElement =  prop.getProperty("NavigationPage", "colouring.tools.element");
    private String pencilCasesElement =  prop.getProperty("NavigationPage", "pencil.cases.element");
    private String stationaryExtrasElement =  prop.getProperty("NavigationPage", "stationary.extras.element");
    private String stationaryShopAllElement =  prop.getProperty("NavigationPage", "stationary.shop.all.element");
    private String schoolBagsElement =  prop.getProperty("NavigationPage", "school.bags.element");
    private String backpacksElement =  prop.getProperty("NavigationPage", "backpacks.element");
    private String totesElement =  prop.getProperty("NavigationPage", "totes.element");
    private String trolleyBagsElement =  prop.getProperty("NavigationPage", "trolley.bags.element");
    private String pursesElement =  prop.getProperty("NavigationPage", "purses.element");
    private String schoolBagsShopAllElement =  prop.getProperty("NavigationPage", "school.bags.shop.all.element");
    private String schoolTopBrandsElement =  prop.getProperty("NavigationPage", "school.top.brands.element");
    private String yumboxElement =  prop.getProperty("NavigationPage", "yumbox.element");
    private String crayolaElement =  prop.getProperty("NavigationPage", "crayola.element");
    private String citronElement =  prop.getProperty("NavigationPage", "citron.element");
    private String herschelElement =  prop.getProperty("NavigationPage", "herschel.element");
    private String smilyKiddosElement =  prop.getProperty("NavigationPage", "smily.kiddos.element");
    private String schoolTopBrandsShopAllElement =  prop.getProperty("NavigationPage", "school.top.brands.shop.all.element");
    private String newbornGiftsElement =  prop.getProperty("NavigationPage", "newborn.gifts.element");
    private String milestoneCardsElement =  prop.getProperty("NavigationPage", "milestone.cards.element");
    private String babyArtElement =  prop.getProperty("NavigationPage", "baby.art.element");
    private String newbornGiftsMuslinsAndSwaddlesElement =  prop.getProperty("NavigationPage", "newborn.gifts.muslins.and.swaddles.element");
    private String newbornGiftSetsElement =  prop.getProperty("NavigationPage", "newborn.gift.sets.element");
    private String gearUnder100AedElement =  prop.getProperty("NavigationPage", "gear.under.100.aed.element");
    private String gearUnder250AedElement =  prop.getProperty("NavigationPage", "gear.under.250.aed.element");
    private String newbornGiftsShopAllElement =  prop.getProperty("NavigationPage", "newborn.gifts.shop.all.element");
    private String giftToysElement =  prop.getProperty("NavigationPage", "gift.toys.element");
    private String under50AedElement =  prop.getProperty("NavigationPage", "under.50.aed.element");
    private String under100AedElement =  prop.getProperty("NavigationPage", "under.100.aed.element");
    private String under500AedElement =  prop.getProperty("NavigationPage", "under.500.aed.element");
    private String under1000AedElement =  prop.getProperty("NavigationPage", "under.1000.aed.element");
    private String giftToysShopAllElement =  prop.getProperty("NavigationPage", "gift.toys.shop.all.element");
    private String mumsToBeGiftedElement =  prop.getProperty("NavigationPage", "mums.to.be.gifted.element");
    private String phoneAccessoriesElement =  prop.getProperty("NavigationPage", "phone.accessories.element");
    private String bodyCareElement =  prop.getProperty("NavigationPage", "body.care.element");
    private String bathTimeElement =  prop.getProperty("NavigationPage", "bath.time.element");
    private String essentialOilsElement =  prop.getProperty("NavigationPage", "essential.oils.element");
    private String mumsToBeGiftedShopAllelement =  prop.getProperty("NavigationPage", "mums.to.be.gifted.shop.all.element");
    private String finishingTouchesElement =  prop.getProperty("NavigationPage", "finishing.touches.element");
    private String candlesAndDiffusersElement =  prop.getProperty("NavigationPage", "candles.and.diffusers.element");
    private String homeAccessoriesElement =  prop.getProperty("NavigationPage", "home.accessories.element");
    private String notebooksElement =  prop.getProperty("NavigationPage", "notebook.element");
    private String flowersElement =  prop.getProperty("NavigationPage", "flowers.element");
    private String finishingTouchesShopAllElement =  prop.getProperty("NavigationPage", "finishing.touches.shop.all.element");
    private String giftsPartyEssentialsElement =  prop.getProperty("NavigationPage", "gifts.party.essentials.element");
    private String ballonsAndBannersElement =  prop.getProperty("NavigationPage", "balloons.and.banners.element");
    private String birthdayCandlesElement =  prop.getProperty("NavigationPage", "birthday.candles.element");
    private String partyTablewareElement =  prop.getProperty("NavigationPage", "party.tableware.element");
    private String partyHornsElement =  prop.getProperty("NavigationPage", "party.horns.element");
    private String partyEssentialsShopAllElement =  prop.getProperty("NavigationPage", "party.essentials.shop.all.element");
    private String giftVouchersElement =  prop.getProperty("NavigationPage", "gift.vouchers.element");
    private String spriiGiftVouchersElement =  prop.getProperty("NavigationPage", "sprii.gift.vouchers.element");
    private String photographyElement =  prop.getProperty("NavigationPage", "photography.element");
    private String giftVouchersShopAllElement =  prop.getProperty("NavigationPage", "gift.vouchers.shop.all.element");




    public GearPage selectGearPage(){
        SpriiTestFramework.getInstance().waitForElement(By.linkText(gearElement), 20);
        driver.findElement(By.linkText(gearElement)).click();
        return new GearPage();
    }

    public DiaperingPage selectDiaperingPage(){
        SpriiTestFramework.getInstance().waitForElement(By.linkText(diaperingElement), 20);
        driver.findElement(By.linkText(diaperingElement)).click();
        return new DiaperingPage();
    }

    public FeedingPage selectFeedingPage(){
        SpriiTestFramework.getInstance().waitForElement(By.linkText(feedingElement), 20);
        driver.findElement(By.linkText(feedingElement)).click();
        return new FeedingPage();
    }

    public ToysPage selectToysPage (){
        SpriiTestFramework.getInstance().waitForElement(By.linkText(toysElement), 20);
        driver.findElement(By.linkText(toysElement)).click();
        return new ToysPage();
    }

    public OutdoorPage clickOutdoorPage(){
        SpriiTestFramework.getInstance().waitForElement(By.linkText(outdoorElement), 20);
        driver.findElement(By.linkText(outdoorElement)).click();
        return new OutdoorPage();
    }

    public BathandBabyCarePage clickBathandBabyCarePage(){
        SpriiTestFramework.getInstance().waitForElement(By.linkText(bathBabyElement), 20);
        driver.findElement(By.linkText(bathBabyElement)).click();
        return new BathandBabyCarePage();
    }

    public MumsPage clickMumsPage(){
        SpriiTestFramework.getInstance().waitForElement(By.linkText(mumsElement), 20);
        driver.findElement(By.linkText(mumsElement)).click();
        return new MumsPage();
    }

    public KidsFashionPage clicKidsFashionPage(){
        SpriiTestFramework.getInstance().waitForElement(By.linkText(kidsFashionElement), 20);
        driver.findElement(By.linkText(kidsFashionElement)).click();
        return new KidsFashionPage();
    }

    public HomeandLifeStylePage clickHomeandLifestylePage(){
        SpriiTestFramework.getInstance().waitForElement(By.linkText(homeLifestyleElement), 20);
        driver.findElement(By.linkText(homeLifestyleElement)).click();
        return new HomeandLifeStylePage();
    }

    public AppliancesPage clickAppliancesPage(){
        SpriiTestFramework.getInstance().waitForElement(By.linkText(appliancesElement), 20);
        driver.findElement(By.linkText(appliancesElement)).click();
        return new AppliancesPage();
    }

    public SchoolPage clickSchoolPage(){
        SpriiTestFramework.getInstance().waitForElement(By.linkText(schoolElement), 20);
        driver.findElement(By.linkText(schoolElement)).click();
        return new SchoolPage();
    }

    public GiftsPage clickGearPage(){
        SpriiTestFramework.getInstance().waitForElement(By.linkText(giftsElement), 20);
        driver.findElement(By.linkText(giftsElement)).click();
        return new GiftsPage();
    }

    public StrollerAndAccessoriesPage selectStrollersAndAccessoriesInGear(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(gearElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(strollerAccessoriesElement), 20);
        driver.findElement(By.linkText(strollerAccessoriesElement)).click();
        return new StrollerAndAccessoriesPage();
    }

    public CarSeatsAndAccessoriesPage selectCarSeatsAndAccessoriesInGear(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(gearElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(carSeatsAccessoriesElement), 20);
        driver.findElement(By.linkText(carSeatsAccessoriesElement)).click();
        return new CarSeatsAndAccessoriesPage();
    }

    public BedsAndCotsPage selectBedsAndCotsInGear(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(gearElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(bedsAndCotsElement), 20);
        driver.findElement(By.xpath(bedsAndCotsElement)).click();
        return new BedsAndCotsPage();
    }

    public TravelPage selectTravelPageInGear(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(gearElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(travelElement), 20);
        driver.findElement(By.linkText(travelElement)).click();
        return new TravelPage();
    }

    public ActivityCentersPage selectActivityCentersInGear(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(gearElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(activityCentersElement), 20);
        driver.findElement(By.linkText(activityCentersElement)).click();
        return new ActivityCentersPage();
    }

    public GearTopBrandsPage selectGearTopBrands(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(gearElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(topBrandsElement), 20);
        driver.findElement(By.xpath(topBrandsElement)).click();
        return new GearTopBrandsPage();
    }

    public StrollersPage selectStrollersPageInGear(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(gearElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(strollerElement), 20);
        driver.findElement(By.linkText(strollerElement)).click();
        return new StrollersPage();
    }

    public TravelSystemsPage selectTravelSystemsPageInGear(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(gearElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(travelSystemsElement), 20);
        driver.findElement(By.linkText(travelSystemsElement)).click();
        return new TravelSystemsPage();
    }

    public TwinStrollersPage selectTwinStrollersPageInGear(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(gearElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(twinStrollersElement), 20);
        driver.findElement(By.linkText(twinStrollersElement)).click();
        return new TwinStrollersPage();
    }

    public SandAAccessoriesPage selectSandAAccessoriesPageInGear(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(gearElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(sAndaAccessoriesElement), 20);
        driver.findElement(By.linkText(sAndaAccessoriesElement)).click();
        return new SandAAccessoriesPage();
    }

    public SandAShopAllPage selectSandAShopAllPageInGear(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(gearElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(sAndaShopAllElement), 20);
        driver.findElement(By.xpath(sAndaShopAllElement)).click();
        return new SandAShopAllPage();
    }

    public CarSeatsPage selectCarSeatsPageInGear(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(gearElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(carSeatsElement), 20);
        driver.findElement(By.linkText(carSeatsElement)).click();
        return new CarSeatsPage();
    }

    public CarSeatToysPage selectCarSeatToysPageInGear(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(gearElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(carSeatToysElement), 20);
        driver.findElement(By.linkText(carSeatToysElement)).click();
        return new CarSeatToysPage();
    }

    public BoostersPage selectBoostersPageInGear(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(gearElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(boostersElement), 20);
        driver.findElement(By.linkText(boostersElement)).click();
        return new BoostersPage();
    }

    public CSandAAccessoriesPage selectCSandAAccessoriesPageInGear(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(gearElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(cSandAAccessoriesElement), 20);
        driver.findElement(By.linkText(cSandAAccessoriesElement)).click();
        return new CSandAAccessoriesPage();
    }

    public CSandAccessoriesShopAllPage selectCSandAccessoriesPageInGera(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(gearElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(cSandAccessoriesShopAllElement), 20);
        driver.findElement(By.xpath(cSandAccessoriesShopAllElement)).click();
        return new CSandAccessoriesShopAllPage();
    }

    public CotsCribsAndBassinetsPage selectCotsCribsBassientsPageInGear(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(gearElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(cotsCribsAndBassinetsElement), 20);
        driver.findElement(By.linkText(cotsCribsAndBassinetsElement)).click();
        return new CotsCribsAndBassinetsPage();
    }

    public PodsAndNestsPage selectPodsAndNestsInGear(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(gearElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(podsAndNetsElement), 20);
        driver.findElement(By.linkText(podsAndNetsElement)).click();
        return new PodsAndNestsPage();
    }

    public BeddingPage selectBeddingPageInGear(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(gearElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(beddingElement), 20);
        driver.findElement(By.linkText(beddingElement)).click();
        return new BeddingPage();
    }

    public MuslinsAndSwaddlesPage selectMuslinsAndSwaddlesPageInGear(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(gearElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(muslinsAndSwaddlesElement), 20);
        driver.findElement(By.xpath(muslinsAndSwaddlesElement)).click();
        return new MuslinsAndSwaddlesPage();
    }

    public BedsAndBedRailsPage selectBedsAndBedRailPageInGear(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(gearElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(bedsAndBedRailsElement), 20);
        driver.findElement(By.linkText(bedsAndBedRailsElement)).click();
        return new BedsAndBedRailsPage();
    }

    public BAndCShopAllPage selectBedsAndCotsShopAllPageInGear(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(gearElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(bAndCShopAllElement), 20);
        driver.findElement(By.xpath(bAndCShopAllElement)).click();
        return new BAndCShopAllPage();
    }

    public ChangingBagsPage selectChangingBagsPageInGear(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(gearElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(changingBagsElement), 20);
        driver.findElement(By.linkText(changingBagsElement)).click();
        return new ChangingBagsPage();
    }

    public BackpacksAndCarriersPage selectBackpacksAndCarriersPageInGear(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(gearElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(backpacksAndCarriersElement), 20);
        driver.findElement(By.linkText(backpacksAndCarriersElement)).click();
        return new BackpacksAndCarriersPage();
    }

    public TravelCotsPage selectTravelCotsPageInGear(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(gearElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(travelCotsElement), 20);
        driver.findElement(By.linkText(travelCotsElement)).click();
        return new TravelCotsPage();
    }

    public SuitcasesPage selectSuitcasesPageInGear(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(gearElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(suitcaseElement), 20);
        driver.findElement(By.linkText(suitcaseElement)).click();
        return new SuitcasesPage();
    }

    public TravelShopAllPage selectTravelShopAllPageInGear(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(gearElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(travelShopAllElement), 20);
        driver.findElement(By.xpath(travelShopAllElement)).click();
        return new TravelShopAllPage();
    }

    public ActivityGymsPage selectActivityGymsPageInGear(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(gearElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(activityGymsElement), 20);
        driver.findElement(By.linkText(activityGymsElement)).click();
        return new ActivityGymsPage();
    }

    public PlaymatsPage selectPlaymatsPageInGear(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(gearElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(playmatsElement), 20);
        driver.findElement(By.linkText(playmatsElement)).click();
        return new PlaymatsPage();
    }

    public BouncersPage selectBouncersPageInGear(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(gearElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(bouncersElement), 20);
        driver.findElement(By.linkText(bouncersElement)).click();
        return new BouncersPage();
    }

    public PlaypensPage selectPlaypensPageInGear(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(gearElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(playpensElement), 20);
        driver.findElement(By.linkText(playpensElement)).click();
        return new PlaypensPage();
    }

    public WalkersPage selectWalkersPageInGear(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(gearElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(walkersElement), 20);
        driver.findElement(By.linkText(walkersElement)).click();
        return new WalkersPage();
    }

    public JumpersPage selectJumpersPageInGear(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(gearElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(jumpersElement), 20);
        driver.findElement(By.linkText(jumpersElement)).click();
        return new JumpersPage();
    }

    public AandCShopAllPage selectAandCShopAllPageInGear(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(gearElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(activityCenterShopAllElement), 20);
        driver.findElement(By.xpath(activityCenterShopAllElement)).click();
        return new AandCShopAllPage();
    }

    public ChiccoBrandPage selectChiccoBrandPageInGear(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(gearElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(chiccoElement), 20);
        driver.findElement(By.linkText(chiccoElement)).click();
        return new ChiccoBrandPage();
    }

    public BabyzenBrandPage selectBabyzenBrandPageInGear(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(gearElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(babyzenElement), 20);
        driver.findElement(By.linkText(babyzenElement)).click();
        return new BabyzenBrandPage();
    }

    public MaxiCosiBrandPage selectMaxiCosiBrandPageInGear(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(gearElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(maxicosiElement), 20);
        driver.findElement(By.linkText(maxicosiElement)).click();
        return new MaxiCosiBrandPage();
    }

    public SunvenoBrandPage selectSunvenoBrandPageInGear(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(gearElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(sunvenoElement), 20);
        driver.findElement(By.linkText(sunvenoElement)).click();
        return new SunvenoBrandPage();
    }

    public BritaxBrandPage selectBritaxBrandPageInGear(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(gearElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(britaxElement), 20);
        driver.findElement(By.linkText(britaxElement)).click();
        return new BritaxBrandPage();
    }

    public GracoBrandPage selectGracoBrandPageInGear(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(gearElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(gracoElement), 20);
        driver.findElement(By.linkText(gracoElement)).click();
        return new GracoBrandPage();
    }

    public TopBrandsShopAllPage selectTopBrandsShopAllPageInGear(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(gearElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(topBrandsShopAllElement), 20);
        driver.findElement(By.xpath(topBrandsShopAllElement)).click();
        return new TopBrandsShopAllPage();
    }

    public DiapersAndWipesPage selectDiapersAndWipesInDiapering(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(diaperingElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(diaperWipesElement), 20);
        driver.findElement(By.linkText(diaperWipesElement)).click();
        return new DiapersAndWipesPage();
    }

    public DiaperBinsAndRefillsPage selectDiaperBinsAndRefillsInDiapering(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(diaperingElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(diaperBinsRefillsElement), 20);
        driver.findElement(By.linkText(diaperBinsRefillsElement)).click();
        return new DiaperBinsAndRefillsPage();
    }

    public ChangingTablesAndMatsPage selectChangingTablesAndMatsPageInDiapering(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(diaperingElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(changingTableMatsElement), 20);
        driver.findElement(By.linkText(changingTableMatsElement)).click();
        return new ChangingTablesAndMatsPage();
    }

    public CreamsAndPowdersPage selectCreamsAndPowdersPageInDiapering(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(diaperingElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(creamsAndPowdersElement), 20);
        driver.findElement(By.linkText(creamsAndPowdersElement)).click();
        return new CreamsAndPowdersPage();
    }

    public DiaperingTopBrandsPage selectTopBrandsPageInDiapering(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(diaperingElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(diaperingTopBrandsElement), 20);
        driver.findElement(By.xpath(diaperingTopBrandsElement)).click();
        return new DiaperingTopBrandsPage();
    }

    public DisposableDiapersPage selectDisposableDiapersPageInDiapering(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(diaperingElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(disposableDiapersElement), 20);
        driver.findElement(By.linkText(disposableDiapersElement)).click();
        return new DisposableDiapersPage();
    }

    public SwimmingDiapersPage selectSwimmingDiapersPageInDiapering(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(diaperingElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(swimmingDiapersElement), 20);
        driver.findElement(By.linkText(swimmingDiapersElement)).click();
        return new SwimmingDiapersPage();
    }

    public ReusableDiapersPage selectReusableDiapersPageInDiapering(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(diaperingElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(reusableDiapersElement), 20);
        driver.findElement(By.linkText(reusableDiapersElement)).click();
        return new ReusableDiapersPage();
    }

    public WipesPage selectWipesPageInDiapering(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(diaperingElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(wipesElement), 20);
        driver.findElement(By.linkText(wipesElement)).click();
        return new WipesPage();
    }

    public WipesPouchesPage selectWipesPouchesInDiapering(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(diaperingElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(wipesPouchesElement), 20);
        driver.findElement(By.linkText(wipesPouchesElement)).click();
        return new WipesPouchesPage();
    }

    public DiapersAndWipesShopAllPage selectDiapersAndWipesShopAllPageInDiapering(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(diaperingElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(diapersWipesShopAllElement), 100);
        driver.findElement(By.xpath(diapersWipesShopAllElement)).click();
        return new DiapersAndWipesShopAllPage();
    }

    public RefillsPage selectRefillsPageInDiapering(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(diaperingElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(refillsElement), 20);
        driver.findElement(By.linkText(refillsElement)).click();
        return new RefillsPage();
    }

    public DiaperBinsPage selectDiaperBinsPageInDiapering(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(diaperingElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(diapersBinsElement), 20);
        driver.findElement(By.linkText(diapersBinsElement)).click();
        return new DiaperBinsPage();
    }

    public DiaperBinsAndRefillsShopAllPage selectDiaperBinsAndRefillsShopAllPageInDiapering(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(diaperingElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(diapersBinsRefillsShopAllElement), 20);
        driver.findElement(By.linkText(diapersBinsRefillsShopAllElement)).click();
        return new DiaperBinsAndRefillsShopAllPage();
    }

    public ChangingMatsPage selectChangingMatsPageInDiapering(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(diaperingElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(changingMatsElement), 20);
        driver.findElement(By.linkText(changingMatsElement)).click();
        return new ChangingMatsPage();
    }

    public ChangingTablesPage selectChangingTablesPageInDiapering(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(diaperingElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(changingTablesElement), 20);
        driver.findElement(By.linkText(changingTablesElement)).click();
        return new ChangingTablesPage();
    }

    public ChangingMatCoversPage selectChangingMatCoversPageInDiapering(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(diaperingElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(changingMatCoversElement), 20);
        driver.findElement(By.linkText(changingMatCoversElement)).click();
        return new ChangingMatCoversPage();
    }
    public ChangingTablesAndMatsShopAllPage selectCTandMatsShopAllPageInDiapering(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(diaperingElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(changingTableMatsShopAll), 20);
        driver.findElement(By.linkText(changingTableMatsShopAll)).click();
        return new ChangingTablesAndMatsShopAllPage();
    }

    public DiaperRashCreamsPage selectDiaperRashCreamInDiapering(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(diaperingElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(diaperRashCreamsElement), 20);
        driver.findElement(By.linkText(diaperRashCreamsElement)).click();
        return new DiaperRashCreamsPage();
    }

    public BabyPowdersPage selectBabyPowdersPageInDiapering(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(diaperingElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(babyPowdersElement), 20);
        driver.findElement(By.linkText(babyPowdersElement)).click();
        return new BabyPowdersPage();
    }

    public CreamsAndPowdersShopAllPage selectCreamsAndPowdersShopAllInDiapering(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(diaperingElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(creamsPowderShopAllElement), 20);
        driver.findElement(By.xpath(creamsPowderShopAllElement)).click();
        return new CreamsAndPowdersShopAllPage();
    }

    public PampersPage selectPampersPageInDIapering(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(diaperingElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(pampersElement), 20);
        driver.findElement(By.linkText(pampersElement)).click();
        return new PampersPage();
    }

    public WaterWipesPage selectWaterWipesPageInDiapering(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(diaperingElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(waterWipesElement), 20);
        driver.findElement(By.linkText(waterWipesElement)).click();
        return new WaterWipesPage();
    }

    public PureBornPage selectPureBornPageInDiapering(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(diaperingElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(pureBornElement), 20);
        driver.findElement(By.linkText(pureBornElement)).click();
        return new PureBornPage();
    }

    public TommeeTippeePage selectTommeeTippeePageInDiapering(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(diaperingElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(tommeeTippeeElement), 20);
        driver.findElement(By.linkText(tommeeTippeeElement)).click();
        return new TommeeTippeePage();
    }

    public BabyJoyPage selectBabyJoyPageInDiapering(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(diaperingElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(babyJoyElement), 20);
        driver.findElement(By.linkText(babyJoyElement)).click();
        return new BabyJoyPage();
    }

    public HuggiesPage selectHuggiesPageInDiapering(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(diaperingElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(huggiesElement), 20);
        driver.findElement(By.linkText(huggiesElement)).click();
        return new HuggiesPage();
    }

    public BreastfeedingPage selectBreastFeedingPageInFeeding(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(feedingElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(breastFeedingElement), 20);
        driver.findElement(By.linkText(breastFeedingElement)).click();
        return new BreastfeedingPage();
    }

    public BreastPumpsPage selectBreastPumpsPageInFeeding(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(feedingElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(breastPumpsElement), 20);
        driver.findElement(By.linkText(breastPumpsElement)).click();
        return new BreastPumpsPage();
    }

    public NursingCoversAndBrasPage selectNursingCoversAndBrasPageInFeeding(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(feedingElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(nursingCoversBrasElement), 20);
        driver.findElement(By.linkText(nursingCoversBrasElement)).click();
        return new NursingCoversAndBrasPage();
    }

    public BreastmilkStorageAndBagsPage selectBreastmilkStorageANdBagsPageInFeeding(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(feedingElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(breastmilkStorageBagsElement), 20);
        driver.findElement(By.linkText(breastmilkStorageBagsElement)).click();
        return new BreastmilkStorageAndBagsPage();
    }

    public BreastShellsAndCreamsPage selectBreastShellsAndCreamsPageInFeeding(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(feedingElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(breastShellsCreamsElement), 20);
        driver.findElement(By.linkText(breastShellsCreamsElement)).click();
        return new BreastShellsAndCreamsPage();
    }

    public NursingPadsAndWipesPage selectNursingPadsAndWipesPageInFeeding(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(feedingElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(nursingPadsWipesElement), 20);
        driver.findElement(By.linkText(nursingPadsWipesElement)).click();
        return new NursingPadsAndWipesPage();
    }

    public BreastfeedingShopAllPage selectBreastfeedingShopAllPageInFeeding(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(feedingElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(breastfeedingShopAllElement), 20);
        driver.findElement(By.xpath(breastFeedingElement)).click();
        return new BreastfeedingShopAllPage();
    }

    public BabyFoodAndFormulaPage selectBabyFoodAndFormulaPageinFeeding(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(feedingElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(babyFoodFormulaElement), 20);
        driver.findElement(By.linkText(babyFoodFormulaElement)).click();
        return new BabyFoodAndFormulaPage();
    }

    public BabyFormulaPage selectBabyFormulaPageInFeeding(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(feedingElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(babyFormulaElement), 20);
        driver.findElement(By.linkText(babyFormulaElement)).click();
        return new BabyFormulaPage();
    }

    public BabyFoodPage selectBabyFoodPageInFeeding(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(feedingElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(babyFoodElement), 20);
        driver.findElement(By.linkText(babyFoodElement)).click();
        return new BabyFoodPage();
    }

    public CerealsPage selectCerealsPageInFeeding(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(feedingElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(cerealsElement), 20);
        driver.findElement(By.linkText(cerealsElement)).click();
        return new CerealsPage();
    }

    public BeveragesPage selectBeveragesPageInFeeding(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(feedingElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(bevaragesElement), 20);
        driver.findElement(By.linkText(bevaragesElement)).click();
        return new BeveragesPage();
    }

    public BabyFoodAndFormulaShopAllPage selectBabyFoodAndFormulaPageInFeeding(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(feedingElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(babyFoodFormulaShopAll), 20);
        driver.findElement(By.xpath(babyFoodFormulaShopAll)).click();
        return  new BabyFoodAndFormulaShopAllPage();
    }

    public BottleFeedingPage selectBottleFeedingPageInFeeding(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(feedingElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(bottleFeedingElement), 20);
        driver.findElement(By.linkText(bottleFeedingElement)).click();
        return new BottleFeedingPage();
    }

    public BottlesPage selectBottlesPageInFeeding(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(feedingElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(bottlesElement), 20);
        driver.findElement(By.linkText(bottlesElement)).click();
        return new BottlesPage();
    }

    public WarmersAndSterilizersPage selectWarmersAndSterilizersPageInFeeding(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(feedingElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(warmersSterilizersElement), 20);
        driver.findElement(By.linkText(warmersSterilizersElement)).click();
        return new WarmersAndSterilizersPage();
    }

    public BottleWashingAndDryingPage selectBottleWashingAndDryingPageInFeeding(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(feedingElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(bottleWashingDryingElement), 20);
        driver.findElement(By.linkText(bottleWashingDryingElement)).click();
        return new BottleWashingAndDryingPage();
    }

    public NipplesPage selectNipplesPageInFeeding(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(feedingElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(nipplesElement), 20);
        driver.findElement(By.linkText(nipplesElement)).click();
       return new NipplesPage();
    }

    public BottleAccessoriesPage selectBottleAccessoriesPageInFeeding(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(feedingElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(bottleAccessoriesElement), 20);
        driver.findElement(By.linkText(bottleAccessoriesElement)).click();
        return new BottleAccessoriesPage();
    }

    public  BottleFeedingShopAllPage selectBottleFeedingShopAllPageInFeeding(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(feedingElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(bottleFeedingShopAllElement), 20);
        driver.findElement(By.xpath(bottleFeedingShopAllElement)).click();
        return new BottleFeedingShopAllPage();
    }
    public SolidFeedingPage selectSolidFeedingInFeeding(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(feedingElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(solidFeedingElement), 20);
        driver.findElement(By.linkText(solidFeedingElement)).click();
        return new SolidFeedingPage();
    }

    public BeakersAndCupsPage selectBeakersAndCupsPageInFeeding(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(feedingElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(beakersCupsElement), 20);
        driver.findElement(By.linkText(beakersCupsElement)).click();
        return new BeakersAndCupsPage();
    }

    public PlatesBowlsAndSetsPage selectPlatesBowlsAndSetsPageInFeeding(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(feedingElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(platesBowlsSetsElement), 20);
        driver.findElement(By.linkText(platesBowlsSetsElement)).click();
        return new PlatesBowlsAndSetsPage();
    }

    public BibsAndBurpClothsPage selectBibsANdBurpClothsPageInFeeding(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(feedingElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(bibsBurpClothsElement), 20);
        driver.findElement(By.linkText(bibsBurpClothsElement)).click();
        return new BibsAndBurpClothsPage();
    }

    public UtensilsPage selectUtensilsPageInFeeding(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(feedingElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(utensilsElement), 20);
        driver.findElement(By.linkText(utensilsElement)).click();
        return new UtensilsPage();
    }

    public FeedersPage selectFeedersPageInFeeding(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(feedingElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(feedersElement), 20);
        driver.findElement(By.linkText(feedersElement)).click();
        return new FeedersPage();
    }

    public SolidFeedingShopAllPage selectSolidFeedingShopAllPageInFeeding(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(feedingElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(solidFeedingShopAllElement), 20);
        driver.findElement(By.xpath(solidFeedingShopAllElement)).click();
        return new SolidFeedingShopAllPage();
    }

    public HighChairsAndBoostersPage selectHighChairsAndBoostersPageInFeeding(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(feedingElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(highChairsBoostersElement), 20);
        driver.findElement(By.linkText(highChairsBoostersElement)).click();
        return new HighChairsAndBoostersPage();
    }

    public HighChairsPage selectHighChairsPageInFeeding(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(feedingElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(highChairsElement), 20);
        driver.findElement(By.linkText(highChairsElement)).click();
        return new HighChairsPage();
    }

    public BoostersPage selectBoostersPageInFeeding(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(feedingElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(boosterElement), 20);
        driver.findElement(By.linkText(boosterElement)).click();
        return new BoostersPage();
    }

    public HCandBoostersAccessoriesPage selectHighChairsAndBoostersAccessoriesPageInFeeding(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(feedingElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(highChairsBoostersAccessoriesElement), 20);
        driver.findElement(By.linkText(highChairsBoostersAccessoriesElement)).click();
        return new HCandBoostersAccessoriesPage();
    }

    public HCandBoostersShopAllPage selectHighChairsAndBoostersShopAllPageInFeeding(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(feedingElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(highChairsBoostersShopAllElement), 20);
        driver.findElement(By.xpath(highChairsBoostersShopAllElement)).click();
        return new HCandBoostersShopAllPage();
    }

    public FoodPreparationPage selectFoodPreparationPageInFeeding(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(feedingElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(foodPreparationElement), 20);
        driver.findElement(By.linkText(foodPreparationElement)).click();
        return new FoodPreparationPage();
    }

    public BabyFoodProcessorsPage selectBabyFoodProcessorsPageInFeeding(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(feedingElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(babyFoodProcessorsElement), 20);
        driver.findElement(By.linkText(babyFoodProcessorsElement)).click();
        return new BabyFoodProcessorsPage();
    }

    public FoodContainersPage selectFoodContainersPageInFeeding(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(feedingElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(foodContainersElement), 20);
        driver.findElement(By.linkText(foodContainersElement)).click();
        return new FoodContainersPage();
    }

    public FoodPreparationShopAllPage selectFoodPreparationShopAllPageInFeeding(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(feedingElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(foodPreparationShopAllElement), 20);
        driver.findElement(By.xpath(foodPreparationShopAllElement)).click();
        return new FoodPreparationShopAllPage();
    }

    public DollsAndDollhousesPage selectDollsAndDollhousesPageInToys(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(toysElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(dollsAndDollhousesElement), 20);
        driver.findElement(By.linkText(dollsAndDollhousesElement)).click();
        return new DollsAndDollhousesPage();
    }

    public DollhousesPage selectDollhousePageInToys(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(toysElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(dollhousesElement), 20);
        driver.findElement(By.linkText(dollhousesElement)).click();
        return new DollhousesPage();
    }

    public DollsPlaysetsPage selectDollsPlaysetsPageInToys(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(toysElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(dollsPlaysetsElement), 20);
        driver.findElement(By.linkText(dollsPlaysetsElement)).click();
        return new DollsPlaysetsPage();
    }

    public BabyDollsPage selectBabyDollsPageInToys(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(toysElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(babyDollsElement), 20);
        driver.findElement(By.linkText(babyDollsElement)).click();
        return new BabyDollsPage();
    }

    public FashionDollsPage selectFashionDollsPageInToys(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(toysElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(fashionDollsElement), 20);
        driver.findElement(By.linkText(fashionDollsElement)).click();
        return new FashionDollsPage();
    }

    public DollsAccessoriesPage selectDollsAccessoriesPageInToys(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(toysElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(dollsAccessoriesElement), 20);
        driver.findElement(By.linkText(dollsAccessoriesElement)).click();
        return new DollsAccessoriesPage();
    }

    public  DollsAndDollhousesShopAllPage selectDollsAndDollhousesShopAllPage(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(toysElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(dollsDollhousesShopAllElement), 20);
        driver.findElement(By.xpath(dollsDollhousesShopAllElement)).click();
        return new DollsAndDollhousesShopAllPage();
    }

    public VehiclesPage selectVehiclePageInToys(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(toysElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(vehiclesElement), 20);
        driver.findElement(By.linkText(vehiclesElement)).click();
        return new VehiclesPage();
    }

    public CarsPage selectCarsPageInToys(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(toysElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(carsElement), 20);
        driver.findElement(By.linkText(carsElement)).click();
        return new CarsPage();
    }

    public TrucksPage selectTrucksPageInToys(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(toysElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(trucksElement), 20);
        driver.findElement(By.linkText(trucksElement)).click();
        return new TrucksPage();
    }

    public RemoteControlledVehiclesPage selectRemoteControlledVehiclesPageInToys(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(toysElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(remoteControlledVehiclesElement), 20);
        driver.findElement(By.linkText(remoteControlledVehiclesElement)).click();
        return new RemoteControlledVehiclesPage();
    }

    public TrainsPage selectTrainsPageInToys(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(toysElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(trainsElement), 20);
        driver.findElement(By.linkText(trainsElement)).click();
        return new TrainsPage();
    }

    public BatteriesPage selectBatteriesPageInToys(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(toysElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(batteriesElement), 20);
        driver.findElement(By.linkText(batteriesElement)).click();
        return new BatteriesPage();
    }

    public VehiclesShopAllPage selectVehiclesShopAllPageInToys(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(toysElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(vehiclesShopAllElement), 20);
        driver.findElement(By.xpath(vehiclesShopAllElement)).click();
        return new VehiclesShopAllPage();
    }

    public RolePlayAndArtsPage selectRolePlayAndArtsPageInToys(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(toysElement));
        SpriiTestFramework.getInstance().waitForElement(By.linkText(rolePlayArtsElement), 20);
        driver.findElement(By.linkText(rolePlayArtsElement)).click();
        return new RolePlayAndArtsPage();
    }

    public ArtsAndCraftsPage selectArtsAndCraftsPageInToys(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(toysElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(artsAndCraftElement), 20);
        driver.findElement(By.linkText(artsAndCraftElement)).click();
        return new ArtsAndCraftsPage();
    }

    public RolePlayPage selectRolePlayInToys(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(toysElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(rolePlayElement), 20);
        driver.findElement(By.linkText(rolePlayElement)).click();
        return new RolePlayPage();
    }

    public PartyEssentialsPage selectPartyEssentialsPageInToys(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(toysElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(partyEssentialsElement), 20);
        driver.findElement(By.xpath(partyEssentialsElement)).click();
        return new PartyEssentialsPage();
    }

    public HalloweenPage selectHalloweenPageInToys(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(toysElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(halloweenElement), 20);
        driver.findElement(By.linkText(halloweenElement)).click();
        return new HalloweenPage();
    }

    public RolePlayAndArtsShopAllPage selectRolePlayAndArtsShopAllPageInToys(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(toysElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(rolePlayArtsShopAllElement), 20);
        driver.findElement(By.xpath(rolePlayArtsShopAllElement)).click();
        return new RolePlayAndArtsShopAllPage();
    }

    public BabyAndPreSchoolPage selectBabyAndPreSchoolPageInToys(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(toysElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(babyPreSchoolElement), 20);
        driver.findElement(By.linkText(babyPreSchoolElement)).click();
        return new BabyAndPreSchoolPage();
    }

    public InteractiveToysPage selectInterActiveToysPageInToys(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(toysElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(interactiveToysElement), 20);
        driver.findElement(By.linkText(interactiveToysElement)).click();
        return new InteractiveToysPage();
    }

    public BathToysPage selectBathToysPageInToys(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(toysElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(bathToysElement), 20);
        driver.findElement(By.linkText(bathToysElement)).click();
        return new BathToysPage();
    }

    public StuffedToysPage selectStuffedToysPageInToys(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(toysElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(stuffedToysElement), 20);
        driver.findElement(By.linkText(stuffedToysElement)).click();
        return new StuffedToysPage();
    }

    public RattlesPage selectRattlesPageInToys(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(toysElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(rattlesElement), 20);
        driver.findElement(By.linkText(rattlesElement)).click();
        return new RattlesPage();
    }

    public StrollerAndCarSeatToysPage selectStrollerAndCarSeatToysPageInToys(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(toysElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(strollerAndCarSeatToysElement), 20);
        driver.findElement(By.linkText(strollerAndCarSeatToysElement)).click();
        return new StrollerAndCarSeatToysPage();
    }

    public BabyAndPreSchoolShopAllPage selectBabyAndPreSchoolShopAllPageInToys(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(toysElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(babyAndPreSchoolShopAllElement), 20);
        driver.findElement(By.xpath(babyAndPreSchoolShopAllElement)).click();
        return new BabyAndPreSchoolShopAllPage();
    }

    public ShopByCharacterPage selectShopByCharacterPageInToys(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(toysElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(shopByCharacterElement), 20);
        driver.findElement(By.linkText(shopByCharacterElement)).click();
        return new ShopByCharacterPage();
    }

    public PJMasksPage selectPJMasksPageInToys(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(toysElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(pjMasksElement), 20);
        driver.findElement(By.linkText(pjMasksElement)).click();
        return new PJMasksPage();
    }

    public LEGOPage selectLEGOPageInToys(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(toysElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(legoElement), 20);
        driver.findElement(By.linkText(legoElement)).click();
        return new LEGOPage();
    }

    public DisneyPage selectDisneyPageInToys(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(toysElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(disneyElement), 20);
        driver.findElement(By.linkText(disneyElement)).click();
        return new DisneyPage();
    }

    public BarbiePage selectBarbiePageInToys(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(toysElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(barbieElement), 20);
        driver.findElement(By.linkText(barbieElement)).click();
        return new BarbiePage();
    }

    public FrozenPage selectFrozenPageInToys(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(toysElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(frozenElement), 20);
        driver.findElement(By.linkText(frozenElement)).click();
        return new FrozenPage();
    }

    public WWEPage selectWWEPageInToys(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(toysElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(wweElement), 20);
        driver.findElement(By.linkText(wweElement)).click();
        return new WWEPage();
    }

    public ShopByCharacterShopAllPage selectShopByCharacterShopAllPage(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(toysElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(shopByCharacterShopAllElement), 20);
        driver.findElement(By.xpath(shopByCharacterShopAllElement)).click();
        return new ShopByCharacterShopAllPage();
    }

    public ToysTopBrandsPage selectToysTopBrandsPageInToys(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(toysElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(toysTopBrandsElement), 20);
        driver.findElement(By.xpath(toysTopBrandsElement)).click();
        return new ToysTopBrandsPage();
    }

    public KidKraftPage selectKidKraftPageInToys(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(toysElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(kidkraftElement), 20);
        driver.findElement(By.linkText(kidkraftElement)).click();
        return new KidKraftPage();
    }

    public MelissaAndDougPage selectMelissaAndDougPageInToys(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(toysElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(melissaAndDougElement), 20);
        driver.findElement(By.linkText(melissaAndDougElement)).click();
        return new MelissaAndDougPage();
    }

    public EarlyLearningCentrePage selectEarlyLearningCentrePageInToys(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(toysElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(earlyLearningCentreElement), 20);
        driver.findElement(By.linkText(earlyLearningCentreElement)).click();
        return new EarlyLearningCentrePage();
    }

    public LOLSurprisePage selectLOLSurprisePageInToys(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(toysElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(lolSurprise), 20);
        driver.findElement(By.linkText(lolSurprise)).click();
        return new LOLSurprisePage();
    }

    public FisherPricePage selectFisherPricePageInToys(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(toysElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(fisherPriceElement), 20);
        driver.findElement(By.linkText(fisherPriceElement)).click();
        return new FisherPricePage();
    }
    public ToysTopBrandsShopAllPage selectToysTopBrandsShopAllPageInToys(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(toysElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(toysTopBrandsShopAllElement), 20);
        driver.findElement(By.xpath(toysTopBrandsShopAllElement)).click();
        return new ToysTopBrandsShopAllPage();
    }

    public SwimmingPoolsPage selectSwimmingPoolsPageInOutdoor(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(outdoorElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(swimmingPoolsElement), 20);
        driver.findElement(By.linkText(swimmingPoolsElement)).click();
        return new SwimmingPoolsPage();
    }

    public FramePoolsPage selectFramePoolsInOutdoor(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(outdoorElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(framePoolsElement), 20);
        driver.findElement(By.linkText(framePoolsElement)).click();
        return new FramePoolsPage();
    }

    public InflatablePoolsPage selectInflatablePoolsPageInOutdoor(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(outdoorElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(inflatablePoolsElement), 20);
        driver.findElement(By.linkText(inflatablePoolsElement)).click();
        return new InflatablePoolsPage();
    }

    public LilosAndPoolInflatablesPage selectLilosAndPoolInflatablesPageInOutdoor(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(outdoorElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(lilosAndPoolInflatables), 20);
        driver.findElement(By.linkText(lilosAndPoolInflatables)).click();
        return new LilosAndPoolInflatablesPage();
    }

    public PoolAccessoriesPage selectPoolAccessoriesPageInOutdoor(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(outdoorElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(poolAccessoriesElement), 20);
        driver.findElement(By.linkText(poolAccessoriesElement)).click();
        return new PoolAccessoriesPage();
    }

    public BallPitsPage selectBallPitsPageInOutdoor(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(outdoorElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(ballPitsElement), 20);
        driver.findElement(By.linkText(ballPitsElement)).click();
        return new BallPitsPage();
    }

    public SwimmingPoolsShopAllPage selectSwimmingPoolsShopAllPageInOutdoor(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(outdoorElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(swimmingPoolsShopAllElement), 20);
        driver.findElement(By.xpath(swimmingPoolsShopAllElement)).click();
        return new SwimmingPoolsShopAllPage();
    }

    public SwingSetsAndPlayhousesPage selectSwingSetsAndPlayhousesPageInOutdoor(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(outdoorElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(swimmingSetsPlayhousesElement), 20);
        driver.findElement(By.linkText(swimmingSetsPlayhousesElement)).click();
        return new SwingSetsAndPlayhousesPage();
    }

    public WoodenSwingSetsPage selectWoodenSwingSetsPageInOutdoor(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(outdoorElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(woodenSwingSetsElement), 20);
        driver.findElement(By.linkText(woodenSwingSetsElement)).click();
        return new WoodenSwingSetsPage();
    }

    public PlasticSwingSetsPage selectPlasticSwingSetsPageInOutdoor(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(outdoorElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(plasticSwingSetsElement), 20);
        driver.findElement(By.linkText(plasticSwingSetsElement)).click();
        return new PlasticSwingSetsPage();
    }

    public PlayhousesPage selectPlayhousesPageInOutdoor(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(outdoorElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(playhousesElement), 20);
        driver.findElement(By.linkText(playhousesElement)).click();
        return new PlayhousesPage();
    }

    public TrampolinesPage selectTrampolinesPageInOutdoor(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(outdoorElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(trampolinesElement), 20);
        driver.findElement(By.linkText(trampolinesElement)).click();
        return new TrampolinesPage();
    }

    public WaterSlidesAndBouncersPage selectWaterSlidesAndBouncersInOutdoor(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(outdoorElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(waterSlidesBouncersElement), 20);
        driver.findElement(By.linkText(waterSlidesBouncersElement)).click();
        return new WaterSlidesAndBouncersPage();
    }

    public SwingSetsAndPlayhousesShopAllPage selectSwingSetsAndPlayhousesShopAllPageInOutdoor(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(outdoorElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(swingSetsPlayhousesShopAllElement), 20);
        driver.findElement(By.xpath(swingSetsPlayhousesShopAllElement)).click();
        return new SwingSetsAndPlayhousesShopAllPage();
    }

    public SandboxesAndWaterTablesPage selectSandboxesAndWaterTablesPageInOutdoor(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(outdoorElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(sandboxesWaterTablesElement), 20);
        driver.findElement(By.linkText(sandboxesWaterTablesElement)).click();
        return new SandboxesAndWaterTablesPage();
    }

    public SandboxesPage selectSandboxesPageInOutdoor(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(outdoorElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(sandboxesElement), 20);
        driver.findElement(By.linkText(sandboxesElement)).click();
        return new SandboxesPage();
    }

    public WaterTablesPage selectWaterTablesPageInOutdoor(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(outdoorElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(waterTablesElement), 20);
        driver.findElement(By.linkText(waterTablesElement)).click();
        return new WaterTablesPage();
    }

    public BucketsAndSpadesPage selectBucketAndSpadesPageInOutdoor(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(outdoorElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(bucketsSpadesElement), 20);
        driver.findElement(By.linkText(bucketsSpadesElement)).click();
        return new BucketsAndSpadesPage();
    }

    public SandboxesAndWaterTablesShopAllPage selectSandboxesAndWaterTablesShopAllPageInOutdoor(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(outdoorElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(sandboxesWaterTablesShopAllElement), 20);
        driver.findElement(By.xpath(sandboxesWaterTablesShopAllElement)).click();
        return new SandboxesAndWaterTablesShopAllPage();
    }

    public RideonsBikesAndTrikesPage selectRideonsBikesAndTricksPageInOutdooe(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(outdoorElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(rideonsBikesAndTricksElement), 20);
        driver.findElement(By.linkText(electricRideonsElement)).click();
        return new RideonsBikesAndTrikesPage();
    }

    public ElectricRideonsPage selectElectricRideonsPageInOutdoor(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(outdoorElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(electricRideonsElement), 20);
        driver.findElement(By.linkText(electricRideonsElement)).click();
        return new ElectricRideonsPage();
    }

    public ManualRideonsPage selectManualRideonsPageInOutdoor(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(outdoorElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(manualRideonsElement), 20);
        driver.findElement(By.linkText(manualRideonsElement)).click();
        return new ManualRideonsPage();
    }

    public BikesAndTrikesPage selectBikesAndTrikesPageInOutdoor(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(outdoorElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(bikesAndTricksElement), 20);
        driver.findElement(By.linkText(bikesAndTricksElement)).click();
        return new BikesAndTrikesPage();
    }

    public ScootersPage selectScootersPageInOutdoor(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(outdoorElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(scootersElement), 20);
        driver.findElement(By.linkText(scootersElement)).click();
        return new ScootersPage();
    }

    public SkatesAndWheeliesPage selectSkatesAndWheeliesPageInOutdoor(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(outdoorElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(skatesAndWheeliesElement), 20);
        driver.findElement(By.linkText(skatesAndWheeliesElement)).click();
        return new SkatesAndWheeliesPage();
    }

    public RideonsBikesAndTrikesShopAllPAge selectRideonsBikesAndTricksShopAllPageInOutdoor(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(outdoorElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(rideOnsBikesTricksShopAllElement), 20);
        driver.findElement(By.xpath(rideOnsBikesTricksShopAllElement)).click();
        return new RideonsBikesAndTrikesShopAllPAge();
    }

    public OutdoorTopBrandsPage selectOutdoorTopBrandsPageInOutdoor(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(outdoorElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(outdoorTopBrandsElement), 20);
        driver.findElement(By.xpath(outdoorTopBrandsElement)).click();
        return new OutdoorTopBrandsPage();
    }

    public IntexPage selectIntexPageInOutdoor(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(outdoorElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(intexElement), 20);
        driver.findElement(By.linkText(intexElement)).click();
        return new IntexPage();
    }

    public BestwayPage selectBestwayPageInOutdoor(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(outdoorElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(bestwayElement), 20);
        driver.findElement(By.linkText(bestwayElement)).click();
        return new BestwayPage();
    }

    public MegastarRideonsPage selectMegastarRideonsPageInOutdoor(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(outdoorElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(megastarRideonsElement), 20);
        driver.findElement(By.linkText(megastarRideonsElement)).click();
        return new MegastarRideonsPage();
    }

    public SpringfreePage selectSpringfreeInOutdoor(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(outdoorElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(springfreeElement), 20);
        driver.findElement(By.xpath(springfreeElement)).click();
        return new SpringfreePage();
    }

    public Step2Page selectStep2PageInOutdoor(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(outdoorElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(step2Element), 20);
        driver.findElement(By.linkText(step2Element)).click();
        return new Step2Page();
    }

    public CanadianSwingsetsPage selectCanandianSwingSetsPageInOutdoor(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(outdoorElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(canadianSwingsetsElement), 20);
        driver.findElement(By.linkText(canadianSwingsetsElement)).click();
        return new CanadianSwingsetsPage();
    }

    public TopBrandsShopAllPage selectTopBrandsShopAllPageInOutdoor(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(outdoorElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(outdoorTopBrandsShopAllElement), 20);
        driver.findElement(By.xpath(outdoorTopBrandsShopAllElement)).click();
        return new TopBrandsShopAllPage();
    }

    public BathtimePage selectBathtimePageInBathAndBabyCare(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(bathBabyElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(bathtimeElement), 20);
        driver.findElement(By.linkText(bathtimeElement)).click();
        return new BathtimePage();
    }

    public BathingTubsAndSeatsPage selectBathingTubesAndSeatsPageInBathAndBabyCare(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(bathBabyElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(bathingTubsAndSeatsElement), 20);
        driver.findElement(By.linkText(bathingTubsAndSeatsElement)).click();
        return new BathingTubsAndSeatsPage();
    }

    public BabyWashesAndSoapsPage selectBabyWashesAndSoapsPageInBathAndBabyCare(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(bathBabyElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(babyWashesAndSoapsElement), 20);
        driver.findElement(By.linkText(babyWashesAndSoapsElement)).click();
        return new BabyWashesAndSoapsPage();
    }

    public BathShowerFiltersPage selectBathShowerFiltersPageInBathAndBabyCare(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(bathBabyElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(bathShowerFiltersElement), 20);
        driver.findElement(By.linkText(bathShowerFiltersElement)).click();
        return new BathShowerFiltersPage();
    }

    public PottyTrainingPage selectPottyTrainingInBathAndBabyCare(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(bathBabyElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(pottyTrainingElement), 20);
        driver.findElement(By.linkText(pottyTrainingElement)).click();
        return new PottyTrainingPage();
    }

    public TowelsAndFlannelsPage selectTowelsAndFlannelsInBathAndBabyCare(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(bathBabyElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(towelsAndFlannelsElement), 20);
        driver.findElement(By.linkText(towelsAndFlannelsElement)).click();
        return new TowelsAndFlannelsPage();
    }

    public BathtimeShopAllPage selectBathtimeShopAllPageInBathAndBabyCare(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(bathBabyElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(bathtimeShopAllElement), 20);
        driver.findElement(By.linkText(bathtimeShopAllElement)).click();
        return new BathtimeShopAllPage();
    }

    public HairAndSkinCarePage SelectHairAndShinCarePageInBathAndBabyCare(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(bathBabyElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(hairAndSkinCareElement), 20);
        driver.findElement(By.linkText(hairAndSkinCareElement)).click();
        return new HairAndSkinCarePage();
    }

    public OilsLotionAndCreamsPage slectOilsLotionAndCreamsPageInBathAndABabyCare(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(bathBabyElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(oilsLotionsAndCreamsElement), 20);
        driver.findElement(By.linkText(oilsLotionsAndCreamsElement)).click();
        return new OilsLotionAndCreamsPage();
    }

    public ShampoosAndConditionersPage selectShampposAndConditionersPageInBathAndBabyCare(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(bathBabyElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(shampoosAndConditionersElement), 20);
        driver.findElement(By.linkText(shampoosAndConditionersElement)).click();
        return new ShampoosAndConditionersPage();
    }

    public StylingAndOilsPage selectStylingAndOilsPageInBathAndBabyCare(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(bathBabyElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(stylingAndOilsElement), 20);
        driver.findElement(By.linkText(stylingAndOilsElement)).click();
        return new StylingAndOilsPage();
    }

    public HandWashesAndSanitisersPage selectHandWashesAndSanitisersPageInBathAndBabyCare(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(bathBabyElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(handWashesAndSanitisersElement), 20);
        driver.findElement(By.linkText(handWashesAndSanitisersElement)).click();
        return new HandWashesAndSanitisersPage();
    }

    public HairAndSkinCareShopAllPage selectHairAndSkinCareShopAllPageInBathAndBabyCare(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(bathBabyElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(hairAndSkinCareShopAllElement), 20);
        driver.findElement(By.xpath(hairAndSkinCareShopAllElement)).click();
        return new HairAndSkinCareShopAllPage();
    }

    public HealthAndBabyCarePage selectHealthAndBabyCarePageInBathAndBabyCare(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(bathBabyElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(healthAndBabyCareElement), 20);
        driver.findElement(By.linkText(healthAndBabyCareElement)).click();
        return new HealthAndBabyCarePage();
    }

    public HumidifiersAndVaporizersPage selectHumidifiersAndVaporizersPageInBathAndBabyCare(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(bathBabyElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(humidifiersAndVaporizersElement), 20);
        driver.findElement(By.linkText(humidifiersAndVaporizersElement)).click();
        return new HumidifiersAndVaporizersPage();
    }

    public TravelCarePage selectTravelCarePageInBathAndBabyCare(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(bathBabyElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(travelCareElement), 20);
        driver.findElement(By.linkText(travelCareElement)).click();
        return new TravelCarePage();
    }

    public RoomAndBodyThermometersPage selectRoomAndBodyThermometersPageInBathAndBabyCare(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(bathBabyElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(roomAndBodyThermometersElement), 20);
        driver.findElement(By.linkText(roomAndBodyThermometersElement)).click();
        return new RoomAndBodyThermometersPage();
    }

    public GroomingPage selectGroomingPageInBathAndBabyCare(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(bathBabyElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(groomingElement), 20);
        driver.findElement(By.linkText(groomingElement)).click();
        return new GroomingPage();
    }

    public MedicalAndFirstAidPage selectMedicalAndFirstAidPageInBathAndBabyCare(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(bathBabyElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(medicalAndFirstAidElement), 20);
        driver.findElement(By.linkText(roomAndBodyThermometersElement)).click();
        return new MedicalAndFirstAidPage();
    }

    public HealthAndBabyCareShopAllPage selectHealthAndBabyCareShopAllPageInBathAndBabyCare(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(bathBabyElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(healthAndBabyCareShopAllElement), 20);
        driver.findElement(By.xpath(healthAndBabyCareElement)).click();
        return new HealthAndBabyCareShopAllPage();
    }

    public PacifiersAndTeethersPage selectPacifiersAndTeethersPageInBathAndBabyCare(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(bathBabyElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(pacifiersAndTeethersElement), 20);
        driver.findElement(By.xpath(healthAndBabyCareElement)).click();
        return new PacifiersAndTeethersPage();
    }

    public PacifiersPage selectPacifiersPageInBathAndBabyCare(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(bathBabyElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(pacifierElement), 20);
        driver.findElement(By.xpath(pacifierElement)).click();
        return new PacifiersPage();
    }

    public TeethersAndTeethingReliefPage selectTeethersAndTeethingReliefPageInBathAndBabyCare(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(bathBabyElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(teethersAndTeethingReliefElement), 20);
        driver.findElement(By.xpath(teethersAndTeethingReliefElement)).click();
        return new TeethersAndTeethingReliefPage();
    }

    public PacifierBoxesAndHoldersPage selectPacifierBoxesAndHoldersPageInBathAndBabyCare(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(bathBabyElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(pacifierBoxesAndHoldersElement), 20);
        driver.findElement(By.linkText(pacifierBoxesAndHoldersElement)).click();
        return new PacifierBoxesAndHoldersPage();
    }

    public PacifierClipsPage selectPacifierClipsPageInBathAndBabyCare(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(bathBabyElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(pacifierClipsElement), 20);
        driver.findElement(By.linkText(pacifierClipsElement)).click();
        return new PacifierClipsPage();
    }

    public PacifiersAndTeethersShopAllPage selectPacifiersAndTeethersShopAllPageInBathAndBabyCare(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(bathBabyElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(pacifiersShopAllElement), 20);
        driver.findElement(By.xpath(pacifiersShopAllElement)).click();
        return new PacifiersAndTeethersShopAllPage();
    }

    public SafetyPage selectSafetyPageInBathAndBabyCare(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(bathBabyElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(safetyElement), 20);
        driver.findElement(By.linkText(safetyElement)).click();
        return new SafetyPage();
    }

    public MonitorsPage selectMonitorsPageInBathAndBabyCare(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(bathBabyElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(monitorsElement), 20);
        driver.findElement(By.linkText(monitorsElement)).click();
        return new MonitorsPage();
    }

    public SafetyGatesAndExtensionsPage selectSafetyGatesAndExtensionsPageInBathAndBabyCare(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(bathBabyElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(safetyGatesAndExtensionsElement), 20);
        driver.findElement(By.linkText(safetyGatesAndExtensionsElement)).click();
        return new SafetyGatesAndExtensionsPage();
    }

    public ChildProofingPage selectChildProofingPageInBathAndBabyCare(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(bathBabyElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(childProofingElement), 20);
        driver.findElement(By.linkText(childProofingElement)).click();
        return new ChildProofingPage();
    }

    public TravelSafetyPage selectTravelSafetyPageInBathAndBabyCare(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(bathBabyElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(travelSafetyElement), 20);
        driver.findElement(By.linkText(travelSafetyElement)).click();
        return new TravelSafetyPage();
    }

    public SafetyShopAllPage selectSafetyShopAllPageInBathAndBabyCare(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(bathBabyElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(safetyShopAllElement), 20);
        driver.findElement(By.xpath(safetyShopAllElement)).click();
        return new SafetyShopAllPage();
    }

    public BathAndBabyCareTopBrandsPage selectBathAndBabyCareTopBrandsPageInBathAndBabyCare(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(bathBabyElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(bathAndBabyCareTopBrandsElement), 20);
        driver.findElement(By.xpath(bathAndBabyCareTopBrandsElement)).click();
        return new BathAndBabyCareTopBrandsPage();
    }


    public BlueairPage selectBlueairPageInBathAndBabyCare(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(bathBabyElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(blueairElement), 20);
        driver.findElement(By.linkText(blueairElement)).click();
        return new BlueairPage();
    }


    public AveenoPage selectAveenoPageInBathAndBabyCare(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(bathBabyElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(aveenoElement), 20);
        driver.findElement(By.linkText(aveenoElement)).click();
        return new AveenoPage();
    }

    public ChiccoPage selectChiccoPageInBathAndBabyCare(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(bathBabyElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(bathAndBabyCareChiccoElement), 20);
        driver.findElement(By.linkText(bathAndBabyCareChiccoElement)).click();
        return new ChiccoPage();
    }

    public MustelaPage selectMustelaPageInBathAndBabyCare(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(bathBabyElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(mustelaElement), 20);
        driver.findElement(By.linkText(mustelaElement)).click();
        return new MustelaPage();
    }

    public OriginalSproutPage selectOriginalSproutPageInBathAndBabyCare(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(bathBabyElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(originalSproutElement), 20);
        driver.findElement(By.linkText(originalSproutElement)).click();
        return new OriginalSproutPage();
    }

    public BathAndBabyCareTopBrandsShopAllPage selectBathAndBabyCareTopBrandsShopAllPageInBathAndBabyCare(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(bathBabyElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(bathAndBabyCareTopBrandsShopAllElement), 20);
        driver.findElement(By.linkText(bathAndBabyCareTopBrandsShopAllElement)).click();
        return new BathAndBabyCareTopBrandsShopAllPage();
    }

    public DuringPregnancyPage selectDuringPregnancyPageInMums(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(mumsElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(duringPregnancyElement), 20);
        driver.findElement(By.linkText(duringPregnancyElement)).click();
        return new DuringPregnancyPage();
    }

    public BodyPage selectBodyPageInMums(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(mumsElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(bodyElement), 20);
        driver.findElement(By.linkText(bodyElement)).click();
        return new BodyPage();
    }

    public FaceCarePage selectFaceCarePageInMums(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(mumsElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(faceCareElement), 20);
        driver.findElement(By.linkText(faceCareElement)).click();
        return new FaceCarePage();
    }

    public DentalCarePage selectDentalCarePageInMums(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(mumsElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(dentalElement), 20);
        driver.findElement(By.linkText(dentalElement)).click();
        return new DentalCarePage();
    }

    public VitaminsPage selectVitaminsPageInMums(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(mumsElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(vitaminsElement), 20);
        driver.findElement(By.linkText(vitaminsElement)).click();
        return new VitaminsPage();
    }


    public PregnancyCushionsPage selectPregnancyCushionsPageInMums(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(mumsElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(pregnancyCushionsElement), 20);
        driver.findElement(By.linkText(pregnancyCushionsElement)).click();
        return new PregnancyCushionsPage();
    }


    public DuringPregnancyShopAllPage selectDuringPregnancyShopAllPageInMums(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(mumsElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(duringPregnancyShopAllElement), 20);
        driver.findElement(By.xpath(duringPregnancyShopAllElement)).click();
        return new DuringPregnancyShopAllPage();
    }

    public DressYourBumpPage selectDressYourBumpPageInMums(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(mumsElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(dressYourBumpElement), 20);
        driver.findElement(By.linkText(dressYourBumpElement)).click();
        return new DressYourBumpPage();
    }

    public UnderwearPage selectUnderwearPageInMums(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(mumsElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(underwearElement), 20);
        driver.findElement(By.linkText(underwearElement)).click();
        return new UnderwearPage();
    }

    public ShapewearPage selectShapewearPageInMums(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(bathBabyElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(shapewearElement), 20);
        driver.findElement(By.linkText(shapewearElement)).click();
        return new ShapewearPage();
    }

    public SleepwearPage selectSleepwearPageInMums(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(mumsElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(sleepwearElement), 20);
        driver.findElement(By.linkText(sleepwearElement)).click();
        return new SleepwearPage();
    }

    public SwimwearPage selectSwimwearPageInMums(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(mumsElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(swimwearElement), 20);
        driver.findElement(By.xpath(swimwearElement)).click();
        return new SwimwearPage();
    }

    public MaternityWearPage selectMaternityWearPageInMums(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(mumsElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(maternityWearElement), 20);
        driver.findElement(By.linkText(maternityWearElement)).click();
        return new MaternityWearPage();
    }

    public DressYourBumpShopAllPage selectDressYourBumpShopAllPageInMums(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(mumsElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(dressYourBumpShopAllElement), 20);
        driver.findElement(By.xpath(dressYourBumpShopAllElement)).click();
        return new DressYourBumpShopAllPage();
    }

    public GetFitPage selectGetFitPageInMums(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(mumsElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(getFitElement), 20);
        driver.findElement(By.linkText(getFitElement)).click();
        return new GetFitPage();
    }

    public WristMonitorsPage selectWristMonitorsPageInMums(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(mumsElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(wristMonitorsElement), 20);
        driver.findElement(By.linkText(wristMonitorsElement)).click();
        return new WristMonitorsPage();
    }

    public HeadphonesPage selectHeadphonesPageInMums(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(mumsElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(headphonesElement), 20);
        driver.findElement(By.linkText(headphonesElement)).click();
        return new HeadphonesPage();
    }

    public ApparelPage selectApparelPagInMums(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(mumsElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(apparelElement), 20);
        driver.findElement(By.linkText(apparelElement)).click();
        return new ApparelPage();
    }

    public EquipmentPage selectEquipmentPageInMums(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(mumsElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(equipmentElement), 20);
        driver.findElement(By.linkText(equipmentElement)).click();
        return new EquipmentPage();
    }

    public GetFitAccessoriesPage selectGetFitAccessoriesPageInMums(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(mumsElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(getFitAccessoriesElement), 20);
        driver.findElement(By.xpath(getFitAccessoriesElement)).click();
        return new GetFitAccessoriesPage();
    }

    public GetFitShopAllPage selectGetFitShopAllPageInMums(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(mumsElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(getFitShopAllElement), 20);
        driver.findElement(By.xpath(getFitShopAllElement)).click();
        return new GetFitShopAllPage();
    }

    public PostPregnancyPage selectPostPregnancyPageInMums(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(mumsElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(postPregnancyElement), 20);
        driver.findElement(By.linkText(postPregnancyElement)).click();
        return new PostPregnancyPage();
    }


    public PostPregnancyBodyPage selectPostPregnancyBodyPageInMums(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(mumsElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(postPregnancyBodyElement), 20);
        driver.findElement(By.xpath(postPregnancyBodyElement)).click();
        return new PostPregnancyBodyPage();
    }

    public FaceAndTeethPage selectFaceAndTeethPageInMums(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(mumsElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(faceAndTeethElement), 20);
        driver.findElement(By.linkText(faceAndTeethElement)).click();
        return new FaceAndTeethPage();
    }

    public HairCarePage selectHairCarePageInMums(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(mumsElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(hairCareElement), 20);
        driver.findElement(By.linkText(hairCareElement)).click();
        return new HairCarePage();
    }

    public PostPregnancyVitaminsPage selectPostPregnancyVitaminsPageInMums(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(mumsElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(postPregnancyVitaminsElement), 20);
        driver.findElement(By.xpath(postPregnancyVitaminsElement)).click();
        return new PostPregnancyVitaminsPage();
    }

    public PostPregnancyShopAllPage selectPostPregnancyShopAllPageInMums(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(mumsElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(postPregnancyShopAllElement), 20);
        driver.findElement(By.xpath(postPregnancyShopAllElement)).click();
        return new PostPregnancyShopAllPage();
    }

    public TopMumsBrandsPage selectTopMumsBrandsPageInMums(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(mumsElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(topMumsBrandsElement), 20);
        driver.findElement(By.xpath(topMumsBrandsElement)).click();
        return new TopMumsBrandsPage();
    }

    public FitbitPage selectFitbitPageInMums(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(mumsElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(fitbitElement), 20);
        driver.findElement(By.linkText(fitbitElement)).click();
        return new FitbitPage();
    }

    public MandukaPage selectMandukaPageInMums(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(mumsElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(mandukaElement), 20);
        driver.findElement(By.linkText(mandukaElement)).click();
        return new MandukaPage();
    }

    public NaturesBountyPage selectNaturesBountyPageInMums(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(mumsElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(naturesBountyElement), 20);
        driver.findElement(By.linkText(naturesBountyElement)).click();
        return new NaturesBountyPage();
    }

    public OralBPage selectOralBPageInMums(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(mumsElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(oralBElement), 20);
        driver.findElement(By.linkText(oralBElement)).click();
        return new OralBPage();
    }

    public BellyBanditPage selectBellyBanditPageInMums(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(mumsElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(bellyBanditElement), 20);
        driver.findElement(By.linkText(bellyBanditElement)).click();
        return new BellyBanditPage();
    }

    public MumsAndBumpsPage selectMumsAndBumpsPageInMums(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(mumsElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(mumsAndBumpsElement), 20);
        driver.findElement(By.linkText(mumsAndBumpsElement)).click();
        return new MumsAndBumpsPage();
    }

    public MumsShopByPage selectMumsShopByPageInMums(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(mumsElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(shopByElement), 20);
        driver.findElement(By.xpath(shopByElement)).click();
        return new MumsShopByPage();
    }

    public ShopByNewInPage selectShopByNewInPageInMums(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(mumsElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(newInElement), 20);
        driver.findElement(By.xpath(newInElement)).click();
        return new ShopByNewInPage();
    }

    public ShopBySalePage selectShopBySalePageInMums(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(mumsElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(saleElement), 20);
        driver.findElement(By.xpath(saleElement)).click();
        return new ShopBySalePage();
    }

    public GirlsPage selectGirlsPageInKidsFashion(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(kidsFashionElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(girlsElement), 20);
        driver.findElement(By.linkText(girlsElement)).click();
        return new GirlsPage();
    }

    public GirlsTopsAndTeesPage selectGirlsTopsAndTeesPageInKidsFashion(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(kidsFashionElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(girlsTopsAndTeesElement), 20);
        driver.findElement(By.xpath(girlsTopsAndTeesElement)).click();
        return new GirlsTopsAndTeesPage();
    }

    public GirlsTrousersPage selectGirlsTrousersPageInKidsFashion(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(kidsFashionElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(girlsTrousersElement), 20);
        driver.findElement(By.xpath(girlsTrousersElement)).click();
        return new GirlsTrousersPage();
    }

    public GirlsDressesPage selectGirlsDressesPageInKidsFashion(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(kidsFashionElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(dressElement), 20);
        driver.findElement(By.linkText(dressElement)).click();
        return new GirlsDressesPage();
    }

    public GirlsSetsAndOnePiecesPage selectGirlsSetsAndOnePiecesPageInKidsFashion(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(kidsFashionElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(setsAndOnePiecesElement), 20);
        driver.findElement(By.xpath(setsAndOnePiecesElement)).click();
        return new GirlsSetsAndOnePiecesPage();
    }

    public GirlsSleepwearPage selectGirlsSleepwearPageInKidsFashion(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(kidsFashionElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(girlsSleepwearElement), 20);
        driver.findElement(By.xpath(girlsSleepwearElement)).click();
        return new GirlsSleepwearPage();
    }

    public GirlsFootwearPage selectGirlsFootwearPageInKidsFashion(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(kidsFashionElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(girlsFootwearElement), 20);
        driver.findElement(By.xpath(girlsFootwearElement)).click();
        return new GirlsFootwearPage();
    }

    public GirlsAccessoriesPage selectGirlsAccessoriesPageInKidsFashion(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(kidsFashionElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(girlsAccessoriesElement), 20);
        driver.findElement(By.xpath(girlsAccessoriesElement)).click();
        return new GirlsAccessoriesPage();
    }

    public GirlsShopAllPage selectGirlsShopAllPageInKidsFashion(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(kidsFashionElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(girlsShopAllElement), 20);
        driver.findElement(By.xpath(girlsShopAllElement)).click();
        return new GirlsShopAllPage();
    }

    public BoysPage selectBoysPageInKidsFashion(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(kidsFashionElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(boysElement), 20);
        driver.findElement(By.linkText(boysElement)).click();
        return new BoysPage();
    }

    public BoysTopsAndTeesPage selectBoysTopsAndTeesPageInKidsFashion(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(kidsFashionElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(boysTopsAndTeesElement), 20);
        driver.findElement(By.xpath(boysTopsAndTeesElement)).click();
        return new BoysTopsAndTeesPage();
    }

    public BoysTrousersPage selectBoysTrousersPageInKidsFashion(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(kidsFashionElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(boysTrousersElement), 20);
        driver.findElement(By.xpath(boysTrousersElement)).click();
        return new BoysTrousersPage();
    }

    public BoysSetsAndOnePiecesPage selectBoysSetsAndOnePiecesPageInKidsFashion(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(kidsFashionElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(boysSetsAndOnePiecesElement), 20);
        driver.findElement(By.xpath(boysSetsAndOnePiecesElement)).click();
        return new BoysSetsAndOnePiecesPage();
    }

    public BoysSleepwearPage selectBoysSleepwearPageInKidsFashion(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(kidsFashionElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(boysSleepwearElement), 20);
        driver.findElement(By.xpath(boysSleepwearElement)).click();
        return new BoysSleepwearPage();
    }

    public BoysFootwearPage selectBoysFootwearPageInKidsFashion(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(kidsFashionElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(boysFootwearElement), 20);
        driver.findElement(By.xpath(boysFootwearElement)).click();
        return new BoysFootwearPage();
    }

    public BoysAccessoriesPage selectBoysAccessoriesPageInKidsFashion(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(kidsFashionElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(boysAccessoriesElement), 20);
        driver.findElement(By.xpath(boysAccessoriesElement)).click();
        return new BoysAccessoriesPage();
    }

    public BoysShopAllPage selectBoysShopAllPageInKidsFashion(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(kidsFashionElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(boysShopAllElement), 20);
        driver.findElement(By.xpath(boysShopAllElement)).click();
        return new BoysShopAllPage();
    }

    public UnisexPage selectUnisexPageInKidsFashion(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(kidsFashionElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(unisexElement), 20);
        driver.findElement(By.linkText(unisexElement)).click();
        return new UnisexPage();
    }

    public UnisexTopsAndTeesPage selectUnisexTopsAndTeesPageInKidsFashion(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(kidsFashionElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(unisexTopsAndTeesElement), 20);
        driver.findElement(By.xpath(unisexTopsAndTeesElement)).click();
        return new UnisexTopsAndTeesPage();
    }

    public UnisexBodysuitsAndRompersPage selectUnisexBodysuitsAndRompersPageInKidsFashion(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(kidsFashionElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(bodysuitsAndRompersElement), 20);
        driver.findElement(By.linkText(bodysuitsAndRompersElement)).click();
        return new UnisexBodysuitsAndRompersPage();
    }

    public HatsPage selectHatsPageInKidsFashion(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(kidsFashionElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(hatsElement), 20);
        driver.findElement(By.linkText(hatsElement)).click();
        return new HatsPage();
    }

    public SocksPage selectSocksPageInKidsFashion(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(kidsFashionElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(socksElement), 20);
        driver.findElement(By.linkText(socksElement)).click();
        return new SocksPage();
    }

    public UnisexShopAllPage selectUnisexShopAllPageInKidsFashion(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(kidsFashionElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(unisexShopAllElement), 20);
        driver.findElement(By.xpath(unisexShopAllElement)).click();
        return new UnisexShopAllPage();
    }

    public KidsFashionSwimwearPage selectKidsFashionSwimwearPageInKidsFashion(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(kidsFashionElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(kidFashionSwimwearElement), 20);
        driver.findElement(By.xpath(kidFashionSwimwearElement)).click();
        return new KidsFashionSwimwearPage();
    }

    public SwimwearRashVestsAndShoesPage selectSwimwearRashVestsAndShoesPageInKidsFashion(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(kidsFashionElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(rashVestsAndShoesElement), 20);
        driver.findElement(By.linkText(rashVestsAndShoesElement)).click();
        return new SwimwearRashVestsAndShoesPage();
    }

    public FloatAidsPage selectFloatAidsPageInKidsFashion(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(kidsFashionElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(floatAidsElement), 20);
        driver.findElement(By.linkText(floatAidsElement)).click();
        return new FloatAidsPage();
    }

    public GogglesAndHatsPage selectGogglesAndHatsPageInKidsFashion(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(kidsFashionElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(gogglesAndHatsElement), 20);
        driver.findElement(By.linkText(gogglesAndHatsElement)).click();
        return new GogglesAndHatsPage();
    }

    public BeachTowelsAndBlanketsPage selectBeachTowelsAndBlanketsPageInKidsFashion(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(kidsFashionElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(beachTowelsAndBlanketsElement), 20);
        driver.findElement(By.linkText(beachTowelsAndBlanketsElement)).click();
        return new BeachTowelsAndBlanketsPage();
    }

    public SwimmingSuitsPage selectSwimmingSuitsPageInKidsFashion(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(kidsFashionElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(swimmingSuitsElement), 20);
        driver.findElement(By.linkText(swimmingSuitsElement)).click();
        return new SwimmingSuitsPage();
    }

    public SwimwearShopAllPage selectSwimwearShopAllPageInKidsFashion(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(kidsFashionElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(swimwearShopAllElement), 20);
        driver.findElement(By.xpath(swimwearShopAllElement)).click();
        return new SwimwearShopAllPage();
    }

    public KidsFashionTopBrandsPage selectKidsFashionTopBrandsPageInKidsFashion(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(kidsFashionElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(kidsFashionTopBrandsElement), 20);
        driver.findElement(By.xpath(kidsFashionTopBrandsElement)).click();
        return new KidsFashionTopBrandsPage();
    }

    public TwinkleHandsPage selectTwinkleHandsPageInKidsFashion(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(kidsFashionElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(twinkleHandsElement), 20);
        driver.findElement(By.linkText(twinkleHandsElement)).click();
        return new TwinkleHandsPage();
    }

    public COEGAPage selectCOEGAPageInKidsFashion(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(kidsFashionElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(coegaElement), 20);
        driver.findElement(By.linkText(coegaElement)).click();
        return new COEGAPage();
    }

    public SlipstopPage selectSlipstopPageInKidsFashion(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(kidsFashionElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(slipstopElement), 20);
        driver.findElement(By.linkText(slipstopElement)).click();
        return new SlipstopPage();
    }

    public PimpolhoPage selectPimpolhoPageInKidsFashion(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(kidsFashionElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(pimpolhoElement), 20);
        driver.findElement(By.linkText(pimpolhoElement)).click();
        return new PimpolhoPage();
    }

    public AbsorbaPage selectAbsorbaPageInKidsFashion(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(kidsFashionElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(absorbaElement), 20);
        driver.findElement(By.linkText(absorbaElement)).click();
        return new AbsorbaPage();
    }

    public KidsFashionTopBrandsShopAllPage selectKidsFashionTopBrandsShopAllPageInKidsFashion(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(kidsFashionElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(kidFashionTopBrandsShopAllElement), 20);
        driver.findElement(By.xpath(kidFashionTopBrandsShopAllElement)).click();
        return new KidsFashionTopBrandsShopAllPage();
    }

    public KidsFashionShopByPage selectKidsFashionShopByPageInKidsFashion(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(kidsFashionElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(kidsFashionShopByElement), 20);
        driver.findElement(By.xpath(kidsFashionShopByElement)).click();
        return new KidsFashionShopByPage();
    }

    public KidsFashionNewInPage selectKidsFashionNewInPageInKidsFashion(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(kidsFashionElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(kidsFashionShopByNewInElement), 20);
        driver.findElement(By.xpath(kidsFashionShopByNewInElement)).click();
        return new KidsFashionNewInPage();
    }

    public KidsFashionSalePage selectKidsFashionSalePageInKidsFashion(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(kidsFashionElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(kidsFashionSaleElement), 20);
        driver.findElement(By.xpath(kidsFashionSaleElement)).click();
        return new KidsFashionSalePage();
    }

    public CleaningPage selectCleaningPageInHomeAndLifestyle(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(homeLifestyleElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(cleaningElement), 20);
        driver.findElement(By.linkText(cleaningElement)).click();
        return new CleaningPage();
    }

    public HouseholdCleanersPage selectHouseholdCleanersPageInHomeAndLifestyle(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(homeLifestyleElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(householdCleanersElement), 20);
        driver.findElement(By.linkText(householdCleanersElement)).click();
        return new HouseholdCleanersPage();
    }

    public MoppingPage selectMoppingPageInHomeAndLifestyle(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(homeLifestyleElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(moppingElement), 20);
        driver.findElement(By.linkText(moppingElement)).click();
        return new MoppingPage();
    }

    public TrashBinsAndBagsPage selectTrashBinsAndBagsPageInHomeAndLifestyle(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(homeLifestyleElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(trashBinsAndBagsElement), 20);
        driver.findElement(By.linkText(trashBinsAndBagsElement)).click();
        return new TrashBinsAndBagsPage();
    }

    public AirFreshnersPage selectAirFreshnersPageInHomeAndLifestyle(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(homeLifestyleElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(airfreshnersElement), 20);
        driver.findElement(By.linkText(airfreshnersElement)).click();
        return new AirFreshnersPage();
    }

    public CleaningShopAllPage selectCleaningShopAllPageInHomeAndLifestyle(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(homeLifestyleElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(cleaningShopAllElement), 20);
        driver.findElement(By.xpath(cleaningShopAllElement)).click();
        return new CleaningShopAllPage();
    }

    public LaundryPage selectLaundryPageInHomeAndLifestyle(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(homeLifestyleElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(laundryElement), 20);
        driver.findElement(By.linkText(laundryElement)).click();
        return new LaundryPage();
    }

    public DetergentsAndConditionersPage selectDetergentsAndConditionersPageInHomeAndLifestyle(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(homeLifestyleElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(detergentsAndConditionersElement), 20);
        driver.findElement(By.linkText(detergentsAndConditionersElement)).click();
        return new DetergentsAndConditionersPage();
    }

    public ClothesDryingRacksPage selectClothesDryingRacksPageInHomeAndLifestyle(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(homeLifestyleElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(clothesDryingRacksElement), 20);
        driver.findElement(By.linkText(clothesDryingRacksElement)).click();
        return new ClothesDryingRacksPage();
    }

    public IroningBoardsPage selectIroningBoardsPageInHomeAndLifestyle(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(homeLifestyleElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(ironingBoardsElement), 20);
        driver.findElement(By.linkText(ironingBoardsElement)).click();
        return new IroningBoardsPage();
    }

    public LaundryShopAllPage selectLaundryShopAllPageInHomeAndLifestyle(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(homeLifestyleElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(laundryShopAllElement), 20);
        driver.findElement(By.xpath(laundryShopAllElement)).click();
        return new LaundryShopAllPage();
    }

    public NurseryFurnitureAndDecorPage selectNurseryFurnitureAndDecorPageInHomeAndLifestyle(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(homeLifestyleElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(nurseryFurnitureAndDecorElement), 20);
        driver.findElement(By.linkText(nurseryFurnitureAndDecorElement)).click();
        return new NurseryFurnitureAndDecorPage();
    }

    public StorageAndOrganizationPage selectStorageAndOrganizationPageInHomeAndLifestyle(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(homeLifestyleElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(storageAndOrganizationElement), 20);
        driver.findElement(By.linkText(storageAndOrganizationElement)).click();
        return new StorageAndOrganizationPage();
    }

    public LightsAndLampsPage selectLightsAndLampsPageInHomeAndLifestyle(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(homeLifestyleElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(lightAndLampsElement), 20);
        driver.findElement(By.linkText(lightAndLampsElement)).click();
        return new LightsAndLampsPage();
    }

    public TeepeesPage selectTeepeesPageInHomeAndLifestyle(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(homeLifestyleElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(teepeesElement), 20);
        driver.findElement(By.linkText(teepeesElement)).click();
        return new TeepeesPage();
    }

    public TableAndChairsPage selectTableAndChairsPageInHomeAndLifestyle(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(homeLifestyleElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(tableAndChairsElement), 20);
        driver.findElement(By.linkText(tableAndChairsElement)).click();
        return new TableAndChairsPage();
    }

    public BeanbagsPage selectBeanbagsPageInHomeAndLifestyle(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(homeLifestyleElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(beanbagsElement), 20);
        driver.findElement(By.linkText(beanbagsElement)).click();
        return new BeanbagsPage();
    }

    public NurseryFurnitureAndDecorShopAllPage selectNurseryFurnitureAndDecorShopAllPageInHomeAndLifestyle(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(homeLifestyleElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(nurseryFurnitureAndDecorShopAllElement), 20);
        driver.findElement(By.xpath(nurseryFurnitureAndDecorShopAllElement)).click();
        return new NurseryFurnitureAndDecorShopAllPage();
    }

    public KitchenAndDiningPage selectKitchenAndDiningPageInHomeAndLifestyle(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(homeLifestyleElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(kitchenAndDiningElement), 20);
        driver.findElement(By.linkText(kitchenAndDiningElement)).click();
        return new KitchenAndDiningPage();
    }

    public CookwearPage selectCookwearPageInHomeAndLifestyle(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(homeLifestyleElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(cookwareElement), 20);
        driver.findElement(By.linkText(cookwareElement)).click();
        return new CookwearPage();
    }

    public PreparationGadgetsPage selectPreparationGadgetsPageInHomeAndLifestyle(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(homeLifestyleElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(preparationGadgetsElement), 20);
        driver.findElement(By.linkText(preparationGadgetsElement)).click();
        return new PreparationGadgetsPage();
    }

    public CuttingAndChoppingPage selectCuttingAndChoppingPageInHomeAndLifestyle(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(homeLifestyleElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(cuttingAndChoppingElement), 20);
        driver.findElement(By.linkText(cuttingAndChoppingElement)).click();
        return new CuttingAndChoppingPage();
    }

    public BakewarePage selectBakewarePageInHomeAndLifestyle(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(homeLifestyleElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(bakewareElement), 20);
        driver.findElement(By.linkText(bakewareElement)).click();
        return new BakewarePage();
    }

    public WeighingAndMeasuringPage selectWeighingAndMeasuringPageInHomeAndLifestyle(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(homeLifestyleElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(weighingAndMeasuringElement), 20);
        driver.findElement(By.linkText(weighingAndMeasuringElement)).click();
        return new WeighingAndMeasuringPage();
    }



    public KitchenAndDiningShopAllPage selectKitchenAndDiningShopAllPageInHomeAndLifestyle(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(homeLifestyleElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(kitchenAndDiningShopAllElement), 20);
        driver.findElement(By.xpath(kitchenAndDiningShopAllElement)).click();
        return new KitchenAndDiningShopAllPage();
    }

    public HomeAndLifestyleTopBrandsPage selectHomeAndLifestyleTopBrandsPageInHomeAndLifestyle(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(homeLifestyleElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(homeAndLifestyleTopBrandsElement), 20);
        driver.findElement(By.xpath(homeAndLifestyleTopBrandsElement)).click();
        return new HomeAndLifestyleTopBrandsPage();
    }

    public ArielPage selectArielPageInHomeAndLifestyle(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(homeLifestyleElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(arielElement), 20);
        driver.findElement(By.linkText(arielElement)).click();
        return new ArielPage();
    }

    public ViledaPage selectViledaPageInHomeAndLifestyle(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(homeLifestyleElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(viledaElement), 20);
        driver.findElement(By.linkText(viledaElement)).click();
        return new ViledaPage();
    }

    public BlackAndDeckerPage selectBlackAndDeckerPageInHomeAndLifestyle(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(homeLifestyleElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(blackAndDeckerElement), 20);
        driver.findElement(By.linkText(blackAndDeckerElement)).click();
        return new BlackAndDeckerPage();
    }

    public EcoverPage selectEcoverPageInHomeAndLifestyle(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(homeLifestyleElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(ecoverElement), 20);
        driver.findElement(By.linkText(ecoverElement)).click();
        return new EcoverPage();
    }

    public TefalPage selectTefalPageInHomeAndLifestyle(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(homeLifestyleElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(tefalElement), 20);
        driver.findElement(By.linkText(tefalElement)).click();
        return new TefalPage();
    }

    public HomeAndLifestyleTopBrandsShopAllPage selectHomeAndLifestyleTopBrandsShopAllPageInHomeAndLifestyle(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(homeLifestyleElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(homeAndLifestyleTopBrandsShopAllElement), 20);
        driver.findElement(By.xpath(homeAndLifestyleTopBrandsShopAllElement)).click();
        return new HomeAndLifestyleTopBrandsShopAllPage();
    }

    public HomeAppliancesPage selectHomeAppliancesPageInAppliances(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(appliancesElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(homeAppliancesElement), 20);
        driver.findElement(By.linkText(homeAppliancesElement)).click();
        return new HomeAppliancesPage();
    }

    public BlendersPage selectBlendersPageInAppliances(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(appliancesElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(blendersElement), 20);
        driver.findElement(By.linkText(blendersElement)).click();
        return new BlendersPage();
    }

    public FridgesPage selectFridgesPageInAppliances(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(appliancesElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(fridgesElement), 20);
        driver.findElement(By.linkText(fridgesElement)).click();
        return new FridgesPage();
    }

    public MixersPage selectMixersPageInAppliances(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(appliancesElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(mixersElement), 20);
        driver.findElement(By.linkText(mixersElement)).click();
        return new MixersPage();
    }

    public FoodProcessorsPage selectFoodProcessorsPageInAppliances(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(appliancesElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(foodProcessorsElement), 20);
        driver.findElement(By.linkText(foodProcessorsElement)).click();
        return new FoodProcessorsPage();
    }

    public SandwichMakersPage selectSandwichMakersPageInAppliances(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(appliancesElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(sandwichMakersElement), 20);
        driver.findElement(By.linkText(sandwichMakersElement)).click();
        return new SandwichMakersPage();
    }

    public VacuumCleanersPage selectVacuumCleanersPageInAppliances(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(appliancesElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(vacuumCleanersElement), 20);
        driver.findElement(By.linkText(vacuumCleanersElement)).click();
        return new VacuumCleanersPage();
    }

    public IronsAndSteamersPage selectIronsAndSteamersPageInAppliances(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(appliancesElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(ironsAndSteamersElement), 20);
        driver.findElement(By.linkText(ironsAndSteamersElement)).click();
        return new IronsAndSteamersPage();
    }

    public HomeAppliancesShopAllPage selectHomeAppliancesShopAllPageInAppliances(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(appliancesElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(homeAppliancesShopAllElement), 20);
        driver.findElement(By.xpath(homeAppliancesShopAllElement)).click();
        return new HomeAppliancesShopAllPage();
    }

    public CoffeeMachinesAndAccessoriesPage selectCoffeeMachinesAndAccessoriesPageInAppliances(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(appliancesElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(coffeeMachinesAndAccessoriesElement), 20);
        driver.findElement(By.linkText(coffeeMachinesAndAccessoriesElement)).click();
        return new CoffeeMachinesAndAccessoriesPage();
    }

    public CoffeeAndEspressoMachinesPage selectCoffeeAndEspressoMachinesPageInAppliances(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(appliancesElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(coffeeAndEspresssoMachinesElement), 20);
        driver.findElement(By.linkText(coffeeAndEspresssoMachinesElement)).click();
        return new CoffeeAndEspressoMachinesPage();
    }

    public CoffeeAndTeaMakersPage selectCoffeeAndTeaMakersPageInAppliances(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(appliancesElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(coffeeAndTeaMakersElement), 20);
        driver.findElement(By.linkText(coffeeAndTeaMakersElement)).click();
        return new CoffeeAndTeaMakersPage();
    }

    public CoffeeCapsulesPage selectCoffeeCapsulesPageInAppliances(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(appliancesElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(coffeeCapsulesElement), 20);
        driver.findElement(By.linkText(coffeeCapsulesElement)).click();
        return new CoffeeCapsulesPage();
    }

    public KettlesPage selectKettlesPageInAppliances(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(appliancesElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(kettlesElement), 20);
        driver.findElement(By.linkText(kettlesElement)).click();
        return new KettlesPage();
    }

    public CoffeeMachinesAndAccessoriesShopAllPage selectCoffeeMachinesAndAccessoriesShopAllPageInAppliances(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(appliancesElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(coffeeMachinesAndAccessoriesShopAllElement), 20);
        driver.findElement(By.xpath(coffeeMachinesAndAccessoriesShopAllElement)).click();
        return new CoffeeMachinesAndAccessoriesShopAllPage();
    }

    public AppliancesTopBrandsPage selectAppliancesTopBrandsPageInAppliances(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(appliancesElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(appliancesTopBrandsElement), 20);
        driver.findElement(By.xpath(appliancesTopBrandsElement)).click();
        return new AppliancesTopBrandsPage();
    }

    public SmegPage selectSmegPageInAppliances(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(appliancesElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(smegElement), 20);
        driver.findElement(By.linkText(smegElement)).click();
        return new SmegPage();
    }

    public IllyPage selectIllyPageInAppliances(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(appliancesElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(illyElement), 20);
        driver.findElement(By.linkText(illyElement)).click();
        return new IllyPage();
    }

    public BrevillePage selectBrevillePageInAppliances(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(appliancesElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(brevilleElement), 20);
        driver.findElement(By.linkText(brevilleElement)).click();
        return new BrevillePage();
    }

    public NespressoPage selectNespressoPageInAppliances(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(appliancesElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(nespressoElement), 20);
        driver.findElement(By.linkText(nespressoElement)).click();
        return new NespressoPage();
    }

    public KenwoodPage selectKenwoodPageInAppliances(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(appliancesElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(kenwoodElement), 20);
        driver.findElement(By.linkText(kenwoodElement)).click();
        return new KenwoodPage();
    }

    public AppliancesBlackAndDeckerPage selectAppliancesBlackAndDeckerPageInAppliances(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(appliancesElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(appliancesBlackAndDeckerElement), 20);
        driver.findElement(By.linkText(appliancesBlackAndDeckerElement)).click();
        return new AppliancesBlackAndDeckerPage();
    }

    public AppliancesTopBrandsShopAllPage selectAppliancesTopBrandsShopAllPageInAppliances(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(appliancesElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(appliancesTopbrandsShopAllElement), 20);
        driver.findElement(By.xpath(appliancesTopbrandsShopAllElement)).click();
        return new AppliancesTopBrandsShopAllPage();
    }

    public ChildrensBooksPage selectChildrensBooksPageInSchool(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(schoolElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(childrensBooksElement), 20);
        driver.findElement(By.linkText(childrensBooksElement)).click();
        return new ChildrensBooksPage();
    }

    public EducationalPage selectEducationalPageInSchool(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(schoolElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(educationalElement), 20);
        driver.findElement(By.linkText(educationalElement)).click();
        return new EducationalPage();
    }

    public BabiesAndToddlersPage selectBabiesAndToddlersPageInSchool(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(schoolElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(babiesAndToddlersElement), 20);
        driver.findElement(By.linkText(babiesAndToddlersElement)).click();
        return new BabiesAndToddlersPage();
    }

    public PreTeensPage selectPreTeensPageInSchool(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(schoolElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(preTeensElement), 20);
        driver.findElement(By.linkText(preTeensElement)).click();
        return new PreTeensPage();
    }

    public ChildrensBoooksShopAllPage selectChildrensBoooksShopAllPageInSchool(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(schoolElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(childrensBoosShopAllElement), 20);
        driver.findElement(By.xpath(childrensBoosShopAllElement)).click();
        return new ChildrensBoooksShopAllPage();
    }

    public SchoolEssentialsPage selectSchoolEssentialsPageInSchool(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(schoolElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(schoolEsssentialsElement), 20);
        driver.findElement(By.linkText(schoolEsssentialsElement)).click();
        return new SchoolEssentialsPage();
    }

    public LunchBoxesPage selectLunchBoxesPageInSchool(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(schoolElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(lunchBoxesElement), 20);
        driver.findElement(By.linkText(lunchBoxesElement)).click();
        return new LunchBoxesPage();
    }

    public LunchBagsPage selectLunchBagsPageInSchool(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(schoolElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(lunchBagsElement), 20);
        driver.findElement(By.linkText(lunchBagsElement)).click();
        return new LunchBagsPage();
    }

    public LunchSnacksPage selectLunchSnacksPageInSchool(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(schoolElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(lunchSnacksElement), 20);
        driver.findElement(By.linkText(lunchSnacksElement)).click();
        return new LunchSnacksPage();
    }

    public WaterBottlesPage selectWaterBottlesPageInSchool(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(schoolElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(waterBottlesElement), 20);
        driver.findElement(By.linkText(waterBottlesElement)).click();
        return new WaterBottlesPage();
    }

    public StationaryPage selectStationaryPageInSchool(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(schoolElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(stationaryElement), 20);
        driver.findElement(By.linkText(stationaryElement)).click();
        return new StationaryPage();
    }

    public PencilsAndPensPage selectPencilsAndPensPageInSchool(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(schoolElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(pencilsAndPensElement), 20);
        driver.findElement(By.linkText(pencilsAndPensElement)).click();
        return new PencilsAndPensPage();
    }

    public ColouringToolsPage selectColouringToolsPageInSchool(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(schoolElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(colouringToolsElement), 20);
        driver.findElement(By.linkText(colouringToolsElement)).click();
        return new ColouringToolsPage();
    }

    public PencilCasesPage selectPencilCasesPageInSchool(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(schoolElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(pencilCasesElement), 20);
        driver.findElement(By.linkText(pencilCasesElement)).click();
        return new PencilCasesPage();
    }

    public StationaryExtrasPage selectStationaryExtrasPageInSchool(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(schoolElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(stationaryExtrasElement), 20);
        driver.findElement(By.linkText(stationaryExtrasElement)).click();
        return new StationaryExtrasPage();
    }

    public StationaryShopAllPage selectStationaryShopAllPageInSchool(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(schoolElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(stationaryShopAllElement), 20);
        driver.findElement(By.xpath(stationaryShopAllElement)).click();
        return new StationaryShopAllPage();
    }

    public SchoolBagsPage selectSchoolBagsPageInSchool(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(schoolElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(schoolBagsElement), 20);
        driver.findElement(By.linkText(schoolBagsElement)).click();
        return new SchoolBagsPage();
    }

    public BackPacksPage selectBackPacksPageInSchool(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(schoolElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(backpacksElement), 20);
        driver.findElement(By.linkText(backpacksElement)).click();
        return new BackPacksPage();
    }

    public TotesPage selectTotesPageInSchool(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(schoolElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(totesElement), 20);
        driver.findElement(By.linkText(totesElement)).click();
        return new TotesPage();
    }

    public TrolleyBagsPage selectTrolleyBagsPageInSchool(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(schoolElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(trolleyBagsElement), 20);
        driver.findElement(By.linkText(trolleyBagsElement)).click();
        return new TrolleyBagsPage();
    }

    public PursesPage selectPursesPageInSchool(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(schoolElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(pursesElement), 20);
        driver.findElement(By.linkText(pursesElement)).click();
        return new PursesPage();
    }

    public SchoolBagsShopAllPage selectSchoolBagsShopAllPageInSchool(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(schoolElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(schoolBagsShopAllElement), 20);
        driver.findElement(By.xpath(schoolBagsShopAllElement)).click();
        return new SchoolBagsShopAllPage();
    }

    public SchoolTopBrandsPage selectSSchoolTopBrandsPageInSchool(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(schoolElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(schoolTopBrandsElement), 20);
        driver.findElement(By.xpath(schoolTopBrandsElement)).click();
        return new SchoolTopBrandsPage();
    }
    public YumboxPage selectYumboxPageInSchool(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(schoolElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(yumboxElement), 20);
        driver.findElement(By.linkText(yumboxElement)).click();
        return new YumboxPage();
    }


    public CrayolaPage selectCrayolaPageInSchool(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(schoolElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(crayolaElement), 20);
        driver.findElement(By.linkText(crayolaElement)).click();
        return new CrayolaPage();
    }

    public CitronPage selectCitronPageInSchool(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(schoolElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(citronElement), 20);
        driver.findElement(By.linkText(citronElement)).click();
        return new CitronPage();
    }

    public HerschelPage selectHerschelPageInSchool(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(schoolElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(herschelElement), 20);
        driver.findElement(By.linkText(herschelElement)).click();
        return new HerschelPage();
    }

    public SmilyKiddosPage selectSmilyKiddosPageInSchool(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(schoolElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(smilyKiddosElement), 20);
        driver.findElement(By.linkText(smilyKiddosElement)).click();
        return new SmilyKiddosPage();
    }

    public SchoolTopBrandsShopAllPage selectSchoolTopBrandsShopAllPageInSchool(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(schoolElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(schoolTopBrandsShopAllElement), 20);
        driver.findElement(By.xpath(schoolTopBrandsShopAllElement)).click();
        return new SchoolTopBrandsShopAllPage();
    }

    public NewbornGiftsPage selectNewbornGiftsPageInGifts(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(giftsElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(newbornGiftsElement), 20);
        driver.findElement(By.linkText(newbornGiftsElement)).click();
        return new NewbornGiftsPage();
    }

    public MilestoneCardsPage selectMilestoneCardsPageInGifts(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(giftsElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(milestoneCardsElement), 20);
        driver.findElement(By.linkText(newbornGiftsElement)).click();
        return new MilestoneCardsPage();
    }

    public BabyArtPage selectBabyArtPageInGifts(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(giftsElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(babyArtElement), 20);
        driver.findElement(By.linkText(babyArtElement)).click();
        return new BabyArtPage();
    }

    public NewbornGiftsMuslinsAndSwaddlesPage selectNewbornGiftsMuslinsAndSwaddlesPageInGifts(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(giftsElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(newbornGiftsMuslinsAndSwaddlesElement), 20);
        driver.findElement(By.xpath(newbornGiftsMuslinsAndSwaddlesElement)).click();
        return new NewbornGiftsMuslinsAndSwaddlesPage();
    }

    public NewbornGiftSetsPage selectNewbornGiftSetsPageInGifts(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(giftsElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(newbornGiftSetsElement), 20);
        driver.findElement(By.linkText(newbornGiftSetsElement)).click();
        return new NewbornGiftSetsPage();
    }

    public GearUnder100AEDPage selectGearUnder100AEDPageInGifts(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(giftsElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(gearUnder100AedElement), 20);
        driver.findElement(By.linkText(gearUnder250AedElement)).click();
        return new GearUnder100AEDPage();
    }

    public GearUnder250AEDPage selectGearUnder250AEDPageInGifts(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(giftsElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(gearUnder250AedElement), 20);
        driver.findElement(By.linkText(gearUnder250AedElement)).click();
        return new GearUnder250AEDPage();
    }

    public NewbornGiftsShopAllPage selectNewbornGiftsShopAllPageInGifts(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(giftsElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(newbornGiftsShopAllElement), 20);
        driver.findElement(By.xpath(newbornGiftsShopAllElement)).click();
        return new NewbornGiftsShopAllPage();
    }

    public GiftToysPage selectGiftToysPageInGifts(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(giftsElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(giftToysElement), 20);
        driver.findElement(By.linkText(giftToysElement)).click();
        return new GiftToysPage();
    }

    public Under50AEDPage selectUnder50AEDPageInGifts(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(giftsElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(under50AedElement), 20);
        driver.findElement(By.linkText(under50AedElement)).click();
        return new Under50AEDPage();
    }

    public Under100AEDPage selectUnder100AEDPageInGifts(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(giftsElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(under100AedElement), 20);
        driver.findElement(By.linkText(under100AedElement)).click();
        return new Under100AEDPage();
    }

    public Under500AEDPage selectUnder500AEDPageInGifts(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(giftsElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(under500AedElement), 20);
        driver.findElement(By.linkText(under500AedElement)).click();
        return new Under500AEDPage();
    }

    public Under1000AEDPage selectUnder1000AEDPageInGifts(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(giftsElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(under1000AedElement), 20);
        driver.findElement(By.linkText(under1000AedElement)).click();
        return new Under1000AEDPage();
    }

    public GiftToysShopAllPage selectGiftToysShopAllPageInGifts(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(giftsElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(giftToysShopAllElement), 20);
        driver.findElement(By.xpath(giftToysShopAllElement)).click();
        return new GiftToysShopAllPage();
    }

    public MumsToBeGiftsPage selectMumsToBeGiftsPageInGifts(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(giftsElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(mumsToBeGiftedElement), 20);
        driver.findElement(By.linkText(mumsToBeGiftedElement)).click();
        return new MumsToBeGiftsPage();
    }

    public PhoneAccessoriesPage selectPhoneAccessoriesPageInGifts(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(giftsElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(phoneAccessoriesElement), 20);
        driver.findElement(By.linkText(phoneAccessoriesElement)).click();
        return new PhoneAccessoriesPage();
    }

    public BodyCarePage selectBodyCarePageInGifts(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(giftsElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(bodyCareElement), 20);
        driver.findElement(By.linkText(bodyCareElement)).click();
        return new BodyCarePage();
    }

    public BathTimePage selectBathTimePageInGifts(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(giftsElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(bathTimeElement), 20);
        driver.findElement(By.linkText(bathTimeElement)).click();
        return new BathTimePage();
    }

    public EssentialOilsPage selectEssentialOilsPageInGifts(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(giftsElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(essentialOilsElement), 20);
        driver.findElement(By.linkText(essentialOilsElement)).click();
        return new EssentialOilsPage();
    }

    public MumsToBeGiftsShopAllPage selectMumsToBeGiftsShopAllPageInGifts(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(giftsElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(mumsToBeGiftedShopAllelement), 20);
        driver.findElement(By.xpath(essentialOilsElement)).click();
        return new MumsToBeGiftsShopAllPage();
    }

    public FinishingTouchesPage selectFinishingTouchesPageInGifts(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(giftsElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(finishingTouchesElement), 20);
        driver.findElement(By.linkText(finishingTouchesElement)).click();
        return new FinishingTouchesPage();
    }

    public CandlesAndDiffusersPage selectCandlesAndDiffusersPageInGifts(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(giftsElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(candlesAndDiffusersElement), 20);
        driver.findElement(By.linkText(candlesAndDiffusersElement)).click();
        return new CandlesAndDiffusersPage();
    }

    public HomeAccessoriesPage selectHomeAccessoriesPageInGifts(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(giftsElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(homeAccessoriesElement), 20);
        driver.findElement(By.linkText(homeAccessoriesElement)).click();
        return new HomeAccessoriesPage();
    }

    public NotebooksPage selectNotebooksPageInGifts(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(giftsElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(notebooksElement), 20);
        driver.findElement(By.linkText(notebooksElement)).click();
        return new NotebooksPage();
    }

    public FlowersPage selectFlowersPageInGifts(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(giftsElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(flowersElement), 20);
        driver.findElement(By.linkText(flowersElement)).click();
        return new FlowersPage();
    }

    public FinishingTouchesShopAllPage selectFinishingTouchesShopAllPageInGifts(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(giftsElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(finishingTouchesShopAllElement), 20);
        driver.findElement(By.xpath(finishingTouchesShopAllElement)).click();
        return new FinishingTouchesShopAllPage();
    }

    public PartyEssentialsPage selectPartyEssentialsPageInGifts(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(giftsElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(giftsPartyEssentialsElement), 20);
        driver.findElement(By.linkText(giftsPartyEssentialsElement)).click();
        return new PartyEssentialsPage();
    }

    public BalloonsAndBannersPage selectBalloonsAndBannersPageInGifts(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(giftsElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(ballonsAndBannersElement), 20);
        driver.findElement(By.linkText(ballonsAndBannersElement)).click();
        return new BalloonsAndBannersPage();
    }

    public BirthdayCandlesPage selectBirthdayCandlesPageInGifts(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(giftsElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(birthdayCandlesElement), 20);
        driver.findElement(By.linkText(birthdayCandlesElement)).click();
        return new BirthdayCandlesPage();
    }

    public PartyTablewarePage selectPartyTablewarePageInGifts(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(giftsElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(partyTablewareElement), 20);
        driver.findElement(By.linkText(partyTablewareElement)).click();
        return new PartyTablewarePage();
    }

    public PartyHornsPage selectPartyHornsPageInGifts(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(giftsElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(partyHornsElement), 20);
        driver.findElement(By.linkText(partyHornsElement)).click();
        return new PartyHornsPage();
    }

    public PartyEssentialsShopAllPage selectPartyEssentialsShopAllPageInGifts(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(giftsElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(partyEssentialsShopAllElement), 20);
        driver.findElement(By.xpath(partyEssentialsShopAllElement)).click();
        return new PartyEssentialsShopAllPage();
    }

    public GiftVouchersPage selectGiftVouchersPageInGifts(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(giftsElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(giftVouchersElement), 20);
        driver.findElement(By.linkText(giftVouchersElement)).click();
        return new GiftVouchersPage();
    }

    public SpriiGiftVouchersPage selectSpriiGiftVouchersPageInGifts(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(giftsElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(spriiGiftVouchersElement), 20);
        driver.findElement(By.linkText(spriiGiftVouchersElement)).click();
        return new SpriiGiftVouchersPage();
    }

    public PhotographyPage selectPhotographyPageInGifts(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(giftsElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.linkText(photographyElement), 20);
        driver.findElement(By.linkText(photographyElement)).click();
        return new PhotographyPage();
    }

    public GiftVouchersShopAllPage selectGiftVouchersShopAllPageInGifts(){
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.linkText(giftsElement));
        action.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(giftVouchersShopAllElement), 20);
        driver.findElement(By.xpath(giftVouchersShopAllElement)).click();
        return new GiftVouchersShopAllPage();
    }
}
