package holamundo;

import java.util.Scanner;

public class HolaMundo {

  
    public static void main(String[] args) {
     /*   System.out.println("Hola Mundo");
        
        int miVariable = 10; 
        System.out.println(miVariable);
        miVariable = 5;
        System.out.println(miVariable);

        //tipo string
        String miVariableCadena = "Bienvenidos";
        System.out.println(miVariableCadena);
        miVariableCadena = "Sigamos creciendo en programacion";
        System.out.println(miVariableCadena);
*/
     
     //var - inferencia de tipos en java
     /*var miVariableEntera2 = 10;
     var miVariableCadena2 = "Seguimos estudiando";
        System.out.println("miVariableEntera2 = " + miVariableEntera2);
        System.out.println("miVariableCadena2 " + miVariableCadena2);
        
        var opcion = 45;
        
        //reglas para definir una variable en java 
        
        var usuario = "Guillermo";
        var titulo =  "Kondratiuk";
        var union = titulo + " " + usuario;
        System.out.println("union = " + union);
        
        var a = 8;
        var b = 4;
        System.out.println(usuario + (a+b));
        
        //Ejercicios de caracteres especiales en  java 
        var nombre = "Guillermo";
        System.out.println("\n nueva linea : \n" + nombre);
        System.out.println("Tabulador: \t" + nombre);
        System.out.println("\t\t.:MENU:.");
        System.out.println("Retroceso: \b\b" + nombre);
        System.out.println("comillas dobles \""+nombre+"\"");
        */
     
     /*
        //clase Scanner
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite su nombre");
        var usuario2 = entrada.nextLine();
        System.out.println("usuario2 = " + usuario2);
        System.out.println("Escriba el titulo ");
        var titulo2 = entrada.nextLine();
        System.out.println("Resultado " + titulo2 + " " + usuario2);

*/
     /*
        System.out.println("BYTE");
        System.out.println("");
        byte numEnteroByte = 127;
        System.out.println("numEnteroByte = " + numEnteroByte);
        System.out.println("Valor minimo del Byte:" + Byte.MIN_VALUE);
        System.out.println("Valor maximo del Byte: " + Byte.MAX_VALUE);
        
        System.out.println("");
        System.out.println("SHORT");
        System.out.println("");
        short numEnteroShot = 32767;
        System.out.println("numEnteroShort = " + numEnteroByte);
        System.out.println("Valor minimo del short:" + Short.MIN_VALUE);
        System.out.println("Valor maximo del short: " + Short.MAX_VALUE);
        
        System.out.println("");
        System.out.println("INT");
        System.out.println("");
        int numEnteroInt = (int)2147483647;
        System.out.println("numEnteroInt = " + numEnteroInt);
        System.out.println("Valor minimo del Int:" + Integer.MIN_VALUE);
        System.out.println("Valor maximo del Int: " + Integer.MAX_VALUE);
        
        System.out.println("");
        System.out.println("LONG");
        System.out.println("");
        long numEnteroLong = 9223372036854775807L;
        System.out.println("numEnteroLong = " + numEnteroLong);
        System.out.println("Valor minimo del Long:" + Long.MIN_VALUE);
        System.out.println("Valor maximo del Long: " + Long.MAX_VALUE);
     
*/
     
        System.out.println("");
        System.out.println("FLOAT");
        System.out.println("");
        float numFloat = 3.4028235E38F;
        System.out.println("numfloat = " + numFloat);
        System.out.println("Valor minimo del Float:" + Float.MIN_VALUE);
        System.out.println("Valor maximo del Float: " + Float.MAX_VALUE);
        
        System.out.println("");
        System.out.println("DOUBLE");
        System.out.println("");
        double numDouble = 9223372036854775807D;
        System.out.println("numDouble = " + numDouble);
        System.out.println("Valor minimo del Double:" + Long.MIN_VALUE);
        System.out.println("Valor maximo del Double: " + Long.MAX_VALUE);
    }
    
}
