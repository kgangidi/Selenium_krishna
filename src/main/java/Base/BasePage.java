package Base;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.RegisterPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BasePage {
    public static WebDriver driver;
    public static HomePage homePage;
    public static LoginPage loginPage;
    public static RegisterPage registerPage;
    // public static Utils utils;
    //it is not allowed to use Inheritence
    @Before
    public static void setUp(){
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();

    homePage = new HomePage(driver);
    loginPage = new LoginPage(driver);
    registerPage = new RegisterPage(driver);
    //utils = new Utils();

}


    public static void navigateToUrl(String url){
        driver.navigate().to(url);

    }
    @After
    public static void tearDown(){
    driver.quit();
}


}
