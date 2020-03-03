Feature: Customers information

@Sanity
Scenario: Add new customer
 Given User launch browser
  When user open Url "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
  And user enter Email as "admin@yourstore.com" and password as "admin"
 And click on login
 Then user can view dashboard
 When  user click on customer menu
 And click on customer menu item
  And click on add new button
 Then user can view add new customer page
When user enter customer info
And click on save button
Then user can view confirmation message "The new customer has been added successfully."
 And close browser
