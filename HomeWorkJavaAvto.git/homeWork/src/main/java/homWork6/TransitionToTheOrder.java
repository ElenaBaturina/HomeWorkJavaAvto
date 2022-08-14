package homWork6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class TransitionToTheOrder extends BasePage {

    public TransitionToTheOrder(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "cartModule")
    private WebElement basket; //клик на корзину

    public void clickBasket() {
        actions.moveToElement(basket)
                .build()
                .perform();
        webDriverWait.until(ExpectedConditions.visibilityOf(basket));
        basket.click();
    }


    @FindBy(xpath = "//a[@href=\"/cart\"]")
    private WebElement goToCart;// перейти в корзину

    public void clickOrders() {
        actions.moveToElement(goToCart)
                .build()
                .perform();
        webDriverWait.until(ExpectedConditions.visibilityOf(goToCart));
        goToCart.click();

    }


}
