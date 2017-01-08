package com.string;

public class SubstringTest {
	public static void main(String[] args) {
		String quote = "Java is to JavaScript what Car is to Carpet";
		// Example 1 - Let's say, we need only "what Car is to Carpet" substring
		// // out start will be 22, you can also do quote.indexOf("what")
		// and
		// we can first substring method
		String substr = quote.substring(22);
		System.out.println(substr);
		// Example 2 - Let's say, we need "Java"
		// from quote
		// start will be 0 and end will be 4 (because end is exclusive)
		String substr2 = quote.substring(0, 4);

		System.out.println(substr2);
		// Example 3 - Following call to
		// substring method will return empty String

		String substr3 = quote.substring(quote.length());

		System.out.println(substr3.isEmpty());
		// Example 4 - substring
		// method will also return empty String if begin = end
		String substr4 = quote.substring(3, 3);
		System.out.println(substr4.isEmpty());

		// Example 5 - This substring call will throw IndexOutOfBoundException

		String substr5 = quote.substring(-1);// start < 0
		String substr6 = quote.substring(2, 1); // start > end } }
	}
}
