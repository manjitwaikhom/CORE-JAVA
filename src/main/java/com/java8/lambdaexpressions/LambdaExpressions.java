package com.java8.lambdaexpressions;

/**
 * @author manjit
 *
 */
public class LambdaExpressions {
	 public static void main(String args[]) {
		 LambdaExpressions tester = new LambdaExpressions();
			
	      //with type declaration
	      MathOperation addition = (int a, int b) -> a + b;
	      System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
	      
	      
	      //with out type declaration
	      MathOperation subtraction = (a, b) -> a - b;
	      System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
	      
	      //with return statement along with curly braces
	      MathOperation multiplication = (int a, int b) -> { return a * b; };
	      System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));	
	      
	      
	      //without return statement and without curly braces
	      MathOperation division = (int a, int b) -> a / b;
	      System.out.println("10 / 5 = " + tester.operate(10, 5, division));
	      
			
	      //without parenthesis
	      GreetingService greetService1 = message ->
	      System.out.println("Hello " + message);
			
	      //with parenthesis
	      GreetingService greetService2 = (message) ->
	      System.out.println("Hello " + message);
			
	      greetService1.sayMessage("Mahesh");
	      greetService2.sayMessage("Suresh");
	   }
	
	 //----------------------------
	 @FunctionalInterface
	   interface MathOperation {
	      int operation(int a, int b);
	   }
	//----------------------------
	 @FunctionalInterface
	   interface GreetingService {
	      void sayMessage(String message);
	   }
	 
	 
	   private int operate(int a, int b, MathOperation mathOperation) {
	      return mathOperation.operation(a, b);
	   }
}
