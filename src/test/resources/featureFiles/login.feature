@Login
Feature: Sign In
  As an employee of the company
  I want to login to application with my credentails
  In order to use the application features.

  Background: User navigates to Application URL
    Given I am on the Login page URL 
    Then I should see Log In Page

   @sanity
  Scenario: Sign In with valid credential
    When I enter username 
    And I enter password 
    And click on login button
    Then I sould see application homepage
    And I sould see administrator text message on home Page