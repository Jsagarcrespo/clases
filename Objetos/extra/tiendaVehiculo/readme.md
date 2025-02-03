Tienda de Vehículos
Queremos construir una aplicación que permita almacenar información sobre diferentes tipos de vehículos en una tienda, siguiendo la estructura que aparece en el siguiente diagrama de clases:

```@startuml
skinparam classAttributeIconSize 0
skinparam nodesep 100
skinparam ranksep 80

class Vehiculo {
- marca: String
- modelo: String
- anio: int
- precio: double
+ mostrarDetalles(): void
  }

class Coche extends Vehiculo {
- numPuertas: int
  }

class Moto extends Vehiculo {
- cilindrada: int
  }

interface Vendible {
+ vender(): void
  }

enum TipoVehiculo {
COCHE,
MOTO
}


class TiendaSingleton {
- numVehiculos: int
+ anadirVehiculo(Vehiculo v): void
+ listarVehiculos(): void
  }

Vehiculo <|-- Coche
Vehiculo <|-- Moto
Vehiculo <|.. Vendible
Coche ..|> Vendible
Moto ..|> Vendible
Tienda "1" - "10" Vehiculo
TiendaSingleton "1" - "1" Tienda

@enduml
```
TiendaSingleton usara el formato Singleton. 
El programa mostrará un menú como el siguiente:

```plaintext
1. Crear nuevo vehículo
2. Listar todos los vehículos
3. Vender un vehículo
4. Salir
```

El programa principal pedirá al usuario todos los datos necesarios y creará los objetos que hagan falta.