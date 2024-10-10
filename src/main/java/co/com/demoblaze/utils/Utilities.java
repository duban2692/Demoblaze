package co.com.demoblaze.utils;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.ResourceBundle;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class Utilities {

    private static WebDriver driver;

    public Utilities(WebDriver driver) {
        Utilities.driver = driver;
    }

    private static final Logger LOGGER = LoggerFactory.getLogger(Utilities.class);

    public static final ResourceBundle SERENITY = ResourceBundle.getBundle("environment");

    public static String getEnvironments() {

        return SERENITY.getString("environment");
    }

    public static String getRandomDriver() {
        String[] drivers = {"chrome", "firefox", "edge"};
        int r = (int) Math.floor(Math.random() * drivers.length);
        return drivers[r];
    }

    public static void acceptAlert() {
        try {

            getDriver().switchTo().alert().accept();

        } catch (Exception e) {

            System.out.println("No hay alerta para aceptar: " + e.getMessage());
        }
    }
}
