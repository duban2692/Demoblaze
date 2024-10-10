# Author: duban2692@gmail.com

Feature: Register on Demoblaze
  As a transactional user
  I want to enter my information
  to register in the application

  Scenario: User successfully registers on the Demoblaze app
    Given the transactional user navigates to the login page
    When they enter their registration information
    Then they should see a message indicating successful sign-up