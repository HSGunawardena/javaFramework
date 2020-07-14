package com.sprii.footer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.PropertyFileReader;
import utils.SpriiTestFramework;

public class Footer {

    WebDriver driver = SpriiTestFramework.getInstance().getDriver();
    PropertyFileReader prop = new PropertyFileReader();

    String newsletterTextElement = prop.getProperty("Footer", "newsletter.text.element");
    String newsletterSubmitButtonElement = prop.getProperty("Footer", "newsletter.submit.button.element");
    String newsletterUnSuccessWithAlreadySubscribedElement = prop.getProperty("Footer", "newsletter.unsuccess.with.already.subscribed.element");
    String newsletterUnSuccessWithInvalidEmailElement = prop.getProperty("Footer", "newsletter.unsuccess.with.invalid.email.element");
    String newsletterSuccessElement = prop.getProperty("Footer", "newsletter.success.element");
    String toysCategoryPageElement = prop.getProperty("Footer", "toys.category.page.element");
    String diapersCategoryPageElement = prop.getProperty("Footer", "diapers.category.page.element");
    String babyFoodCategoryPageElement = prop.getProperty("Footer", "baby.food.category.page.element");
    String strollersCategoryPageElement = prop.getProperty("Footer", "strollers.category.page.element");
    String babyWalkersCategoryPageElement = prop.getProperty("Footer", "baby.walkers.category.page.element");
    String babySwingCategoryPageElement = prop.getProperty("Footer", "baby.swing.category.page.element");
    String carSeatsCategoryPageElement = prop.getProperty("Footer", "car.seats.category.page.element");
    String testimonialsPageElement = prop.getProperty("Footer", "testimonials.page.element");
    String affiliateProgramPageElement = prop.getProperty("Footer", "affiliate.program.page.element");
    String sellingOnSpriiPageElement = prop.getProperty("Footer", "selling.on.sprii.page.element");
    String careerPageElement = prop.getProperty("Footer", "careers.page.element");
    String corporateSalesPageElement = prop.getProperty("Footer", "corporate.sales.page.element");
    String viewAllBrandsPageElement = prop.getProperty("Footer", "view.all.brands");
    String aboutUsPageElement = prop.getProperty("Footer", "about.us.page.element");
    String helpAndContactUsPageElement = prop.getProperty("Footer", "help.and.contact.us.page.element");
    String shippingAndReturnsPageElement = prop.getProperty("Footer", "shipping.and.returns.page");
    String faqPageElement = prop.getProperty("Footer", "faq.page.element");
    String requestAProductPageElement = prop.getProperty("Footer", "request.a.product.page.element");
    String termsAndConditionsPageElement = prop.getProperty("Footer", "terms.and.conditions.page.element");
    String privacyAndCookiePolicyPageElement = prop.getProperty("Footer", "privacy.and.cookie.policy.element");
    String spriiEmailPopupElement = prop.getProperty("Footer", "sprii.email.popup.element");
    String facebookPageElement = prop.getProperty("Footer", "facebook.page.element");
    String twitterPageElement = prop.getProperty("Footer", "twitter.page.element");
    String youTubeChannelElement = prop.getProperty("Footer", "youtube.channel.element");
    String instagramPageElement = prop.getProperty("Footer", "instagram.page.element");
    String whatsappPageElement = prop.getProperty("Footer", "whatsapp.page.element");

