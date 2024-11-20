/**Autor: Santiago Palencia 
*Tema: Ejercicio #20
*Ejercicio:Escribir un programa en Java que calcule el área de un rectángulo del cual se le 
proporcionará por el teclado su altura y anchura (números decimales).
*/

import java.util.*;
public class Punto20 {
    public static void main(String[] args) { 
            Scanner s = new Scanner(System.in);
            System.out.print("Introduce la altura del rectangulo (Pueden ser decimales): ");
            double altura = s.nextDouble();
            System.out.print("Introduzca el ancho del rectangulo (Pueden ser decimales): ");
            double ancho = s.nextDouble();
            double area = altura * ancho;
            System.out.println(" El area del rectangulo con altura " + altura + "y anchura "+ ancho + "es igual a " + area );
    }
}