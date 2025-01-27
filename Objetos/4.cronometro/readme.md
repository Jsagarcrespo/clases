# Cronómetro

Crea un programa que implemente la clase Cronometro:

```plantuml
@startuml
skinparam classAttributeIconSize 0
skinparam nodesep 100
skinparam ranksep 80

class Cronometro {
- horaInicio: long
+ tiempoTranscurrido()
}

@enduml
```

El programa mostrará al usuario un menú con las siguientes opciones:

- Nuevo cronómetro.
- Consultar cronómetro.
- Salir.

## Sugerencias

Para medir el tiempo, se puede usar:

```java
// Instante inicial
long startTime = System.nanoTime();    

// Cálculo del tiempo transcurrido
long estimatedTime = System.nanoTime() - startTime;
```

## Restricciones

El programa permitirá crear un máximo de 10 cronómetros simultáneos.
