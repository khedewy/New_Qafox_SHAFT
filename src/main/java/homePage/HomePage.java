package homePage;


import LoginSuite.LoginWithValidData;
import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import registerSuite.RegisterWithValidData;

import java.time.Duration;

public class HomePage {
    private final SHAFT.GUI.WebDriver driver;
    WebDriverWait wait;
    public HomePage(SHAFT.GUI.WebDriver driver){
        this.driver = driver;
    }

    private final By accountManager = By.xpath("//a[@title='My Account']");
    private final By registerButton = By.xpath("//a[text()='Register']");
    private final By loginButton = By.linkText("Login");


    public RegisterWithValidData navigateToRegisterPage(){
        driver.element().click(accountManager);
        driver.element().click(registerButton);
        return new RegisterWithValidData(driver);
    }

    public LoginWithValidData navigateToLoginPage(){
        driver.element().click(accountManager);
        driver.element().click(loginButton);
        return new LoginWithValidData(driver);
    }


}
