/**Autor: Santiago Palencia 
*Tema: Ejercicio #20
*Ejercicio: Escriba un programa que lea los coeficientes a, b y c de una ecuación de segundo, y
estudie si tiene o no solución. En caso positivo, las soluciones se calcularán e
imprimirán en pantalla.
*/
import java.util.Scanner;
public class Punto24 {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el coeficiente a: ");
        double a = scanner.nextDouble();

        System.out.print("Introduce el coeficiente b: ");
        double b = scanner.nextDouble();

        System.out.print("Introduce el coeficiente c: ");
        double c = scanner.nextDouble();

        if (a == 0) {
            System.out.println("Esto no es una ecuación de segundo grado.");
            if (b != 0) {
                double solucion = -c / b;
                System.out.println("La solución de la ecuación lineal es: " + solucion);
            } else {
                System.out.println(c == 0 ? "La ecuación tiene infinitas soluciones." : "La ecuación no tiene solución.");
            }
        } else {
            double discri = Math.pow(b, 2) - 4 * a * c;

            if (discri > 0) {
                // Dos soluciones reales distintas
                double x1 = (-b + Math.sqrt(discri)) / (2 * a);
                double x2 = (-b - Math.sqrt(discri)) / (2 * a);
                System.out.println("La ecuación tiene dos soluciones reales:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            } else if (discri == 0) {
                // Una solución real doble
                double x = -b / (2 * a);
                System.out.println("La ecuación tiene una solución real doble:");
                System.out.println("x = " + x);
            } else {
                // No hay soluciones reales
                System.out.println("La ecuación no tiene soluciones reales.");
            }
        }

    }
}