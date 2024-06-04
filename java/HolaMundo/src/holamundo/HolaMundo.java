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
     //***************************************
     //var - inferencia de tipos en java
     //***************************************
     
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
        
     //***************************************
        //Ejercicios de caracteres especiales en  java 
     //***************************************
     
     
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
     /*
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
*/
     //***************************************************
     //INFERENCIA DE TIPOS VAR Y TIPOS PRIMITIVOS
     //***************************************************
     /*
     var numEntero = 20; //Las literales sin punto automaticamente son del tipo int 
        System.out.println("numEntero = " + numEntero);
        var numFloat = 10.0F; //automaticamente con el punto, se transforma en double
        System.out.println("numFloat = " + numFloat);
        var numDouble = 10.0;
        System.out.println("numDouble = " + numDouble);
        
        //***************************************************
        //TIPOS PRIMITIVOS CHAR
        //***************************************************
        
        char miVariableChar = 'a';
        System.out.println("miVariableChar = " + miVariableChar);
        
        char varCaracter = '\u0024'; // indicamos a java la asignacion con el codigo unicode
        System.out.println("varCaracter = " + varCaracter);
        
        char varCaracterDecimal = 36; //este es el valor decimal del juego de caracteres unicode
        System.out.println("varCaracterDecimal = " + varCaracterDecimal);
        
        char varCaracterSimbolo = '$'; //Un caracter especial, podemos copiar y pegar desde unicode
        System.out.println("varCaracterSimbolo = " + varCaracterSimbolo);
        System.out.println("");
        
        System.out.println("***************************************************");
        
        var varCaracter1 = '\u0024'; // indicamos a java la asignacion con el codigo unicode
        System.out.println("varCaracter1 = " + varCaracter1);
        
        var varCaracterDecimal1 = (char)36; //convertimos a char
        System.out.println("varCaracterDecimal1 = " + varCaracterDecimal1);
        
        var varCaracterSimbolo1 = '$'; //Un caracter especial, podemos copiar y pegar desde unicode
        System.out.println("varCaracterSimbolo1 = " + varCaracterSimbolo1);
        
         System.out.println("***************************************************");
         
        int varEnteroChar = '$'; //nos muestra un char, el valor decimal asociado al simbolo
        System.out.println("varEnteroChar = " + varEnteroChar);
        
        int caracterChar = 'k';
        System.out.println("caracterChar = " + caracterChar);
     
*/
     
     /*
     boolean varBool = false;
        System.out.println("varBool = " + varBool);
     
        if(varBool){
            System.out.println("La bandera es verde");
        }
        else{
            System.out.println("La bandera es roja");
        }
        
        //ALGORITMO ¿ES MAYOR?
        
        var edad = 30;
        var adulto = edad >= 18;
        if(adulto){
            System.out.println("Eres mayor de edad");
        }
        else{
            System.out.println("Eres menor");
     }
*/
     
     //CONVERSIONES DE TIPOS PRIMITIVOS
     
//     var edad = Integer.parseInt("20"); // clase que permite convertir el string a integer
//        System.out.println("edad = " + (edad + 1));
//     
//     var valorPI = Double.parseDouble("3.1416");
//        System.out.println("valorPI = " + valorPI);
//        
//        //PEDIR UN VALOR 
//        
        var entrada = new Scanner(System.in);
