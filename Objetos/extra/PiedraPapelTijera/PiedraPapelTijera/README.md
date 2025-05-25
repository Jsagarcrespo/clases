# Piedra, papel o tijera

Escribe un programa que permita jugar
a ["piedra, papel o tijera"](https://es.wikipedia.org/wiki/Piedra%2C_papel_o_tijera) contra el ordenador.

## Funcionamiento

El programa mostrará una ventana como esta:

![](capturas/01.png)

El usuario pulsará uno de los tres botones, haciendo su elección:

![](capturas/02.png)

Al pulsar el botón, el ordenador elegirá al azar una de las tres posibilidades y se actualizarán los totales con el
resultado:

![](capturas/03.png)

Al pulsar en el botón de volver a jugar, además de reiniciar el juego, los totales se guardarán en el
fichero [`totales.json`](totales.json).

Partiendo de ese fichero guardado, cuando la aplicación vuelva a arrancar, se cargarán los totales y el juego continuará a partir de ahí.

## Reglas

La precedencia de los tres elementos es como sigue:

- Piedra gana a tijera.
- Tijera gana a papel.
- Papel gana a piedra.
