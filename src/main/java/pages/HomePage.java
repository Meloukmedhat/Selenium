package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

    public class HomePage {
    private WebDriver driver;

    public HomePage (WebDriver driver){
        this.driver = driver;
    }

    String productName = "Sauce Labs Fleece Jacket";

    private By headerArea = By.className("app_Logo");
    private By productLink = By.xpath("//div[text()=\""+productName+"\"]");
    public By getHeaderArea (){
        return headerArea;
    }
    public void openProduct(){
        driver.findElement(productLink).click();
    }
}
