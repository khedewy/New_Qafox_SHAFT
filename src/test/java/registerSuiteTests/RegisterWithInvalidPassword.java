package registerSuiteTests;

import com.shaft.driver.SHAFT;
import homePage.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;




public class RegisterWithInvalidPassword extends TestBase{
    HomePage homePage;
    registerSuite.RegisterWithInvalidPassword registerPage;
    String currentTime = String.valueOf(System.currentTimeMillis());
    SHAFT.TestData.JSON registerData;

    @Test
    public void navigateToRegisterPage(){
        homePage = new HomePage(driver);
        homePage.navigateToRegisterPage();


    }

    @Test(priority = 1)
    public void enterRegisterData() {
        registerData = new SHAFT.TestData.JSON("invalidPasswordData.json");
        registerPage = new registerSuite.RegisterWithInvalidPassword(driver);

        registerPage.enterRegisterData(registerData.getTestData("firstName"),registerData.getTestData("lastName"),
                registerData.getTestData("email")+currentTime+"@gmail.com",
                registerData.getTestData("telephone"),registerData.getTestData("password"));
        Assert.assertEquals(registerPage.getErrorMessage(),"Password must be between 4 and 20 characters!");

    }
}
