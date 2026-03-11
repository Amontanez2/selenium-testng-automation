package tests;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.InventoryPage;
import pages.CartPage;
import pages.CheckoutPage;
import utils.BaseTest;

public class CheckoutTest extends BaseTest {

    @Test
    public void checkoutCompleto(){

        LoginPage loginPage = new LoginPage(driver);
        InventoryPage inventoryPage = new InventoryPage(driver);
        CartPage cartPage = new CartPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);

        loginPage.login("standard_user","secret_sauce");

        inventoryPage.agregarProducto();

        cartPage.abrirCarrito();

        cartPage.hacerCheckout();

        checkoutPage.llenarDatos("Juan","Perez","15001");
    }
}