/**Autor: Santiago Palencia 
*Tema: Ejercicio #27
*Ejercicio:  Escriba un programa que lea temperaturas expresadas en grados Fahrenheit y las
convierta a grados Celsius mostrándola. El programa finalizará cuando lea un valor
de temperatura igual a 999. La conversión de grados Farenheit (F) a Celsius (C) está
dada por C = 5/9(F − 32).
*/

import java.util.Scanner;
public class Punto27 {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double f;
        System.out.println("Introduce temperaturas en Fahrenheit para convertirlas a Celsius.");
        System.out.println("Introduce 999 para cerrar el programa.");

        while (true) {
            System.out.print("Introduce una temperatura en ° Fahrenheit: ");
            f = scanner.nextDouble();
            if (f == 999) {
                System.out.println("Programa cerrado");
                break;
            }
            double celsius = (5.0 / 9) * (f - 32);
            System.out.printf("La temperatura en Celsius es: " + celsius + "    ");
        }

    }
}