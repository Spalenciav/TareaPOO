/**Autor: Santiago Palencia 
*Tema: Ejercicio #15
*Ejercicio: Escribir un programa en Java que sume los cuadrados de los cien primeros números naturales, mostrando el resultado en pantalla.
*/

public class Punto17 {
            public static void main(String[] args) {
            long x =0;
        for (int i = 1; i <= 100; i++) {
            x += (i*i) ;
            System.out.println(x);

        }
     }
}