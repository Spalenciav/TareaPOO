/**Autor: Santiago Palencia 
*Tema: Ejercicio #25
*Ejercicio: Pruebe la recursividad en Java. Escriba programas que calculen recursivamente las
funciones f actorial(n) y Ackermann(x, y).
*/

import java.util.Scanner;
public class Punto25 {
    public static int ackermann(int x, int y) {
        if (x == 0) {
            return y + 1; 
        } else if (x > 0 && y == 0) {
            return ackermann(x - 1, 1);
        } else {
            return ackermann(x - 1, ackermann(x, y - 1)); 
        }
    }

public static int factorial(int n) {
        if (n == 0) { 
            return 1;
        } else {
            return n * factorial(n - 1); 
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número para calcular su factorial: ");
        int num = scanner.nextInt();
        int resultado = factorial(num);
        System.out.println("El factorial de " + num + " es: " + resultado);
    }
}


