package depositFinmaxFX;

import com.promo.finmaxfx.WebElementSettings;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class DepositFXGermany extends WebElementSettings {
    //paysystems
    String certus = "https://api.certus.finance/";
    String accentpay = "https://zwmxm.playmeagame.com/";
    String paymentCenter = "https://paygatedirect.com/";
    String payboutique = "https://pay.qiwi.com/";
    String xpate = "https://m.xpate.com";

    //user data germany
    String login = "Selenium1987@autotest.com";
    String password = "123456Aa";


    @Test
    public void depositFXVisa() {
        LoginFX loginFX = PageFactory.initElements(driver,LoginFX.class);
        loginFX.loginToFX(login,password);
        ClickPayment clickPayment = PageFactory.initElements(driver,ClickPayment.class);
        clickPayment.clicktoDeposit();
        clickPayment.checkDeposit("visa",250);
        clickPayment.checkPaysystem(certus);
    }
    @Test
    public void depositFXVisa2() {
        LoginFX loginFX = PageFactory.initElements(driver,LoginFX.class);
        loginFX.loginToFX(login,password);
        ClickPayment clickPayment = PageFactory.initElements(driver,ClickPayment.class);
        clickPayment.clicktoDeposit();
        clickPayment.checkDeposit("visa",1000);
        clickPayment.checkPaysystem(paymentCenter);
    }

    @Test
    public void depositFXMasterCard() {
        LoginFX loginFX = PageFactory.initElements(driver,LoginFX.class);
        loginFX.loginToFX(login,password);
        ClickPayment clickPayment = PageFactory.initElements(driver,ClickPayment.class);
        clickPayment.clicktoDeposit();
        clickPayment.checkDeposit("master",250);
        clickPayment.checkPaysystem(certus);
    }
    @Test
    public void depositFXMasterCard2() {
        LoginFX loginFX = PageFactory.initElements(driver,LoginFX.class);
        loginFX.loginToFX(login,password);
        ClickPayment clickPayment = PageFactory.initElements(driver,ClickPayment.class);
        clickPayment.clicktoDeposit();
        clickPayment.checkDeposit("master",1000);
        clickPayment.checkPaysystem(paymentCenter);
    }

}

