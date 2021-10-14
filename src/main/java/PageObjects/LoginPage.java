package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    //Locators
    @FindBy(id = "Email")
    public WebElement emailTextBox;

    @FindBy(id = "Password")
    public WebElement passwordTextBox;

    @FindBy(className="login-button")
    public WebElement loginButton;

    @FindBy(className = "registration-result-page")
    public WebElement successMsg;

    public LoginPage(WebDriver driver){
        //this step to initialize the pagefactory
        //Page factory cannot be created here as it will be local .so we have to created global

        this.driver = driver;

        PageFactory.initElements(driver, this);

    }

    //actions
      public void enterEmail(String email)
    {
        emailTextBox.sendKeys(email);
    }

    public void enterPassword(String pw){
        passwordTextBox.sendKeys(pw);
    }

    public void clickLogin(){
        loginButton.click();
    }
    public void resultMsg(){
        successMsg.getText();

    }

    /*
    public void loginToNopCommerce(String email,String pw){
        emailTextBox.sendKeys(email);
        passwordTextBox.sendKeys(pw);
        loginButton.click();
    }*/


}
