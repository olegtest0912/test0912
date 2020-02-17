package depositFinmaxFX;

import com.promo.finmaxfx.WebElementSettings;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class DepositFX extends WebElementSettings {
    @Test
    public void depositFXVisa() {
        LoginFX loginFX = PageFactory.initElements(driver,LoginFX.class);
        loginFX.loginToFX("olegtest0912@gmail.com","Oleg12345");

        ClickPayment clickPayment = PageFactory.initElements(driver,ClickPayment.class);
        clickPayment.clicktoDeposit();
        clickPayment.checkDeposit("visa");
        clickPayment.checkPaysystem("https://finmaxfx.com/ru/deposit");
    }
    @Test
    public void depositFXMasterCard() {
        LoginFX loginFX = PageFactory.initElements(driver,LoginFX.class);
        loginFX.loginToFX("olegtest0912@gmail.com","Oleg12345");

        ClickPayment clickPayment = PageFactory.initElements(driver,ClickPayment.class);
        clickPayment.clicktoDeposit();
        clickPayment.checkDeposit("master");
        clickPayment.checkPaysystem("https://finmaxfx.com/ru/deposit");
    }
    @Test
    public void depositFXMir() {
        LoginFX loginFX = PageFactory.initElements(driver,LoginFX.class);
        loginFX.loginToFX("olegtest0912@gmail.com","Oleg12345");

        ClickPayment clickPayment = PageFactory.initElements(driver,ClickPayment.class);
        clickPayment.clicktoDeposit();
        clickPayment.checkDeposit("mir");
        clickPayment.checkPaysystem("https://finmaxfx.com/ru/deposit");
    }
}
