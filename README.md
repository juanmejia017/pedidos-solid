# Proyecto: Refactorización SOLID - Pedidos

Este proyecto es una aplicación práctica de los principios SOLID en Java, enfocado en el procesamiento de pedidos.

## Principios SOLID Aplicados

- **Single Responsibility Principle (SRP):** Cada clase tiene una única responsabilidad. Por ejemplo, `Pedido` solo maneja datos, mientras que `PedidosRepository` se encarga de la persistencia.
- **Open/Closed Principle (OCP):** La interfaz `PoliticaDescuento` permite agregar nuevas reglas de descuento (como `DescuentoClienteVip` o `DescuentoClienteRegular`) sin modificar el código existente del servicio.
- **Liskov Substitution Principle (LSP):** Cualquier implementación de `PoliticaDescuento` puede sustituir a la interfaz base sin romper el programa.
- **Interface Segregation Principle (ISP):** Se crearon interfaces pequeñas y específicas como `NotificadorPedido` y `PedidosRepository`.
- **Dependency Inversion Principle (DIP):** `ProcesarPedidoService` depende de abstracciones (interfaces) y no de implementaciones concretas, recibiéndolas mediante inyección por constructor.

## Instrucciones de Ejecución

Para compilar y ejecutar el proyecto desde la terminal de Windows:

1. Compilar el código:
   `javac -d bin -sourcepath src src\Main.java`

2. Ejecutar la aplicación:
   `java -cp bin Main`
