# Carrera popular

Te han encargado desarrollar una aplicación para registrar la clasificación de una carrera popular que se va a celebrar en tu barrio.

La aplicación tiene que estar compuesta de cuatro clases diferentes:

- `Participante`: almacena el dorsal y el nombre.
- `Marca`: almacena el tiempo empleado en completar la prueba de un participante concreto.
- `Carrera`: tiene que ser una [clase de instancia única o _Singleton_](https://es.wikipedia.org/wiki/Singleton) que puede almacenar hasta 10000 marcas de participantes. Dispondrá de los métodos `registrarMarca()` y `verClasificacion()` que permitirán añadir una nueva marca y ver el listado completo con este formato:

    ```text
    --- Clasificación --------------
    013 | María           |   652,00
    002 | Luis            |   675,00
    009 | Carlos          |   691,20
    --------------------------------
    ```

- `Main`: contendrá la función `main()`, instanciará el _Singleton_ y pedirá al usuario marcas hasta que éste escriba como dorsal `FIN`. Entonces mostrará la clasificación en pantalla.

## Sugerencias

Antes de empezar a codificar, crea un diagrama de clases con la estructura de la aplicación para que te sirva como guía.
![img.png](img.png)