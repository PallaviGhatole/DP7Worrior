package com.LoopAssignment;

import java.util.Scanner;

public class Automorphic {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = sc.nextInt();
		int x = n, count = 0, auto = 0, y, var;

		while (0 < x) {
			x = x / 10;
			count++;
		}
		var = n * n;
		System.out.println(var);

		for (int i = 0; i < count; i++) {

			y = var % 10;
			auto =  (auto + y *  (int)Math.pow(10, i));
			
			var /= 10;

		}
		if (auto == n) {
			System.out.println(n + " is an Automorphic number.");
		} else {
			System.out.println(n + " is not an Automorphic number.");
		}
		System.out.println(Math.pow(10, 0));

	}
}
