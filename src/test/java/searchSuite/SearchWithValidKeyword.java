package searchSuite;

import org.testng.Assert;
import org.testng.annotations.Test;
import registerSuiteTests.TestBase;
import searchPage.SearchWithValidKeyWord;

public class SearchWithValidKeyword extends TestBase {
     SearchWithValidKeyWord searchFunction;
    @Test
    public void searchForProduct(){
        searchFunction = new SearchWithValidKeyWord(driver);
        searchFunction.searchForProducts("iphone");
        Assert.assertEquals(searchFunction.getAssertionMessage(),"iPhone");
    }
}
