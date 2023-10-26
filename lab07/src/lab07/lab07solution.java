package lab07;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class lab07solution {

	public static void main(String[] args) {
		ArrayList<Integer> nums = readFile();
		writeFile(nums);
	}
	
	public static ArrayList<Integer> readFile() {
		
		ArrayList<Integer> numbers = new ArrayList<>();

		try (Scanner fileScanner = new Scanner(Paths.get("tester.txt"))) {

			
			while (fileScanner.hasNextLine()) {
				String line = fileScanner.nextLine();
				
				if (line.isEmpty()) {
					continue;
				}
				
				// parse (convert) this String
				// then add to your ArrayList
				
				
				// line is "1,2,3"
				String[] strings = line.split(",");
				// strings is ["1","2","3"]
				
				int sum = 0;
				for (String s : strings) {
					sum += Integer.valueOf(s);
					// sum += 1
					// sum += 2
					// sum += 3
				}
				numbers.add(sum);
				
				// sum is 6
				
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return numbers;
	}
	
	public static void writeFile(ArrayList<Integer> numbers) {
		try (PrintWriter pw = new PrintWriter("output.txt")) {

			for (int num : numbers) {
				pw.println(num);
			}
			
			pw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("output.txt has been written!");
	}
	

}
