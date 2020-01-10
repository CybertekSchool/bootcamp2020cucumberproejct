package step_definitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.ViewAllOrders;

public class ViewAllOrdersStepDefinitions {
    ViewAllOrders viewAllOrders = new ViewAllOrders();

    //And user verifies that "List of All Orders" table-title is displayed
    @Then("user verifies that {string} table-title is displayed")
    public void user_verifies_that_table_title_is_displayed(String string) {
        String actual = viewAllOrders.tableTitleElement.getText().trim();
        Assert.assertEquals(string, actual);
    }

}
