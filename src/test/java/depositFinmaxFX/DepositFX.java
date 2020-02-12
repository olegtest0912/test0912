package depositFinmaxFX;

import com.promo.finmaxfx.WebElementSettings;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

public class DepositFX extends WebElementSettings {
    @Test
    public void depositFX(){
        LoginFX loginFX = PageFactory.initElements(driver,LoginFX.class);
        loginFX.loginToFX("olegtest0912@gmail.com","Oleg12345");

        ClickPayment clickPayment = PageFactory.initElements(driver,ClickPayment.class);
        clickPayment.clicktoDeposit();
        clickPayment.checkDeposit();
    }
}
