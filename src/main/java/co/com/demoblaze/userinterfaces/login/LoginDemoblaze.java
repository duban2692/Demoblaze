package co.com.demoblaze.userinterfaces.login;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class LoginDemoblaze {

    public static final Target BUTTON_LOGIN = Target.the("BUTTON_LOGIN").located(By.id("login2"));
    public static final Target INPUT_USERNAME_LOGIN = Target.the("INPUT_USERNAME").located(By.xpath("//input[@id='loginusername']"));
    public static final Target INPUT_PASSWORD_LOGIN = Target.the("INPUT_PASSWORD").located(By.xpath("//input[@id='loginpassword']"));
    public static final Target CONFIRM_lOGIN = Target.the("CONFIRM_lOGIN").located(By.xpath("//button[contains(text(),'Log in')]"));
    public static final Target LOGGED_IN_USER = Target.the("LOGGED_IN_USER").located(By.xpath("//a[@id='nameofuser']"));

}
