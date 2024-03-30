package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FinishPage {

    private WebDriver driver;

    public FinishPage (WebDriver driver){
        this.driver = driver;

    }
    private By FinishStep = By.xpath("//a[text()='FINISH']");

    private By FinishStatment = By.xpath("//h2[text()=\"THANK YOU FOR YOUR ORDER\"]");

    public By getFinishStep(){
        return FinishStep;

    }
    public By getFinishStatment(){
        return FinishStatment;
    }
    public void selectFinish(){
        driver.findElement(FinishStep).click();
    }
}
