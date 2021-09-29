package pom.evaluacionibañez.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pom.evaluacionibañez.base.Hook;
import pom.evaluacionibañez.pages.VFHomeGezatek;

public class BusquedaProductoSteps {
VFHomeGezatek page;
    private VFHomeGezatek HomePage;

    @When("clickeo en un producto elegido")
    public void clickeo_en_un_producto_elegido() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        HomePage = new VFHomeGezatek(Hook.getDriver());
        HomePage.seleccionarProducto();
    }
}
