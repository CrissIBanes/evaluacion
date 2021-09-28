package pom.evaluacionIbañez.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pom.evaluacionIbañez.base.SeleniumBase;

public class VFHomeGezatek extends SeleniumBase {
    By botonProductos = By.xpath("//header/div[1]/div[1]/div[1]/div[4]/ul[1]/li[1]/a[1]");
    By mouseProducto = By.xpath("//body/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/a[1]/div[1]/img[1]");
    By btnComprar = By.xpath("/html/body/section/div/div/div/div[2]/div[1]/div[2]/button[2]");
    By imputProducto = By.xpath("//*[@id=\"busqueda\"]");
    By btnBuscar = By.xpath("//*[@id=\"busqueda_principal\"]/div[2]");
    By productoHyperX = By.xpath("//body/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/a[1]/div[1]/img[1]");

    public VFHomeGezatek(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    public void goProductos (){
        /***
         * @function : Carga la pagina www.gezatek.com.ar y navega hacia la seccion "Productos"
         */
        goToUrl("https://www.gezatek.com.ar/");
        click(botonProductos);

    }
    public void seleccionarProducto () throws InterruptedException {
        Thread.sleep(500);
        click(mouseProducto);
    }
    public void agregarAlCarrito () throws InterruptedException {
        Thread.sleep(500);
        click(btnComprar);
    }
    public void IngresarProducto(String hyperX) throws InterruptedException {
        Thread.sleep(500);

        click(btnBuscar);
    }
    public void ProductSelect() {
        click(productoHyperX);
    }

}
