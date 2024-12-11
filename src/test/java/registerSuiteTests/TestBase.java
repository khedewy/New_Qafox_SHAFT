package registerSuiteTests;

import com.shaft.driver.SHAFT;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;

public class TestBase {
    protected  static SHAFT.GUI.WebDriver driver;

    @BeforeClass
    public void setDriver(){
        driver = new SHAFT.GUI.WebDriver();
        driver.browser().navigateToURL("https://tutorialsninja.com/demo/");

    }

    @AfterClass
    public void closeDriver(){
        driver.quit();
    }
}
