package homWork6;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private final String emailIdLocator = "auth_LoginInput";

    @FindBy(id = emailIdLocator)
    private WebElement emailField;

    @FindBy(id = "auth_PassInput")
    private WebElement passwordField;

    @FindBy(xpath = "//input[ @value='Войти в личный кабинет']")
    private WebElement signInButton;

    //главная страница
    @Step("Клик на кнопку Кабинет")
    public MainPage login(String login, String password) {
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id(emailIdLocator)));
        emailField.sendKeys(login);
        passwordField.sendKeys(password);
        signInButton.click();
        return new MainPage(driver);
    }
}
