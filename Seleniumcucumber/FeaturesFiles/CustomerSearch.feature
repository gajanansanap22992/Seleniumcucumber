Feature:  CuctomerSearch
Background: Folowing are the common steps for All scenario
Given  User launch browser
  When user open Url "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
  And user enter Email as "admin@yourstore.com" and password as "admin"
 And click on login
 Then user can view dashboard
 When  user click on customer menu
 And click on customer menu item

@Sanity
Scenario: Search customer by Emailid 
 When user enter emailId 
 And click on search button
 Then user should find email in the search table
 Then close browser
 
 @Regression
 Scenario: search customer by first and last name
 When user enter firstName
 When user enter lastName 
 And click on search button
 Then user should find first and last in the search table
 Then close browser