# Author: duban2692@gmail.com

Feature: Login to Demoblaze
  As a transactional user
  I want to use the Demoblaze application
  to make transactions within the application

  Scenario: User successfully logs in to Demoblaze
    Given the transactional user navigates to the login page
    When they enter their credentials
    Then they should be logged in successfully