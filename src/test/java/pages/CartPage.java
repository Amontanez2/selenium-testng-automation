
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

    WebDriver driver;

    By cartIcon = By.className("shopping_cart_link");
    By cartItem = By.className("cart_item");

    public CartPage(WebDriver driver){
        this.driver = driver;
    }

    public void irAlCarrito(){
        driver.findElement(cartIcon).click();
    }

    public boolean productoEnCarrito(){
        return driver.findElement(cartItem).isDisplayed();
    }

}