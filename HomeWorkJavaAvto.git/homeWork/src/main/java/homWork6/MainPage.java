package homWork6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {

    @FindBy(xpath = "//i[@class=\"far fa-user\"]")
    private WebElement signInButton; //войти в лк

    public MainPage(WebDriver driver) {
        super(driver);
        mainMenuBlock = new MainMenuBlock(driver);
    }

    public MainMenuBlock mainMenuBlock;

    public LoginPage clickSingInButton() {
        signInButton.click();
        return new LoginPage(driver);
    }
}
