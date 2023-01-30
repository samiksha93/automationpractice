package WebPages_OrangeHRM;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import utilities.SeleniumUtility;

public class OrangeHRM_PIM_Add_Page extends SeleniumUtility {
	public OrangeHRM_PIM_Add_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//Add pim 

	@FindBy(name="firstName")
	private WebElement firstNameInputField;
	
	@FindBy(name="lastName")
	private WebElement lastNameInputField;
	
	@FindBy(xpath="//div[div[label[text()='Employee Id']]]/div[2]/input")
	private WebElement employeeIdInputField;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement saveButtonOnEmpAddPage;
	
	public void createEmployee(String firstName,String lastName,int EmpId) {
		typeInput(firstNameInputField,firstName);
		typeInput(lastNameInputField,lastName);

		getActiveElement().sendKeys(Keys.TAB,Keys.BACK_SPACE);
		typeInput(employeeIdInputField,String.valueOf(EmpId));
		setSleepTime(5000);
		performClick(saveButtonOnEmpAddPage);

		}
}