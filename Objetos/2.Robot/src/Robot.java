public class Robot {
    private int x, y;

    public Robot() {
        this.x = 0;
        this.y = 0;
    }

    // no puede ser static ya que si no, no puedo acceder a this.x o this.y
    public void mover(int x, int y){

        // para la diagonal, no se puede seleccionar dos veces 1, con lo que si x = 1 el if entra en false y sigue corriendo el codigo
        // pero si y tambien es 1 entra en esta sentencia.
        if ( x != 0 && y!=0){
            System.out.println("No se puede mover en diagonal");
            return;
        }

        if ( x < -1 || x > 1 || y < -1 || y > 1){
            System.out.print("Movimiento no valido");
            return;
        }



        this.x += x;
        this.y += y;

        if (this.x > 10 || this.x < -10 || this.y > 10 || this.y < -10 ){
            System.out.println("Fuera del area 10x10");
            this.x = 0;
            this.y = 0;
        } else {
            System.out.println("Nueva posicion: " + this.x + ", " + this.y );
        }

    }

    public void imprimirPosicion(){
        System.out.println("(" + this.x + ", " + this.y + ")" );
    }
}
