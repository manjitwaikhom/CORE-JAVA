package com.java8.lambdaexpression;

/**
 * @author manjit
 *lambda expressions implements the only abstract function and in effect implements functional interfaces
 *(An interface with single abstract method is called functional interface. An example is java.lang.Runnable)
 */

//A sample functional interface (An interface with single abstract method)



class LambdaExpression 
{ 
    public static void main(String args[]) 
    { 
        // lambda expression to implement above 
        // functional interface. This interface 
        // by default implements abstractFun() 
        FunctionalInterfaceTest fobj = (int x)->System.out.println(2*x); 
  
        // This calls above lambda expression and prints 10. 
        fobj.abstractMethod(5); 
    } 
    
   
}

/* An interface with single abstract method is called functional interface */
@FunctionalInterface
interface FunctionalInterfaceTest{
	
// An abstract function 
    void abstractMethod(int x); 
    
 // A non-abstract (or default) function 
    default void normalMethod() 
    { 
       System.out.println("Hello"); 
    } 
	
}





