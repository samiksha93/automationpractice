package google.pagesctips;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import google.pages.GoogleSearchPage;
import utilities.SeleniumUtility;

public class TestGoogleSearch extends SeleniumUtility{
	GoogleSearchPage getGoogleSearchPage;
	@BeforeMethod
	public void preCondition() {
		WebDriver driver=setUp("chrome", "https://www.google.com");
		getGoogleSearchPage=new GoogleSearchPage(driver);
	}
	@Test
	public void testSearchPage() {		
		getGoogleSearchPage.searchText("Selenium interview questions");
		Assert.assertTrue(getCurrentTitleOfApplication().contains("Selenium interview questions"), "Google search was not sucessfull");
	}	
	
	@Test
	public void testSuggestions() {
		List<WebElement> suggList=getGoogleSearchPage.searchTextAndGetSuggestions("Selenium interview questions");
		Assert.assertTrue((suggList.size()==10), "Either search failed or suggestion count changed");
	}
	
	@AfterMethod
	public void cleanUp() {
		tearDown();
	}
}
