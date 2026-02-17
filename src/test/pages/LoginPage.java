package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    // Localizadores
    private By username = By.id("user-name");
    private By password = By.id("password");
    private By loginButton = By.id("login-button");

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Acciones
    public void ingresarUsuario(String user) {
        driver.findElement(username).sendKeys(user);
    }

    public void ingresarPassword(String pass) {
        driver.findElement(password).sendKeys(pass);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }

    public void login(String user, String pass) {
        ingresarUsuario(user);
        ingresarPassword(pass);
        clickLogin();
    }

    private By errorMessage = By.cssSelector("h3[data-test='error']");

    public String obtenerMensajeError() {
        return driver.findElement(errorMessage).getText();
    }

}
