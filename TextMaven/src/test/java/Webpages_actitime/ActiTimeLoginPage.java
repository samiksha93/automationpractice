package Webpages_actitime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class ActiTimeLoginPage extends SeleniumUtility {
	public ActiTimeLoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
		@FindBy(id="username")
		private WebElement usernameInputField;
		@FindBy(name="pwd")
		private WebElement passwordInputField;
		@FindBy(id="loginButton")
		private WebElement loginButton;

		
	public void LoginInActTime(String username,String password) {
		typeInput(usernameInputField,username);
		typeInput(passwordInputField,password);
		performClick(loginButton);	
		}
	}