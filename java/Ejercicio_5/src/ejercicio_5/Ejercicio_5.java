/*
Hacer un programa que calcule e imprima la suma de tres calificaciones 
Pedir las calificaciones al usuario
*/
package ejercicio_5;
import java.util.Scanner;
public class Ejercicio_5 {

    public static void main(String[] args) {
       int notaUno, notaDos, notaTres, resultado;
        Scanner entrada = new Scanner(System.in);
       
       System.out.println("Escriba la primer nota");
       notaUno = entrada.nextInt();
       
       System.out.println("Escriba la segunda nota");
       notaDos = entrada.nextInt();
       
       System.out.println("Escriba la tercer nota");
       notaTres = entrada.nextInt();
       
       resultado = notaUno + notaDos + notaTres;
       
        System.out.println("El total de las notas es " + resultado);
    }
    
}
