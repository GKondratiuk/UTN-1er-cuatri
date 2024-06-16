package ejercicio_6;
import java.util.Scanner;
/*
Guillermo tiene N dólares. Luis tiene la mitad de lo que posee Guillermo. Juan tiene la mitad de lo que 
poseen Luis y Guillermo juntos. Hacer un programa que calcule e imprima la cantidad de dinero que tienen entre 
los tres.
*/
public class Ejercicio_6 {
    public static void main(String[] args) {
    double guille,luis,juan;
    Scanner entrada = new Scanner(System.in);
    
        System.out.println("Ingrese la cantidad de dolares de Guillermo");
        guille = entrada.nextDouble();
        
        luis = guille / 2;
        System.out.println("luis tiene " + luis );
        
        juan = (luis + guille) / 2;
        
        System.out.println("juan tiene " + juan );
    
    }
    
}
