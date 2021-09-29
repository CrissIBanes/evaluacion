Feature: Busqueda de Producto en Gezatek
  Como usuario
  Quiero realizar una busqueda en Gezatek
  Para encontrar un producto de mi agrado

  @test @busquedaProducto
    Scenario: Busqueda Simple sin Ingreso
    Given que estoy en la seccion productos
    When clickeo en un producto elegido
    Then se me añade al carrito de compra

  @test @busquedaProductoConIngreso
    Scenario: Busqueda Simple con Ingreso
    Given que estoy en la seccion productos
    When ingreso HyperX y clickeo en buscar
    And clickeo en el producto
    Then se me añade al carrito de compra