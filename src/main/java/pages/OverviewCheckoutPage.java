package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OverviewCheckoutPage {
    private WebDriver driver;

    public OverviewCheckoutPage (WebDriver driver){
        this.driver = driver;
    }

   private By descriptionOverview = By.xpath("//a[@class=\'btn_action cart_button\']");

    public By getDescriptionOverview(){
        return descriptionOverview;

    }
    public void goToFinish(){
        driver.findElement(descriptionOverview).click();
    }
}
