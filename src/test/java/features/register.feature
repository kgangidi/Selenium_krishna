Feature: Register user
  Scenario: verify user registration by filling all the mandatory fields
    Given User navigate to url "https://demo.nopcommerce.com/"
    Then User should be navigated to home page with title "nopCommerce demo store"
    When User click on register link from the nav bar
    Then User should be navigated to register page with title "nopCommerce demo store. Register"
    When User select gender as male
    And  User enter firstName lastName email password confirmPassword
    |firstName|lastName|email|password|confirmPassword|
    |John  |Doe        |test1@test.com |testing|testing|
    And User click on registerButton
    Then User should see the confirmation message "Your registration completed"
