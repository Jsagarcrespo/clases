
import java.awt.*;
import java.math.BigInteger;

public class Generador extends Container {

    public boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        if (numero == 2 || numero == 3) {
            return true;
        }

        if (numero % 2 == 0 || numero % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= numero; i += 6) {
            if (numero % i == 0 || numero % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }


    public BigInteger Factorial(int fator) {

        if (fator < 0) {
            throw new IllegalArgumentException("Mete un numero entero positivo");
        }
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= fator; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;

    }

    public BigInteger fibonacci(int fibo) {
        if (fibo < 0) {
            throw new IllegalArgumentException("El número debe ser mayor o igual a 0");
        }
        if (fibo == 0) return BigInteger.ZERO;
        if (fibo == 1) return BigInteger.ONE;

        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;
        BigInteger c = BigInteger.ONE;
        for (int i = 2; i <= fibo; i++) {
            c = a.add(b);
            a = b;
            b = c;
        }
        return b;
    }


}

