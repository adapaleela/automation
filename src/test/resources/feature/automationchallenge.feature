Feature: Automation Challenge
  
  	@tag1
  	Scenario: Test1
 
    Given Navigate to the home page
		When In Test1 div click the Open Modal Button
		When Enter values for Name and City
		|leela|vijayawada|
		When Click the Enter Data Button
		When Close the Modal
		Then Verify values under Open Modal button that were entered in the textboxes
    When close site
    
    @tag2
    Scenario: Test2
    
    Given Navigate to the home page
		When In Test2 div click on Click Me
		Then Verify and print all the available options
		When Search for the keyword "Angular"
		Then Verify two options are visible as Angular and Angular2
		When Clear the search box and type "ReactJs"
		Then Verify no option is visible
		When close site
		
		@tag3
		Scenario: Test3
		
		Given Navigate to the home page
		When In Test3 div search box enter value "USA"
		Then Verify table displays two rows with country as USA
		When Clear search box
		Then Verify table displays four rows
		When close site
		
		@tag4
		Scenario: Test4
		
		Given Navigate to the home page
		When In Test4 div drag button Drag Me to the Red Rectangle box
		Then After dragging, verify if button was dragged inside the box
		When close site

  
  