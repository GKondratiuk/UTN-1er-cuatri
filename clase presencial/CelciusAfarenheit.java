//2) Haga un programa en java que permita pasar de grados Celsius a grados Fahrenheit
//La formula a utilizar es
//(celcius * 9/5) + 32
import java.util.Scanner;

public class CelciusAfarenheit{
	public static void main(String Args[]){
		float celcius, farenheit;
		celcius = 0;
		farenheit = 0;
	
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Hola, Ingrese los grados Celcius a convertir a Farenheit");
		celcius = entrada.nextFloat();
		farenheit = (celcius * 9 / 5 ) + 32;
		
		System.out.println("Los grados celcius convertidos en farenheit dan, " + farenheit +" Grados Farenheit" );
		
		}
	}
