Feature: Test PIM Functionality of OrangeHRM application

Background:   
    Given User is already login page
    And User enters username as "Admin"
    And User enters password as "admin123"
    And Click on signin button
		And Click on pim menu in home page
 
Scenario Outline: Verify PIM creation
		When User click on add button on pim home page 
		And Enter firstname as <firstname> on add employee page
		And Enter lastname as <lastname> on add employee page
		And Enter empoloyee id as <EmpId> on add employee page
		And Click on save buttton on add employee page
	
	 Examples: 
      | firstname 		| lastname   | EmpId |
      | automation    | testing    | 1233  |

Scenario: Verify PIM modification 
	Given Enter employee id as "1233" in employee information on pim home page 
	And Click on search button in employee information on pim home page
	And Click on first employee check box on pim home page
	And Verify serach count message on pim home page
	When User click on first employee edit symbol on pim home page
	And Click on Job option in Personal information page
	And Select Job Title in Job detail page
	And Click on Save button on Job detial page

Scenario: Verify PIM deletion
	Given Enter employee id as "1233" in employee information on pim home page 
	And Click on search button in employee information on pim home page
	And Click on first employee check box on pim home page
	And Verify serach count message on pim home page
	When Click on first employee delete symbol on PIM home page 
	And Click on yes delete button on delete confirmation pop up
	And Verify the messsage NoRecord Found  
	Then close the browser