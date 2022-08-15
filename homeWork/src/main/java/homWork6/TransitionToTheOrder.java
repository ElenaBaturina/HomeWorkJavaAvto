package homWork6;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
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

    @Step("Нажимаем на кнопку Корзина")
    public void clickBasket() {
        actions.moveToElement(basket)
                .build()
                .perform();
        webDriverWait.until(ExpectedConditions.visibilityOf(basket));
        basket.click();
        /*webDriverWait
                .until(ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//a[@href=\"/cart\"]")));
        Assertions.assertEquals(driver.findElement(By.xpath("//a[@href=\"/cart\"]")).isDisplayed(),true);
        driver.findElement(
                By.xpath("//a[@href=\"/cart\"]")).click();*/
    }


    @FindBy(xpath = "//a[@href=\"/cart\"]")
    private WebElement goToCart;// перейти в корзину

    @Step("Подтверждаем переход в Корзину")
    public void clickOrders() {
        actions.moveToElement(goToCart)
                .build()
                .perform();
        webDriverWait.until(ExpectedConditions.visibilityOf(goToCart));
        goToCart.click();
        /*webDriverWait
                .until(ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//div[@class=\"col-12 pb-3\"]/h1")));
        Assertions.assertEquals(driver.findElement(By.xpath("//div[@class=\"col-12 pb-3\"]/h1")).isDisplayed(),true);
        driver.findElement(
                By.xpath("//div[@class=\"col-12 pb-3\"]/h1")).click();*/

    }


}
