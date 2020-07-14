package com.sprii.pdp;

import com.sprii.checkout.CheckoutRegisteredUserPage;
import com.sprii.home.HomePage;
import com.sprii.login.LoginPage;
import com.sprii.login.MyAccount;
import com.sprii.myaccount.MyWishListPage;
import com.sprii.navigate.NerfSupersoakerCategoryPage;
import com.sprii.navigate.diapering.DiaperingPage;
import com.sprii.navigate.diapering.DiapersAndWipesPage;
import com.sprii.ordersuccess.OrderPlacementSuccessPage;
import com.sprii.plp.CartPage;
import com.sprii.shoppingcart.ShoppingCartPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.PropertyFileReader;
import utils.SpriiTestFramework;

public class SimpleProduct1WithOriginalPriceDetailPage {

    WebDriver driver = SpriiTestFramework.getInstance().getDriver();
    PropertyFileReader prop = new PropertyFileReader();

    String addToCartElement = prop.getProperty("SimpleProduct1WithOriginalPriceDetailPage", "add.to.cart.simple.product1.element");
    String addToWishListElement = prop.getProperty("SimpleProduct1WithOriginalPriceDetailPage", "add.to.wishlist.element");
    String simpleProductBaseImageElement = prop.getProperty("SimpleProduct1WithOriginalPriceDetailPage", "simple.product.base.image.element");
    String simpleProductBaseImageZoomElement = prop.getProperty("SimpleProduct1WithOriginalPriceDetailPage", "simple.product.base.image.zoom.element");
    String simpleProductBaseImageLeftScrollArrowElement = prop.getProperty("SimpleProduct1WithOriginalPriceDetailPage", "simple.product.base.image.left.scroll.arrow.element");
    String simpleProductBaseImageRightScrollArrowElement = prop.getProperty("SimpleProduct1WithOriginalPriceDetailPage", "simple.product.base.image.right.scroll.arrow.element");
    String simpleProductFirstThumbnailImageElement = prop.getProperty("SimpleProduct1WithOriginalPriceDetailPage", "simple.product.first.thumbnail.image.element");
    String simpleProductSecondThumbnailImageElement = prop.getProperty("SimpleProduct1WithOriginalPriceDetailPage", "simple.product.second.thumbnail.image.element");
    String simpleProductThirdThumbnailImageElement = prop.getProperty("SimpleProduct1WithOriginalPriceDetailPage", "simple.product.third.thumbnail.image.element");
    String simpleProductFourthThumbnailImageElement = prop.getProperty("SimpleProduct1WithOriginalPriceDetailPage", "simple.product.fourth.thumbnail.image.element");
    String simpleProductFifthThumbnailImageElement = prop.getProperty("SimpleProduct1WithOriginalPriceDetailPage", "simple.product..fifth.thumbnail.image.element");
    String simpleProductViewAllElement = prop.getProperty("SimpleProduct1WithOriginalPriceDetailPage", "simple.product.view.all.element");
    String breadcrumbDiaperingCategoryElement = prop.getProperty("SimpleProduct1WithOriginalPriceDetailPage", "breadcrumb.diapering.category.element");
    String breadcrumbDiapersAndWipesElement = prop.getProperty("SimpleProduct1WithOriginalPriceDetailPage", "breadcrumb.diapersAndWipes.category.element");
    String breadcrumbHomePageElement = prop.getProperty("SimpleProduct1WithOriginalPriceDetailPage", "breadcrumb.homepage.element");
    String loggedUserPaymentMethodCODElement = prop.getProperty("SimpleProduct1WithOriginalPriceDetailPage", "logged.user.payment.method.COD.element");
    String loggedUserPaymentMethodCCElement = prop.getProperty("SimpleProduct1WithOriginalPriceDetailPage", "logged.user.payment.method.CC.element");
    String loggedUserInstantCheckoutButtonElement = prop.getProperty("SimpleProduct1WithOriginalPriceDetailPage", "logged.user.instant.checkout.button.element");

