package com.sprii.regressionTestSuite;

import com.sprii.header.Header;
import com.sprii.home.HomePage;
import com.sprii.login.LoginPage;
import com.sprii.myaccount.*;
import com.sprii.shoppingcart.ShoppingCartPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.SpriiTestFramework;

public class MyAccountTest {
    AccountDashboardPage accountDashboardpage;
    AccountInformationChangePasswordPage accountInformationChangePasswordPage;
    AccountInformationEditPage accountInformationEditPage;
    AddNewAddressPage addNewAddressPage;
    AddressBookPage addressBookPage;
    CreateAccountPage createAccountPage;
    EditAddressPage editAddressPage;
    ManageYourPreferencesPage manageYourPreferencesPage;
    MyCreditCardsPage mycreditCardsPage;
    MyOrdersPage myOrdersPage;
    MyWishListPage myWishListPage;
    StoreCreditPage storeCreditPage;
    WishListSharingPage wishListSharingPage;
    HomePage homepage;
    LoginPage loginPage;
    Header header;
    ShoppingCartPage shoppingCartPage;

    @BeforeClass
    public void beforeClass() {
        SpriiTestFramework.getInstance().openBrowser();
        SpriiTestFramework.getInstance().navigateToURL();
        header = new Header();
        header
                .redirectToSignInPage()
                .loginSuccess("sanuja+311@sprii.com", "sprii12");
    }

    @BeforeMethod
    public void setUp() {
        accountDashboardpage = new AccountDashboardPage();
        accountInformationChangePasswordPage = new AccountInformationChangePasswordPage();
        accountInformationEditPage = new AccountInformationEditPage();
        addNewAddressPage = new AddNewAddressPage();
        addressBookPage = new AddressBookPage();
        createAccountPage = new CreateAccountPage();
        editAddressPage = new EditAddressPage();
        manageYourPreferencesPage = new ManageYourPreferencesPage();
        mycreditCardsPage = new MyCreditCardsPage();
        myOrdersPage = new MyOrdersPage();
        myWishListPage = new MyWishListPage();
        storeCreditPage = new StoreCreditPage();
        wishListSharingPage = new WishListSharingPage();
        homepage = new HomePage();
        loginPage = new LoginPage();
        header = new Header();
        shoppingCartPage = new ShoppingCartPage();
        header = new Header();
    }

    // Logout from the account
    @Test(priority = 1)
    public void testLogout() {
        accountDashboardpage
                .selectLogout();
        header
                .redirectToSignInPage()
                .loginSuccess("sanuja+311@sprii.com", "sprii12");
    }

    // Edit Account Information details
    @Test(priority = 2)
    public void testEditContactInformation() {
        accountDashboardpage
                .selectEditContactInformation();
        accountInformationEditPage
                .editFirstName("SanujaT")
                .editLastName("Test123")
                .selectSaveButton();
    }

    // Change password for the user
    @Test(priority = 3)
    public void testEditPassword() {
        accountDashboardpage
                .selectChangePassword();
        accountInformationEditPage
                .changePassword("sprii123", "sprii12", "sprii12");
    }

    // Change email for the user
    @Test(priority = 4)
    public void testChangeEmail() {
        accountDashboardpage
                .selectChangePassword();
        accountInformationEditPage
                .changeEmail("sanuja+311@sprii.com", "sprii12");
    }

    // Change email and password
    @Test(priority = 5)
    public void testChangeEmailAndPassword() {
        accountDashboardpage
                .selectChangePassword();
        accountInformationEditPage
                .ChangeEmailandPassword("sanuja+311@sprii.com", "sprii12", "sprii12", "sprii12");
    }

    // Subscribe for the newsletter (Manage Your Preferences)
    @Test(priority = 6)
    public void testNewsLetterSubscription() {
        accountDashboardpage
                .selectEditNewsLetter();
        manageYourPreferencesPage
                .getNewsLetter()
                .selectSaveButton();
    }

    // Change shipping address (Manage Address > Change Shipping Address) 
    @Test(priority = 7)
    public void testManageAddress() {
        accountDashboardpage
                .selectManageAddresses();
        addressBookPage
                .selectChangeShippingAddress();
        editAddressPage
                .setFirstName("Sanuja")
                .setLastName("Test321")
                .selectCity("Al Ain")
                .setArea("Ajman")
                .setStreet("S1")
                .setBuilding("B21")
                .setPhoneNumber("+971 52 860 6921")
                .selectSaveAddress();
    }

    // Add a new address (Manage Address > Add New Address)
    @Test(priority = 8)
    public void testAddNewAddress() {
        accountDashboardpage
                .selectManageAddresses();
        addressBookPage
                .selectAddnewAddress();
        addNewAddressPage
                .setFirstName("sanujaTest")
                .setLastName("Test321")
                .selectCity("Al Ain")
                .setArea("Ajman")
                .setStreet("S1")
                .setBuilding("B21")
                .setPhoneNumber("+971 52 860 6921")
                .selectSaveAddress();

    }

    // Edit Address
    @Test(priority = 9)
    public void testEditAddress() {
        accountDashboardpage
                .selectEditAddress();
        editAddressPage
                .setFirstName("SanujaEditTest")
                .setLastName("Test321")
                .selectCity("Al Ain")
                .setArea("Ajman")
                .setStreet("S1")
                .setBuilding("B21")
                .setPhoneNumber("+971 52 860 6921")
                .selectSaveAddress();
    }

    // View My Orders
    @Test(priority = 10)
    public void testMyOrders() {

        accountDashboardpage
                .selectMyOrders();
    }

    // Update WishList
    @Test(priority = 11)
    public void testMyWishList() {
        accountDashboardpage
                .selectWishList();
        myWishListPage
                .selectUpdateList();
    }

    // Share WishList
    @Test(priority = 12)
    public void testShareWishList() {
        accountDashboardpage
                .selectWishList();
        myWishListPage
                .selectShareList();
        wishListSharingPage
                .setEmails("Saliya@sprii.com")
                .setMessage("Test")
                .selectShareWishList();
    }

    // Add all to shopping cart
    @Test(priority = 13)
    public void testAddAllToCart() {
        shoppingCartPage = accountDashboardpage
                .selectWishList()
                .selectAddAlltoCart();
    }

    // Select Store Credit
    @Test(priority = 14)
    public void testStoreCredit() {
        accountDashboardpage
                .selectStoreCredit();
    }

    // Select My Credit Cards
    @Test(priority = 15)
    public void testMyCreditCards() {
        accountDashboardpage
                .selectMyCreditCards();
    }

    // Select Air Miles ID
    @Test(priority = 16)
    public void testAirMilesId() {
        accountDashboardpage
                .selectAirMilesId();
    }

    @AfterClass
    public void afterClass() {
        SpriiTestFramework.getInstance().closeBrowser();
    }
}
