package lab3;

public class UABPersonTester {

	public static void main(String[] args) {
		
		UABPerson alice = new UABPerson("Alice", "she/her", 20, "aliceal");
		UABPerson bob = new UABPerson("Bob", "he/him", 46, "bobob");
		UABPerson hannah = new UABPerson("HaNnAh", "they/them", 19, "hann");
		
		
		System.out.println("Testing toString method: " + bob.toString());
		System.out.println("Testing checkPalindrome method: " + bob.checkPalindrome());
		System.out.println("Testing yearsUntilRetirement: " + bob.getName() + " has " + bob.yearsUntilRetirement() + " years until retirement.\n");
		
		System.out.println("Testing toString method: " + alice.toString());
		System.out.println("Testing checkPalindrome method: " + alice.checkPalindrome());
		System.out.println("Testing yearsUntilRetirement: " + alice.getName() + " has " + alice.yearsUntilRetirement() + " years until retirement.\n");
		
		System.out.println("Testing toString method: " + hannah.toString());
		System.out.println("Testing checkPalindrome method: " + hannah.checkPalindrome());
		System.out.println("Testing yearsUntilRetirement: " + hannah.getName() + " has " + hannah.yearsUntilRetirement() + " years until retirement.");

	}

}
