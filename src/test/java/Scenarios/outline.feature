Feature: Amazon login scenarios 
#This is how background can be used to eliminate duplicate steps 

Background: User navigates to Amazon 
   Given I am on Amazon login page 


#Scenario with xml data 
Scenario:
   When I enter Username and Password from file at "resources\\data.xml"
   Then Login should fail 


#Scenario outline exapmle1 
Scenario Outline:
   When I enter Username as "<username>" and Password as "<password>"
   Then Login should fail 
Examples:
|username|password|
|Tom|jerry|


#Scenario outline example2 
Scenario Outline:
   When I enter username as "<username>"
   And I enter password as "<password>" 
   Then Login should fail 
   But Relogin option should be available
 Examples:
|username|password|
|tom|jerry|
|kritika|dwivedi|
|dwivedi|tewari|

#Scenario with data table 
Scenario:
   When I enter username
   |tom		|
   |kritika |
   And I enter password 
   |jerry|
   |dwivedi|
   Then Login should fail 
   #But Relogin option should be available