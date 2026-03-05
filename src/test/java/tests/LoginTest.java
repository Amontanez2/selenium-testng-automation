package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.InventoryPage;
import utils.BaseTest;
import org.testng.annotations.DataProvider;



public class LoginTest extends BaseTest {


    @Test
    public void loginExitoso() {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        InventoryPage inventoryPage = new InventoryPage(driver);
        String titulo = inventoryPage.obtenerTitulo();

        Assert.assertEquals(titulo, "Products", "El login no fue exitoso");
    }

    @DataProvider(name = "usuariosInvalidos")
    public Object[][] usuariosInvalidos() {
        return new Object[][] {
                {"standard_user", "wrong_password"},
                {"locked_out_user", "secret_sauce"},
                {"", "secret_sauce"}
        };
    }

    @Test(dataProvider = "usuariosInvalidos")
    public void loginInvalido(String usuario, String password) {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(usuario, password);

        String error = loginPage.obtenerMensajeError();

        Assert.assertFalse(error.isEmpty(), "No se mostró mensaje de error");

    }

    @Test
    public void loginValido() {

        System.out.println("Ejecutando prueba de login");

    }

}
