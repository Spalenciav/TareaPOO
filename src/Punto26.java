/**Autor: Santiago Palencia 
*Tema: Ejercicio #26
*Ejercicio:  Escriba un programa que lea tres números enteros positivos, y que calcule e imprima
en pantalla el menor y el mayor de todos ellos.
*/

import java.util.Scanner;
public class Punto26 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
          System.out.print("Introduce el primer número entero positivo: ");
        int num1 = scanner.nextInt();

        System.out.print("Introduce el segundo número entero positivo: ");
        int num2 = scanner.nextInt();

        System.out.print("Introduce el tercer número entero positivo: ");
        int num3 = scanner.nextInt();
        
            if (num1 <= 0 || num2 <= 0 || num3 <= 0) {
            System.out.println("Por favor, asegúrate de que todos los números sean positivos.");
        } else {
            
            int mayor = num1;
            int menor = num1;
            
            if (num2 > mayor) {
                mayor = num2;
            }
            if (num3 > mayor) {
                mayor = num3;
            }
            if (num2 < menor) {
                menor = num2;
            }
            if (num3 < menor) {
                menor = num3;
            }
            System.out.println("El mayor número es: " + mayor);
            System.out.println("El menor número es: " + menor);
        }

    }


}