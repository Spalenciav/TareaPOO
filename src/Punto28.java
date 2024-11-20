/**Autor: Santiago Palencia 
*Tema: Ejercicio #28
*Ejercicio:  Implemente una sentencia switch que escriba un mensaje en cada caso. Inclúyala en
bucle de prueba for. Utilice también un break tras cada caso y pruébelo. Elimine el
break y vea qué ocurre.
*/

public class Punto28 {
public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            System.out.println("Iteración " + i + ":");
            
            switch (i) {
                case 1 -> System.out.println("Caso 1");
                case 2 -> System.out.println("Caso 2");
                case 3 -> System.out.println("Caso 3");
                default -> System.out.println("Caso por defecto: Ningún caso específico coincide.");
            }
            System.out.println(); 
        }
    }
}
