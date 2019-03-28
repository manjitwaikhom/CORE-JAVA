package com.string;

import java.util.Scanner;
//reverse a string without using reverse() method
public class ReverseString {
	 public static void main(String[] args)
	    {
	        System.out.println("Enter string to reverse:");
	        
	        Scanner read = new Scanner(System.in);
	        String str = read.nextLine();
	        String reverse = "";
	        
	        
	        for(int i = str.length() - 1; i >= 0; i--)
	        {
	            reverse = reverse + str.charAt(i);
	        }
	        
	        System.out.println("Reversed string is:");
	        System.out.println(reverse);
	        read.close();
	    }
}
