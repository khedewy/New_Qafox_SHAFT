package registerSuiteTests;

import com.shaft.driver.SHAFT;
import homePage.HomePage;
import org.testng.annotations.Test;


public class RegisterWithInvalidEmail extends TestBase {
    HomePage homePage;
    registerSuite.RegisterWithInvalidEmail registerPage;
    SHAFT.TestData.JSON registerData;

    @Test
    public void navigateToRegisterPage(){
        homePage = new HomePage(driver);
        homePage.navigateToRegisterPage();


    }

    @Test(priority = 1)
    public void enterRegisterData() {
        registerData = new SHAFT.TestData.JSON("validData.json");
        registerPage = new registerSuite.RegisterWithInvalidEmail(driver);

        registerPage.enterRegisterData(registerData.getTestData("firstName"),registerData.getTestData("lastName"),
                registerData.getTestData("email"),
                registerData.getTestData("telephone"),registerData.getTestData("password"));

    }
}
