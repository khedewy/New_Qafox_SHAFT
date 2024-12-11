package registerSuiteTests;

import com.shaft.driver.SHAFT;
import homePage.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;



public class RegisterWithExistingEmail extends TestBase{
    HomePage homePage;
    registerSuite.RegisterWithExistingEmail registerPage;
    String currentTime = String.valueOf(System.currentTimeMillis());
    SHAFT.TestData.JSON registerData;

    @Test
    public void navigateToRegisterPage(){
        homePage = new HomePage(driver);
        homePage.navigateToRegisterPage();


    }

    @Test(priority = 1)
    public void enterRegisterData() {
        registerData = new SHAFT.TestData.JSON("existinData.json");
        registerPage = new registerSuite.RegisterWithExistingEmail(driver);

        registerPage.enterRegisterData(registerData.getTestData("firstName"),registerData.getTestData("lastName"),
                registerData.getTestData("email")+currentTime+"@gmail.com",
                registerData.getTestData("telephone"),registerData.getTestData("password"));
        Assert.assertEquals(registerPage.getErrorMessage(),"Warning: E-Mail Address is already registered!");

    }
}
