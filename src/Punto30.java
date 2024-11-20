/**Autor: Santiago Palencia 
*Tema: Ejercicio #28
*Ejercicio:  Escriba un programa que use dos bucles for anidados y el operador de módulo (%)
para detectar e imprimir números primos.
*/

public class Punto30 {
    public static void main(String[] args) {
        int limite = 500; 
        System.out.println("Números primos hasta " + limite + ":");
        for (int num = 2; num <= limite; num++) {
            boolean esPrimo = true; 
            for (int divisor = 2; divisor <= Math.sqrt(num); divisor++) {
                if (num % divisor == 0) {
                    esPrimo = false; 
                    break; 
                }
            }
            if (esPrimo) {
                System.out.print(num + " ");
            }
        }
    }
}