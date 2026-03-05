package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class InventoryPage {

    private WebDriver driver;
    private WebDriverWait wait;

    private By title = By.className("title");

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public String obtenerTitulo() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(title));
        return driver.findElement(title).getText();
    }
}
