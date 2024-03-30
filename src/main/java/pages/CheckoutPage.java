package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {

    private WebDriver driver;

    public CheckoutPage (WebDriver driver){
        this.driver = driver;

    }
    private By selectedProduct = By.xpath("//a[@class='btn_action checkout_button']");
    private By firstNameField = By.xpath("//input[@id='first-name']");

    private By lastNameField = By.id("last-name");

    private By postalCodeField = By.id("postal-code");

    private By Continue = By.xpath("//input[@class=('btn_primary cart_button')]");
    public By getSelectedProduct(){
        return selectedProduct;
    }
    public void addToCheckout(){
        driver.findElement(selectedProduct).click();
    }
    public void clickToContinue(){
        driver.findElement(firstNameField).sendKeys("Melouk");
        driver.findElement(lastNameField).sendKeys("Medhat");
        driver.findElement(postalCodeField).sendKeys("0000");
        driver.findElement(Continue).click();
    }
}
