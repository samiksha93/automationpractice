package WebPages_OrangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;


public class Login_Page extends SeleniumUtility{
	//Initialize current web page Elements
	public Login_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//Use user name
	@FindBy(xpath="//input[@name='username']")
	private WebElement usernameInputField;
	
	//password
	@FindBy(xpath="//input[@name='password']")
	private WebElement passwordInputField;
	
	//login button
	@FindBy(xpath="//button[text()=\" Login \"]")
	private WebElement loginButton;
	
	//forgot password
	@FindBy(xpath="//p[text()=\"Forgot your password? \"]")
	private WebElement forgotPasswordLink;
	
	
	//Methods
	public void ForgotPasswordLink() {
		clickOnElement(forgotPasswordLink);
	}

	public void enterUsername(String username) {
		typeInput(usernameInputField,username);
	}

	public void enterPassword(String password) {
		typeInput(passwordInputField,password);
	}

	public void clickOnSigninButton() {
		clickOnElement(loginButton);
	}
	

}
