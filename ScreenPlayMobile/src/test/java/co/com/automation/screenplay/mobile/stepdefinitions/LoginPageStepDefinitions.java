package co.com.automation.screenplay.mobile.stepdefinitions;

import co.com.automation.screenplay.mobile.tasks.EnterCredentials;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.actors.OnStage;

public class LoginPageStepDefinitions {

    @Given("^The (.*) is on the app$")
    public void theUserIsOnTheApp(String actor) {
        OnStage.theActorCalled(actor).entersTheScene();
    }

    @Given("^The (.*) enters its credentials$")
    public void theUserEntersItsCredentials(String actor) {
        OnStage.theActorCalled(actor).attemptsTo(EnterCredentials.enterCredentials());
    }

}
