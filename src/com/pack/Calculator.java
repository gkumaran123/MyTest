package com.pack;

public class Calculator {
	public static void main(String[] args) {
		calculateSalary(500, 8);
	}

	private static void calculateSalary(int charge, int hrsWorking) {
		double totalSalary = 52*charge*hrsWorking;
		System.out.println(totalSalary);
	}

}
