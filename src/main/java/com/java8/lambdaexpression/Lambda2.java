package com.java8.lambdaexpression;

/**
 * @author manjit
 *
 */
public class Lambda2 {
	public static void main(String args[]) 
	{ 
		// lambda expression to implement above 
		// functional interface. This interface 
		// by default implements abstractFun() 
		FuncInterface fobj = (int x,int y)->System.out.println(x*y); 

		// This calls above lambda expression and prints 10. 
		fobj.abstractFunction(5,3); 
	} 

}

@FunctionalInterface
interface FuncInterface 
{ 
	// An abstract function 
	void abstractFunction(int x,int y); 

} 
