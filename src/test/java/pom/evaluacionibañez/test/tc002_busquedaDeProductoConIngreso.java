package pom.evaluacionibañez.test;

import org.junit.Test;
import pom.evaluacionibañez.base.Hook;
import pom.evaluacionibañez.pages.VFHomeGezatek;

public class tc002_busquedaDeProductoConIngreso extends Hook {
    @Test
    public void atc002() throws InterruptedException {
        VFHomeGezatek producto = new VFHomeGezatek(driver, wait);
        producto.goProductos();
        producto.IngresarProducto("HyperX");
        producto.ProductSelect();
        producto.agregarAlCarrito();
    }
}