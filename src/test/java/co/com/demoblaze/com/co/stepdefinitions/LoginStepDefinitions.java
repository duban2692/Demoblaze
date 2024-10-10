package co.com.demoblaze.com.co.stepdefinitions;

import co.com.demoblaze.exceptions.CauseResultNotWaitedException;
import co.com.demoblaze.task.login.InitiationWeb;
import co.com.demoblaze.task.login.Login;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import org.openqa.selenium.WebDriver;

import static co.com.demoblaze.userinterfaces.login.LoginDemoblaze.LOGGED_IN_USER;
import static co.com.demoblaze.utils.Utilities.getRandomDriver;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getWebdriverManager;


public class LoginStepDefinitions {

    static WebDriver driver = getWebdriverManager().getWebdriver(getRandomDriver());

    @Before
    public void configurationsActor() {

        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Duban").can(BrowseTheWeb.with(driver));

    }

    @Given("the transactional user navigates to the login page")
    public void theTransactionalUserNavigatesToTheLoginPage() {
        theActorInTheSpotlight().attemptsTo(InitiationWeb.url());

    }

    @When("they enter their credentials")
    public void theyEnterTheirCredentials() {
        theActorInTheSpotlight().attemptsTo(Login.into());

    }

    @Then("they should be logged in successfully")
    public void theyShouldBeLoggedInSuccessfully() {

        theActorInTheSpotlight().should(seeThat(WebElementQuestion.the(LOGGED_IN_USER), isVisible())
                .orComplainWith(CauseResultNotWaitedException.class, "Error al usuario en la  pagina Demoblaze."));


    }

}
