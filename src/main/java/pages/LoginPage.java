package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(id = "ctl00_MainContent_username")
    public WebElement userNameInputBoxElement;

    @FindBy(id = "ctl00_MainContent_password")
    public WebElement passwordInputBoxElement;

    public void login(String username, String password){
        userNameInputBoxElement.sendKeys(username);
        passwordInputBoxElement.sendKeys(password, Keys.ENTER);
    }
}
