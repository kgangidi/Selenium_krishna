import Base.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class StepDefinition {

    @Given("User navigate to url {string}")
    public void user_navigate_to_url(String url) {
    BasePage.navigateToUrl(url);
    }
    @Then("User should be navigated to homepage")
    public void user_should_be_navigated_to_homepage() {

    }
    @Then("User should be navigated to home page with title {string}")
    public void userShouldBeNavigatedToHomePageWithTitle(String title) {
        Assertions.assertEquals(title,BasePage.driver.getTitle());
    }
    @When("User click on navigate link on nav bar")
    public void user_click_on_navigate_link_on_nav_bar() {
    BasePage.homePage.clickLoginLink();
    }
    @Then("User should be navigated to login page")
    public void user_should_be_navigated_to_login_page() {
    BasePage.loginPage.loginButton.click();
    }
    @When("User enters email as {string}")
    public void user_enters_email_as(String email) {
    BasePage.loginPage.enterEmail(email);
    }
    @When("User enters password as {string}")
    public void user_enters_password_as(String pw) {
        BasePage.loginPage.enterPassword(pw);
    }
    @When("User clicks on login button")
    public void user_clicks_on_login_button() {
        BasePage.loginPage.clickLogin();


    }
    @Then("User should be login successful")
    public void user_should_be_login_successful() {
    BasePage.loginPage.resultMsg();
    }

    @When("User click on register link from the nav bar")
    public void user_click_on_register_link_from_the_nav_bar() {
        BasePage.homePage.clickRegisterLink();
    }

    @Then("User should be navigated to register page with title {string}")
    public void user_should_be_navigated_to_register_page_with_title(String title) {

        Assertions.assertEquals(title,BasePage.driver.getTitle());
    }

    @When("User select gender as male")
    public void user_select_gender_as_male() {
    BasePage.registerPage.clickMaleRadioButton();
    }
    @When("User enter firstName lastName email password confirmPassword")
    public void user_enter_first_name_last_name_email_password_confirm_password(io.cucumber.datatable.DataTable dataTable) {
        BasePage.registerPage.enterFirstName(dataTable.cell(1,0));
        BasePage.registerPage.enterLasttName(dataTable.cell(1,1));
        BasePage.registerPage.enterEmail(dataTable.cell(1,2));
        BasePage.registerPage.enterPassword(dataTable.cell(1,3));
        BasePage.registerPage.enterConfirmPassword(dataTable.cell(1,4));
    }
    @When("User click on registerButton")
    public void user_click_on_register_button() {
        BasePage.registerPage.clickRegister();

    }
    @Then("User should see the confirmation message {string}")
    public void user_should_see_the_confirmation_message(String cm) {
    Assertions.assertEquals(cm,BasePage.registerPage.verifyRegisterConMsg());
    }


}
