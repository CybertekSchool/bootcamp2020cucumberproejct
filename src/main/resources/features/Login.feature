@login
Feature: Login

  @smoke
  Scenario: Login as tester
    Given user is on the login page
    Then user logs in