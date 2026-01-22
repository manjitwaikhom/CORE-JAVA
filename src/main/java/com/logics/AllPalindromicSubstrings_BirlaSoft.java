package com.logics;

import java.util.HashSet;
import java.util.Set;

public class AllPalindromicSubstrings_BirlaSoft {

    private static void expandAndAdd(String s, int left, int right, Set<String> set) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            set.add(s.substring(left, right + 1));
            left--;
            right++;
        }
    }

    public static Set<String> allPalindromes(String s) {
        Set<String> palindromes = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            // Odd length
            expandAndAdd(s, i, i, palindromes);
            // Even length
            expandAndAdd(s, i, i + 1, palindromes);
        }
        return palindromes;
    }

    public static void main(String[] args) {
        String str = "babaab";
        Set<String> result = allPalindromes(str);
        System.out.println("All Palindromic Substrings: " + result);
    }
}
