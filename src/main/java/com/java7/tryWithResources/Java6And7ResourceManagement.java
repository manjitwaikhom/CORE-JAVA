package com.java7.tryWithResources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Java6And7ResourceManagement {

	public static void main(String[] args) {
		// java 6 style
		BufferedReader br1 = null;
		try {
			br1 = new BufferedReader(new FileReader("D:\\hello.txt"));
			System.out.println(br1.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br1 != null)
					br1.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}

		// java 7 style (Try with Resources new feature)

		try (BufferedReader br2 = new BufferedReader(new FileReader("D:\\hello.txt"))) {
			System.out.println(br2.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