    //Assertions
    String simpleProduct1NameElement = prop.getProperty("SimpleProduct1WithOriginalPriceDetailPage", "simple.product1.name.element");
    String simpleProduct1PriceElement = prop.getProperty("SimpleProduct1WithOriginalPriceDetailPage", "simple.product1.price.element");
    String simpleProduct1VatIncludedTextElement = prop.getProperty("SimpleProduct1WithOriginalPriceDetailPage", "simple.product1.vat.included.text.element");
    String simpleProduct1DeliveryTimeElement = prop.getProperty("SimpleProduct1WithOriginalPriceDetailPage", "simple.product1.delivery.time.element");
    String simpleProduct1SkuTitleElement = prop.getProperty("SimpleProduct1WithOriginalPriceDetailPage", "simple.product1.sku.title.element");
    String simpleProduct1SkuValueElement = prop.getProperty("SimpleProduct1WithOriginalPriceDetailPage", "simple.product1.sku.value.element");
    String simpleProduct1BrandTitleElement = prop.getProperty("SimpleProduct1WithOriginalPriceDetailPage", "simple.product1.brand.title.element");
    String simpleProduct1BrandValueElement = prop.getProperty("SimpleProduct1WithOriginalPriceDetailPage", "simple.product1.brand.value.element");
    String simpleProduct1SizeAgeTitleElement = prop.getProperty("SimpleProduct1WithOriginalPriceDetailPage", "simple.product1.size.age.title.element");
    String simpleProduct1SizeAgeValueElement = prop.getProperty("SimpleProduct1WithOriginalPriceDetailPage", "simple.product1.size.age.value.element");
    String simpleProduct1CollectionTitleElement = prop.getProperty("SimpleProduct1WithOriginalPriceDetailPage", "simple.product1.collection.title.element");
    String simpleProduct1CollectionValueElement = prop.getProperty("SimpleProduct1WithOriginalPriceDetailPage", "simple.product1.collection.value.element");
    String simpleProduct1GuestFreeShippingIconElement = prop.getProperty("SimpleProduct1WithOriginalPriceDetailPage", "simple.product1.guest.user.free.shipping.icon.element");
    String simpleProduct1GuestFreeShippingTextElement = prop.getProperty("SimpleProduct1WithOriginalPriceDetailPage", "simple.product1.guest.user.free.shipping.text.element");
    String simpleProduct1GuestOnAllOrdersElement = prop.getProperty("SimpleProduct1WithOriginalPriceDetailPage", "simple.product1.guest.user.on.all.orders.text.element");
    String simpleProduct1GuestFreeReturnsIconElement = prop.getProperty("SimpleProduct1WithOriginalPriceDetailPage", "simple.product1.guest.user.free.returns.icon.element");
    String simpleProduct1GuestFreeReturnsLabelElement = prop.getProperty("SimpleProduct1WithOriginalPriceDetailPage", "simple.product1.guest.user.free.returns.label.element");
    String simpleProduct1GuestWithinDaysLabelElement = prop.getProperty("SimpleProduct1WithOriginalPriceDetailPage", "simple.product1.guest.user.within.days.label.element");
    String simpleProduct1GuestCashOnDeliveryIconElement = prop.getProperty("SimpleProduct1WithOriginalPriceDetailPage", "simple.product1.guest.user.cash.on.delivery.icon.element");
    String simpleProduct1GuestCashOnDeliveryLabelElement = prop.getProperty("SimpleProduct1WithOriginalPriceDetailPage", "simple.product1.guest.user.cash.on.delivery.label.element");
    String simpleProduct1GuestAvailableLabelElement = prop.getProperty("SimpleProduct1WithOriginalPriceDetailPage", "simple.product1.guest.user.available.label.element");
    String simpleProduct1GuestPriceMatchIconElement = prop.getProperty("SimpleProduct1WithOriginalPriceDetailPage", "simple.product1.guest.user.price.match.icon.element");
    String simpleProduct1GuestPriceMatchLabelElement = prop.getProperty("SimpleProduct1WithOriginalPriceDetailPage", "simple.product1.guest.user.price.match.label.element");
    String simpleProduct1GuestOnAllProductsLabelElement = prop.getProperty("SimpleProduct1WithOriginalPriceDetailPage", "simple.product1.guest.user.on.all.products.label.element");
    String simpleProduct1GuestCustomerAlsoBoughtSection = prop.getProperty("SimpleProduct1WithOriginalPriceDetailPage", "simple.product.1.customer.also.bought.label.element");

