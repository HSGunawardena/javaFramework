package com.sprii.regressionTestSuite;

import com.sprii.footer.*;
import com.sprii.home.HomePage;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.SpriiTestFramework;

import java.util.Random;

public class FooterTest {

    Footer footer;
    HomePage home;
    ToysCategoryPage toys;
    DiapersCategoryPage diapering;
    BabyFoodCategoryPage babyFood;
    StrollersCategoryPage strollers;
    BabyWalkersCategoryPage babyWalkers;
    BabySwingCategoryPage babySwing;
    CarSeatesCategoryPage carSeats;
    TestimonialsPage testimonials;
    AffiliateProgramPage affiliateProgram;
    SellingOnSpriiPage sellingOnSprii;
    CareersPage careers;
    CorporateSalesPage corporateSales;
    ViewAllBrandPage viewAllBrands;
    AboutUsPage aboutUs;
    HelpAndContactUsPage helpAndContactUs;
    ShippingAndReturnsPage shippingAndReturns;
    FaqPage faq;
    RequestAProductPage requestAProduct;
    TermsAndConditions termsAndConditions;
    PrivacyAndCookiePolicy privacyAndCookiePolicy;
    SpriiEmailPopup spriiEmailPopup;
    FacebookPage facebook;
    TwitterPage twitter;
    YouTubeChannel youTube;
    InstagramPage instagram;
    WhatsAppPage whatsApp;
    Boolean isNewsletterTitle1Available;
    Boolean isNewsletterTitle2Available;
    Boolean isFreeShippingLabelAvailable;
    Boolean isOnAllOrdersLabelAvailable;
    Boolean isFreeReturnsLabelAvailable;
    Boolean isWithinDaysAvailable;
    Boolean isPriceMatchLabelAvailable;
    Boolean isOnAllProductsAvailable;
    Boolean isCashOnDeliveryAvailable;
    Boolean isAvailableLabelAvailable;
    Boolean isTopCategoriesLabelAvailable;
    Boolean isAboutLabelAvailable;
    Boolean isCustomerServiceAvailable;
    Boolean isCompanyInfoAvailable;
    Boolean isCompanyInfoSpriiComAvailable;
    Boolean isCompanyInfoAddressAvailable;
    Boolean isCompanyPhoneNumberAvailable;
    Boolean isCopyrightLabelAvailable;
    String newsletterSuccessMsg;
    String alreadySubscribedErrorMsg;
    String invalidEmailAddressErrorMsg;
    String errorMsgForEmptyEmailAddress;

    //To randomize the email address
    Random randomGenerator = new Random();
    int randomInt = randomGenerator.nextInt(1000);
    String userEmail = "sureni+" + randomInt + "@sprii.com";

    @BeforeClass
    public void beforeClass() throws Exception {
        SpriiTestFramework.getInstance().openBrowser();
    }

    @BeforeMethod
    public void setUp() throws Exception {
        SpriiTestFramework.getInstance().navigateToURL();
        footer = new Footer();
    }

    @Test(priority = 1)
    public void testNewsletterSuccess() throws Exception {
        footer
                .newsletterSuccess(userEmail);
        Thread.sleep(5000);
        newsletterSuccessMsg = footer
                .getNewsletterSuccessMessage();
        Assert.assertEquals(newsletterSuccessMsg, "Thank you for your subscription.");
        System.out.println(newsletterSuccessMsg);
    }

    @Test(priority = 2)
    public void testNewsletterUnSuccessWithAlreadySubscribed() throws Exception {
        alreadySubscribedErrorMsg = footer
                .newsletterUnSuccessWithAlreadySubscribed("sureni@sprii.com")
                .getAlreadySubscribedErrorMessage();
        Assert.assertEquals(alreadySubscribedErrorMsg, "User already subscribed.");
        System.out.println(alreadySubscribedErrorMsg);
    }

    @Test(priority = 3)
    public void testNewsletterUnSuccessWithInvalidEmail() throws Exception {
        invalidEmailAddressErrorMsg = footer
                .newsletterUnSuccessWithInvalidEmail("surenisprii.com")
                .getNewsletterInvalidEmailErrorMessage();
        Assert.assertEquals(invalidEmailAddressErrorMsg, "Please enter valid email address.");
        System.out.println(invalidEmailAddressErrorMsg);
    }

