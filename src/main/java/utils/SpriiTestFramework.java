package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

public class SpriiTestFramework {
    private WebDriver driver;
    private static SpriiTestFramework myObj;
    private utils.PropertyFileReader property = new PropertyFileReader();
    private WebElement element;
    private String os = property.getProperty("config", "driver.os");
    private String browserType = property.getProperty("config", "browser");


    public static SpriiTestFramework getInstance() {
        if (myObj == null) {
            myObj = new SpriiTestFramework();
            return myObj;
        } else {
            return myObj;
        }
    }

    //get the selenium driver
    public WebDriver getDriver() {
        return driver;
    }

    //when selenium opens the browsers it will automatically set the web driver
    private void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public static void setMyObj(SpriiTestFramework myObj) {
        SpriiTestFramework.myObj = myObj;
    }

    public void openBrowser() {
        if (browserType.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", getDriverFilePath());
            ChromeOptions options = new ChromeOptions();
//            options.addArguments("--headless");
            options.addArguments("--incognito");
            options.setExperimentalOption("useAutomationExtension", false);
            options.setExperimentalOption("excludeSwitches",
                    Collections.singletonList("enable-automation"));
            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else if (browserType.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver", getDriverFilePath());
            FirefoxOptions options = new FirefoxOptions();
//            options.addArguments("--headless");
            options.addArguments("--incognito");
            driver = new FirefoxDriver(options);
            System.out.println(driver);
            driver.manage().window().maximize();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void navigateToURL() {
        String url = property.getProperty("config", "base.url");
        driver.get(url);
    }

    public void navigateToSaudiURL() {
        String url = property.getProperty("config", "base.url.saudi");
        driver.get(url);
    }

    public void navigateToTestAutomationCategory() {
        String url = property.getProperty("config", "test.automation.category.url");
        driver.get(url);
    }

    public void navigateToTestAutomationCategorySaudi() {
        String url = property.getProperty("config", "test.automation.category.url.saudi");
        driver.get(url);
    }

    public void navigateToCartPage() {
        String url = property.getProperty("config", "cart.url");
        driver.get(url);
    }

    public void navigateToCartPageSaudi() {
        String url = property.getProperty("config", "cart.url.saudi");
        driver.get(url);
    }

    public void closeBrowser() {
        driver.quit();
    }

    public WebElement  waitForElement(By locator, int timeout) {
        element = new WebDriverWait(driver, timeout).until
                (ExpectedConditions.presenceOfElementLocated(locator));
        return element;
    }

    public WebElement waitTillClickable(By locator, int timeout) {
        element = new WebDriverWait(driver, timeout).until
                (ExpectedConditions.elementToBeClickable(locator));
        return element;
    }

    public void waitUntil(int timeout) {
        driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
    }

    private String getDriverFilePath() throws NullPointerException {
        String chromeDriverLinux = property.getProperty("config", "chrome.driver.path.linux");
        String chromeDriverWindows = property.getProperty("config", "chrome.driver.path.windows");
        String firefoxDriverLinux = property.getProperty("config", "firefox.geckodriver.path.linux");
        String firefoxDriverWindows = property.getProperty("config", "firefox.geckodriver.path.windows");
        File file = null;
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            if (os.equals("windows") && browserType.equals("chrome")) {
                file = new File(classLoader.getResource(chromeDriverWindows).getFile());
            } else if (os.equals("windows") && browserType.equals("firefox")){
                file = new File(classLoader.getResource(firefoxDriverWindows).getFile());
            } else if (os.equals("linux") && browserType.equals("chrome")){
                file = new File(classLoader.getResource(chromeDriverLinux).getFile());
            } else if (os.equals("linux") && browserType.equals("firefox")){
                file = new File(classLoader.getResource(firefoxDriverLinux).getFile());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return file.getAbsolutePath();
    }
}
