public class MotorJuego {

    private static int[][] tablero = new int[3][3];
    private static int jugando= 0;
    private static int tiradas = 0;


    public static void reset() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = -1;
            }
        }
       // tiradas = 0;
        //necesara esta parte porque si no no me cabia de jugador
        //jugando = 0;

    }

  /*  public void tabla() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (tablero[i][j] == 0) {
                    System.out.print("O");
                } else if (tablero[i][j] == -1) {
                    System.out.print(" ");
                } else {
                    System.out.println("X");
                }

            }
        }
    }*/


/*    public static void limpiarTablero() {

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {

                    tablero[i][j] = -1;


            }
        }
    }*/

    public static int quienJuega() {
        return (jugando = (jugando + 1) % 2);
    }

    public static char tirada(int fila, int columna) {

        if (tablero[fila][columna] == -1) {
            tablero[fila][columna] = jugando;
            //tiradas++;
        }
        if (tablero[fila][columna] == 0) {
            return 'O';
        } /*else if(tablero[fila][columna] == 1) {
            return 'X';
        }*/
        else {
            return 'X';
        }

    }


}
