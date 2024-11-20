/**Autor: Santiago Palencia 
*Tema: Ejercicio #18
*Ejercicio: Escribir un programa en Java que lea un número entero desde teclado y realiza la suma de los 100 número siguientes, mostrando el resultado en pantalla.
*/

import java.util.*;
public class Punto18 {
            public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
                System.out.print("introduzca el número inicial: ");
                int h = s.nextInt();
                int x = 0 ;
                for (int i = 1; i <= 100; i++) {
                    x += h+i ; 
                System.out.println(x);
        }
    }
}