package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public abstract class BasePage {

    public BasePage() {
        //makes @FindBy work
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
