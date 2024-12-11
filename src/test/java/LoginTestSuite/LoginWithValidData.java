package LoginTestSuite;

import com.shaft.driver.SHAFT;
import homePage.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import registerSuiteTests.TestBase;

import java.io.IOException;
import java.text.ParseException;

public class LoginWithValidData extends TestBase {
    HomePage homePage;
    LoginSuite.LoginWithValidData loginPage;
    SHAFT.TestData.JSON loginData;

    @Test
    public void NavigateToLogin(){
        homePage = new HomePage(driver);
        homePage.navigateToLoginPage();


    }

    @Test(priority = 1)
    public void login() throws  IOException, ParseException, org.json.simple.parser.ParseException {
        loginData  = new SHAFT.TestData.JSON("loginValidData.json");

        loginPage = new LoginSuite.LoginWithValidData(driver);
        loginPage.enterLoginData(loginData.getTestData("email"),loginData.getTestData("password"));
        Assert.assertEquals(loginPage.getSuccessfulLoginAssertionMessage(),"My Account");
    }
}
