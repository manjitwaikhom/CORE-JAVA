package com.DSA;

import java.util.HashSet;
import java.util.Set;

public class AllPalindromicSubstrings_BirlaSoft {


    //Using Rabin Karp and Center Expansion

    private static void expandAndAdd(String str, int left, int right, Set<String> set) {
        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
            set.add(str.substring(left, right + 1));
            left--;
            right++;
        }
    }

    public static Set<String> allPalindromes(String str) {
        Set<String> palindromes = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            // Odd length
            expandAndAdd(str, i, i, palindromes);
            // Even length
            expandAndAdd(str, i, i + 1, palindromes);
        }
        return palindromes;
    }

    public static Set<String> allPalindromeBrutForce(String s){
        int n = s.length();

        //usig TreeSet to mantain order
        Set<String> result=new HashSet<>();

        //to store substrings
        String cur="";

        for (int i = 0; i < n; i++) {

            for(int j=i+1;j<=n;j++){
                cur=s.substring(i,j);
                // check if cur is palindrome
                Boolean isPalin= isPalindrome(cur);
                if(isPalin){
                    result.add(cur);
                }
            }

        }

        return result;
    }

    public static Boolean isPalindrome(String str){
        Boolean isPalindrome=false;
        String reverse="";
        if(str!=null && str !="") {

            for (int k = str.length()-1; k >= 0; k--) {
                reverse = reverse + str.charAt(k);
            }
            if (reverse.equals(str)) {
                isPalindrome = true;
            }
        }

        return isPalindrome;
    }

    public static void main(String[] args) {
        String str = "babaab";
        //Set<String> result = allPalindromes(str);
        Set<String> result = allPalindromeBrutForce(str);
        System.out.println("All Palindromic Substrings: Expected[aa, a, aba, b, bab, baab]");
        System.out.println( "Result: " + result);

    }
}
