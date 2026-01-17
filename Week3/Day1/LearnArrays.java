package week3.day1;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {

		// Array Literal
		// index 0 1 2 3 4
		int[] scores = { 90, 87, 68, 100, 78 };

		// To find the number of elements -length
		int arrayLength = scores.length;
		System.out.println("The number of elements is: " + arrayLength);

		// To retrieve an element from the Array
		System.out.println(scores[4]);

		System.out.println("------------------------");

		// To retrieve all the values
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}

		// To print the lowest and highest
		// Sort the Array - sort the array in ascending order/ascii order

		// sort - Arrays
		Arrays.sort(scores);
		// 0 1 2 3 4
		// {68,78,87,90,100}

		// Lowest
		System.out.println("The lowest value is: " + scores[0]);

		// Highest
		System.out.println("The Highest value is: "+scores[arrayLength - 1]);

		// Instantiation
		int[] marks = new int[3];
		marks[0] = 55;
		marks[1] = 98;
		marks[2] = 100;
	}
}
