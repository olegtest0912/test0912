package com.rusvpn;

import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

public class DepositRusVpn extends SettingsRusVpn {
    String[] defaultPaySystem = {"card","https://www2.1stpayments.net/ccdata.php"};
    String[] usa = {"usa","https://pay.fasterpay.com/payment/complete-order"};
    String[] paypal = {"paypal","https://www.paypal.com/cgi-bin/webscr"};

    String years_3 = "active t-3_year";
    String month_1 = "unactive t-1_month";
    String year_1 = "unactive t-1_year";
    @Test
    public void CheckDefault1years(){
        LoginRusVpn loginRusVpn = PageFactory.initElements(driver,LoginRusVpn.class);
        loginRusVpn.loginToRusVpn("imadforit@gmail.com","121980");
        CabinetRusVpn cabinetRusVpn = PageFactory.initElements(driver,CabinetRusVpn.class);
        cabinetRusVpn.clickToCabinet();
        cabinetRusVpn.selectDatePlan(year_1);
        cabinetRusVpn.clickPayButtons(defaultPaySystem[0]);
        cabinetRusVpn.checkPaySystems(defaultPaySystem[1]);
    }
    @Test
    public void CheckDefault3years(){
        LoginRusVpn loginRusVpn = PageFactory.initElements(driver,LoginRusVpn.class);
        loginRusVpn.loginToRusVpn("imadforit@gmail.com","121980");
        CabinetRusVpn cabinetRusVpn = PageFactory.initElements(driver,CabinetRusVpn.class);
        cabinetRusVpn.clickToCabinet();
        cabinetRusVpn.selectDatePlan(years_3);
        cabinetRusVpn.clickPayButtons(defaultPaySystem[0]);
        cabinetRusVpn.checkPaySystems(defaultPaySystem[1]);
    }
}
