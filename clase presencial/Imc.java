import java.util.Scanner;
//1) Haga un programa en java que calcule el imc de una persona.
//La formula para calcular es peso / (altura * altura)

public class Imc{
	public static void main(String Args[]){
		float altura, imcPersona;
		altura = 0;
		imcPersona = 0; 
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Hola, Ingrese su altura");
		altura = entrada.nextFloat();
		imcPersona = altura * altura;
		
		System.out.println("Su IMC es " + imcPersona);
		
		}
	}
