package lab04;

public class BankAccountTester {

	public static void main(String[] args) {
		
		// Creating a test1 object where:
		// name is 		"John Smith"
		// accNo is 	153
		// balance is 	4500
		BankAccount test1 = new BankAccount("John Smith", 153, 4500.0);
		
		//System.out.println(b.name);
		/*This statement will raise an error
		 * as the "first" variable in BankAccount class is defined as
		 * private and it cannot be accessed in a public class,
		 * you can only view the details using getter methods you define*/
		
		// test the the methods down here!
		
		// BEFORE: name of test1 is "John Smith"
		System.out.println(test1.getName());
		
		// AFTER: name of test1 is "Alice Bob"
		test1.setName("Alice Bob");
		System.out.println(test1.getName());
		
		// TODO
		
		
	}

}
