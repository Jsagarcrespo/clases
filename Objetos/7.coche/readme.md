# Coche

Queremos modelar un coche en Java. Sigue el diagrama que se proporciona y crea los objetos necesarios, con sus relaciones, pidiéndole los datos al usuario para instanciar un objeto de tipo `Coche` y mostrarlo después en pantalla.

```plantuml
@startuml
skinparam classAttributeIconSize 0
skinparam nodesep 100
skinparam ranksep 80

class Coche {
- marca: String
- modelo: String
- color: int
}

class Motor {
- arrancado: boolean
- potencia: int
- cilindrada: int
- combustible: String
+ arrancar()
+ parar()
}

class Rueda {
- diametro: String
}

class Puerta {
- elevalunasElectrico: boolean
}

Coche *-- "1..*" Motor
Rueda "4" -* Coche
Coche *- "2..5" Puerta

@enduml
```
