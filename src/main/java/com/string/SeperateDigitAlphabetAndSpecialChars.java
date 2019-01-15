package com.string;

public class SeperateDigitAlphabetAndSpecialChars {

	public static void main(String[] args) {
		String mixed = "man12@34@#$%jit";
		seperate(mixed);
	}

	public static void seperate(String mixed) {
		StringBuilder alphabets = new StringBuilder();
		StringBuilder digits = new StringBuilder();
		StringBuilder specialChars = new StringBuilder();

		for (int i = 0; i < mixed.length(); i++) {
			char ch = mixed.charAt(i);
			if (Character.isAlphabetic(ch)) {
				alphabets.append(ch);
			} else if (Character.isDigit(ch)) {
				digits.append(ch);
			} else {
				specialChars.append(ch);
			}
		}

		System.out.println("Alphabets are         : " + alphabets.toString());
		System.out.println("Digits are            : " + digits.toString());
		System.out
				.println("Special Characters are: " + specialChars.toString());

	}
}
