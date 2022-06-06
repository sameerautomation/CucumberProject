Feature: Login

  Scenario Outline: validate login with valid credentials
    Given i am at signin page
    When i entered username as "<username>"
    And i entered password as "<password>"
    And i click on sigin button
    Then page title should be "<exptitle>"
    
  Examples:
  
  |username|password|exptitle|
	|ramu@mailinator.com|abc@1234|My account - My Store|
	|ram@milinator.com|abc@1234|Login - My Store|
	
	
	Scenario: validate the sigin page title
  
  Given i am at signin page
  Then page title should be "Login - My Store"
  
  