package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ViewAllOrders extends BasePage {

    @FindBy(tagName = "h2")
    public WebElement tableTitleElement;
}
