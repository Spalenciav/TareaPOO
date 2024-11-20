/**Autor: Santiago Palencia 
*Tema: Ejercicio #20
*Ejercicio: Implemente el algoritmo de Euclides para encontrar el gcd de dos número leídos
desde teclado.
*/

import java.util.*;
public class Punto23 {
       public static int gcd(int a, int b) {
        while (b != 0) {
            int x = b;
            b = a % b;
            a = x;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce el primer número: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Introduce el segundo número: ");
        int num2 = scanner.nextInt();
        
        int resultado = gcd(num1, num2);
        
        System.out.println("El GCD de " + num1 + " y " + num2 + " es: " + resultado);
    }
}