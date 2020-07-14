Feature: performance mangae reviews
  As a Test Engineer I want to manage the reviews of the employees.

  Background: User should be on Home page
    Given I am on the Login page URL 
    When I enter username
    And I enter password
    And click on login button
    
  Scenario: create review employee
    When I click on Manage Reviews link
    And Click on Add Button
    And Enter the employee name as "Fiona Grace"
    And Enter the supervisor name as "John Smith"
    And Enter the work period start date as "2019-05-02"
    And Enter the work period end date as "2020-07-01"
    And Enter the due date as "2020-07-30"
    And click on activate
    Then check the status of the employee to be changed to "Activated"

Scenario: Search employee to evaluate 
    When I click on Manage Reviews link
    And  look for employee name as "Fiona Grace"
    And click on Evaluate
    And enter the rating as "5"
    And Enter the final comment as "Satisfactory"
    And enter the fina rating as "5"
    And enter the complete date as "2020-07-15"
    Then click on Complete
    Then pop up of OrangeHRM confirmation Required will come
    And click on okie
    Then Click on back
    Then verify the status changed to "Approved"
    
    
   Scenario: delete employee records
    When I click on Manage Reviews link
    And select employee "Fiona Grace" 
    And click on Delete
    Then Pop up will come and click on okie
    Then verify the message "No Records Found"
    
   