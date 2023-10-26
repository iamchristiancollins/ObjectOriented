package lab12;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Double> doubles = new ArrayList<>();
		doubles.add(-3.0);
		doubles.add(5.1);
		doubles.add(6.2);
		doubles.add(57.3);
		doubles.add(1.0);
		
		System.out.println("DOUBLE");
		
		Pair<Double,Double> question1 = findMinAndMax(doubles);
		System.out.println("Min: " + question1.getKey());
		System.out.println("Max: " + question1.getValue());
		
		Pair<Double,Double> question2 = findAvgAndSum(doubles);
		System.out.println("Avg: " + question2.getKey());
		System.out.println("Sum: " + question2.getValue());
		
		System.out.println("\nINTEGER");
		
		ArrayList<Integer> integers = new ArrayList<>();
		integers.add(-93);
		integers.add(3);
		integers.add(27);
		integers.add(1003);
		integers.add(372);
		
		Pair<Integer,Integer> q3 = findMinAndMax(integers);
		System.out.println("Min: " + q3.getKey());
		System.out.println("Max: " + q3.getValue());
		
		Pair<Integer, Integer> q4 = findAvgAndSum(integers);
		System.out.println("Avg: " + q4.getKey());
		System.out.println("Sum: " + q4.getValue());
	}
	
	public static <T extends Comparable<T>> Pair<T,T> findMinAndMax(ArrayList<T> arr) {
		T min = arr.get(0);
		T max = arr.get(0);
		// TODO for loop on the array to assign a new min and max value
		for (int i = 1; i < arr.size(); i++){
			if (arr.get(i).compareTo(max) > 0){
				max = arr.get(i);
			}
			if (arr.get(i).compareTo(min) < 0){
				min = arr.get(i);
			}

		}
		
		return new Pair<T, T>(min, max);
	}
	
	public static <T extends Number> Pair<T,T> findAvgAndSum(ArrayList<T> arr) {
		if (arr.get(0) instanceof Integer) {
			// handle for integer
			int sum = 0;
			int count = arr.size();
			// TODO complete the code
			for (T t : arr) {
				sum += (int) t;
			}
			
			double avg = (double) sum / count;
			return (Pair<T, T>) new Pair<Double,Integer>(avg, sum);
		} else if (arr.get(0) instanceof Double) {
			// handle for double
			double sum = 0;
			int count = arr.size();
			// TODO complete the code
			for (T t : arr) {
				sum += (double) t;
			}
			
			double avg = sum / count;
			Pair<Double,Double> result = new Pair<>(avg, sum);
			return (Pair<T, T>) new Pair<Double,Double>(avg, sum);
		} 
		// if my arraylist is not storing ints or doubles, return null
		return null;
	}

}
