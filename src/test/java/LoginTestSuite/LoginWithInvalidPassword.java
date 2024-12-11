package LoginTestSuite;

import com.shaft.driver.SHAFT;
import homePage.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import registerSuiteTests.TestBase;



public class LoginWithInvalidPassword extends TestBase {
    HomePage homePage;
    LoginSuite.LoginWithInvalidEmail loginPage;
    SHAFT.TestData.JSON loginData;

    @Test
    public void NavigateToLogin(){
        homePage = new HomePage(driver);
        homePage.navigateToLoginPage();


    }

    @Test(priority = 1)
    public void login() {
        loginData  = new SHAFT.TestData.JSON("invalidPassword.json");
        loginPage = new LoginSuite.LoginWithInvalidEmail(driver);
        loginPage.enterLoginData(loginData.getTestData("email"),loginData.getTestData("password"));
        Assert.assertEquals(loginPage.getErrorMessage(),"Warning: No match for E-Mail Address and/or Password.");
    }
}
