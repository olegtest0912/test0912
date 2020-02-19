package com.rusvpn;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CabinetRusVpn {
    private WebDriver driver;
    private WebDriverWait wait;

    public CabinetRusVpn(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver,10);
    }
    @FindBy (css = "div[class=\"data\"]")
    private WebElement dataDiv;

     @FindBy (css = "[class=\"this-submit-button\"]")
    private WebElement submitButton;
    private By buttonToCabinet = By.cssSelector("[class=\"button\"]");

     public void clickToCabinet(){
         WebElement buttondiv = dataDiv;
        buttondiv.findElement(buttonToCabinet).click();
     }
     public void selectDatePlan(String date){
         wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("[class=\"c-order-plan t-"+date+"\"]")));
        driver.findElement(By.cssSelector("[class=\"c-order-plan t-"+date+"\"]")).click();
     }
     public void clickPayButtons(String buttonPay){
        if (buttonPay.equals("card")){
            driver.findElement(By.cssSelector("[class=\"this-submit-button\"]")).click();
        }else {
            driver.findElement(By.cssSelector("[class=\"this-method-button this-"+buttonPay+"\"]")).click();
            submitButton.click();
        }
     }
     public void checkPaySystems(String ExpPaySystem){
         wait.until(ExpectedConditions.urlContains(ExpPaySystem));
     }
}