    //Any product add to cart button click
    public ShoppingCartPage addToCartButtonClick() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(addToCartElement), 500);
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
        SpriiTestFramework.getInstance().waitForElement(By.xpath(addToWishListElement), 2000);
        driver.findElement(By.xpath(addToWishListElement)).click();
        return new MyWishListPage();
    }

    //Simple product zoom image
    public ProductGalleryPage zoomTheSimpleProduct() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProductBaseImageElement), 500);
        Actions actions = new Actions(driver);
        WebElement target = driver.findElement(By.xpath(simpleProductBaseImageElement));
        actions.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProductBaseImageZoomElement), 20);
        driver.findElement(By.xpath(simpleProductBaseImageZoomElement)).click();
        return new ProductGalleryPage();
    }

    //Simple Product left arrow scrolls
    public SimpleProduct1WithOriginalPriceDetailPage productScrollWithLeftArrow() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProductBaseImageElement), 500);
        Actions actions = new Actions(driver);
        WebElement target = driver.findElement(By.xpath(simpleProductBaseImageElement));
        actions.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProductBaseImageLeftScrollArrowElement), 500);
        driver.findElement(By.xpath(simpleProductBaseImageLeftScrollArrowElement)).click();
        return this;
    }

    //Simple Product right arrow scrolls
    public SimpleProduct1WithOriginalPriceDetailPage productScrollWithRightArrow() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProductBaseImageElement), 500);
        Actions actions = new Actions(driver);
        WebElement target = driver.findElement(By.xpath(simpleProductBaseImageElement));
        actions.moveToElement(target).perform();
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProductBaseImageRightScrollArrowElement), 500);
        driver.findElement(By.xpath(simpleProductBaseImageRightScrollArrowElement)).click();
        return this;
    }

    //Simple Product thumbnail images clicks
    public SimpleProduct1WithOriginalPriceDetailPage clickEventOnFirstThumbnailImage() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProductFirstThumbnailImageElement), 500);
        driver.findElement(By.xpath(simpleProductFirstThumbnailImageElement)).click();
        return this;
    }

    public SimpleProduct1WithOriginalPriceDetailPage clickEventOnSecondImage() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProductSecondThumbnailImageElement), 500);
        driver.findElement(By.xpath(simpleProductSecondThumbnailImageElement)).click();
        return this;
    }

    public SimpleProduct1WithOriginalPriceDetailPage clickEventOnThirdImage() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProductThirdThumbnailImageElement), 500);
        driver.findElement(By.xpath(simpleProductThirdThumbnailImageElement)).click();
        return this;
    }

    public SimpleProduct1WithOriginalPriceDetailPage clickEventOnFourthImage() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProductFourthThumbnailImageElement), 500);
        driver.findElement(By.xpath(simpleProductFourthThumbnailImageElement)).click();
        return this;
    }

    public SimpleProduct1WithOriginalPriceDetailPage clickEventOnFifthImage() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProductFifthThumbnailImageElement), 500);
        driver.findElement(By.xpath(simpleProductFifthThumbnailImageElement)).click();
        return this;
    }

    public NerfSupersoakerCategoryPage clickViewallNerfSupersoakerproductsLink() {
        SpriiTestFramework.getInstance().waitForElement(By.linkText(simpleProductViewAllElement), 20);
        driver.findElement(By.linkText(simpleProductViewAllElement)).click();
        return new NerfSupersoakerCategoryPage();
    }

//    //Thumbnail images scroll arrows
//    public SimpleProduct1WithOriginalPriceDetailPage clickEventOnThumbnailLowerScrollArrow() {
//        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProductThumbnailLowerScrollArrowElement), 20);
//        driver.findElement(By.xpath(configProductThumbnailLowerScrollArrowElement)).click();
//        return this;
//    }

