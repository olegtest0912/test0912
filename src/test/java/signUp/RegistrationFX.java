package signUp;

import com.promo.finmaxfx.WebElementSettings;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Random;

public class RegistrationFX extends WebElementSettings {
    @Test
    public void registrationFX(){
        //---------- mainpage

        MainPage mainPage = PageFactory.initElements(driver, MainPage.class);
        mainPage.open("https://finmaxfx.com/en");
        mainPage.getStarted();
        mainPage.checkCurrentLink("https://finmaxfx.com/en/registration");

        // --------- singup

        SignUpPage signUpPage = PageFactory.initElements(driver,SignUpPage.class);
        signUpPage.fillFirstName("SeleniumName");
        signUpPage.fillLastName("SeleniumLastname");

        // --------- random elements

        Random random = new Random();
        String number = "545455" + (random.nextInt(999) + 100 );
        String rand_email = "Selenium" + (random.nextInt(9999) + 1000) + "@autotest.com";

        //----------fill fields and click

        signUpPage.fillPhone(number);

        signUpPage.fillEmail(rand_email);

        signUpPage.fillPass1("123456Aa");

        signUpPage.fillPass2("123456Aa");

        signUpPage.selectCurrency("eur");

        signUpPage.setCheckbox();

        signUpPage.clickSubmit();

        signUpPage.checkAlert();

        mainPage.checkCurrentLink("https://finmaxfx.com/en/deposit?registered=1");

    }
}
