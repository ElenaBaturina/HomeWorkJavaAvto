package homWork6;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SizeChart extends BasePage{

    public SizeChart(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@href=\"/tablica-muzhskih-razmerov\" and @class=\"menu-list__link menu-list__link--footer \"]")
    private WebElement sizeChart;

    public void clickSizeChart(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(
                By.xpath("/html/body/footer/div/div[1]/div[1]/div")));
        webDriverWait.until(ExpectedConditions.visibilityOf(sizeChart));
        sizeChart.click();
    }
}
