package ejercicio_7;
import java.util.Scanner;
/*
Una compañia de venta de carros usados, paga a su personal de venta un salario de $1000 mensuales
mas una comision de venta de $150 por cada carro vendido, mas el 5% del valor de la venta por carro
Cada mes el capturista de la empresa ingresa en la computadora los datos pertinentes.

Hacer un programa que calcule e imprima el salario mensual de un vendedor dado.

El salario de 1000 lo vamos a manejar como un dato constante, para asignarlo debemos usar la palabra reservada
"final"
*/

public class Ejercicio_7 {
    public static void main(String[] args) {
       int salario = 1000;
       double salarioFinal = 0;
       double comision = 0;
       int finalComision = 0;
       int autosVendidos;
       double valorAuto, totalPorcentajeVenta;
       double totalValorAuto = 0.0;
       
       Scanner entrada = new Scanner(System.in);
       
        System.out.println("¿Cuantos autos vendió?");
        autosVendidos = entrada.nextInt();
        
        for(int i = 0; i < autosVendidos; i++){
            System.out.println("¿Cual es el valor del auto?");
            valorAuto = entrada.nextDouble();
            
            totalValorAuto = totalValorAuto + valorAuto;
           
        }
        System.out.println("Valor total de autos venidos: " + totalValorAuto);
        
        System.out.println("----------------------------------");
        
        comision = 150 * autosVendidos; 
        System.out.println("Comision por auto/s vendido/s: " + comision );
        
        System.out.println("----------------------------------");
        
        totalPorcentajeVenta = totalValorAuto * 0.05;
        System.out.println("Porcentaje por auto/s vendido/s: " + totalPorcentajeVenta);
        
        System.out.println("----------------------------------");
        
        salarioFinal = salario + totalPorcentajeVenta + comision;
        System.out.println("El salario mensual total del empleado es de " + salarioFinal);
        
        
    }
}
