package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    public LoginPage (WebDriver driver){
        this.driver = driver;
    }

    //elements
    private By usernameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login-button");
    private By errorButton = By.className("error-button");

    //getter
    public By getErrorButton(){
        return errorButton;
    }

    //actions
    public void login(String Username, String Password){
        driver.findElement(usernameField).sendKeys(Username);
        driver.findElement(passwordField).sendKeys(Password);
        driver.findElement(loginButton).click();
    }
}
