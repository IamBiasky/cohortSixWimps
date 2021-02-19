import java.util.Scanner;

public class FahrenheitConversion{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a degree in Celsius: ");

		double userCelsius = input.nextDouble();
		double userFahrenheit = ((userCelsius * 1.8) + 32);


		System.out.printf("%.2f Celsius is %.2f fahrenheit", userCelsius, userFahrenheit);
	
	}

}