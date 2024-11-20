/**Autor: Santiago Palencia 
*Tema: Ejercicio #25
*Ejercicio: Pruebe la recursividad en Java. Escriba programas que calculen recursivamente las
funciones f actorial(n) y Ackermann(x, y).
*/
import java.util.Scanner;
public class Punto25parte2 {
    public static int ackermann(int x, int y) {
        if (x == 0) {
            return y + 1; 
        } else if (x > 0 && y == 0) {
            return ackermann(x - 1, 1);
        } else {
            return ackermann(x - 1, ackermann(x, y - 1)); 
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el valor de x: ");
        int x = scanner.nextInt();
        System.out.print("Introduce el valor de y: ");
        int y = scanner.nextInt();
        int resultado = ackermann(x, y);
        System.out.println("El resultado de Ackermann(" + x + ", " + y + ") es: " + resultado);
    }
}