    @Test(priority = 31)
    public void testNewsletterWithoutEmailAddress() throws Exception {
        errorMsgForEmptyEmailAddress = footer
                .newsletterSubscribeWithoutEmail("")
                .getNewsletterInvalidMessageForEmptyEmailAddress();
        Assert.assertEquals(errorMsgForEmptyEmailAddress, "Please enter valid email address.");
        System.out.println(errorMsgForEmptyEmailAddress);
    }

    //Redirect to top categories
    @Test(priority = 4)
    public void testFooterRedirectToToysCategory() throws Exception {
        toys = footer
                .footerRedirectToToysCategory();
    }

    @Test(priority = 5)
    public void testFooterRedirectToDiapersCategory() throws Exception {
        diapering = footer
                .footerRedirectToDiapersCategory();
    }

    @Test(priority = 6)
    public void testFooterRedirectToBabyFoodCategory() throws Exception {
        babyFood = footer
                .footerRedirectToBabyFoodCategory();
    }

    @Test(priority = 7)
    public void testFooterRedirectToStrollersCategory() throws Exception {
        strollers = footer
                .footerRedirectToStrollersCategory();
    }

    @Test(priority = 8)
    public void testFooterRedirectToBabyWalkersCategory() throws Exception {
        babyWalkers = footer
                .footerRedirectToBabyWalkersCategory();
    }

    @Test(priority = 9)
    public void testFooterRedirectToBabySwingCategory() throws Exception {
        babySwing = footer
                .footerRedirectToBabySwingCategory();
    }

    @Test(priority = 10)
    public void testFooterRedirectToCarSeatsCategory() throws Exception {
        carSeats = footer
                .footerRedirectToCarSeatsCategory();
    }

    //About
    @Test(priority = 11)
    public void testFooterRedirectToTestimonialsPage() throws Exception {
        testimonials = footer
                .footerRedirectToTestimonialsPage();
    }

    @Test(priority = 12)
    public void testFooterRedirectToAffiliateProgramPage() throws Exception {
        affiliateProgram = footer
                .footerRedirectToAffiliateProgramPage();
    }

    @Test(priority = 13)
    public void testfooterRedirectToSellingOnSpriiPage() throws Exception {
        sellingOnSprii = footer
                .footerRedirectToSellingOnSpriiPage();
    }

    @Test(priority = 14)
    public void testFooterRedirectToCareersPage() throws Exception {
        careers = footer
                .footerRedirectToCareersPage();
    }

    @Test(priority = 15)
    public void testFooterRedirectToCorporateSalesPage() throws Exception {
        corporateSales = footer
                .footerRedirectToCorporateSalesPage();
    }

    @Test(priority = 16)
    public void testFooterRedirectToViewAllBrandPage() throws Exception {
        viewAllBrands = footer
                .footerRedirectToViewAllBrandPage();
    }

    //Customer Services
    @Test(priority = 17)
    public void testFooterRedirectToAboutUsPage() throws Exception {
        aboutUs = footer
                .footerRedirectToAboutUsPage();
    }

    @Test(priority = 18)
    public void testFooterRedirectToHelpAndContactUsPage() throws Exception {
        helpAndContactUs = footer
                .footerRedirectToHelpAndContactUsPage();
    }

    @Test(priority = 19)
    public void testFooterRedirectToShippingAndReturnsPage() throws Exception {
        shippingAndReturns = footer
                .footerRedirectToShippingAndReturnsPage();
    }

    @Test(priority = 20)
    public void testFooterRedirectToFaqPage() throws Exception {
        faq = footer
                .footerRedirectToFaqPage();
    }

    @Test(priority = 21)
    public void testFooterRedirectToRequestAProductPage() throws Exception {
        requestAProduct = footer
                .footerRedirectToRequestAProductPage();
    }

    @Test(priority = 22)
    public void testFooterRedirectToTermsAndConditionsPage() throws Exception {
        termsAndConditions = footer
                .footerRedirectToTermsAndConditionsPage();
    }

    @Test(priority = 23)
    public void testFooterRedirectToPrivacyAndCookiePolicyPage() throws Exception {
        privacyAndCookiePolicy = footer
                .footerRedirectToPrivacyAndCookiePolicyPage();
    }

