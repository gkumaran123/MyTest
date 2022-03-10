package com.pack.array;

import java.util.Scanner;

public class FindAverage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double[] heights;
		System.out.println("Enter number of student in the class");
		int numberOfStudents = sc.nextInt();
		heights = new double[numberOfStudents];

		for (int i = 0; i < numberOfStudents; i++) {
			System.out.println("Enter Height ");
			heights[i] = sc.nextInt();
		}

		double maxHeight = heights[0];
		double total = 0;
		for (double height : heights) {

			total = total + height;
			if (height > maxHeight)
				maxHeight = height;
		}

		System.out.println("The maximum height of the student is " + maxHeight);
		System.out.println("The Average Height is " + total / numberOfStudents);
	}

}
