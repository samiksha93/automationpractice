package WebPages_OrangeHRM;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.SeleniumUtility;

public class OrangeHRM_Home_Page extends SeleniumUtility {
	public OrangeHRM_Home_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//ul[@class=\"oxd-main-menu\"]/li[2]")
	private WebElement PIM_link;
	
	public void clickOnPim() {
		performClick(PIM_link);
		}

	
	public String orangehrmHomePageTitle() {
		return getPageTitle();
	}

}
