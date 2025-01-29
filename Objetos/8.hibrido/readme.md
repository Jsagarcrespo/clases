# Híbrido

El departamento de ingeniería ha perfeccionado nuestros sistemas de propulsión añadiendo motores eléctricos para mejorar la eficiencia, creando coches híbridos:

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

abstract class Motor {
# arrancado: boolean
# potencia: int
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

class MotorCombustionInterna {
- cilindrada: int
- combustible: String
}

class MotorElectrico {
- tipoBateria: String
}

Motor <|-- MotorCombustionInterna
Motor <|-- MotorElectrico

@enduml
```

Añade las nuevas clases y crea los objetos necesarios, con sus relaciones, pidiéndole los datos al usuario para instanciar un objeto de la clase `Coche` con un motor de cada tipo; después muéstralo en pantalla.
