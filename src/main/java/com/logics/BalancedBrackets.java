package com.logics;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {

    public static void main(String[] args) {
	//a*(b+c)-(d*e)
	//(a*(b-c)*{d+e}

	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter a string to check if it has balanced brackets");
	String input = scanner.next();
	scanner.close();

	String checkBalancedExpr = checkBalancedParentesis(input);
	System.out.println(input + " : " + checkBalancedExpr);

    }

    public static String checkBalancedParentesis(String expr) {
	if (expr.isEmpty())
	    return "Balanced";

	Stack<Character> stack = new Stack<Character>();
	for (int i = 0; i < expr.length(); i++) {
	    
	    char current = expr.charAt(i);
	    
	    if (current == '{' || current == '(' || current == '[') {
		stack.push(current);
	    }
	    
	    if (current == '}' || current == ')' || current == ']') {
		if (stack.isEmpty()) {
		    return "Not Balanced";
		}
		char last = stack.peek();
		
		if (current == '}' && last == '{' || current == ')' && last == '(' || current == ']' && last == '[') {
		    stack.pop();
		}else {
		    return "Not Balanced";
		}
	    }
	    
	}
	return stack.isEmpty() ? "Balanced" : "Not Balanced";
    }

}
