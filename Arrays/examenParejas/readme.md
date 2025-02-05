# Parejas

Este juego consiste en revelar las parejas de letras ocultas en un tablero.

Partimos de esta posición inicial del tablero:

```text
  1  2  3  4
1 A  .  D  E 
2 .  B  D  B 
3 .  A  E  . 
```

Las letras representan casillas descubiertas y los puntos casillas que no se han desvelado todavía.

En cada jugada el programa pide los valores de fila y columna para dos casillas y, si corresponden a dos letras iguales,
se muestran.

El programa sigue jugando hasta que se complete el tablero entero o el usuario escriba `0, 0` como posición de la
primera casilla.

## Pasos a seguir

1. Crea la función `visualizar()` que muestre el tablero de juego como en el ejemplo.
2. Crea la función `terminado()` que retorne un valor lógico indicando si el tablero se ha completado.
3. Crea la función `jugada()` que reciba dos posiciones del tablero y compruebe si hay dos letras iguales en ellas. Si
   las hay, actualizará el estado del juego y retornará `true`. En cualquier otro caso retornará `false`.
4. En el programa principal, usa las funciones para gestionar el juego como en el ejemplo.

## Restricciones

- El juego se controla con dos matrices: `letras` contiene las parejas y `visibles` indica qué casillas se han
  descubierto ya. No se puede modificar su declaración.
- Es obligatorio tratar las posibles excepciones de forma adecuada.

## Ejemplo

```text
  1  2  3  4
1 A  .  D  E 
2 .  B  D  B 
3 .  A  E  . 

Fila 1: 1
Columna 1: 2
Fila 2: 3
Columna 2: 4

No hay coincidencia...

  1  2  3  4
1 A  .  D  E 
2 .  B  D  B 
3 .  A  E  . 

Fila 1: 1
Columna 1: 2
Fila 2: 2
Columna 2: 1

Coinciden, buen trabajo.

  1  2  3  4
1 A  C  D  E 
2 C  B  D  B 
3 .  A  E  . 

Fila 1: 3
Columna 1: 4
Fila 2: 3
Columna 2: 1

Coinciden, buen trabajo.

  1  2  3  4
1 A  C  D  E 
2 C  B  D  B 
3 F  A  E  F 

Fin del juego.
```
