package homWork6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class MainMenuBlock extends BasePage {

    public MainMenuBlock(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[@class=\"hamburger hamburger__button hamburger__mobile-menu\"]//i[@class=\"fas fa-bars\"]")
    private WebElement goMainPage; //меню

    public void clickGoMainPage() {
        actions.moveToElement(goMainPage)
                .build()
                .perform();
        webDriverWait.until(ExpectedConditions.visibilityOf(goMainPage));
        goMainPage.click();

    }

    @FindBy(xpath = "//li[@class=\"menu-list__item menu-list__item--header\"]//a[@href=\"/novinki\"]")
    private WebElement catalogNewItems; // каталог новинки

    public ManCollection clickCatalogNewItems() {
        actions.moveToElement(catalogNewItems)
                .build()
                .perform();
        webDriverWait.until(ExpectedConditions.visibilityOf(catalogNewItems));
        catalogNewItems.click();
        return new ManCollection(driver);
    }
}
