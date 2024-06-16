package leccion_2;
import java.util.Scanner;
public class Leccion_2 {
    public static void main(String[] args) {
        
       /* var condicion = false;
        if(condicion){
            System.out.println("Condición verdadera");
            
        }else{
            System.out.println("Condicion falsa");
        }
       
        var numero = 2;
        var numeroTexto = "Numero desconocido";
        
        if(numero == 1){
        numeroTexto = "Numero Uno";
        }else if (numero == 2){
        numeroTexto = "Numero Dos";
        }else if (numero == 3){
        numeroTexto = "Numero Tres";
        }else if (numero == 4){
        numeroTexto = "Numero cuatro";
        }else{
        numeroTexto = "Numero no encontrado";
        }
        
        System.out.println("numeroTexto = " + numeroTexto);
        */
       Scanner entrada = new Scanner(System.in);
       System.out.println("Digite un numero del 1 al 4");
       var numeroTexto = "Valor desconocido";
       var numero = Integer.parseInt(entrada.nextLine());
       
       switch(numero){
           case 1:
               numeroTexto = "Numero uno";
               break;
           case 2:
               numeroTexto = "Numero dos";
               break;
           case 3:
               numeroTexto = "Numero tres";
               break;
           case 4:
               numeroTexto = "Numero cuatro";
               break;
           default:
               numeroTexto = "Caso no encontrado";
               
        System.out.println("numeroTexto = " + numeroTexto);
               
       }
    }
    
}
