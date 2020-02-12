package depositFinmaxFX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClickPayment {
    private WebDriver driver;
  //  private WebDriverWait wait;

    public ClickPayment(WebDriver driver){
        this.driver = driver;
     //   wait = new WebDriverWait(driver,10);
    }

    public void clicktoDeposit(){
        driver.findElement(By.id("my-account")).click();
        driver.findElement(By.cssSelector("[class=\"fa fa-credit-card\"]")).click();
    }
    public void checkDeposit(){

        WebElement button = driver.findElement(By.cssSelector("input[value=\"visa\"]"));
        WebElement buttonParent = button.findElement(By.xpath("../.."));
        buttonParent.findElement(By.cssSelector("label[role=\"button\"]")).click();
      //  buttonParent
       // String link= driver.getCurrentUrl();
    }
}