    //Assertions
    String newsletterTitle1Element = prop.getProperty("Footer", "newsletter.title1.element");
    String newsletterTitle2Element = prop.getProperty("Footer", "newsletter.title2.element");
    String footerFreeShippingLabelElement = prop.getProperty("Footer", "footer.free.shipping.label.element");
    String footerOnAllOrdersLabelElement = prop.getProperty("Footer", "footer.on.all.orders.label.element");
    String footerFreeReturnsLabelElement = prop.getProperty("Footer", "footer.free.returns.label.element");
    String footerWithin7DaysLabelElement = prop.getProperty("Footer", "footer.within.7.days.label.element");
    String footerPriceMatchLabelElement = prop.getProperty("Footer", "footer.price.match.label.element");
    String footerOnAllProductsElement = prop.getProperty("Footer", "footer.on.all.products.label.element");
    String footerCashOnDeliveryLabelElement = prop.getProperty("Footer", "footer.cash.on.delivery.label.element");
    String footerAvailableLabelElement = prop.getProperty("Footer", "footer.available.label.element");
    String footerTopCategoriesTitleElement = prop.getProperty("Footer", "footer.top.categories.title.element");
    String footerAboutTitleElement = prop.getProperty("Footer", "footer.about.title.element");
    String footerCustomerServiceTitleElement = prop.getProperty("Footer", "footer.customer.service.title.element");
    String footerCompanyInfoTitleElement = prop.getProperty("Footer", "footer.company.info.title.element");
    String companyInfoSpriiComElement = prop.getProperty("Footer", "company.info.sprii.com.element");
    String companyInfoAddressElement = prop.getProperty("Footer", "company.info.address.element");
    String companyInfoPhoneNumberElement = prop.getProperty("Footer", "company.info.phone.number.element");
    String copyrightElement = prop.getProperty("Footer", "copyright.element");
    String newsletterEmptyEmailAddressElement = prop.getProperty("Footer", "newsletter.empty.email.address.element");
    String newsletterInvalidEmailAddress = prop.getProperty("Footer", "newsletter.invalid.email.address.element");
    String newsletterAlreadySubscribeElamil = prop.getProperty("Footer", "newsletter.already.subscribe.email.element");
    String newsletterSuccessMaessageElement = prop.getProperty("Footer", "newsletter.success.message.element");

    //Newsletter Subscription
    public Footer newsletterSuccess(String email) {
        subscribeToNewsletterAs(email);
        return this;
    }

