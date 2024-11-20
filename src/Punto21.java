/**Autor: Santiago Palencia 
*Tema: Ejercicio #20
*Ejercicio:Escribir un programa en Java que lea dos números del teclado y diga cual es el
mayor y cual el menor.
*/

import java.util.*;
public class Punto21 {
    public static void main(String[] args) { 
            Scanner s = new Scanner(System.in);
            System.out.print("Introduzca el primer numero entero: ");
            int x = s.nextInt();
            System.out.print("Introduzca el segundo numero entero: ");
            int y = s.nextInt();
            
            if (x<y) {
                    System.out.println("El numero mayor es " + y + " y el numero menor es " + x );
            } else if (x>y) {
                    System.out.println("El numero mayor es " + x + " y el numero menor es " + y );
            }else{
                            System.out.println("Los numeros son iguales");
                            }        
            }
}