import java.util.Scanner;

public class Cylinder{

public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.println ("Enter a number for Radius: ");
	double userRadius = input.nextDouble();

	System.out.println ("Enter a number for Length: ");
	double userLength = input.nextDouble();

	double area = userRadius * userRadius * 3.141592653;
	double volume = area * userLength;

	System.out.printf ("The Area Is %.2f%n", area);
	System.out.printf ("The Volume Is %.2f%n", volume);

	}

}