/*
 * Ejercicio 3: Leer 2 numeros; si son iguales que los multiplique
 * si el primero es mayor que el segundo que lo reste 
 * y si no son que los sume*/
import java.util.Scanner;
public class EjercicioTres{
	public static void main(String Args[]){
		Scanner entrada = new Scanner(System.in);
		
		double num1, num2, resultado;
		
		System.out.println("Digite dos numeros");
		num1 = entrada.nextDouble();
		num2 = entrada.nextDouble();
		
		if(num1 == num2){
			resultado = num1 * num2;
			}
		else if(num1>num2){
			resultado = num1 - num2;	
			}else{
				resultado = num1 + num2;
				}
				
		System.out.println("el resultado es " + resultado);
	}
	}
