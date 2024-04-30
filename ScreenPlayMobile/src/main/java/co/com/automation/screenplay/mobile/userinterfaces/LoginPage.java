package co.com.automation.screenplay.mobile.userinterfaces;

import co.com.devco.automation.mobile.locator.Locator;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static co.com.devco.automation.mobile.locator.ElementFinder.theElementBy;
import static co.com.devco.automation.mobile.locator.Locator.locator;

public class LoginPage {
    //Nota se puede usar lo mismo para IOS
    //public static final Locator TITLE_LOG_IN_LOCATOR = locator()
    //        .withAndroidId("com.lemon42.flashmobilecol:id/iniciar_sesion_text")
    //        .withAndroidAccesibilityId("1");
    //public static final Target TITLE_LOG_IN = Target.the("Title Activity Log In").located(theElementBy(TITLE_LOG_IN_LOCATOR));
//
    //public static final Locator INPUT_NAME_LOCATOR = locator()
    //        .withAndroidId("com.lemon42.flashmobilecol:id/login_email_field")
    //        .withAndroidAccesibilityId("1");
    //public static final Target INPUT_NAME = Target.the("Text box name").located(theElementBy(INPUT_NAME_LOCATOR));

    public static final Target TITLE_LOG_IN = Target.the("Title Activity Log In").located(By.id("com.lemon42.flashmobilecol:id/iniciar_sesion_text"));
    public static final Target INPUT_NAME = Target.the("Text box name").located(By.id("com.lemon42.flashmobilecol:id/login_email_field"));

}
