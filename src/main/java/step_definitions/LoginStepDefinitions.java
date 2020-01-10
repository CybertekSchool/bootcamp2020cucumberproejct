package step_definitions;

import io.cucumber.java.en.*;
import utilities.ConfigurationReader;
import utilities.Driver;

public class LoginStepDefinitions {

    @Given("user is on the login page")
    public void user_is_on_the_login_page() throws InterruptedException {
        System.out.println("user is on the login page");
        String url = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(url);//to open login page
        Thread.sleep(1000);
    }

    @Then("user logs in")
    public void user_logs_in() {
        System.out.println("user logs in");
    }

}
