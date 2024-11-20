/**Autor: Santiago Palencia 
*Tema: Ejercicio #19
*Ejercicio: Escribir un programa en Java que convierta de euros a dolares. Recibirá un número decimal correspondiente a la cantidad en euros y contestará con la cantidad correspondiente en dálares. */

import java.util.*;
public class Punto19 {
    public static void main(String[] args) { 
            double cambiomoneda = 1.6;          //valor actual
            Scanner s = new Scanner(System.in);
            System.out.print("Introduce la cantidad en euros: ");
            double euros = s.nextDouble();
            double dolares = euros * cambiomoneda ; 
            System.out.println(" La cantidad de " + euros + "  en euros es:" + dolares);
    }
}