# Gestión de productos

Nuestro cliente nos ha proporcionado este *mockup* de una aplicación que quiere que le programemos:

![](productos.png)

También nos proporciona este diagrama de clases para que lo sigamos:

```plantuml
@startuml
skinparam classAttributeIconSize 0
skinparam nodesep 100
skinparam ranksep 80

class VGestion {
}

class VListado {
}

class GestionProductos {
+ nuevo(producto: Producto)
+ listado(): String
}

class Producto {
- referencia: String
- nombre: String
- precio: double
}

VGestion - GestionProductos
GestionProductos - VListado

GestionProductos -- "*" Producto

@enduml
```

Se nos pide:

- Construir el interfaz de usuario usando Swing.
- Almacenar los datos en una estructura tipo `List<E>`.
- Mostrar los datos almacenados en la estructura usando un `JTextArea`.
