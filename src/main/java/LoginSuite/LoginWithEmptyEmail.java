package LoginSuite;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginWithEmptyEmail {
    private final SHAFT.GUI.WebDriver driver;
    public LoginWithEmptyEmail (SHAFT.GUI.WebDriver driver){
        this.driver = driver;
    }


    private final By emailTxt = By.id("input-email");
    private final By passwordTxt = By.id("input-password");
    private final By loginButton = By.xpath("//input[@value='Login']");
    private final By errorMessage = By.xpath("//div[@class='alert alert-danger alert-dismissible']");




    public void enterLoginData(String email, String password){
        driver.element().type(emailTxt,email);
        driver.element().type(passwordTxt,password);
        driver.element().click(loginButton);
    }
    public String getErrorMessage(){
        return driver.element().getText(errorMessage);
    }
}
