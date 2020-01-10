package step_definitions;

import io.cucumber.java.en.*;
import pages.LoginPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class LoginStepDefinitions {
    //this is how we create page objects
    LoginPage loginPage = new LoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() throws InterruptedException {
        System.out.println("user is on the login page");
        String url = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(url);//to open login page
        Thread.sleep(2000);
    }

    @Then("user logs in")
    public void user_logs_in() throws InterruptedException {
        System.out.println("user logs in");
        String username = ConfigurationReader.getProperty("user_name");
        String password = ConfigurationReader.getProperty("password");
        loginPage.login(username, password);
        Thread.sleep(2000);
    }

}
