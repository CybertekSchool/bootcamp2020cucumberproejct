@view_orders
Feature: View All Orders
  As user I want to be able to see list of
  all orders as table

  Scenario: Verify that List of All Orders table-title is displayed
    Given user is on the login page
    Then user logs in
    And user verifies that "List of All Orders" table-title is displayed