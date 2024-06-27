/*
 Determinar si el alumno aprueba o reprueba el curso, sabiendo que 
 * aprobará si su promedio de tres calificaciones es mayor o igual a 70
 * reprueba caso contrario
 */
 import java.util.Scanner;
public class EjercicioUno{
	public static void main(String Args[]){
				
		float nota1, nota2, nota3, promedio;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite las tres calificaciones");
		nota1 = entrada.nextFloat();
		nota2 = entrada.nextFloat();
		nota3 = entrada.nextFloat();
		promedio = (nota1 + nota2 + nota3)/3;
		
		if (promedio >= 70){
			System.out.println("usted Aprobó con " + promedio);
			}else{
				System.out.println("Usted desaprobó con " + promedio);
				}
		}
	}
