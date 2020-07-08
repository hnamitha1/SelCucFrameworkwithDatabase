@CustomFields
Feature: Custom Field Creation
  As a Test Engineer I want to test Creation of a Custom Field.

  Background: User should be on Home page
    Given I am on the Login page URL 
    When I enter username
    And I enter password
    And click on login button
    
  Scenario: Create Custom Fields
    When I click on Custom Fields link
    And I enter Field Name "age"
    And I select Screen As "Personal Details"
    And I select Type as "Text or Number"
    And I click on Save button
    Then I should see Custom Field creation success message
    And I should verify leads information