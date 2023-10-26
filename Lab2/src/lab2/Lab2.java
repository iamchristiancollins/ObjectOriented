package lab2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lab2 {
	
	public static void fileAnalyze() {
		ArrayList<Integer> lines = new ArrayList<>();
		try (Scanner fileScanner = new Scanner(Paths.get("inputFile.txt"))) {
			while (fileScanner.hasNextLine()) {
				int line = fileScanner.nextInt();
				lines.add(line);
			}
			fileScanner.close();
		} catch (IOException e) {
			System.out.println("error: " + e.toString());
			e.printStackTrace();
		}

		try (PrintWriter output = new PrintWriter("outputFile.txt")) {
			for (int i = 0; i < lines.size(); i++) {
				output.println(lines.get(i));
			}
			output.println("**********");
			output.println("There are " + lines.size() + " numbers in this file");
			output.println("The minimum number is " + Collections.min(lines));
			output.println("The maximum number is " + Collections.max(lines));
			float total = 0;
			float avg = 0;
			for (int i = 0; i < lines.size(); i++) {

				total += lines.get(i);
			}
			avg = total / lines.size();
			output.println("The average is: " + avg);
			output.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e.toString());
			e.printStackTrace();
		}
	}

	
	public static String sec2Days(int n) {
		int d = n / 86400;
		String d2 = String.format("%02d", d);
		n = n - (d * 86400);
		

		int h = n / 3600;
		String h2 = String.format("%02d", h);
		n = n - (h * 3600);

		int m = n / 60;
		String m2 = String.format("%02d", m);

		int s = n - (m * 60);
		String s2 = String.format("%02d", s);

		return (d2 + ":" + h2 + ":" + m2 + ":" + s2);

	}
	
	public static int consonantCount(String s) {
		int count = 0;
		ArrayList<Character> vowels = new ArrayList<>();
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');
		vowels.add('y');
		s = s.toLowerCase();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) < 'a' || s.charAt(i) > 'z' || (vowels.contains(s.charAt(i)))) {
				continue;
			} else {
				count++;
			}
		}

		return count;
	}
	
	
	public static void main(String[] args) {
		fileAnalyze();
		System.out.println(sec2Days(750000));
		System.out.println(consonantCount("This is Lab2, folks"));

	}

}
