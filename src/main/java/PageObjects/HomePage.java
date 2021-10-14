package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver driver;

    //Locators
    @FindBy(linkText = "Register")
    public WebElement registerLink;

    @FindBy(linkText = "log in")
    public WebElement loginLink;

    @FindBy(id="small-searchterms")
    public WebElement searchTextBox;

    @FindBy(className="search-box-button")
    public WebElement searchButton;

    public HomePage(WebDriver driver){
        //this step to initialize the pagefactory
        //Page factory cannot be created here as it will be local .so we have to created global

        this.driver = driver;

        PageFactory.initElements(driver, this);

    }

    //actions
    public void clickRegisterLink(){
        registerLink.click();
    }

    public void clickLoginLink(){
        loginLink.click();
    }
    public void enterSearchText(String searchItem){
        searchTextBox.sendKeys(searchItem);
    }
    public void clickSearchButton(){
        searchButton.click();
    }
}