    public String getNewsletterSuccessMessage() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(newsletterSuccessElement), 2000);
        String newsletterSuccessMessage = driver.findElement(By.xpath(newsletterSuccessElement)).getText();
        return newsletterSuccessMessage;
    }

    public Footer newsletterSubscribeWithoutEmail(String email) {
        subscribeToNewsletterAs(email);
        return this;
    }

    public String getNewsletterInvalidMessageForEmptyEmailAddress() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(newsletterEmptyEmailAddressElement), 50);
        String newsletterEmptyEmailAddress = driver.findElement(By.xpath(newsletterEmptyEmailAddressElement)).getText();
        return newsletterEmptyEmailAddress;
    }

    public Footer newsletterUnSuccessWithAlreadySubscribed(String email) {
        subscribeToNewsletterAs(email);
        return this;
    }

    public String getAlreadySubscribedErrorMessage() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(newsletterUnSuccessWithAlreadySubscribedElement), 20);
        return driver.findElement(By.xpath(newsletterUnSuccessWithAlreadySubscribedElement)).getText();
    }

    public Footer newsletterUnSuccessWithInvalidEmail(String email) {
        subscribeToNewsletterAs(email);
        return this;
    }

    public String getNewsletterInvalidEmailErrorMessage() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(newsletterUnSuccessWithInvalidEmailElement), 20);
        return driver.findElement(By.xpath(newsletterUnSuccessWithInvalidEmailElement)).getText();
    }

    private void subscribeToNewsletterAs(String email) {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(newsletterTextElement), 20);
        driver.findElement(By.xpath(newsletterTextElement)).sendKeys(email);
        driver.findElement(By.xpath(newsletterSubmitButtonElement)).click();
    }

    //Top Categories
    public ToysCategoryPage footerRedirectToToysCategory() {
        SpriiTestFramework.getInstance().waitForElement(By.linkText(toysCategoryPageElement), 20);
        driver.findElement(By.linkText(toysCategoryPageElement)).click();
        return new ToysCategoryPage();
    }

    public DiapersCategoryPage footerRedirectToDiapersCategory() {
        SpriiTestFramework.getInstance().waitForElement(By.linkText(diapersCategoryPageElement), 20);
        driver.findElement(By.linkText(diapersCategoryPageElement)).click();
        return new DiapersCategoryPage();
    }

    public BabyFoodCategoryPage footerRedirectToBabyFoodCategory() {
        SpriiTestFramework.getInstance().waitForElement(By.linkText(babyFoodCategoryPageElement), 20);
        driver.findElement(By.linkText(babyFoodCategoryPageElement)).click();
        return new BabyFoodCategoryPage();
    }

    public StrollersCategoryPage footerRedirectToStrollersCategory() {
        SpriiTestFramework.getInstance().waitForElement(By.linkText(strollersCategoryPageElement), 20);
        driver.findElement(By.linkText(strollersCategoryPageElement)).click();
        return new StrollersCategoryPage();
    }

    public BabyWalkersCategoryPage footerRedirectToBabyWalkersCategory() {
        SpriiTestFramework.getInstance().waitForElement(By.linkText(babyWalkersCategoryPageElement), 20);
        driver.findElement(By.linkText(babyWalkersCategoryPageElement)).click();
        return new BabyWalkersCategoryPage();
    }

    public BabySwingCategoryPage footerRedirectToBabySwingCategory() {
        SpriiTestFramework.getInstance().waitForElement(By.linkText(babySwingCategoryPageElement), 20);
        driver.findElement(By.linkText(babySwingCategoryPageElement)).click();
        return new BabySwingCategoryPage();
    }

    public CarSeatesCategoryPage footerRedirectToCarSeatsCategory() {
        SpriiTestFramework.getInstance().waitForElement(By.linkText(carSeatsCategoryPageElement), 20);
        driver.findElement(By.linkText(carSeatsCategoryPageElement)).click();
        return new CarSeatesCategoryPage();
    }

    //About
    public TestimonialsPage footerRedirectToTestimonialsPage() {
        SpriiTestFramework.getInstance().waitForElement(By.linkText(testimonialsPageElement), 20);
        driver.findElement(By.linkText(testimonialsPageElement)).click();
        return new TestimonialsPage();
    }

    public AffiliateProgramPage footerRedirectToAffiliateProgramPage() {
        SpriiTestFramework.getInstance().waitForElement(By.linkText(affiliateProgramPageElement), 20);
        driver.findElement(By.linkText(affiliateProgramPageElement)).click();
        return new AffiliateProgramPage();
    }

    public SellingOnSpriiPage footerRedirectToSellingOnSpriiPage() {
        SpriiTestFramework.getInstance().waitForElement(By.linkText(sellingOnSpriiPageElement), 20);
        driver.findElement(By.linkText(sellingOnSpriiPageElement)).click();
        return new SellingOnSpriiPage();
    }

    public CareersPage footerRedirectToCareersPage() {
        SpriiTestFramework.getInstance().waitForElement(By.linkText(careerPageElement), 20);
        driver.findElement(By.linkText(careerPageElement)).click();
        return new CareersPage();
    }

    public CorporateSalesPage footerRedirectToCorporateSalesPage() {
        SpriiTestFramework.getInstance().waitForElement(By.linkText(corporateSalesPageElement), 20);
        driver.findElement(By.linkText(corporateSalesPageElement)).click();
        return new CorporateSalesPage();
    }

    public ViewAllBrandPage footerRedirectToViewAllBrandPage() {
        SpriiTestFramework.getInstance().waitForElement(By.linkText(viewAllBrandsPageElement), 20);
        driver.findElement(By.linkText(viewAllBrandsPageElement)).click();
        return new ViewAllBrandPage();
    }

    //Customers Services
    public AboutUsPage footerRedirectToAboutUsPage() {
        SpriiTestFramework.getInstance().waitForElement(By.linkText(aboutUsPageElement), 20);
        driver.findElement(By.linkText(aboutUsPageElement)).click();
        return new AboutUsPage();
    }

    public HelpAndContactUsPage footerRedirectToHelpAndContactUsPage() {
        SpriiTestFramework.getInstance().waitForElement(By.linkText(helpAndContactUsPageElement), 20);
        driver.findElement(By.linkText(helpAndContactUsPageElement)).click();
        return new HelpAndContactUsPage();
    }

    public ShippingAndReturnsPage footerRedirectToShippingAndReturnsPage() {
        SpriiTestFramework.getInstance().waitForElement(By.linkText(shippingAndReturnsPageElement), 20);
        driver.findElement(By.linkText(shippingAndReturnsPageElement)).click();
        return new ShippingAndReturnsPage();
    }

    public FaqPage footerRedirectToFaqPage() {
        SpriiTestFramework.getInstance().waitForElement(By.linkText(faqPageElement), 20);
        driver.findElement(By.linkText(faqPageElement)).click();
        return new FaqPage();
    }

    public RequestAProductPage footerRedirectToRequestAProductPage() {
        SpriiTestFramework.getInstance().waitForElement(By.linkText(requestAProductPageElement), 20);
        driver.findElement(By.linkText(requestAProductPageElement)).click();
        return new RequestAProductPage();
    }

    public TermsAndConditions footerRedirectToTermsAndConditionsPage() {
        SpriiTestFramework.getInstance().waitForElement(By.linkText(termsAndConditionsPageElement), 20);
        driver.findElement(By.linkText(termsAndConditionsPageElement)).click();
        return new TermsAndConditions();
    }

    public PrivacyAndCookiePolicy footerRedirectToPrivacyAndCookiePolicyPage() {
        SpriiTestFramework.getInstance().waitForElement(By.linkText(privacyAndCookiePolicyPageElement), 20);
        driver.findElement(By.linkText(privacyAndCookiePolicyPageElement)).click();
        return new PrivacyAndCookiePolicy();
    }

    //Company Info
    public SpriiEmailPopup footerRedirectToSpriiEmailPopup() {
        SpriiTestFramework.getInstance().waitForElement(By.linkText(spriiEmailPopupElement), 20);
        driver.findElement(By.linkText(spriiEmailPopupElement)).click();
        return new SpriiEmailPopup();
    }

    //Social Medias
    public FacebookPage footerRedirectToFacebookPage() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(facebookPageElement), 20);
        driver.findElement(By.xpath(facebookPageElement)).click();
        return new FacebookPage();
    }

    public TwitterPage footerRedirectToTwitterPage() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(twitterPageElement), 20);
        driver.findElement(By.xpath(twitterPageElement)).click();
        return new TwitterPage();
    }

    public YouTubeChannel footerRedirectToYouTubeChannel() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(youTubeChannelElement), 20);
        driver.findElement(By.xpath(youTubeChannelElement)).click();
        return new YouTubeChannel();
    }

    public InstagramPage footerRedirectToInstagramPage() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(instagramPageElement), 20);
        driver.findElement(By.xpath(instagramPageElement)).click();
        return new InstagramPage();
    }

    public WhatsAppPage footerRedirectToWhatsAppPage() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(whatsappPageElement), 20);
        driver.findElement(By.xpath(whatsappPageElement)).click();
        return new WhatsAppPage();
    }

    public boolean newsletterTitle1IsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(newsletterTitle1Element), 20);
        String newsletterTitle1 = driver.findElement(By.xpath(newsletterTitle1Element)).getText();
        if (newsletterTitle1.equals("SIGN-UP TO OUR NEWSLETTER")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean newsletterTitle2IsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(newsletterTitle2Element), 20);
        String newsletterTitle2 = driver.findElement(By.xpath(newsletterTitle2Element)).getText();
        if (newsletterTitle2.equals("AND ENJOY 10% OFF YOUR FIRST ORDER")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean footerFreeShippingLabelIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(footerFreeShippingLabelElement), 20);
        String footerFreeShippingLabel = driver.findElement(By.xpath(footerFreeShippingLabelElement)).getText();
        if (footerFreeShippingLabel.equals("FREE SHIPPING")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean footerOnAllOrdersLabelIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(footerOnAllOrdersLabelElement), 20);
        String footerOnAllOrdersLabel = driver.findElement(By.xpath(footerOnAllOrdersLabelElement)).getText();
        if (footerOnAllOrdersLabel.equals("ON ALL ORDERS!")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean footerFreeReturnsLabelIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(footerFreeReturnsLabelElement), 20);
        String footerFreeReturnLabel = driver.findElement(By.xpath(footerFreeReturnsLabelElement)).getText();
        if (footerFreeReturnLabel.equals("FREE RETURNS")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean footerWithinDaysLabelIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(footerWithin7DaysLabelElement), 20);
        String footerWithinDaysLabel = driver.findElement(By.xpath(footerWithin7DaysLabelElement)).getText();
        if (footerWithinDaysLabel.equals("WITHIN 7 DAYS")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean footerPriceMatchLabelIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(footerPriceMatchLabelElement), 20);
        String footerPriceMatchLabel = driver.findElement(By.xpath(footerPriceMatchLabelElement)).getText();
        if (footerPriceMatchLabel.equals("PRICE MATCH")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean footerOnAllProductsLabelIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(footerOnAllProductsElement), 20);
        String footerOnAllProductsLabel = driver.findElement(By.xpath(footerOnAllProductsElement)).getText();
        if (footerOnAllProductsLabel.equals("ON ALL PRODUCTS")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean footerCashOnDeliveryLabelIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(footerCashOnDeliveryLabelElement), 20);
        String footerCashOnDelivery = driver.findElement(By.xpath(footerCashOnDeliveryLabelElement)).getText();
        if (footerCashOnDelivery.equals("CASH ON DELIVERY")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean footerAvailableLabelIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(footerAvailableLabelElement), 20);
        String footerAvailableLabel = driver.findElement(By.xpath(footerAvailableLabelElement)).getText();
        if (footerAvailableLabel.equals("AVAILABLE")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean footerTopCategoriesLabelIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(footerTopCategoriesTitleElement), 20);
        String footerTopCategoriesTitle = driver.findElement(By.xpath(footerTopCategoriesTitleElement)).getText();
        if (footerTopCategoriesTitle.equals("TOP CATEGORIES")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean footerAboutLabelIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(footerAboutTitleElement), 20);
        String footerAboutTitle = driver.findElement(By.xpath(footerAboutTitleElement)).getText();
        if (footerAboutTitle.equals("ABOUT")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean footerCustomerServiceIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(footerCustomerServiceTitleElement), 20);
        String footerCustomerServiceTitle = driver.findElement(By.xpath(footerCustomerServiceTitleElement)).getText();
        if (footerCustomerServiceTitle.equals("CUSTOMER SERVICE")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean footerCompanyInfoIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(footerCompanyInfoTitleElement), 20);
        String footerCompanyInfoTitle = driver.findElement(By.xpath(footerCompanyInfoTitleElement)).getText();
        if (footerCompanyInfoTitle.equals("COMPANY INFO")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean footerCompanyInfoSpriiComIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(companyInfoSpriiComElement), 20);
        String companyInfoSpriiComLabel = driver.findElement(By.xpath(companyInfoSpriiComElement)).getText();
        if (companyInfoSpriiComLabel.equals("Sprii.com")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean footerCompanyInfoAddressIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(companyInfoAddressElement), 20);
        String companyInfoAddress = driver.findElement(By.xpath(companyInfoAddressElement)).getText();
        if (companyInfoAddress.equals("Office 101, Mazaya Business Avenue BB1, JLT, Dubai, UAE")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean footerCompanyInfoPhoneNumberIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(companyInfoPhoneNumberElement), 20);
        String companyInfoPhoneNumber = driver.findElement(By.xpath(companyInfoPhoneNumberElement)).getText();
        if (companyInfoPhoneNumber.equals("Tel: +971 (0) 4 401 8888")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean footerCopyrightLabelIsAvailable() {
        SpriiTestFramework.getInstance().waitForElement(By.xpath(copyrightElement), 20);
        String copyrightTitle = driver.findElement(By.xpath(copyrightElement)).getText();
        if (copyrightTitle.equals("Copyright © 2019 SPRII.COM")) {
            return true;
        } else {
            return false;
        }
    }
}

