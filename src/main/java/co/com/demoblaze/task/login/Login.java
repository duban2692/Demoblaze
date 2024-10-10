package co.com.demoblaze.task.login;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.demoblaze.userinterfaces.login.LoginDemoblaze.BUTTON_LOGIN;
import static co.com.demoblaze.userinterfaces.login.LoginDemoblaze.INPUT_USERNAME_LOGIN;
import static co.com.demoblaze.userinterfaces.login.LoginDemoblaze.INPUT_PASSWORD_LOGIN;
import static co.com.demoblaze.userinterfaces.login.LoginDemoblaze.CONFIRM_lOGIN;


import static net.serenitybdd.screenplay.Tasks.instrumented;


public class Login implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(BUTTON_LOGIN),
                Enter.theValue("usertest9998").into(INPUT_USERNAME_LOGIN),
                Enter.theValue("usertest9998").into(INPUT_PASSWORD_LOGIN),
                Click.on(CONFIRM_lOGIN));
    }

    public static Login into() {
        return instrumented(Login.class);
    }
}