//    public SimpleProduct1WithOriginalPriceDetailPage clickEventOnThumbnailUpperScrollArrow() {
//        SpriiTestFramework.getInstance().waitForElement(By.xpath(configProductThumbnailUpperScrollArrowElement), 20);
//        driver.findElement(By.xpath(configProductThumbnailUpperScrollArrowElement)).click();
//        return this;
//    }

    //Add to cart button click event without selecting config option for config product
    public SimpleProduct1WithOriginalPriceDetailPage addToCartWithoutSelectingConfigOption() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(addToCartElement), 20);
        driver.findElement(By.xpath(addToCartElement)).click();
        return this;
    }

    public DiapersAndWipesPage selectDiapersAndWipesBreadcrumb() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(breadcrumbDiapersAndWipesElement), 20);
        driver.findElement(By.xpath(breadcrumbDiapersAndWipesElement)).click();
        return new DiapersAndWipesPage();
    }

    public DiaperingPage selectDiaperingBreadcrumb() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(breadcrumbDiaperingCategoryElement), 20);
        driver.findElement(By.xpath(breadcrumbDiaperingCategoryElement)).click();
        return new DiaperingPage();
    }

    public HomePage selectHomePageBreadcrumb() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(breadcrumbHomePageElement), 20);
        driver.findElement(By.xpath(breadcrumbHomePageElement)).click();
        return new HomePage();
    }

    //Assertions
    public boolean productNameIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProduct1NameElement), 5);
        String productName = driver.findElement(By.xpath(simpleProduct1NameElement)).getText();
        if (productName.equals("Test Simple Product 1 - Original Price")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean productPriceIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProduct1PriceElement), 5);
        String productPrice = driver.findElement(By.xpath(simpleProduct1PriceElement)).getText();
        if (productPrice.equals("AED 252")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean productVATTextIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProduct1VatIncludedTextElement), 5);
        String productVATIncludedText = driver.findElement(By.xpath(simpleProduct1VatIncludedTextElement)).getText();
        if (productVATIncludedText.equals("VAT included")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean productDeliveryTimeIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProduct1DeliveryTimeElement), 5);
        String productDeliveryTimeLabel = driver.findElement(By.xpath(simpleProduct1DeliveryTimeElement)).getText();
        if (productDeliveryTimeLabel.equals("Delivery Time: 2-4 business days")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean productSKULabelIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProduct1SkuTitleElement), 5);
        String productSKULabel = driver.findElement(By.xpath(simpleProduct1SkuTitleElement)).getText();
        if (productSKULabel.equals("SKU")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean productSKUValueIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProduct1SkuValueElement), 5);
        String productSKUValue = driver.findElement(By.xpath(simpleProduct1SkuValueElement)).getText();
        if (productSKUValue.equals("TestSimpleProduct-OriginalPrice")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean productBrandLabelIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProduct1BrandTitleElement), 5);
        String productBrandLabel = driver.findElement(By.xpath(simpleProduct1BrandTitleElement)).getText();
        if (productBrandLabel.equals("Brand")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean productBrandValueIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProduct1BrandValueElement), 5);
        String productBrandValue = driver.findElement(By.xpath(simpleProduct1BrandValueElement)).getText();
        if (productBrandValue.equals("Nerf Supersoaker")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean productSizeAndAgeLabelIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProduct1SizeAgeTitleElement), 5);
        String productSizeAndAgeLabel = driver.findElement(By.xpath(simpleProduct1SizeAgeTitleElement)).getText();
        if (productSizeAndAgeLabel.equals("Size/Age")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean productSizeAndAgeValueIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProduct1SizeAgeValueElement), 5);
        String productSizeAndAgeValue = driver.findElement(By.xpath(simpleProduct1SizeAgeValueElement)).getText();
        if (productSizeAndAgeValue.equals("25cm x 30cm, 50cm x 80cm")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean productCollectionLabelIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProduct1CollectionTitleElement), 5);
        String productCollectionLabel = driver.findElement(By.xpath(simpleProduct1CollectionTitleElement)).getText();
        if (productCollectionLabel.equals("Collection")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean productCollectionValueIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProduct1CollectionValueElement), 5);
        String productCollectionValue = driver.findElement(By.xpath(simpleProduct1CollectionValueElement)).getText();
        if (productCollectionValue.equals("Premium Care, Baby-Dry, Embroidery, Animals")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean guestUserFreeShippingLabelIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProduct1GuestFreeShippingTextElement), 5);
        String guestUserFreeShippingLabel = driver.findElement(By.xpath(simpleProduct1GuestFreeShippingTextElement)).getText();
        if (guestUserFreeShippingLabel.equals("FREE SHIPPING")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean guestUserOnAllOrderTextIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProduct1GuestOnAllOrdersElement), 5);
        String guestUserOnAllOrders = driver.findElement(By.xpath(simpleProduct1GuestOnAllOrdersElement)).getText();
        if (guestUserOnAllOrders.equals("On All Orders!")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean guestUserFreeReturnsLabelIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProduct1GuestFreeReturnsLabelElement), 5);
        String guestUserFreeReturnsLabel = driver.findElement(By.xpath(simpleProduct1GuestFreeReturnsLabelElement)).getText();
        if (guestUserFreeReturnsLabel.equals("FREE RETURNS")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean guestUserWithin7DaysTextIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProduct1GuestWithinDaysLabelElement), 5);
        String guestUserWithinDaysLabel = driver.findElement(By.xpath(simpleProduct1GuestWithinDaysLabelElement)).getText();
        if (guestUserWithinDaysLabel.equals("Within 7 Days")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean guestUserCashOnDeliveryLabelIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProduct1GuestCashOnDeliveryLabelElement), 5);
        String guestUserCashOnDeliveryLabel = driver.findElement(By.xpath(simpleProduct1GuestCashOnDeliveryLabelElement)).getText();
        if (guestUserCashOnDeliveryLabel.equals("CASH ON DELIVERY")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean guestUserAvailableLabelIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProduct1GuestAvailableLabelElement), 5);
        String guestUserAvailableLabel = driver.findElement(By.xpath(simpleProduct1GuestAvailableLabelElement)).getText();
        if (guestUserAvailableLabel.equals("Available")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean guestUserPriceMatchLabelIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProduct1GuestPriceMatchLabelElement), 5);
        String guestUserAvailableLabel = driver.findElement(By.xpath(simpleProduct1GuestPriceMatchLabelElement)).getText();
        if (guestUserAvailableLabel.equals("PRICE MATCH")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean guestUserOnAllProductsLabelIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProduct1GuestOnAllProductsLabelElement), 5);
        String guestUserOnAllProductsLabel = driver.findElement(By.xpath(simpleProduct1GuestOnAllProductsLabelElement)).getText();
        if (guestUserOnAllProductsLabel.equals("On All Products")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean guestUserCustomerAlsoBoughtTitleIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(simpleProduct1GuestCustomerAlsoBoughtSection), 5);
        String guestUserCustomerAlsoBoughtTitle = driver.findElement(By.xpath(simpleProduct1GuestCustomerAlsoBoughtSection)).getText();
        if (guestUserCustomerAlsoBoughtTitle.equals("CUSTOMERS ALSO BOUGHT:")) {
            return true;
        } else {
            return false;
        }
    }

    //Registered user detail page checkout
    public SimpleProduct1WithOriginalPriceDetailPage selectPaymentMethodAsCOD() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(loggedUserPaymentMethodCODElement), 15);
        if (!driver.findElement(By.xpath(loggedUserPaymentMethodCODElement)).isSelected()) {
//            driver.findElement(By.id(paymentMethodCODElement)).click();
            WebElement codRadioButton = driver.findElement(By.xpath(loggedUserPaymentMethodCODElement));
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", codRadioButton);
            return this;
        } else {
            return this;
        }
    }

    public SimpleProduct1WithOriginalPriceDetailPage selectPaymentMethodAsCC() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(loggedUserPaymentMethodCCElement), 15);
        if (!driver.findElement(By.xpath(loggedUserPaymentMethodCCElement)).isSelected()) {
//            driver.findElement(By.id(paymentMethodCCElement)).click();
            WebElement ccRadioButton = driver.findElement(By.xpath(loggedUserPaymentMethodCCElement));
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", ccRadioButton);
            return this;
        } else {
            return this;
        }
    }

    public OrderPlacementSuccessPage clickInstantCheckoutButton() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(loggedUserInstantCheckoutButtonElement), 20);
        WebElement target = driver.findElement(By.xpath(loggedUserInstantCheckoutButtonElement));
        Actions builder = new Actions(driver);
        builder.moveToElement(target).click().build().perform();
        return new OrderPlacementSuccessPage();
    }
}
