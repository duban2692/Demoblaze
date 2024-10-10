package co.com.demoblaze.userinterfaces.login;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class RegisterUser {

    public static final Target BUTTON_SIGN_UP = Target.the("BUTTON_SIGN_UP").located(By.id("signin2"));
    public static final Target INPUT_USERNAME = Target.the("INPUT_USERNAME").located(By.xpath("//input[@id='sign-username']"));
    public static final Target INPUT_PASSWORD = Target.the("INPUT_PASSWORD").located(By.xpath("//input[@id='sign-password']"));
    public static final Target CONFIRM_SIGN_UP = Target.the("CONFIRM_SIGN_UP").located(By.xpath("//button[contains(text(),'Sign up')]"));

}
