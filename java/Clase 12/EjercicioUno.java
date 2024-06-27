/*
Ejercicio 1: Construir un programa que, dado un número total de
horas, devuelve el número de semanas, días y horas equivalentes.
Por ejemplo dado un total de 1000 horas debe mostrar 5 semanas,
6 días y 16 horas.
 */
import java.util.Scanner;
public class EjercicioUno{
	public static void main(String Args[]){
		int totalHoras, semanas, dias, horas;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese el total de horas");
		totalHoras = entrada.nextInt();
		
		semanas = totalHoras / 168;
		dias = totalHoras / 24;
		horas = totalHoras % 24;
		
		System.out.println("Son: " + semanas + " Semana/s");
		System.out.println("Son: " + dias + " Dia/ s");
		System.out.println("Son: " + horas + " Hora/ s");
		
		
		
	}
	}
