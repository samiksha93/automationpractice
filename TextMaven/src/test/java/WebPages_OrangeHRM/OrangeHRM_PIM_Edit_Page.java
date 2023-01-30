package WebPages_OrangeHRM;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class OrangeHRM_PIM_Edit_Page extends SeleniumUtility {
	public OrangeHRM_PIM_Edit_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(css=".orangehrm-tabs-wrapper:nth-of-type(6)>a")
	private WebElement jobOptionInPersionalDetailPage;
	
	@FindBy(css=".oxd-select-text--arrow")
	private List<WebElement> dropdownArrowOfJobTitle;
	
	@FindBy(xpath="//div[@role=\"listbox\"]/div[18]/span")
	private WebElement selectTitleFromJobTitle;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	private WebElement saveButtonOfPersonalDetailPage;
	
	public void editPersonalDetail() {
		performClick(jobOptionInPersionalDetailPage);
		performClick(dropdownArrowOfJobTitle.get(0));
		performClick(selectTitleFromJobTitle);
		performClick(saveButtonOfPersonalDetailPage);
	}
}
