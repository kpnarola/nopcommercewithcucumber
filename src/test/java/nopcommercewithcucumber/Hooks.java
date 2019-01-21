package nopcommercewithcucumber;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks extends Utils{
    BrowserSelector browserSelector = new BrowserSelector();
    @Before
    public void driverSetup() {

        browserSelector.browserSelect();

//        System.setProperty("webdriver.chrome.driver", "src\\BrowserDriver\\chromedriver.exe");
//        driver = new ChromeDriver();

        // Implicitly Wait for Driver
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        //Maximising Browser
        driver.manage().window().fullscreen();

        driver.manage().deleteAllCookies();
    }
    @After
    public void tearDown(){
        driver.quit();
    }
}
