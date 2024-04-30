package co.com.automation.screenplay.mobile.tasks;

import co.com.automation.screenplay.mobile.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class EnterCredentials implements Task {
    @Override
    public <T extends Actor> void performAs(T t) {
        t.attemptsTo(
                WaitUntil.the(LoginPage.TITLE_LOG_IN, isPresent()).forNoMoreThan(10).seconds(),
                Enter.theValue("Sebas001").into(LoginPage.INPUT_NAME)
        );
    }
    public static EnterCredentials enterCredentials(){
        return Tasks.instrumented(EnterCredentials.class);
    }
}
