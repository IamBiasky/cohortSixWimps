public class EmployeeTest{

	public static void main(String [] args){

	

	Employee firstStaff = new Employee ("Isaac", "John", 1000.0);
	System.out.println(firstStaff.getFirstName());
	System.out.println(firstStaff.getLastName());
	System.out.println(firstStaff.getMonthlySalary());

	firstStaff.setFirstName("Peter");
	System.out.println(firstStaff.getFirstName());
	firstStaff.setMonthlySalary(2000.00);
	System.out.println(firstStaff.getMonthlySalary());
	firstStaff.increaseSalary(10);
	System.out.println(firstStaff.getMonthlySalary());



	/*Employee secondStaff = new Employee ("Indaboski", "Bahosea", 2000.0);
	
	System.out.println(firstStaff);
	firstStaff.monthlySalary();
	System.out.println(firstStaff.getMonthlySalary() * 12);

	secondStaff.monthlySalary(2000.0);
	System.out.println(secondStaff.getMonthlySalary() * 12);
	*/
	}

}