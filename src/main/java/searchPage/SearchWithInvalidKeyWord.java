package searchPage;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchWithInvalidKeyWord {
    private final SHAFT.GUI.WebDriver driver;
    public SearchWithInvalidKeyWord(SHAFT.GUI.WebDriver driver){
        this.driver = driver;
    }
    private final By searchBox = By.name("search");
    private final By searchButton = By.xpath("//button[@class='btn btn-default btn-lg']");
    private final By errorMessage = By.xpath("//p[text()='There is no product that matches the search criteria.']");

    public void searchForProducts(String product){
        driver.element().type(searchBox,product);
        driver.element().click(searchButton);
    }

    public String getErrorMessage(){
        return driver.element().getText(errorMessage);
    }
}
