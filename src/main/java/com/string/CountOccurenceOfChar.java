package com.string;

import java.util.HashMap;

public class CountOccurenceOfChar {

	public static void main(String[] args) {
		String str = "programming";
		char[] cArr = str.toCharArray();
		HashMap<Character, Integer> map = new HashMap<>();

		for (char c : cArr) {
			if (map.containsKey(c)) {
				int val = map.get(c);
				map.put(c, val + 1);
			} else {
				map.put(c, 1);
			}
		}

		System.out.println(map);
	}
}
