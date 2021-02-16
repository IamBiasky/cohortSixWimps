import java.util.Scanner;

public class AddTest{

	public static void main(String[] args){

	Scanner input = new Scanner (System.in);

	int firstNumber;
	int secondNumber;
	int sum;
	int multiply;

	System.out.print("Enter first Number");
	firstNumber = input.nextInt();

	System.out.print("Enter first Number");
	secondNumber = input.nextInt();

	sum = firstNumber + secondNumber;
	multiply = firstNumber * secondNumber;

	System.out.printf("Sum is %d%n", sum);
	System.out.printf("Multiply is %d%n", multiply);

	}

}