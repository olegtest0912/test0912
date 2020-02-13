package depositFinmaxFX;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class ClickPayment {
    private WebDriver driver;
    private WebDriverWait wait;

    public ClickPayment(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver,10);
    }

    public void clicktoDeposit()  {
        driver.findElement(By.id("my-account")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class=\"fa fa-credit-card\"]")));
        driver.findElement(By.cssSelector("[class=\"fa fa-credit-card\"]")).click();
    }
    public void checkDeposit() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[value=\"visa\"]")));
        WebElement button = driver.findElement(By.cssSelector("input[value=\"visa\"]"));
        WebElement buttonParent = button.findElement(By.xpath("../.."));
        buttonParent.findElement(By.cssSelector("label[role=\"button\"]")).click();
        driver.findElement(By.cssSelector("button[class=\"btn w-100 custom-btn btn-success\"]")).click();
        Thread.sleep(7000);
      //  buttonParent
       // String link= driver.getCurrentUrl();
    }
    public void checkPaysystem() throws IOException {

        String curlink = driver.getCurrentUrl();
        URL url = new URL(curlink);
        HttpURLConnection http = (HttpURLConnection) url.openConnection();
        int response = http.getResponseCode();
        System.out.println(response);
        System.out.println(curlink);
        Assert.assertEquals(response,200);
        Assert.assertNotEquals(curlink ,"https://finmaxfx.com/ru/deposit");
    }
}
