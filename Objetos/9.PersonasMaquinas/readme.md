# Personas y máquinas

Queremos poder lanzar la función `main()` que aparece a continuación sin modificar nada:

```java
public static void main(String[] args) {

    Visualizable[] datos = new Visualizable[2];

    datos[0] = new Maquina("Braun", "BNE-001-BK", "0000-0000-0001");
    datos[1] = new Persona("Arthur", "Dent", 42);

    for (Visualizable dato : datos) {
        dato.visualizar();
    }
}
```

Pasos a seguir:

1. Implementa las clases `Maquina` (marca, modelo y número de serie) y `Persona` (nombre, apellidos y edad).
2. Crea el interfaz `Visualizable` que obligue a quien lo implemente a disponer de una función con la firma:

    ```java
    public void visualizar();
    ```

3. Haz que las clases `Maquina` y `Persona` implementen el interfaz `Visualizable`, completando el código necesario para mostrar los datos como en el ejemplo:

    ```text
    | M | Braun           | BNE-001-BK      |  0000-0000-0001 |
    | P | Arthur          | Dent            |              42 |
    ```

## Restricciones

La clase `Main` ya está implementada y no se puede modificar.
