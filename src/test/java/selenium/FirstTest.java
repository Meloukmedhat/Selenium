//package selenium;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//import java.util.Scanner;
//
//public class FirstTest {
//    @Test
//    public void third(){
//        WebDriver driver = new ChromeDriver();
//        driver.navigate().to("https://www.google.com/");
//    }
//
//    @Test
//    public void first (){
//        WebDriver driver = new ChromeDriver();
//        driver.navigate().to("https://www.saucedemo.com/v1/index.html");
//        By username = By.id("user-name");
//        driver.findElement(username).sendKeys("standard_user");
//        By password = By.id("password");
//        driver.findElement(password).sendKeys("secret_sauce");
//        By loginButton = By.id("login-button");
//        driver.findElement(loginButton).click();
//        By header = By.id("header_container");
//        boolean isHeaderDisplayed = driver.findElement(header).isDisplayed();
//        Assert.assertTrue(isHeaderDisplayed);
//
//    }
//}