    //Company Info
    @Test(priority = 24)
    public void testFooterRedirectToSpriiEmailPopup() throws Exception {
        spriiEmailPopup = footer
                .footerRedirectToSpriiEmailPopup();
    }

    //Social Media
    @Test(priority = 25)
    public void testFooterRedirectToFacebookPage() throws Exception {
        facebook = footer
                .footerRedirectToFacebookPage();
    }

    @Test(priority = 26)
    public void testFooterRedirectToTwitterPage() throws Exception {
        twitter = footer
                .footerRedirectToTwitterPage();
    }

    @Test(priority = 27)
    public void testFooterRedirectToYouTubeChannel() throws Exception {
        youTube = footer
                .footerRedirectToYouTubeChannel();
    }

    @Test(priority = 28)
    public void testFooterRedirectToInstagramPage() throws Exception {
        instagram = footer
                .footerRedirectToInstagramPage();
    }

    @Test(priority = 29)
    public void testFooterRedirectToWhatsAppPage() throws Exception {
        whatsApp = footer
                .footerRedirectToWhatsAppPage();
    }

    //Assertions
    @Test(priority = 30)
    public void testFooterDetails() throws Exception {
        isNewsletterTitle1Available = footer
                .newsletterTitle1IsAvailable();
        Assert.assertTrue(isNewsletterTitle1Available);

        isNewsletterTitle2Available = footer
                .newsletterTitle2IsAvailable();
        Assert.assertTrue(isNewsletterTitle2Available);

        isFreeShippingLabelAvailable = footer
                .footerFreeShippingLabelIsAvailable();
        Assert.assertTrue(isFreeShippingLabelAvailable);

        isOnAllOrdersLabelAvailable = footer
                .footerOnAllOrdersLabelIsAvailable();
        Assert.assertTrue(isOnAllOrdersLabelAvailable);

        isFreeReturnsLabelAvailable = footer
                .footerFreeReturnsLabelIsAvailable();
        Assert.assertTrue(isFreeReturnsLabelAvailable);

        isWithinDaysAvailable = footer
                .footerWithinDaysLabelIsAvailable();
        Assert.assertTrue(isWithinDaysAvailable);

        isPriceMatchLabelAvailable = footer
                .footerPriceMatchLabelIsAvailable();
        Assert.assertTrue(isPriceMatchLabelAvailable);

        isOnAllProductsAvailable = footer
                .footerOnAllProductsLabelIsAvailable();
        Assert.assertTrue(isOnAllProductsAvailable);

        isCashOnDeliveryAvailable = footer
                .footerCashOnDeliveryLabelIsAvailable();
        Assert.assertTrue(isCashOnDeliveryAvailable);

        isAvailableLabelAvailable = footer
                .footerAvailableLabelIsAvailable();
        Assert.assertTrue(isAvailableLabelAvailable);

        isTopCategoriesLabelAvailable = footer
                .footerTopCategoriesLabelIsAvailable();
        Assert.assertTrue(isTopCategoriesLabelAvailable);

        isAboutLabelAvailable = footer
                .footerAboutLabelIsAvailable();
        Assert.assertTrue(isTopCategoriesLabelAvailable);

        isCustomerServiceAvailable = footer
                .footerCustomerServiceIsAvailable();
        Assert.assertTrue(isCustomerServiceAvailable);

        isCompanyInfoAvailable = footer
                .footerCompanyInfoIsAvailable();
        Assert.assertTrue(isCompanyInfoAvailable);

        isCompanyInfoSpriiComAvailable = footer
                .footerCompanyInfoSpriiComIsAvailable();
        Assert.assertTrue(isCompanyInfoSpriiComAvailable);

        isCompanyInfoAddressAvailable = footer
                .footerCompanyInfoAddressIsAvailable();
        Assert.assertTrue(isCompanyInfoAddressAvailable);

        isCompanyPhoneNumberAvailable = footer
                .footerCompanyInfoPhoneNumberIsAvailable();
        Assert.assertTrue(isCompanyPhoneNumberAvailable);

        isCopyrightLabelAvailable = footer
                .footerCopyrightLabelIsAvailable();
        Assert.assertTrue(isCopyrightLabelAvailable);
    }

    @AfterClass
    public void afterClass() throws Exception {
        SpriiTestFramework.getInstance().closeBrowser();
    }
}
