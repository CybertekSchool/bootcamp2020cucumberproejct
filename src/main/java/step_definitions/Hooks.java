package step_definitions;

import io.cucumber.java.After;
import utilities.Driver;

public class Hooks {

    //cleanup part
    //will be executed after every test scenario
    //to close browser
    @After
    public void teardown() {
        System.out.println("Closing browser");
        Driver.closeDriver();
    }
}
