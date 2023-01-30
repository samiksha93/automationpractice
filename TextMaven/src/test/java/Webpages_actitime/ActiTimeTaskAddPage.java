package Webpages_actitime;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class ActiTimeTaskAddPage extends SeleniumUtility {
	public ActiTimeTaskAddPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(css=".projectSelector .selectedItem")
	private WebElement customerdropdownfield;
	
	@FindBy(css=".projectSelector .searchItemList>div")
	private List<WebElement> projectdropdownfield;
	
	@FindBy(css="input[placeholder='Enter task name']")
	private List<WebElement> enterTaskNameInputField;
	
	@FindBy(css=".x-btn-text")
	private List<WebElement> deadlineInputField;
	
	@FindBy(css="a[title=\"Next Month (Control+Right)")
	private WebElement arrowButtonOfCalanderOnDeadlineField;
	
	@FindBy(css=".x-date-inner .x-date-date")
	private List<WebElement> selectDateFromCalanderOnDeadlineField;
	
	@FindBy(css=".taskTableContainer .value.ellipsis")
	private List<WebElement> typeOfWorkField;
	
	@FindBy(css=".taskTableContainer .typeOfWorkList>div>div")
	private List<WebElement> typeOfWorkList;
	
	@FindBy(css=".basicLightboxFooter .components_button_label")
	private WebElement creatTaskButton;
	
	public void taskCreateMethod(String taskname) {
		performClick(customerdropdownfield);
		performClick(projectdropdownfield.get(1));
		typeInput(enterTaskNameInputField.get(0),taskname);
		performClick(deadlineInputField.get(0));
		performClick(arrowButtonOfCalanderOnDeadlineField);
		performClick(selectDateFromCalanderOnDeadlineField.get(20));
		performClick(typeOfWorkField.get(0));
		performClick(typeOfWorkList.get(9));
		setSleepTime(2000);
		performClick(creatTaskButton);
	}
}
