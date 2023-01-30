package WebPages_OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class OrangeHRM_PIM_Home_page extends SeleniumUtility {
	public OrangeHRM_PIM_Home_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary\"]")
	private WebElement addButton;
	
	@FindBy(css=".orangehrm-left-space")
	private WebElement searchButton;
	
	@FindBy(xpath="//div[@class=\"oxd-grid-item oxd-grid-item--gutters\"][2]//input")
	private WebElement EmployeeIdInputField;
	
	@FindBy(css=".orangehrm-vertical-padding>span")
	private WebElement searchResultCountMsg;
	
	@FindBy(css=".oxd-table-body>div:nth-child(1) label>input")
	private WebElement firstEmpCheckBox ;
	
	@FindBy(css=".oxd-table-body>div:nth-child(1) .bi-pencil-fill")
	private WebElement firstEmpEditSymbol;
	
	@FindBy(css=".oxd-table-body>div:nth-child(1) .bi-trash")
	private WebElement firstEmpDeleteSymbol;
	
	@FindBy(css=".orangehrm-modal-footer>button:nth-child(2")
	private WebElement yesDeleteButtonOfConfermationPopup;

	
	public void clickOnAddButton() {
		performClick(addButton);	
	}
	
	public void searchCreatedEmployee(int  EmpId) {
		typeInput (EmployeeIdInputField, String.valueOf(EmpId));
		performClick(searchButton);
		getActiveElement().sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN);
	}
	
	public String getSearchResultMsg() {
		return getTextFromElement(searchResultCountMsg);
	}
	
	public void deleteCreatedEmployee() {
		for (int i=0;i<5;i++){try {
		performClick(firstEmpCheckBox);
		}catch(Exception e){}
		}
		performClick(firstEmpDeleteSymbol);
		performClick(yesDeleteButtonOfConfermationPopup);
	}
	
	public void editCreatedEmployee() {
		for (int i=0;i<5;i++){try {
		performClick(firstEmpCheckBox);
		}catch(Exception e){}
		}
		performClick(firstEmpEditSymbol);
	}
	
}