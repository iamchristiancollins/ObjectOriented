//prints out the first a digits of the fibonnaci sequence

import java.util.Scanner;

public class Fibonnaci {
	public static void main(String[] args) {
		System.out.println("Please enter a number: ");
		Scanner sc = new Scanner(System.in); //sets up a user input
		int a = sc.nextInt(); //stores the user input as an int
		int n1 = 0;
		int n2 = 1;
		
		for (int i = 0; i < a; i++) {
			System.out.println(n1);
			int new_number = n1 + n2;
			n1 = n2;
			n2 = new_number;
		}
		
		sc.close();
}

}
