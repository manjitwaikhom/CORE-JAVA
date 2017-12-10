package com.logics;

import java.util.Scanner;

class Occurence {

	public static void main(String[] arg) {

		int rem, count = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int number = scan.nextInt();
		System.out.print("Number of Occurence of 2 Between 0 and " + number
				+ " is : ");

		for (int i = 1; i <= number; i++) {

			int num = i;

			while (num > 0) {
				rem = num % 10;
				num /= 10;

				if (rem == 2)
					count++;
			}

		}

		System.out.println(count);

	}
}