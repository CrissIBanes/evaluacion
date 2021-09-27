package pom.evaluacionIbañez.test;

import org.junit.Test;
import pom.evaluacionIbañez.base.TestBase;
import pom.evaluacionIbañez.pages.VFHomeGezatek;

public class tc002_busquedaDeProductoConIngreso extends TestBase {
    @Test
    public void atc002() throws InterruptedException {
        VFHomeGezatek producto = new VFHomeGezatek(driver, wait);
        producto.goProductos();
        producto.IngresarProducto("HyperX");
        producto.ProductSelect();
        producto.agregarAlCarrito();
    }
}