Pide al usuario los nombres y apellidos de todos tus compañeros de clase y almacénalos en un array.

Después pídele usuario una letra y muestra aquellos alumnos cuyo nombre empiece por dicha letra.

## Requisitos

- Nota: El programa termina cuando se escriba `FIN` como búsqueda.

------
<h1>1 crear array</h1>
    - Usaremos **ArrayList<String>** para almacenar los nombres y apellidos de los compañeros de clase.
    - En el primero bucle vamos añadiendo los nombres y apellido **(nombres.add(input);)**

<h2>busqueda nombre por letra</h2>
- El **(String nombre : nombres)** nos servira para iterar por cada elemento que tenemos en el array nobmres.
- Si el primer caracter coincide con la letra lo imprime por pantalla. 