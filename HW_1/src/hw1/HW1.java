package hw1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HW1 {
	
	static boolean isPrime(int x) {
		if (x <= 1) {
			return false;
		} else if (x == 2) {
			return true;
		} else if (x%2 == 0) {
			return false;
		} else {
			for (int i = 3; i < x; i = i + 2) {
				if (x%i == 0) {
					return false;
				}
			}
			return true;
		}
	}
	
	static String divSpecial(int n1) {
		if (n1 % 5 == 0 && n1 % 11 == 0) {
			return "Bingo";
		} else if (n1 % 5 == 0) {
			return "divFive";
		} else if (n1 % 11 == 0) {
			return "divEleven";
		} else if (isPrime(n1)) {
			return "Go Blazers";
		} else {
			return String.valueOf(n1*n1*n1);
		}
		
	}
	
	static List<Integer> posDivisors(int x) {
		List<Integer> myDivisors = new ArrayList<Integer>();
		int i = 1;
		while (i<x) {
			if (x%i == 0) {
				myDivisors.add(i);
			}
			i++;
		}
		return myDivisors;
	}
	
	static boolean blazerNumber(int n2) {
		int sum = 0;
		
		List<Integer> divs = posDivisors(n2);
		
		for(int i=0; i<divs.size(); i++) {
			sum = sum + divs.get(i);
		}
		if (sum == n2) {
			return true;
		} else {
			return false;
		}
			
	}
	
	static String nextDay() {
		int y = -1;
		int m = 0;
		int d = 0;
		int y2 = 0;
		int m2 = 0;
		int d2 = 0;
		Scanner sc = new Scanner(System.in);
		List<Integer> thirty = new ArrayList<Integer>(4);
		thirty.add(4);
		thirty.add(6);
		thirty.add(9);
		thirty.add(11);
		//int thirty[] = {4, 6, 9, 11};
		while (y < 0) {
			System.out.println("Please enter the year: ");
			y = sc.nextInt();

		}
		while (m <= 0 || m > 12) {
			System.out.println("Please enter the month: ");
			m =sc.nextInt();


		}
		while (d <= 0 || d > 31) {
			System.out.println("Please enter the day: ");
			d =sc.nextInt();
		} sc.close();
		
		if (d == 28 && m == 2) {
			if((y%4 == 0 && y%100 != 0) || y%400 == 0) {
				m2 = m;
				d2 = d+1;
				y2 = y;
			} else {
				m2 = m+1;
				d2 = 1;
				y2 = y;
			}


		} else if (d == 29 && m ==2) {
			if((y%4 == 0 && y%100 != 0) || y%400 == 0) {
				m2 = m+1;
				d2 = 1;
				y2 = y;
			} else {
				System.out.println("That is not a leap year!");
				return null;
			}
			m2 = m+1;
			d2 = 1;
			y2 = y;
		} else if (d == 30) {
			if (thirty.contains(m)) {
				m2 = m+1;
				d2 = 1;
				y2 = y;
			} else if (m == 2) {
				System.out.println("That month does not have that many days!");
				return null;
			} else {
				m2 = m;
				d2 = d+1;
				y2 = y;
			}

		} else if (d == 31) {
			if (m == 12) {
				y2 = y+1;
				m2 = 1;
				d2 = 1;
			} else if (thirty.contains(m)) {
				System.out.println("That month does not have that many days!");
				return null;
			} else if (m == 2) {
				System.out.println("That month does not have that many days!");
				return null;
			} else {
				y2 = y;
				m2 = m+1;
				d2 = 1;
			}
		} else {
			m2 = m;
			d2 = d+1;
			y2 = y;
		}
		return "The next date is " +y2 + '-' + m2 + '-' + d2;
	}
	
	static int numSteps(int n) {
		int counter = 0;
		
		while (n > 0) {
			if (n%2 == 0) {
				n = n/2;
				counter++;
			}else {
				n--;
				counter++;
			}
		}
		return counter;
	}
	
	static boolean grader(double avg_exams, double avg_hw, int attendance) {
		if (attendance <= 20) {
			System.out.println("FAIL");
			return false;
		} else if (avg_exams < 70 || avg_hw < 70) {
			System.out.println("FAIL");
			return false;
		} else if (avg_exams < 85 && avg_hw < 85) {
			System.out.println("FAIL");
			return false;
		}
		System.out.println("PASS");
		return true;
	}

	public static void main(String[] args) {
		
		System.out.println("Question 1 - divSpecial");
		System.out.println(divSpecial(15));
		System.out.println(divSpecial(77));
		System.out.println(divSpecial(110));
		System.out.println(divSpecial(17));
		// Try out some more test cases!
		System.out.println("/////////////////\n");
		System.out.println("Question 2 - blazerNumber");
		System.out.println(blazerNumber(28));
		System.out.println(blazerNumber(12));
		System.out.println(blazerNumber(6));
		System.out.println(blazerNumber(27));
		// Make sure you test out some more test cases!
		System.out.println("/////////////////\n");
		System.out.println("Question 3 - nextDay");
		// NOTE: Cannot print a function that returns void!
		// We must print functions that return int, String, boolean
		// Try putting nextDay() inside a print statement!
		System.out.println(nextDay());
		System.out.println("/////////////////\n");
		System.out.println("Question 4 - numSteps");
		System.out.println(numSteps(14));
		// Add some more test cases!
		System.out.println("/////////////////\n");
		System.out.println("Question 5 - grader");
		grader(72, 88, 22);
		grader(66, 100, 24);
		grader(100, 90, 18);
		grader(98, 75, 19);
		// Please add some more test cases!
		System.out.println("/////////////////");

	}

}
