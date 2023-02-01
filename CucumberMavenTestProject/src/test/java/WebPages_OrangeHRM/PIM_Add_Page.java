package WebPages_OrangeHRM;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import utilities.SeleniumUtility;

public class PIM_Add_Page extends SeleniumUtility {
	public PIM_Add_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//Add PIM 

	@FindBy(name="firstName")
	private WebElement firstNameInputField;
	
	@FindBy(name="lastName")
	private WebElement lastNameInputField;
	
	@FindBy(xpath="//div[div[label[text()='Employee Id']]]/div[2]/input")
	private WebElement employeeIdInputField;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement saveButton;
	
	
	//Methods
	public void enterFirstName(String firstName) {
		typeInput(firstNameInputField,firstName);
	}

	public void enterLastName(String lastname) {
		typeInput(lastNameInputField,lastname);
	}

	public void enterEmployeeId(String empId) {
		getActiveElementFromUi().sendKeys(Keys.TAB,Keys.BACK_SPACE);
		typeInput(employeeIdInputField,String.valueOf(empId));
	}

	public void clickOnSaveButton() {
		setSleepTime(5000);
		clickOnElement(saveButton);
	}

//	public void createEmployee(String firstName,String lastName,int EmpId) {
//		typeInput(firstNameInputField,firstName);
//		typeInput(lastNameInputField,lastName);
//
//		getActiveElement().sendKeys(Keys.TAB,Keys.BACK_SPACE);
//		typeInput(employeeIdInputField,String.valueOf(EmpId));
//		setSleepTime(5000);
//		performClick(saveButtonOnEmpAddPage);
//
//		}
}