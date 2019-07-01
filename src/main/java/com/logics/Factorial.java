package com.logics;

import java.util.Scanner;

class Factorial{
    
    static int factorial(int n){    
     if (n == 0)    
       return 1;    
     else    
       return(n * factorial(n-1));    
    }
    
    static int factorialByLoop(int x) {
	int fact=1;
	 if (x == 0)    
	       return 1;    
	     else    
	for(int i=x;i>0;i--) {
	    fact=fact*i;
	}
	 return fact;
    }
    
    
    public static void main(String args[]){  
    Scanner scan=new Scanner(System.in);
    System.out.println("Please write a number");
     int number=scan.nextInt();//It is the number to calculate factorial   
     scan.close();
     //by recursion
     //int fact = factorial(number); 
     
     //using loop
      int fact =factorialByLoop(number);
     System.out.println("Factorial of "+number+" is: "+fact);    
    }  
   }  
