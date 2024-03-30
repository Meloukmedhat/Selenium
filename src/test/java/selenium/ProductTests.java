package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;

import java.time.Duration;

public class ProductTests extends BaseTest{

    //String productName = "Sauce Labs Fleece Jacket";
    //By productLink = By.xpath("//div[text()=\""+productName+"\"]");
    //By productPrice = By.className("inventory_details_price");

    String expectedPrice = "$29.99";

    @Test
    public void validateProductPrice() {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        ProductPage productPage = new ProductPage(driver);

        loginPage.login ("standard_user", "secret_sauce");
        homePage.openProduct();
        String actualValue = driver.findElement(productPage.getProductPrice()).getText();
        Assert.assertEquals(actualValue, expectedPrice);

    }
    @Test
    public void addProductToCart(){
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        ProductPage productPage = new ProductPage(driver);
        CartPage cartPage = new CartPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        OverviewCheckoutPage overviewCheckoutPage = new OverviewCheckoutPage(driver);
        FinishPage finishPage = new FinishPage(driver);

        loginPage.login ("standard_user", "secret_sauce");
        homePage.openProduct();
        productPage.addToCart();
        checkoutPage.addToCheckout();
        checkoutPage.clickToContinue();
        finishPage.selectFinish();
        boolean isElementDisplayed = driver.findElement(finishPage.getFinishStatment()).isDisplayed();
        Assert.assertTrue(isElementDisplayed);

    }
}
