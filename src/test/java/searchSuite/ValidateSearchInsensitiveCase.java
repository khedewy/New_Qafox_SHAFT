package searchSuite;

import org.testng.Assert;
import org.testng.annotations.Test;
import registerSuiteTests.TestBase;
import searchPage.SearchWithValidKeyWord;

public class ValidateSearchInsensitiveCase extends TestBase {
    SearchWithValidKeyWord searchFunction;
    @Test
    public void searchForProduct(){
        searchFunction = new SearchWithValidKeyWord(driver);
        searchFunction.searchForProducts("IPHONE");
        Assert.assertEquals(searchFunction.getAssertionMessage(),"iPhone");
        searchFunction.searchForProducts("Iphone");
        Assert.assertEquals(searchFunction.getAssertionMessage(),"iPhone");


    }
}
