Feature: login to nopCommerce
  Scenario Outline: Verify login with valid credentials
    Given User navigate to url "https://demo.nopcommerce.com/"
    Then User should be navigated to home page with title "nopCommerce demo store"
    When User click on navigate link on nav bar
    Then User should be navigated to login page
    When User enters email as "<email>"
    And User enters password as "<password>"
    And User clicks on login button
    Then User should be login successful

    Examples:
      |email        |  password|
      |user1@nop.com| Testing|
      |user2@nop.com| Testing|
      |user3@nop.com| Testing|


