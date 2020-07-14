package com.sprii.myaccount;

import com.sprii.login.LoginPage;
import com.sprii.login.LogoutSuccessPage;
import com.sprii.pdp.*;
import com.sprii.shoppingcart.ShoppingCartPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.PropertyFileReader;
import utils.SpriiTestFramework;

public class MyWishListPage {

    WebDriver driver = SpriiTestFramework.getInstance().getDriver();
    PropertyFileReader prop = new PropertyFileReader();

    String updateListElement = prop.getProperty("MyWishListPage", "update.list.element");
    String shareListElement = prop.getProperty("MyWishListPage", "share.list.element");
    String addAllElement = prop.getProperty("MyWishListPage", "add.all.element");

    String specialPriceSimpleProductNameElement = prop.getProperty("MyWishListPage", "special.price.simple.product.name.element");
    String originalPriceSimpleProduct1NameElement = prop.getProperty("MyWishListPage", "original.price.simple.product1.name.element");
    String originalPriceConfigProduct1NameElement = prop.getProperty("MyWishListPage", "original.price.config.product1.name.element");
    String specialPriceConfigProduct2NameElement = prop.getProperty("MyWishListPage", "special.price.config.product2.name.element");
    String originalPriceSimpleProduct4NameElement = prop.getProperty("MyWishListPage", "original.price.simple.product4.name.element");
    String specialPriceSimpleProduct3NameElement = prop.getProperty("MyWishListPage", "special.price.simple.product3.name.element");

    String product1AddToCartElement = prop.getProperty("MyWishListPage", "product.1.add.to.cart.element");
    String product2AddToCartElement = prop.getProperty("MyWishListPage", "product.2.add.to.cart.element");
    String product3AddToCartElement = prop.getProperty("MyWishListPage", "product.3.add.to.cart.element");
    String product4AddToCartElement = prop.getProperty("MyWishListPage", "product.4.add.to.cart.element");
    String product5AddToCartElement = prop.getProperty("MyWishListPage", "product.5.add.to.cart.element");
    String product6AddToCartElement = prop.getProperty("MyWishListPage", "product.6.add.to.cart.element");

    String product1EditElement = prop.getProperty("MyWishListPage", "product.1.edit.element");
    String product2EditElement = prop.getProperty("MyWishListPage", "product.2.edit.element");
    String product3EditElement = prop.getProperty("MyWishListPage", "product.3.edit.element");
    String product4EditElement = prop.getProperty("MyWishListPage", "product.4.edit.element");
    String product5EditElement = prop.getProperty("MyWishListPage", "product.5.edit.element");
    String product6EditElement = prop.getProperty("MyWishListPage", "product.6.edit.element");

    String product1RemoveElement = prop.getProperty("MyWishListPage", "product.1.remove.element");
    String product2RemoveElement = prop.getProperty("MyWishListPage", "product.2.remove.element");
    String product3RemoveElement = prop.getProperty("MyWishListPage", "product.3.remove.element");
    String product4RemoveElement = prop.getProperty("MyWishListPage", "product.4.remove.element");
    String product5RemoveElement = prop.getProperty("MyWishListPage", "product.5.remove.element");
    String product6RemoveElement = prop.getProperty("MyWishListPage", "product.6.remove.element");
    String userLogoutElement = prop.getProperty("MyWishListPage", "user.logout.wishlist.element");
    String msgForLoggedUserWishList = prop.getProperty("MyWishListPage", "login.user.wish.list.adding.msg.element");


