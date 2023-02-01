package WebPages_OrangeHRM;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class PIM_Home_page extends SeleniumUtility {
	public PIM_Home_page(WebDriver driver) {
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


	//Methods
	public void clickOnAddButton() {
		clickOnElement(addButton);
	}

	public void clickOnSearchButton() {
		clickOnElement(searchButton);
		getActiveElementFromUi().sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN);
	}

	public void enterEmpIdInPimHomePage(String empid) {
		typeInput(EmployeeIdInputField,String.valueOf(empid));
	}

	public String getSearchResultMsg() {
		return getTextFromElement(searchResultCountMsg);
	
	}

	public void getFirstEmpCheckBox() {
		for (int i=0;i<5;i++){try {
			performclick(firstEmpCheckBox); 
		}catch(Exception e){}
		}
	}

	public void getFirstEmpEditSymbol() {
		clickOnElement(firstEmpEditSymbol);
	}

	public void getFirstEmpDeleteSymbol() {
		clickOnElement(firstEmpDeleteSymbol);
	}

	public void getYesDeleteButtonOfConfermationPopup() {
		clickOnElement(yesDeleteButtonOfConfermationPopup);
	}
	
}