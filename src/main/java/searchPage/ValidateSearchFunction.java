package searchPage;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ValidateSearchFunction {
    private final SHAFT.GUI.WebDriver driver;
    public ValidateSearchFunction(SHAFT.GUI.WebDriver driver){
        this.driver = driver;
    }
    private final By searchBox = By.name("search");
    private final By searchButton = By.xpath("//button[@class='btn btn-default btn-lg']");

    public void searchForProducts(String product){
        driver.element().type(searchBox,product);
        driver.element().click(searchButton);
    }

}
