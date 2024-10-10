# Author: duban2692@gmail.com

Feature: Shopping on Demoblaze
  As a transactional user
  I want to select a mobile phone
  and add it to my shopping cart

  Background:
    Given the transactional user navigates to the login page
    When they enter their credentials
    Then they should be logged in successfully

  Scenario: User selects a mobile phone and adds it to the cart
    Given the user is on the homepage
    When they select a mobile phone from the products list
    And they click on the "Add to cart" button
    Then the phone should be added to the shopping cart
    And they should see a confirmation message