package co.com.demoblaze.task.shopping;


import co.com.demoblaze.userinterfaces.shoppingproduct.PlaceOrder;
import co.com.demoblaze.userinterfaces.shoppingproduct.ShoppingTest;
import co.com.demoblaze.utils.Utilities;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.demoblaze.userinterfaces.shoppingproduct.PlaceOrder.*;


public class Shopping implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(
                Click.on(ShoppingTest.PHONE_SAMSUNG),
                Click.on(ShoppingTest.ADD_TO_CART));


        Utilities.acceptAlert();

        try {
            Thread.sleep(15);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        actor.attemptsTo(
                Click.on(ShoppingTest.BUTTON_CART),
                Click.on(ShoppingTest.PLACE_ORDER));

        actor.attemptsTo(
                Enter.theValue("test").into(NAME),
                Enter.theValue("Colombia").into(COUNTRY),
                Enter.theValue("Medellin").into(CITY),
                Enter.theValue("VISA").into(CREDIT_CARD),
                Enter.theValue("OCTUBRE").into(MONTH),
                Enter.theValue("2024").into(YEAR),
                Click.on(PlaceOrder.PURCHASE));

    }

    public static Performable Shopping() {
        return Tasks.instrumented(Shopping.class);
    }
}
