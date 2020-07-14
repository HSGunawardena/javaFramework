package com.sprii.myaccount;


import com.sprii.login.LoginPage;
import com.sprii.login.LogoutSuccessPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.PropertyFileReader;
import utils.SpriiTestFramework;

public class AccountDashboardPage {

    WebDriver driver = SpriiTestFramework.getInstance().getDriver();
    PropertyFileReader prop = new PropertyFileReader();

    String userLogoutElement = prop.getProperty("AccountDashboardPage", "user.logout.element");
    String editPasswordElement = prop.getProperty("AccountDashboardPage", "edit.password.element");
    String changePasswordElement = prop.getProperty("AccountDashboardPage", "change.password.element");
    String manageAddressesElement = prop.getProperty("AccountDashboardPage", "manage.addresses.book.element");
    String myOrdersElement = prop.getProperty("AccountDashboardPage", "my.orders.element");
    String wishListElement = prop.getProperty("AccountDashboardPage", "wish.list.element");
    String storeCreditElement = prop.getProperty("AccountDashboardPage", "store.credit.element");
    String myCreditCardsElement = prop.getProperty("AccountDashboardPage", "credit.card.element");
    String editAddressElement = prop.getProperty("AccountDashboardPage", "edit.address.element");
    String editNewsLetterElement = prop.getProperty("AccountDashboardPage", "edit.newsletter.element");
    String airMilesID = prop.getProperty("AccountDashboardPage", "air.miles.id.element");
    String myAccountTitleElement = prop.getProperty("AccountDashboardPage", "my.account.title.element");

    public LogoutSuccessPage selectLogout(){
        SpriiTestFramework.getInstance().waitForElement(By.xpath(userLogoutElement), 100);
        driver.findElement(By.xpath(userLogoutElement)).click();
        return new LogoutSuccessPage();
    }

    public AccountInformationChangePasswordPage selectEditContactInformation(){
        SpriiTestFramework.getInstance().waitForElement((By.linkText(editPasswordElement)), 20);
        driver.findElement(By.linkText(editPasswordElement)).click();
        return new AccountInformationChangePasswordPage();
    }

    public AccountInformationChangePasswordPage selectChangePassword(){
        SpriiTestFramework.getInstance().waitForElement(By.xpath(changePasswordElement), 20);
        driver.findElement(By.xpath(changePasswordElement)).click();
        return new AccountInformationChangePasswordPage();
    }

    public ManageYourPreferencesPage selectEditNewsLetter(){
        SpriiTestFramework.getInstance().waitForElement(By.xpath(editNewsLetterElement), 20);
        driver.findElement(By.xpath(editNewsLetterElement)).click();
       return  new ManageYourPreferencesPage();
    }

    public AddressBookPage selectManageAddresses(){
        SpriiTestFramework.getInstance().waitForElement(By.linkText(manageAddressesElement),20);
        driver.findElement(By.linkText(manageAddressesElement)).click();
        return new AddressBookPage();
    }

    public MyOrdersPage selectMyOrders(){
        SpriiTestFramework.getInstance().waitForElement(By.xpath(myOrdersElement), 20);
        driver.findElement(By.xpath(myOrdersElement)).click();
        return new MyOrdersPage();
    }

    public MyWishListPage selectWishList(){
        SpriiTestFramework.getInstance().waitForElement(By.xpath(wishListElement), 20);
        driver.findElement(By.xpath(wishListElement)).click();
        return new MyWishListPage();
    }

    public StoreCreditPage selectStoreCredit(){
        SpriiTestFramework.getInstance().waitForElement(By.xpath(storeCreditElement), 20);
        driver.findElement(By.xpath(storeCreditElement)).click();
        return new StoreCreditPage();
    }

    public MyCreditCardsPage selectMyCreditCards(){
        SpriiTestFramework.getInstance().waitForElement(By.linkText(myCreditCardsElement), 20);
        driver.findElement(By.linkText(myCreditCardsElement)).click();
        return new MyCreditCardsPage();
    }

    public MyCreditCardsPage selectAirMilesId(){
        SpriiTestFramework.getInstance().waitForElement(By.linkText(airMilesID), 20);
        driver.findElement(By.linkText(airMilesID)).click();
        return new MyCreditCardsPage();
    }

    public EditAddressPage selectEditAddress(){
        SpriiTestFramework.getInstance().waitForElement(By.linkText(editAddressElement), 20);
        driver.findElement(By.linkText(editAddressElement)).click();
        return new EditAddressPage();
    }

    public boolean titleIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(myAccountTitleElement), 5);
        String title = driver.findElement(By.xpath(myAccountTitleElement)).getText();
        if(title.equals("MY ACCOUNT")){
            return true;
        }else{
            return false;
        }
    }
}



