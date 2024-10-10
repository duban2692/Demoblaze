package co.com.demoblaze.userinterfaces.login;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class MenuLogin {

    public static final Target HOME = Target.the("HOME").located(By.xpath(" //body/nav[@id='narvbarx']/div[@id='navbarExample']/ul[1]/li[1]/a[1]"));
    
}
