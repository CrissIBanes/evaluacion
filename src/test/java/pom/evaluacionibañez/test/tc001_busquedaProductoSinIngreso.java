package pom.evaluacionibañez.test;

import org.junit.Test;
import pom.evaluacionibañez.base.Hook;
import pom.evaluacionibañez.pages.VFHomeGezatek;

public class tc001_busquedaProductoSinIngreso extends Hook {
    @Test
    public void atc001() throws InterruptedException {
        VFHomeGezatek producto = new VFHomeGezatek(driver, wait);
        producto.goProductos();
        producto.seleccionarProducto();
        producto.agregarAlCarrito();
    }
}
