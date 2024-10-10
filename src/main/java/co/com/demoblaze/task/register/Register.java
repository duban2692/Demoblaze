package co.com.demoblaze.task.register;

import co.com.demoblaze.userinterfaces.login.RegisterUser;
import co.com.demoblaze.utils.Utilities;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.demoblaze.userinterfaces.login.RegisterUser.*;

public class Register implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(RegisterUser.BUTTON_SIGN_UP),
                Enter.theValue("usertest2999").into(INPUT_USERNAME),
                Enter.theValue("usertest2999").into(INPUT_PASSWORD),
                Click.on(CONFIRM_SIGN_UP));

        Utilities.acceptAlert();

    }

    public static Performable register() {
        return Tasks.instrumented(Register.class);
    }
}
