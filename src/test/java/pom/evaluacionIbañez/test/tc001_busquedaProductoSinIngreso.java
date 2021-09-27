package pom.evaluacionIbañez.test;

import org.junit.Test;
import pom.evaluacionIbañez.base.TestBase;
import pom.evaluacionIbañez.pages.VFHomeGezatek;

public class tc001_busquedaProductoSinIngreso extends TestBase {
    @Test
    public void atc001() throws InterruptedException {
        VFHomeGezatek producto = new VFHomeGezatek(driver, wait);
        producto.goProductos();
        producto.seleccionarProducto();
        producto.agregarAlCarrito();
    }
}
