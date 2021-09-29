package pom.evaluacionibañez.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pom.evaluacionibañez.base.SeleniumBase;

public class VFHomeGezatek extends SeleniumBase {
    By botonProductos = By.xpath("//header/div[1]/div[1]/div[1]/div[4]/ul[1]/li[1]/a[1]");
    By mouseProducto = By.xpath("//body/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/a[1]/div[1]/img[1]");
    By btnComprar = By.xpath("/html/body/section/div/div/div/div[2]/div[1]/div[2]/button[2]");
    By imputProducto = By.xpath("//*[@id=\"busqueda\"]");
    By btnBuscar = By.xpath("//*[@id=\"busqueda_principal\"]/div[2]");
    By productoHyperX = By.xpath("//body/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/a[1]/div[1]/img[1]");

    public VFHomeGezatek(WebDriver driver, WebDriverWait wait) {
        super(driver);
    }

    public VFHomeGezatek(WebDriver driver) {
        super(driver);
    }

    public void goProductos (){
        /***
         * @function : Carga la pagina www.gezatek.com.ar y navega hacia la seccion "Productos".
         */
        goToUrl("https://www.gezatek.com.ar/");
        click(botonProductos);
    }

    /***
     * @function : Clickea en el producto "Mouse HyperX Pulsefire FPS Pro RGB Gaming 16000 DPI".
     * @throws InterruptedException
     */
    public void seleccionarProducto () throws InterruptedException {
        Thread.sleep(500);
        click(mouseProducto);
    }

    /***
     * @function : Clickea en el boton "Comprar" y lo agrega al "Carrito de Compra".
     * @throws InterruptedException
     */
    public void agregarAlCarrito () throws InterruptedException {
        Thread.sleep(500);
        click(btnComprar);
    }

    /***
     * @function : Ingresa "HyperX" en el campo y clickea en "Buscar".
     * @param hyperX
     * @throws InterruptedException
     */
    public void IngresarProducto(String hyperX) throws InterruptedException {
        Thread.sleep(500);
        setText(imputProducto, "hyperX");
        click(btnBuscar);
    }

    /***
     * @function: Clickea en el producto "Mousepad HyperX FURY S Pro Gaming Control Large (450x400mm)"
     */
    public void ProductSelect() {
        click(productoHyperX);
    }
}