    public MyWishListPage selectUpdateList() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(updateListElement), 20);
        driver.findElement(By.xpath(updateListElement)).click();
        return this;
    }

    public WishListSharingPage selectShareList() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(shareListElement), 20);
        driver.findElement(By.xpath(shareListElement)).click();
        return new WishListSharingPage();
    }

    public ShoppingCartPage selectAddAlltoCart() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(addAllElement), 20);
        driver.findElement(By.xpath(addAllElement)).click();
        return new ShoppingCartPage();
    }

    // Go to PDP SimpleProductWithSpecialPriceDetailPage
    public SimpleProductWithSpecialPriceDetailPage selectSimpleProductWithSpecialPriceDetailPage() {
        SpriiTestFramework.getInstance().waitForElement(By.className(specialPriceSimpleProductNameElement), 20);
        driver.findElement(By.id(specialPriceSimpleProductNameElement)).click();
        return new SimpleProductWithSpecialPriceDetailPage();
    }

    public SimpleProduct1WithOriginalPriceDetailPage selectSimpleProduct1WithOriginalPriceDetailPage() {
        SpriiTestFramework.getInstance().waitForElement(By.className(originalPriceSimpleProduct1NameElement), 20);
        driver.findElement(By.id(originalPriceSimpleProduct1NameElement)).click();
        return new SimpleProduct1WithOriginalPriceDetailPage();
    }

    public ConfigProductWithOriginalPriceDetailPage selectConfigProductWithOriginalPriceDetailPage() {
        SpriiTestFramework.getInstance().waitForElement(By.className(originalPriceConfigProduct1NameElement), 20);
        driver.findElement(By.id(originalPriceConfigProduct1NameElement)).click();
        return new ConfigProductWithOriginalPriceDetailPage();
    }

    public ConfigProductWithSpecialPriceDetailPage selectConfigProductWithSpecialPriceDetailPage() {
        SpriiTestFramework.getInstance().waitForElement(By.className(specialPriceConfigProduct2NameElement), 20);
        driver.findElement(By.id(specialPriceConfigProduct2NameElement)).click();
        return new ConfigProductWithSpecialPriceDetailPage();
    }

    public SimpleProduct4WithOriginalPriceDetailPage selectSimpleProduct4WithOriginalPriceDetailPage() {
        SpriiTestFramework.getInstance().waitForElement(By.className(originalPriceSimpleProduct4NameElement), 20);
        driver.findElement(By.id(originalPriceSimpleProduct4NameElement)).click();
        return new SimpleProduct4WithOriginalPriceDetailPage();
    }

    public SimpleProduct3WithSpecialPriceDetailPage selectSimpleProduct3WithSpecialPriceDetailPage() {
        SpriiTestFramework.getInstance().waitForElement(By.className(specialPriceSimpleProduct3NameElement), 20);
        driver.findElement(By.id(specialPriceSimpleProduct3NameElement)).click();
        return new SimpleProduct3WithSpecialPriceDetailPage();
    }

    public ShoppingCartPage selectAddToCartProduct1() {
        SpriiTestFramework.getInstance().waitForElement(By.className(product1AddToCartElement), 20);
        driver.findElement(By.id(product1AddToCartElement)).click();
        return new ShoppingCartPage();
    }

    public ShoppingCartPage selectAddToCartProduct2() {
        SpriiTestFramework.getInstance().waitForElement(By.className(product2AddToCartElement), 20);
        driver.findElement(By.id(product2AddToCartElement)).click();
        return new ShoppingCartPage();
    }

    public ShoppingCartPage selectAddToCartProduct3() {
        SpriiTestFramework.getInstance().waitForElement(By.className(product3AddToCartElement), 20);
        driver.findElement(By.id(product3AddToCartElement)).click();
        return new ShoppingCartPage();
    }

    public ShoppingCartPage selectAddToCartProduct4() {
        SpriiTestFramework.getInstance().waitForElement(By.className(product4AddToCartElement), 20);
        driver.findElement(By.id(product4AddToCartElement)).click();
        return new ShoppingCartPage();
    }

    public ShoppingCartPage selectAddToCartProduct5() {
        SpriiTestFramework.getInstance().waitForElement(By.className(product5AddToCartElement), 20);
        driver.findElement(By.id(product5AddToCartElement)).click();
        return new ShoppingCartPage();
    }

    public ShoppingCartPage selectAddToCartProduct6() {
        SpriiTestFramework.getInstance().waitForElement(By.className(product6AddToCartElement), 20);
        driver.findElement(By.id(product6AddToCartElement)).click();
        return new ShoppingCartPage();
    }

    public SimpleProductWithSpecialPriceDetailPage selectEditSimpleProductWithSpecialPriceDetailPage() {
        SpriiTestFramework.getInstance().waitForElement(By.className(product1EditElement), 20);
        driver.findElement(By.id(product1EditElement)).click();
        return new SimpleProductWithSpecialPriceDetailPage();
    }

    public SimpleProduct1WithOriginalPriceDetailPage selectEditSimpleProduct1WithOriginalPriceDetailPage() {
        SpriiTestFramework.getInstance().waitForElement(By.className(product2EditElement), 20);
        driver.findElement(By.id(product2EditElement)).click();
        return new SimpleProduct1WithOriginalPriceDetailPage();
    }

    public ConfigProductWithOriginalPriceDetailPage selectEditConfigProductWithOriginalPriceDetailPage() {
        SpriiTestFramework.getInstance().waitForElement(By.className(product3EditElement), 20);
        driver.findElement(By.id(product3EditElement)).click();
        return new ConfigProductWithOriginalPriceDetailPage();
    }

    public ConfigProductWithSpecialPriceDetailPage selectEditConfigProductWithSpecialPriceDetailPage() {
        SpriiTestFramework.getInstance().waitForElement(By.className(product4EditElement), 20);
        driver.findElement(By.id(product4EditElement)).click();
        return new ConfigProductWithSpecialPriceDetailPage();
    }

    public SimpleProduct4WithOriginalPriceDetailPage selectEditSimpleProduct4WithOriginalPriceDetailPage() {
        SpriiTestFramework.getInstance().waitForElement(By.className(product5EditElement), 20);
        driver.findElement(By.id(product5EditElement)).click();
        return new SimpleProduct4WithOriginalPriceDetailPage();
    }

    public SimpleProduct3WithSpecialPriceDetailPage selectEditSimpleProduct3WithSpecialPriceDetailPage() {
        SpriiTestFramework.getInstance().waitForElement(By.className(product6EditElement), 20);
        driver.findElement(By.id(product6EditElement)).click();
        return new SimpleProduct3WithSpecialPriceDetailPage();
    }

    public MyWishListPage selectRemoveProduct1() {
        SpriiTestFramework.getInstance().waitForElement(By.className(product1RemoveElement), 20);
        driver.findElement(By.id(product1RemoveElement)).click();
        return new MyWishListPage();
    }

    public MyWishListPage selectRemoveProduct2() {
        SpriiTestFramework.getInstance().waitForElement(By.className(product2RemoveElement), 20);
        driver.findElement(By.id(product2RemoveElement)).click();
        return new MyWishListPage();
    }

    public MyWishListPage selectRemoveProduct3() {
        SpriiTestFramework.getInstance().waitForElement(By.className(product3RemoveElement), 20);
        driver.findElement(By.id(product3RemoveElement)).click();
        return new MyWishListPage();
    }

    public MyWishListPage selectRemoveProduct4() {
        SpriiTestFramework.getInstance().waitForElement(By.className(product4RemoveElement), 20);
        driver.findElement(By.id(product4RemoveElement)).click();
        return new MyWishListPage();
    }

    public MyWishListPage selectRemoveProduct5() {
        SpriiTestFramework.getInstance().waitForElement(By.className(product5RemoveElement), 20);
        driver.findElement(By.id(product5RemoveElement)).click();
        return new MyWishListPage();
    }

    public MyWishListPage selectRemoveProduct6() {
        SpriiTestFramework.getInstance().waitForElement(By.className(product6RemoveElement), 20);
        driver.findElement(By.id(product6RemoveElement)).click();
        return new MyWishListPage();
    }

    public LogoutSuccessPage selectLogout() {
        SpriiTestFramework.getInstance().waitForElement(By.linkText(userLogoutElement), 20);
        driver.findElement(By.linkText(userLogoutElement)).click();
        return new LogoutSuccessPage();
    }

    public boolean wishListAddingMsgForLoggedUser() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(msgForLoggedUserWishList), 20);
        String wishListAddingMsgForLoggedUser = driver.findElement(By.xpath(msgForLoggedUserWishList)).getText();
        if (wishListAddingMsgForLoggedUser.equals("Test Simple Product 1 - Original Price has been added to your Wish List. Click here to continue shopping.")) {
            return true;
        } else {
            return false;
        }
    }
}
