package com.pack.Java8;

import java.util.Scanner;

public class SeriePrint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, out, in;
		System.out.printf("Enter the range of number(Limit):");
		n = sc.nextInt();
		for (out = 1; out <= n; out++) {
			for (in = 1; in <= out; in++) {
				System.out.print(out);
			}
			System.out.print(" ");
		}
		sc.close();
	}

}
