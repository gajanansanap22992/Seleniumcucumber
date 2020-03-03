Feature: Login

@Sanity
Scenario: Successfully Login with valid credentials
    Given User launch browser
    When user open Url "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    And user enter Email as "admin@yourstore.com" and password as "admin"
    And click on login
       Then pageTitle should be "Dashboard / nopCommerce administration"
       When user click on log out page
       Then Page Title shoub be "Your store. Login"
       And close browser
      
      
      @Regression
       Scenario Outline: Successfully Login with valid credentials
    Given User launch browser
    When user open Url "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    And user enter Email as "<email>" and password as "<password>"
    And click on login
       Then pageTitle should be "Dashboard / nopCommerce administration"
       When user click on log out page
       Then Page Title shoub be "Your store. Login"
       And close browser
       
       Examples:
       |email|passwor|
       |admin@yourstore.com|admin|
       |admin@yourstore.com|admin123|