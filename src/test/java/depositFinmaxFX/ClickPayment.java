package depositFinmaxFX;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class ClickPayment {
    private WebDriver driver;
    private WebDriverWait wait;

    public ClickPayment(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver,15);
    }

    @FindBy (id = "my-account")
    private WebElement accountButton;

    private By depositButton = By.cssSelector("[class=\"fa fa-credit-card\"]");
  //  private By form = By.cssSelector("form");

    public void clicktoDeposit()  {
        accountButton.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(depositButton));
        driver.findElement(depositButton).click();
    }
    public void checkDeposit(String paySystem, int amountValue)  {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[value=\""+paySystem+"\"]")));
        WebElement buttonAmount = driver.findElement(By.cssSelector("input[value=\""+amountValue+"\"]"));
        WebElement buttonAmountParent = buttonAmount.findElement(By.xpath("../.."));
        buttonAmountParent.findElement(By.cssSelector("label[role=\"button\"]")).click();
        WebElement button = driver.findElement(By.cssSelector("input[value=\""+paySystem+"\"]"));
        WebElement buttonParent = button.findElement(By.xpath("../.."));
        buttonParent.findElement(By.cssSelector("label[role=\"button\"]")).click();
        driver.findElement(By.cssSelector("button[class=\"btn w-100 custom-btn btn-success\"]")).click();

    }

    public void checkDeposit50or5000(String paySystem,String amountValue){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[value=\""+paySystem+"\"]")));
        WebElement button = driver.findElement(By.cssSelector("input[value=\""+paySystem+"\"]"));
        WebElement buttonParent = button.findElement(By.xpath("../.."));
        buttonParent.findElement(By.cssSelector("label[role=\"button\"]")).click();
        driver.findElement(By.name("amount")).clear();
        driver.findElement(By.name("amount")).sendKeys(amountValue);

        driver.findElement(By.cssSelector("button[class=\"btn w-100 custom-btn btn-success\"]")).click();
    }
    public void checkPaysystem(String payLink)  {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div")));
      //  driver.findElement(form);
        driver.findElements(By.cssSelector("div"));

        String curlink = driver.getCurrentUrl();

        System.out.println(curlink);
       // Assert.assertNotEquals(curlink ,depositLink);
        boolean isContains = curlink.contains(payLink);
        Assert.assertTrue(isContains);

    }
}
