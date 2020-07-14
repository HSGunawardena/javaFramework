package com.sprii.myaccount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.PropertyFileReader;
import utils.SpriiTestFramework;

public class AddressBookPage {
    WebDriver driver = SpriiTestFramework.getInstance().getDriver();
    PropertyFileReader prop = new PropertyFileReader();

    String shippingAddressElement = prop.getProperty("AddressBookPage", "shipping.address.element");
    String addNewAddressElement = prop.getProperty("AddressBookPage", "new.address.element");

    public EditAddressPage selectChangeShippingAddress(){
        SpriiTestFramework.getInstance().waitForElement(By.linkText(shippingAddressElement),20);
        driver.findElement(By.linkText(shippingAddressElement)).click();
        return new EditAddressPage();
    }

    public AddNewAddressPage selectAddnewAddress(){
        SpriiTestFramework.getInstance().waitForElement(By.xpath(addNewAddressElement), 20);
        driver.findElement(By.xpath(addNewAddressElement)).click();
        return new AddNewAddressPage();
    }

}
