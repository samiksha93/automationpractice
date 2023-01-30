package WebPages_OrangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;


public class OrangeHRM_login_Page extends SeleniumUtility{
	//Initialize current web page Elements
	public OrangeHRM_login_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//Username
	@FindBy(xpath="//input[@name='username']")
	private WebElement usernameInputField;
	//password
	@FindBy(xpath="//input[@name='password']")
	private WebElement passwordInputField;
	//login button
	@FindBy(xpath="//button[text()=\" Login \"]")
	private WebElement loginButton;
	
	public void loginInOrangeHRM(String username,String password) {
		typeInput(usernameInputField, username);
		typeInput(passwordInputField, password);
		performClick(loginButton);
	}
	

}
