package homeWork3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Random;

public class ArgoTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://argoclassic.ru/account");

        WebElement loginForm = driver.findElement(By.id("auth_LoginInput"));
        loginForm.sendKeys("LIABaturina@yandex.ru");
        driver.findElement(By.id("auth_PassInput")).sendKeys("leonteva");
        driver.findElement(By.xpath("//input[ @value='Войти в личный кабинет']")).click(); // вошли в лк

        driver.navigate().refresh();
        driver.findElement(By.xpath("//div/span/i[@class=\"fas fa-bars\"]")).click(); //меню
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@class=\"menu-list__link \" and @href=\"/novinki\"]")).click(); //новинки
        Thread.sleep(2000);
        driver.findElement(By.xpath("//img[@src=\"/timthumb.php?src=/uploads/gallery/db/db4c9899727cdfcb3b259ef992f51e99.jpg&w=422&h=458&zc=1\"]")).click(); //выбор куртки
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@href=\"/catalog/zhenshhini/kurtki/kurtka-J-402-t-vishnja\"]")).click(); //выбор цвета
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name=\"Good[3519][14282]\" and @data-good_id=\"3519\"]")).sendKeys("1"); // выбор размера
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@data-empty=\"В корзину\"]")).click(); //добавиление в корзину
        driver.navigate().refresh();
        driver.findElement(By.xpath("//*[@id=\"cartModule\"]/div[1]/div[2]/i")).click(); // корзина
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@href=\"/cart\"]")).click();//переход в корзину
        driver.navigate().refresh();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[@class=\"cart-button-clear-button\"]")).click(); //очистить корзину
        driver.findElement(By.id("cart-delete-popup-ok")).click(); //удаление
        driver.findElement(By.xpath("//i[@class=\"far fa-user\"]")).click(); //переход в лк
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@href=\"/account?auth_logout=true\"]")).click(); //выход из лк
        Thread.sleep(5000);

        driver.quit();

    }
}
