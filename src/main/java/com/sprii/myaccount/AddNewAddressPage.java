package com.sprii.myaccount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import utils.PropertyFileReader;
import utils.SpriiTestFramework;

public class AddNewAddressPage {
    WebDriver driver = SpriiTestFramework.getInstance().getDriver();
    PropertyFileReader prop = new PropertyFileReader();

    String firstNameElement = prop.getProperty("AddNewAddressPage", "first.name.element");
    String lastNameElement = prop.getProperty("AddNewAddressPage", "last.name.element");
    String cityElement = prop.getProperty("AddNewAddressPage", "city.element");
    String areaElement = prop.getProperty("AddNewAddressPage", "area.element");
    String streetElement = prop.getProperty("AddNewAddressPage", "street.element");
    String buildingElement = prop.getProperty("AddNewAddressPage", "building.element");
    String phoneNumberElement = prop.getProperty("AddNewAddressPage", "phone.number.element");
    String saveAddressElement = prop.getProperty("AddNewAddressPage", "save.address.element");

    public AddNewAddressPage setFirstName(String firstName){
        SpriiTestFramework.getInstance().waitForElement(By.id(firstNameElement), 20);
        driver.findElement(By.id(firstNameElement)).clear();
        driver.findElement(By.id(firstNameElement)).sendKeys(firstName);
        return this;
    }

    public AddNewAddressPage setLastName(String lastName){
        SpriiTestFramework.getInstance().waitForElement(By.id(lastNameElement), 20);
        driver.findElement(By.id(lastNameElement)).clear();
        driver.findElement(By.id(lastNameElement)).sendKeys(lastName);
        return this;
    }

    public AddNewAddressPage selectCity(String editCity){
        SpriiTestFramework.getInstance().waitForElement(By.id(cityElement), 20);
        Select city = new Select(driver.findElement(By.id(cityElement)));
        city.selectByVisibleText(editCity);
        return this;
    }

    public AddNewAddressPage setArea(String area){
        SpriiTestFramework.getInstance().waitForElement(By.id(areaElement), 20);
        driver.findElement(By.id(areaElement)).clear();
        driver.findElement(By.id(areaElement)).sendKeys(area);
        return this;
    }

    public AddNewAddressPage setStreet(String street){
        SpriiTestFramework.getInstance().waitForElement(By.id(streetElement), 20);
        driver.findElement(By.id(streetElement)).clear();
        driver.findElement(By.id(streetElement)).sendKeys(street);
        return this;
    }

    public AddNewAddressPage setBuilding(String building){
        SpriiTestFramework.getInstance().waitForElement(By.id(buildingElement), 20);
        driver.findElement(By.id(buildingElement)).clear();
        driver.findElement(By.id(buildingElement)).sendKeys(building);
        return this;
    }

    public AddNewAddressPage setPhoneNumber(String phoneNumber){
        SpriiTestFramework.getInstance().waitForElement(By.id(phoneNumberElement), 20);
        driver.findElement(By.id(phoneNumberElement)).clear();
        driver.findElement(By.id(phoneNumberElement)).sendKeys(phoneNumber);
        return this;
    }

    public AddressBookPage selectSaveAddress(){
        SpriiTestFramework.getInstance().waitForElement(By.xpath(saveAddressElement), 20);
        driver.findElement(By.xpath(saveAddressElement)).click();
        return new AddressBookPage();
    }
}
