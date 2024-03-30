package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends BaseTest {

//        By usernameField = By.id("user-name");
//        By passwordField = By.id("password");
//        By loginButton = By.id("login-button");
//        By errorButton = By.className("error-button");
//        By headerArea = By.className("app_Logo");
//
//        String validUsername = "standard_user";
//        String validPassword = "secret_sauce";
//        String invalidUsername = "nhgff";
//        String invalidPassword = "jtdfj";

        @Test
        public void validLogin() {
            LoginPage loginPage = new LoginPage(driver);
            HomePage homePage = new HomePage(driver);
            loginPage.login("standard_user", "secret_sauce");
            boolean isHeaderDisplayed = driver.findElement(homePage.getHeaderArea()).isDisplayed();
            Assert.assertTrue(isHeaderDisplayed);

        }

        @Test
        public void invalidLogin() {
            LoginPage loginPage = new LoginPage(driver);
            loginPage.login ("jdhdc" , "lsdjhjcdh");
            boolean iseErrorDisplayed = driver.findElement(loginPage.getErrorButton()).isDisplayed();
            Assert.assertTrue(iseErrorDisplayed);
        }
        }




//package selenium;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.bidi.network.Header;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//public class Login {
//    WebDriver driver;
//
//
//    @BeforeMethod
//    public void setup (){
//        driver = new ChromeDriver();
//        driver.navigate().to("https://www.saucedemo.com/v1/");
//    }
//    String productName = "Sauce Labs Fleece Jacket";
//
//
//    //elements
//    By usernameField = By.id("user-name");
//    By passwordField = By.id("password");
//    By loginButton = By.id("login-button");
//    By errorButton = By.className("error-button");
//    By headerArea = By.className("app_Logo");
//    By productLink = By.xpath("//div[text()=\""+productName+"\"]");
//    By productPrice = By.className("inventory_details_price");
//
//    //data
//    String validUsername = "standard_user";
//    String validPassword ="secret_sauce";
//    String invalidUsername = "nhgff";
//    String invalidPassword = "jtdfj";
//    String expectedPrice = "$29.99";
//
//    @Test
//    public void validLogin (){
//        driver.findElement(usernameField).sendKeys(validUsername);
//        driver.findElement(passwordField).sendKeys(validPassword);
//        driver.findElement(loginButton).click();
//        boolean isHeaderDisplayed = driver.findElement(headerArea).isDisplayed();
//        Assert.assertTrue (isHeaderDisplayed);
//
//    }
//    @Test
//    public void invalidLogin(){
//        driver.findElement(usernameField).sendKeys(invalidUsername);
//        driver.findElement(passwordField).sendKeys(invalidPassword);
//        driver.findElement(loginButton).click();
//        boolean iseErrorDisplayed = driver.findElement(errorButton).isDisplayed();
//        Assert.assertTrue(iseErrorDisplayed);
//    }
//    @Test
//    public void validateProductPrice(){
//        driver.findElement(usernameField).sendKeys(validUsername);
//        driver.findElement(passwordField).sendKeys(validPassword);
//        driver.findElement(loginButton).click();
//        driver.findElement(productLink).click();
//        String actualValue = driver.findElement(productPrice).getText();
//        Assert.assertEquals(actualValue , expectedPrice);
//    }
//
//    @AfterMethod
//    public void teardown(){
//        driver.quit();
//}
//}