//        System.out.println("DIGITE SU EDAD");
//        edad = Integer.parseInt(entrada.nextLine()); 
//        System.out.println("edad = " + edad);
//        
     
     //CONVERSIÓN DE TIPOS PRIMITIVOS EN JAVA PARTE 2
     
     /*
     var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);
    
     var fraseChar = "programadores".charAt(0); //nos mostrará el primer caracter de nuestra cadena
        System.out.println("fraseChar = " + fraseChar);
     
        System.out.println("Digite un caracter");
        fraseChar = entrada.nextLine().charAt(0); //toma 1 caracter de la palabra
        System.out.println("fraseChar = " + fraseChar);
*/
     /*
     int num1 = 5, num2 = 4;
     var solucion = num1 + num2;     
        System.out.println("solucion suma = " + solucion);
        
        solucion = num1 - num2;     
        System.out.println("solucion resta = " + solucion);
        
        solucion = num1 * num2;     
        System.out.println("solucion multiplicacion = " + solucion);
        
        solucion = num1 / num2;     
        System.out.println("solucion division = " + solucion);
        
        var solucion2 = 3.4 / num2;
        System.out.println("resultado de la division " + solucion2);
        
        solucion = num1 % num2; //Guarda el residuo entero de la division 
        System.out.println("solucion = " + solucion);
        
        if(num2 % 2 == 0)
            System.out.println("es par");
        else
            System.out.println("Es un numero impar");
        
        */
     /*
     int varNum1 = 1, varNum2 = 4;
     int varNum3 = varNum1 + 6 - varNum2;
        System.out.println("varNum3 = " + varNum3);
        
        varNum1 += 1; // Es igual a decir: varNum1 = varNUm1 + 1;
        System.out.println("varNum1 = " + varNum1);
        
            varNum2 -= 2; // Es igual a decir: varNum1 = varNUm1 + 1;
        System.out.println("varNum2 = " + varNum2);
        
            varNum1 *= 5; // Es igual a decir: varNum1 = varNUm1 + 1;
        System.out.println("varNum1 = " + varNum1);
        
            varNum1 /= 4; // Es igual a decir: varNum1 = varNUm1 + 1;
        System.out.println("varNum3 = " + varNum3);
        
            varNum1 %= 6; // Es igual a decir: varNum1 = varNUm1 + 1;
        System.out.println("varNum1 = " + varNum1);
        */
     
     //OPERADORES UNARIOS: CAMBIO DE SIGNO
     /*
     var varA = 7;
     var varB = -varA;
        System.out.println("varA = " + varA);
        System.out.println("varB = " + varB); //El resultado es un numero en negativo
        
    //OPERADOR DE NEGACION
    var varC = true;
    var varD = !varC; //Invierte el valor 
        System.out.println("varC = " + varC);
        System.out.println("varD = " + varD);
        
        //OPERADORES UNARIOS DE INCREMENTO: PREINCREMENTO
        
        var varE = 9; 
        var varF = ++varE; //INCREMENTA EL VALOR DE varE en 1
        System.out.println("varE = " + varE);
        System.out.println("varF = " + varF);
        
        //POST-INCREMENTO (EL SIMBOLO VA DESPUES DE LA VARIABLE)
        var varG = 3;
        var varH = varG++; //El incremento solo afecta a la variable G
        System.out.println("varG = " + varG);
        System.out.println("varH = " + varH);
        
        //OPERADORES UNIARIOS DE DECREMENTO
        //PRE-DECREMENTO
        var varI = 4;
        var varJ = --varI; //El decremento afecta a las dos variables
        System.out.println("varI = " + varI);
        System.out.println("varJ = " + varJ);
        
        //POST-DECREMENTO
        var varK = 8;
        var varL = varK--; //El incremento solo afecta a la primer variable
        System.out.println("varK = " + varK);
        System.out.println("varL = " + varL);
        */
     
     //OPERADORES DE IGUALDAD Y RELACIONALES
     /*
     var aNum = 5;
     var bNum = 3;
     var cNum = (aNum == bNum); //si a es igual a b
        System.out.println("cNum = " + cNum);
        
        var dNum = aNum != bNum; // so d es distinto a a y b
        System.out.println("dNum = " + dNum);
        
        var cadenaA = "Hello";
        var cadenaB = "Bye ";
        var cVar = cadenaA == cadenaB; //compara si A es igual a B - comparacion de referencia
        System.out.println("cVar = " + cVar);
        
        var fVar = cadenaA.equals(cadenaB); //comparacion de lo que tienen guardado las variables
        System.out.println("fVar = " + fVar);
        
        var gVar = aNum > bNum;
        System.out.println("gVar = " + gVar);
        
        if(aNum % 2 == 0)
            System.out.println("Es par");
        else
            System.out.println("Es impar");
        
        var edad = 30;
        var adulto = 18;
        if (edad >= adulto){
            System.out.println("Es mayor de edad");}
        else
            System.out.println("Es menor de edad");
        */
     /*
     var valorA = 7;
     var valorMinimo = 0; //creamos un rango de 0 a 10
     var valorMaximo = 10;
     var respuesta = valorA >= 0 && valorA <= 10;
     
     if(respuesta){
            System.out.println("Está dentro del rango establecido");
     }else{
            System.out.println("Está fuera del rango establecido");
     }
     var vacaciones = false;
     var diaLibre = false;
     if(vacaciones || diaLibre)
            System.out.println("Papá puede asistir al juego");
     else
            System.out.println("Papá no puede asistir al juego");
     */
     
     //OPERADOR TERNARIO
     /*
     var resultadoT = (5 > 4) ? "Verdadero" : "Falso"; //5 es mayor a 4 ?
        System.out.println("resultadoT = " + resultadoT);
     
        var numeroT = 7;
        resultadoT = (numeroT % 2 == 0) ? "Es par" : "Es impar";
        System.out.println("resultadoT = " + resultadoT);
*/
     
     var x = 5;
     var y = 10;
     var z = ++x + y--;
        System.out.println("x = " + x); //6
        System.out.println("y = " + y); //9
        System.out.println("z = " + z); //16
        
        var solucionAritmetica = 4 + 5 * 6 /3;
        System.out.println(solucionAritmetica);
        
        var solucionAritmetika = (4 + 5) * 6 /3;
        System.out.println(solucionAritmetica);
    }
}
