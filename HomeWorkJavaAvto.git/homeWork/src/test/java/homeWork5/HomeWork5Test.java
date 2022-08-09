package homeWork5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class HomeWork5Test {
    WebDriver driver;
    WebDriverWait webDriverWait;
    Actions actions;

    private final static String ARGOCLASSIC_URL = "https://argoclassic.ru";

    @BeforeAll
    static void registerDriver(){
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setupBrowser(){
        driver = new ChromeDriver();
        webDriverWait  = new WebDriverWait(driver, Duration.ofSeconds(5));
        actions = new Actions(driver);
        driver.get(ARGOCLASSIC_URL);
    }

    @Test
    void addingAnOrderToTheCartTest() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(
                By.xpath("//p[ .='мужская коллекция']")));
        //прокрутка до Мужской коллекции

        webDriverWait
                .until(ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//p[ .='мужская коллекция']"))); // ждем загрузку
       Assertions.assertEquals(driver.findElement(By.xpath("//p[ .='мужская коллекция']")).isDisplayed(),true);
        driver.findElement(
               By.xpath("//p[ .='мужская коллекция']")).click(); //переходим в каталог

        webDriverWait
                .until(ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//img[@src=\"/timthumb.php?src=/uploads/gallery/42/42ced0e566b27cebea85ffb889297706.jpg&w=422&h=458&zc=1\"]")));
        driver.findElement(
                By.xpath("//img[@src=\"/timthumb.php?src=/uploads/gallery/42/42ced0e566b27cebea85ffb889297706.jpg&w=422&h=458&zc=1\"]")).click();
        //переходим на позицию куртка

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//span[.='Наличие:']")));
        // прокрутка до наличия

        webDriverWait
                .until(ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//input[@name=\"Good[3682][14962]\"]/ancestor::*/span[@class=\"plus\"]")));
        driver.findElement(
                By.xpath("//input[@name=\"Good[3682][14962]\"]/ancestor::*/span[@class=\"plus\"]")).click();
        //выбор размера

        webDriverWait
                .until(ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//span[@data-empty=\"В корзину\"]")));
        driver.findElement(
                By.xpath("//span[@data-empty=\"В корзину\"]")).click();
        //добавление в корзину

        driver.get("https://argoclassic.ru/cart");
        webDriverWait
                .until(ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//img[@src=\"/timthumb.php?src=/uploads/gallery/42/42ced0e566b27cebea85ffb889297706.jpg&w=800&h=800&zc=2\"]")));
        Assertions.assertEquals(driver.findElement(
                By.xpath("//img[@src=\"/timthumb.php?src=/uploads/gallery/42/42ced0e566b27cebea85ffb889297706.jpg&w=800&h=800&zc=2\"]")).isDisplayed(),true);
        driver.findElement(
                By.xpath("//img[@src=\"/timthumb.php?src=/uploads/gallery/42/42ced0e566b27cebea85ffb889297706.jpg&w=800&h=800&zc=2\"]")).click();
        //проверка корзины

    }

    @Test
    void addingAProductToFavoritesTest() {
       ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(
               By.xpath("//p[ .='мужская коллекция']")));
       //прокрутка до Мужской коллекции

       webDriverWait
               .until(ExpectedConditions.visibilityOfElementLocated(
                       By.xpath("//p[ .='мужская коллекция']"))); // ждем загрузку
       Assertions.assertEquals(driver.findElement(By.xpath("//p[ .='мужская коллекция']")).isDisplayed(),true);
       driver.findElement(
               By.xpath("//p[ .='мужская коллекция']")).click(); //переходим в каталог

       webDriverWait
               .until(ExpectedConditions.visibilityOfElementLocated(
                       By.xpath("//img[@src=\"/timthumb.php?src=/uploads/gallery/42/42ced0e566b27cebea85ffb889297706.jpg&w=422&h=458&zc=1\"]")));
       Assertions.assertEquals(driver.findElement(By.xpath("//img[@src=\"/timthumb.php?src=/uploads/gallery/42/42ced0e566b27cebea85ffb889297706.jpg&w=422&h=458&zc=1\"]")).isDisplayed(),true);
       driver.findElement(
               By.xpath("//img[@src=\"/timthumb.php?src=/uploads/gallery/42/42ced0e566b27cebea85ffb889297706.jpg&w=422&h=458&zc=1\"]")).click();
       //переходим на позицию куртка

       ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//span[.='Наличие:']")));
       // прокрутка до наличия

       webDriverWait
               .until(ExpectedConditions.visibilityOfElementLocated(
                       By.xpath("//span[@data-id=\"3682\"]")));
       driver.findElement(
               By.xpath("//span[@data-id=\"3682\"]")).click();
       //добавление в избранное

       driver.get("https://argoclassic.ru/favourites");
       webDriverWait
               .until(ExpectedConditions.visibilityOfElementLocated(
                       By.xpath("//div[@class=\"lc-description\"]")));
       Assertions.assertEquals(driver.findElement(
               By.xpath("//div[@class=\"lc-description\"]")).isDisplayed(),true);
       driver.findElement(
               By.xpath("//div[@class=\"lc-description\"]")).click();
       //проверка избранного
   }

    @Test
    void menSizeChartTest(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(
                By.xpath("/html/body/footer/div/div[1]/div[1]/div")));
        //прокрутка до компания

        webDriverWait
                .until(ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//a[@href=\"/tablica-muzhskih-razmerov\" and @class=\"menu-list__link menu-list__link--footer \"]")));
        driver.findElement(
                By.xpath("//a[@href=\"/tablica-muzhskih-razmerov\" and @class=\"menu-list__link menu-list__link--footer \"]")).click();
        //переход в таблицу

        webDriverWait
                .until(ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//*[@id=\"center-part\"]//h1")));
        Assertions.assertEquals(driver.findElement(By.xpath("//*[@id=\"center-part\"]//h1")).isDisplayed(),true);
        driver.findElement(
                By.xpath("//*[@id=\"center-part\"]//h1")).click();
        //проверка таблицы
    }

    @AfterEach
    void quitBrowser() {
        driver.quit();
    }
}
