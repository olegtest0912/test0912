package com.rusvpn;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class LoginRusVpn {
    private WebDriver driver;
    private WebDriverWait wait;

public LoginRusVpn(WebDriver driver) {
    this.driver = driver;
    wait = new WebDriverWait(driver, 10);
}

@FindBy (css = "div[data-v-1c3fca4b]")
private WebElement div;


private By emailField = By.cssSelector("input[type=\"text\"]");
private By passField = By.cssSelector("input[type=\"password\"]");
private By buttonLogin = By.cssSelector("[class=\"button\"]");
private By currentEmail = By.xpath(".//div[@class=\"user-email\"]/b");

public void loginToRusVpn(String emailtext, String pasText){
    driver.get("https://rusvpn.com/ru/login/");
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class=\"login-logotype\"]")));
    div.findElement(emailField).sendKeys(emailtext);
    div.findElement(passField).sendKeys(pasText);
    div.findElement(buttonLogin).click();
    wait.until(ExpectedConditions.visibilityOfElementLocated(currentEmail));
    WebElement emailContains = driver.findElement(currentEmail);
    wait.until(ExpectedConditions.textToBePresentInElement(emailContains,emailtext));
    }
}
