package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {

    WebDriver driver;

    By checkoutButton = By.id("checkout");

    public CheckoutPage(WebDriver driver){
        this.driver = driver;
    }

    public void iniciarCheckout(){
        driver.findElement(checkoutButton).click();
    }
}