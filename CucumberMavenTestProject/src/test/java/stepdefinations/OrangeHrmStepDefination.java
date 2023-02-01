package stepdefinations;

import org.openqa.selenium.WebDriver;

import WebPages_OrangeHRM.Home_Page;
import WebPages_OrangeHRM.Login_Page;
import WebPages_OrangeHRM.PIM_Add_Page;
import WebPages_OrangeHRM.PIM_Edit_Page;
import WebPages_OrangeHRM.PIM_Home_page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.SeleniumUtility;

public class OrangeHrmStepDefination extends SeleniumUtility {

	Home_Page getHome_Page;
	Login_Page getLogin_Page;
	PIM_Home_page getPim_Home_page;
	PIM_Add_Page getPim_Add_Page;
	PIM_Edit_Page getPim_Edit_page; 
	
	
	@Given("User is already login page")
	public void user_is_already_login_page() {
		WebDriver driver = setUp("chrome", "https://opensource-demo.orangehrmlive.com/");
		getHome_Page = new Home_Page(driver);
		getLogin_Page = new Login_Page(driver);
		getPim_Home_page = new PIM_Home_page(driver);
		getPim_Add_Page = new PIM_Add_Page(driver);
		getPim_Edit_page = new PIM_Edit_Page(driver);
	}
	
	@And("User enters username as {string}")
	public void user_enters_username_as(String string) {
		getLogin_Page.enterUsername(string);
	}

	@And("User enters password as {string}")
	public void user_enters_password_as(String string) {
		getLogin_Page.enterPassword(string);
	}

	@And("Click on signin button")
	public void click_on_signin_button() {
		getLogin_Page.clickOnSigninButton();
	}

	@And("Click on pim menu in home page")
	public void click_on_pim_menu_in_home_page() {
		getHome_Page.clickOnPIMOption();
	}

	@When("^User click on add button on pim home page$")
	public void user_click_on_add_button_on_pim_home_page() {
		getPim_Home_page.clickOnAddButton();
	}

	@And("^Enter firstname as (.+) on add employee page$")
	public void enter_firstname_as_on_add_employee_page(String firstname) {
		getPim_Add_Page.enterFirstName(firstname);
	}

	@And("^Enter lastname as (.+) on add employee page$")
	public void enter_lastname_as_on_add_employee_page(String lastname) {
		getPim_Add_Page.enterLastName(lastname);
	}

	@And("^Enter empoloyee id as (.+) on add employee page$")
	public void enter_empoloyee_id_as_on_add_employee_page(String empid) {
		getPim_Add_Page.enterEmployeeId(empid);
	}

	@And("^Click on save buttton on add employee page$")
	public void click_on_save_buttton_on_add_employee_page() {
		getPim_Add_Page.clickOnSaveButton();
	}

	@When("^Enter employee id as \"([^\"]*)\" in employee information on pim home page$")
	public void enter_employee_id_in_employee_information_on_pim_home_page(String strArg1) {
		getPim_Home_page.enterEmpIdInPimHomePage(strArg1);
	}

    @And("^Click on search button in employee information on pim home page$")
    public void click_on_search_button_in_employee_information_on_pim_home_page()  {
        getPim_Home_page.clickOnSearchButton();
    }
    
    @And("^Click on first employee check box on pim home page$")
    public void click_on_first_employee_check_box_on_pim_home_page()  {
        getPim_Home_page.getFirstEmpCheckBox();
    }

    @And("^Verify serach count message on pim home page$")
    public void verify_serach_count_message_on_pim_home_page()  {
    	String msg =getPim_Home_page.getSearchResultMsg();
    	System.out.println(msg);
    }

    @When("^User click on first employee edit symbol on pim home page$")
    public void user_click_on_first_employee_edit_symbol_on_pim_home_page()  {
    	getPim_Home_page.getFirstEmpEditSymbol();    
    }
  
    @And("^Click on Job option in Personal information page$")
    public void click_on_job_option_in_personal_information_page() {
    	getPim_Edit_page.jobOptionInPersionalDetailPage();
    }

    @And("^Select Job Title in Job detail page$")
    public void select_job_title_in_job_detail_page() {
    	getPim_Edit_page.getDropdownArrowOfJobTitle();
        getPim_Edit_page.selectTitleFromJobTitle();
    }

    @And("^Click on Save button on Job detial page$")
    public void click_on_save_button_on_job_detial_page()  {
    	getPim_Edit_page.saveButtonOfPersonalDetailPage();
    }
    
    @When("^Click on first employee delete symbol on PIM home page$")
    public void click_on_first_employee_delete_symbol_on_pim_home_page()  {
    	getPim_Home_page.getFirstEmpCheckBox();
    	getPim_Home_page.getFirstEmpDeleteSymbol();
    }

    @And("^Click on yes delete button on delete confirmation pop up$")
    public void click_on_yes_delete_button_on_delete_confirmation_pop_up()  {
    	getPim_Home_page.getYesDeleteButtonOfConfermationPopup();
    }

    @And("^Verify the messsage NoRecord Found$")
    public void verify_the_messsage_norecord_found()  {  
    }
    
    @Then("^close the browser$")
    public void close_the_browser()  {
        cleanUp();
    }

}

