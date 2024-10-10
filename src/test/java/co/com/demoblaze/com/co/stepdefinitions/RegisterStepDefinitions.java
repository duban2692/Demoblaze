package co.com.demoblaze.com.co.stepdefinitions;

import co.com.demoblaze.exceptions.CauseResultNotWaitedException;
import co.com.demoblaze.task.register.Register;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import org.openqa.selenium.WebDriver;

import static co.com.demoblaze.userinterfaces.login.MenuLogin.HOME;
import static co.com.demoblaze.utils.Utilities.getRandomDriver;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getWebdriverManager;

public class RegisterStepDefinitions {

    static WebDriver driver = getWebdriverManager().getWebdriver(getRandomDriver());


    @When("they enter their registration information")
    public void theyEnterTheirRegistrationInformation() {
        theActorInTheSpotlight().attemptsTo(Register.register());
    }

    @Then("they should see a message indicating successful sign-up")
    public void theyShouldSeeAMessageIndicatingSuccessfulSignUp() {

        theActorInTheSpotlight().should(seeThat(WebElementQuestion.the(HOME), isVisible())
                .orComplainWith(CauseResultNotWaitedException.class, "Error en el Menú pagina Demoblaze."));

    }

}
