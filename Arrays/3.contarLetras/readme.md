Escribe un programa que cuente el número de veces que aparece cada una de las letras del [alfabeto](https://es.wikipedia.org/wiki/Ortograf%C3%ADa_del_espa%C3%B1ol) en un texto introducido por el usuario.

El recuento se hará mediante la función `contarLetras()` y se almacenará el total de cada letra en la posición correspondiente de un array de enteros.

Después se mostrará el resultado en pantalla mediante la función `visualizarRecuento()`.

## Sugerencias

- Recuerda que para acceder a los caracteres individuales de un `String` disponemos del método `.charAt()`.

## Restricciones

- Los arrays se pasarán como parámetros a las funciones, no pueden ser variables globales.

----------

##contarLetras
- Usaremos un bucle donde recorreremos cada caracter y si este es una letra del alfabeto lo sumara al contador.

##visualizarRecuento
- Esta funcion sera recursiva en contarLetras.
- Mediante esta nos contara las veces que sale un caracter