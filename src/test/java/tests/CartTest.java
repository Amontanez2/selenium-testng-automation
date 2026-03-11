package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.InventoryPage;
import pages.CartPage;
import utils.BaseTest;

public class CartTest extends BaseTest {

    @Test
    public void agregarProductoAlCarrito(){

        LoginPage loginPage = new LoginPage(driver);
        InventoryPage inventoryPage = new InventoryPage(driver);
        CartPage cartPage = new CartPage(driver);

        loginPage.login("standard_user","secret_sauce");

        inventoryPage.agregarProducto();

        cartPage.irAlCarrito();

        Assert.assertTrue(cartPage.productoEnCarrito());
    }
}