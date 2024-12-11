package registerSuite;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class RegisterWithExistingEmail {
    private final SHAFT.GUI.WebDriver driver;
    public RegisterWithExistingEmail(SHAFT.GUI.WebDriver driver){
        this.driver = driver;
    }

    private final By firstNameTxt = By.id("input-firstname");
    private final By lastNameTxt = By.id("input-lastname");
    private final By emailTxt = By.id("input-email");
    private final By telephoneTxt = By.id("input-telephone");
    private final By passwordTxt = By.id("input-password");
    private final By confirmPassWordTxt = By.id("input-confirm");
    private final By agreeOnServices = By.xpath("//input[@type='checkbox']");
    private final By continueButton = By.xpath("//input[@value='Continue']");
    private final By errorMessage = By.xpath("//div[@class='text-danger']");



    public void enterRegisterData(String firstName, String lastName, String email, String telephone, String password){
        driver.element().type(firstNameTxt,firstName);
        driver.element().type(lastNameTxt,lastName);
        driver.element().type(emailTxt,email);
        driver.element().type(telephoneTxt,telephone);
        driver.element().type(passwordTxt,password);
        driver.element().type(confirmPassWordTxt,password);
        driver.element().click(agreeOnServices);
        driver.element().click(continueButton);
    }

    public String getErrorMessage(){
        return driver.element().getText(errorMessage);
    }
}
