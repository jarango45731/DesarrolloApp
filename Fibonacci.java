import java.math.BigInteger;
import java.util.Scanner;

public class Fibonacci {
    public static BigInteger cache[];

    public static void main(String[] args) {
        System.out.println("Calculador de numero fibonacci. Formula: F(n) = F(n-1) + F(n-2), F(1) = 1, F(2) = 1");
        System.out.println("Ingrese un numero:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        cache = new BigInteger[n +1];
        cache[0] = cache[1] = BigInteger.ONE;
        BigInteger resultado = fibonacci(n);
        System.out.println("El numero fibonacci de " + n + " es: " + resultado);
    }

    static BigInteger fibonacci(int n) {
        if (n == 0 || n == 1) {
            return BigInteger.valueOf(n);
        }
        if (cache[n] != null) {
            return cache[n];
        }
        cache[n] = fibonacci(n - 1).add(fibonacci(n - 2));
        return cache[n];
    }
}