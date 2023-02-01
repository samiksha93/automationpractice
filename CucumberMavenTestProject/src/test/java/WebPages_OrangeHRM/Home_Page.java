package WebPages_OrangeHRM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.SeleniumUtility;

public class Home_Page extends SeleniumUtility {
	public Home_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//ul[@class=\"oxd-main-menu\"]/li[2]")
	private WebElement pim_menu;
	
	//Method
	public void clickOnPIMOption() {
		clickOnElement(pim_menu);
	}

	   
}
