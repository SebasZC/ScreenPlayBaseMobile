package co.com.automation.screenplay.mobile.stepdefinitions;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;

import java.util.logging.Level;
import java.util.logging.Logger;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

public class Hooks {

    @Managed(driver = "Appium")
    public static WebDriver driver;

    @Before
    public void prepareStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @After
    public void logOut(){
        try {
            driver.quit();
        }catch (Exception e){
            Logger.getAnonymousLogger().log(Level.WARNING, "Could not class driver. Appium driver not found",e);
        }
    }
}
