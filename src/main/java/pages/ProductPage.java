package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

    public class ProductPage {
    WebDriver driver;
    public ProductPage (WebDriver driver){
     this.driver = driver;
 }
    //elements
    private By productPrice = By.className("inventory_details_price");
    private By addTocartButton = By.xpath("//*[@role='img']");
    private By cartIcon = By.id ("shopping_cart_container");
    public By getProductPrice(){
        return productPrice;
    }

    public void addToCart() {
        driver.findElement(addTocartButton).click();
    }
}