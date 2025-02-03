package com.ikasgela;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int[][] tablero = new int[3][3];

    public static void visualizarTablero() {
        System.out.println("  1 2 3");
        for (int i = 0; i < 3; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == 0) {
                    System.out.print("O ");
                } else if (tablero[i][j] == 1) {
                    System.out.print("X ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }

    public static boolean comprobarGanador() {
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] == tablero[i][1] && tablero[i][1] == tablero[i][2] && tablero[i][0] != -1) {
                return true;
            }
            if (tablero[0][i] == tablero[1][i] && tablero[1][i] == tablero[2][i] && tablero[0][i] != -1) {
                return true;
            }
        }

        if (tablero[0][0] == tablero[1][1] && tablero[1][1] == tablero[2][2] && tablero[0][0] != -1) {
            return true;
        }
        return tablero[0][2] == tablero[1][1] && tablero[1][1] == tablero[2][0] && tablero[0][2] != -1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean juegoActivo = true;
        int jugadorActual = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = -1;
            }
        }

        while (juegoActivo) {
            visualizarTablero();
            System.out.println("Jugador " + (jugadorActual == 0 ? "O" : "X") + ", introduce fila y columna (1-3): ");
            int fila = Integer.parseInt(reader.readLine()) - 1;
            int columna = Integer.parseInt(reader.readLine()) - 1;

            if (fila < 0 || fila > 2 || columna < 0 || columna > 2 || tablero[fila][columna] != -1) {
                System.out.println("Movimiento no válido, intenta de nuevo.");
                continue;
            }

            tablero[fila][columna] = jugadorActual;

            if (comprobarGanador()) {
                visualizarTablero();
                System.out.println("¡Jugador " + (jugadorActual == 0 ? "O" : "X") + " ha ganado!");
                juegoActivo = false;
            } else {
                boolean empate = true;
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (tablero[i][j] == -1) {
                            empate = false;
                            break;
                        }
                    }
                }
                if (empate) {
                    visualizarTablero();
                    System.out.println("¡Es un empate!");
                    juegoActivo = false;
                } else {
                    jugadorActual = 1 - jugadorActual;
                }
            }
        }
    }
}
