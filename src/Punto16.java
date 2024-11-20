/**Autor: Santiago Palencia 
*Tema: Ejercicio #16
*Ejercicio: Escribir un programa en Java que multiplique los 20 primeros número naturales(1*2*3*4*5...).
*/

public class Punto16 {
            public static void main(String[] args) {
            long x = 1;
            for (int i = 1; i <= 20; i++) {
            x *= i;
            System.out.println(x);
        }
     }
}
