//prints the middle character of the string

import java.util.Scanner;

public class MiddleOfString {
	public static void main(String[] args) {
		System.out.println("Please enter a string: ");
		Scanner sc = new Scanner(System.in); //sets up a user input
		String str = sc.nextLine(); //reads user input as a string
		int len = str.length()/2;
		System.out.println(str.charAt(len));
		
		sc.close();
	}

}
