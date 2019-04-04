package com.java5.variableArguments;

public class VariableArguments { 
    public static void main(String args[]) 
    { 
       
    	varArgs(100);         // one parameter 
    	varArgs(1, 2, 3, 4, 5);  // five parameters 
    	varArgs();            // no parameter 
    	
    	varArgs2("Hello  ",100);         // one parameter 
    	varArgs2("Hello  ", 1, 2, 3, 4, 5);  // five parameters 
    	varArgs2("Hello  ");            // no parameter 
    }
    
    // A method that takes variable number of integer arguments. 
    static void varArgs(int ...a) 
    { 
        System.out.println("Number of arguments: " + a.length); 
  
        for (int i: a) 
            System.out.print(i + " "); 
        System.out.println(); 
    } 
    
    static void varArgs2(String str,int ...a) 
    { 
        System.out.println("Number of arguments: " + a.length); 
  
        System.out.print("String arg: "+str); 
        for (int i: a) 
            System.out.print(i + " "); 
        System.out.println(); 
    } 
} 
