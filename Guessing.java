import java.util.Scanner;

public class Guessing{

	public static void main(String[] args){
	
Scanner input = new Scanner(System.in);
int numberToGuess = 25;
int userGuess;

	System.out.print("Enter numberToGuess: ");
	userGuess = input.nextInt();

	if (userGuess == numberToGuess)
	System.out.println("You Won");

	if (userGuess > numberToGuess)
	System.out.println("You are wrong, Try Again");

	if (userGuess < numberToGuess)
	System.out.println("You are almost there, Try Again");


	}


}