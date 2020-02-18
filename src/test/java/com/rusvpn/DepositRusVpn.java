package com.rusvpn;

import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

public class DepositRusVpn extends SettingsRusVpn {
    @Test
    public void loginToRusVpn(){
        LoginRusVpn loginRusVpn = PageFactory.initElements(driver,LoginRusVpn.class);
        loginRusVpn.loginToRusVpn("imadforit@gmail.com","121980");
    }
}
