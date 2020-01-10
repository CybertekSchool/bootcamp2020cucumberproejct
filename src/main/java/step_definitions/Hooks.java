package step_definitions;

import io.cucumber.java.After;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

public class Hooks {

    @After
    public void teardown() {
        System.out.println("Closing browser");
        Driver.getDriver().quit();
    }
}
