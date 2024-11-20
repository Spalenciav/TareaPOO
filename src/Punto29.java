/**Autor: Santiago Palencia 
*Tema: Ejercicio #28
*Ejercicio:  Cuando se lee una entrada estándar, por l	o general se alcanza el fin de archivo
cuando el usuario teclea CRTL-D, CRTL-Z, o algún otro carácter dependiente del
sistema. Descubra cuál es el adecuado en su sistema. Escriba un programa que lea
datos controlando el fin de la secuencia con la combinación adecuada.
*/

import java.util.Scanner;

public class Punto29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce datos línea por línea. Finaliza con:");
        System.out.println(" - Ctrl+D en Linux/macOS.");
        System.out.println(" - Ctrl+Z seguido de Enter en Windows.");

        while (scanner.hasNextLine()) {
            String linea = scanner.nextLine();
            System.out.println("Leído: " + linea + "     Para salir escriba la palabra salir");
            
            if (linea.equalsIgnoreCase("salir")) {
                System.out.println("Se detectó la palabra 'salir'. Programa finalizado.");
                break; // Salir del bucle {
            }
        }
        System.out.println("Fin de la entrada detectado. Programa finalizado.");
    }
}