/**Autor: Santiago Palencia 
*Tema: Ejercicio #22
*Ejercicio: Escribir un programa en Java que lea un número entero por el teclado e imprima
todos los número impares menores que él.
*/

import java.util.*;
public class Punto22 {
    public static void main(String[] args) { 
            Scanner s = new Scanner(System.in);
            System.out.print("Introduzca el primer numero entero: ");
            int x = s.nextInt();            
            for (int i = 1 ; i < x ; i += 2 ) {
                    System.out.println(i);
                }
    }
}