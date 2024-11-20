/**Autor: Santiago Palencia 
*Tema: Ejercicio #15
*Ejercicio: Escribir un programa en Java que imprima por pantalla los cuadrados de los 30 primeros números naturales.
*/

public class Punto15 {
            public static void main(String[] args) {
        for (int i = 1; i <= 30; i++) {
            int x = i * i ;
            System.out.println("El cuadrado de " + i + " es:" + x);

        }
     }
}
