package homWork6;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ManCollection extends BasePage{
    public ManCollection(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//img[@src=\"/timthumb.php?src=/uploads/gallery/42/42ced0e566b27cebea85ffb889297706.jpg&w=422&h=458&zc=1\"]")
    private WebElement choosingAJacket; // выбор куртки

    @Step("Нажимаем на выборанную позицию в каталоге")
    public void clickJaket() {
        webDriverWait.until(ExpectedConditions.visibilityOf(choosingAJacket));
        choosingAJacket.click();
        /*Assertions.assertEquals(driver.findElement(By.xpath("//div[@class=\"props-container\"]/h1")).isDisplayed(),true);
        driver.findElement(
                By.xpath("//div[@class=\"props-container\"]/h1")).click();*/
    }

    @FindBy(xpath = "//input[@name=\"Good[3682][14962]\"]/ancestor::*/span[@class=\"plus\"]")
    private WebElement sizeSelection; // выбор размера

    @Step("Выбираем размер")
    public ManCollection clickSizeSelection() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//span[.='Наличие:']")));
        webDriverWait.until(ExpectedConditions.visibilityOf(sizeSelection));
        sizeSelection.click();
        return this;
    }

    @FindBy(xpath = "//span[@data-empty=\"В корзину\"]")
    private WebElement intoABasket; //в корзину

    @Step("Добавляем заказ в корзину")
    public void addingAnItemToTheCart() {
        webDriverWait.until(ExpectedConditions.visibilityOf(intoABasket));
        intoABasket.click();
        webDriverWait
                .until(ExpectedConditions.visibilityOfElementLocated(
                        By.id("cart-popup-heading")));
        Assertions.assertEquals(driver.findElement(By.id("cart-popup-heading")).isDisplayed(),true);
        driver.findElement(
                By.id("cart-popup-heading")).click();
    }



}
