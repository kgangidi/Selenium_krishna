package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
    WebDriver driver;

    //Locators
    @FindBy(id = "gender-male")
    public WebElement maleRadioButton;

    @FindBy(id = "FirstName")
    public WebElement firstNameTextBox;

    @FindBy(id ="LastName")
    public WebElement lastNameTextBox;

    @FindBy(id = "Email")
    public WebElement emailTextBox;

    @FindBy(id = "Password")
    public WebElement passwordTextBox;

    @FindBy(id = "ConfirmPassword")
    public WebElement confirmPasswordTextBox;

    @FindBy(id = "register-button")
    public WebElement registerButton;

    @FindBy(className= "result")
    public WebElement registerConfirmText;


    public RegisterPage(WebDriver driver){
        //this step to initialize the pagefactory
        //Page factory cannot be created here as it will be local .so we have to created global

        this.driver = driver;

        PageFactory.initElements(driver, this);

    }

    //actions
      public void clickMaleRadioButton()
    {
        maleRadioButton.isSelected();
    }

    public void enterFirstName(String fName){firstNameTextBox.sendKeys(fName);}
    public void enterLasttName(String lName){firstNameTextBox.sendKeys(lName);}
    public void enterEmail(String email){firstNameTextBox.sendKeys(email);}
    public void enterPassword(String pw){passwordTextBox.sendKeys(pw);}

    public void enterConfirmPassword(String cpw){
        confirmPasswordTextBox.sendKeys(cpw);
    }

    public void clickRegister(){
        registerButton.click();
    }

    public String verifyRegisterConMsg(){
        return registerConfirmText.getText();

    }

    /*
    public void loginToNopCommerce(String email,String pw){
        emailTextBox.sendKeys(email);
        passwordTextBox.sendKeys(pw);
        loginButton.click();
    }*/


}
