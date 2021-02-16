public class AccountTest {

	public static void main(String [] args) {

	Account isaac = new Account("Isaac John", 30000.00);

	System.out.printf("Balance is " + isaac.getBalance());

	double depositAmount = 1000.00;

	System.out.printf("%nadding $%.2f%n to isaac balance%n%n", depositAmount);

	isaac.deposit(depositAmount);

	System.out.printf("My Name Is %s%n And My Account Balance Is %.2f%n", isaac.getName(), isaac.getBalance());

	}

}