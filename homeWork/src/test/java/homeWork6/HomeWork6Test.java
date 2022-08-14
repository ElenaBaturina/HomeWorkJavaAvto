package homeWork6;

import homWork6.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork6Test {
    WebDriver driver;

    @BeforeAll
    static void registerDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void initDriver() {
        driver = new ChromeDriver();
        driver.get("https://argoclassic.ru");
    }

    @Test
    void addingAnItemToTheCartTest() {
        new MainPage(driver).clickSingInButton()
                .login("LIABaturina@yandex.ru", "leonteva");
        new MainMenuBlock(driver).clickGoMainPage();
        new MainMenuBlock(driver).clickCatalogNewItems();
        new ManCollection(driver).clickJaket();
        new ManCollection(driver).clickSizeSelection();
        new ManCollection(driver).addingAnItemToTheCart();

    }

    @Test
    void cleaningTheTrashTest() {
        new MainPage(driver).clickSingInButton()
                .login("LIABaturina@yandex.ru", "leonteva");
        driver.get("https://argoclassic.ru/cart");
        new TransitionToTheOrder(driver).clickBasket();
        new TransitionToTheOrder(driver).clickOrders();
        new CleaningTheTrash(driver).clickCleaning();
        new CleaningTheTrash(driver).clickConfirmationOfDeletion();

    }

    @Test
    void menSizeChartTest() {
        new SizeChart(driver).clickSizeChart();
    }

    @AfterEach
    void killBrowser() {
        driver.quit();
    }
}
