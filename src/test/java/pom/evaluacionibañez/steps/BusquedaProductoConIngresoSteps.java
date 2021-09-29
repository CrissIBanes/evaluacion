package pom.evaluacionibañez.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.evaluacionibañez.base.Hook;
import pom.evaluacionibañez.pages.VFHomeGezatek;

public class BusquedaProductoConIngresoSteps {
    VFHomeGezatek page;
    private VFHomeGezatek HomePage;

    @Given("que estoy en la seccion productos")
    public void que_estoy_en_la_seccion_productos() {
        // Write code here that turns the phrase above into concrete actions
        HomePage = new VFHomeGezatek(Hook.getDriver());
        HomePage.goToUrl("https://www.gezatek.com.ar/tienda/");
    }

    @When("ingreso HyperX y clickeo en buscar")
    public void ingreso_HyperX_yclickeo_en_buscar() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        HomePage.IngresarProducto("hyperX");

    }
    @And("clickeo en el producto")
    public void clickeo_en_el_producto(){
        // Write code here thar turn the phrase above into concrete actions
        HomePage.ProductSelect();

    }
    @Then("se me añade al carrito de compra")
    public void se_me_añade_al_carrito_de_compra() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        HomePage.agregarAlCarrito();

    }
}
