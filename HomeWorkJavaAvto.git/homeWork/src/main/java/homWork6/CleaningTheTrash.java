package homWork6;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CleaningTheTrash extends BasePage {

    public CleaningTheTrash(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[@class=\"cart-button-clear-button\"]")
    private WebElement cleaning; //очистить корзину

    @Step("Очистить корзину")
    public void clickCleaning() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement
                (By.xpath("//img[@src=\"/timthumb.php?src=/uploads/gallery/42/42ced0e566b27cebea85ffb889297706.jpg&w=800&h=800&zc=2\"]")));
        actions.moveToElement(cleaning)
                .build()
                .perform();
        webDriverWait.until(ExpectedConditions.visibilityOf(cleaning));
        cleaning.click();
    }

    @FindBy(id = "cart-delete-popup-ok")
    private WebElement confirmationOfDeletion; //подтверждение

    @Step("Подтвердить Очистку корзины")
    public void clickConfirmationOfDeletion() {
        actions.moveToElement(confirmationOfDeletion)
                .build()
                .perform();
        webDriverWait.until(ExpectedConditions.visibilityOf(confirmationOfDeletion));
        confirmationOfDeletion.click();
    }

}
