package co.com.demoblaze.com.co.stepdefinitions;

import co.com.demoblaze.exceptions.CauseResultNotWaitedException;
import co.com.demoblaze.task.shopping.Shopping;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.questions.WebElementQuestion;

import static co.com.demoblaze.userinterfaces.shoppingproduct.PlaceOrder.CONFIRM_PURCHASE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ShoppingStepDefinitions {

    @Given("the user is on the homepage")
    public void theUserIsOnTheHomepage() {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("they select a mobile phone from the products list")
    public void theySelectAMobilePhoneFromTheProductsList() {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("they click on the {string} button")
    public void theyClickOnTheButton(String string) {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("the phone should be added to the shopping cart")
    public void thePhoneShouldBeAddedToTheShoppingCart() {
        theActorInTheSpotlight().attemptsTo(Shopping.Shopping());

    }

    @Then("they should see a confirmation message")
    public void theyShouldSeeAConfirmationMessage() {

        theActorInTheSpotlight().should(seeThat(WebElementQuestion.the(CONFIRM_PURCHASE), isVisible())
                .orComplainWith(CauseResultNotWaitedException.class, "Error en la compra del portal Demoblaze."));

    }
}
