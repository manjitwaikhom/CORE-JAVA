package com.logics;

class Fibonacci
{
	public static void main(String args[])
	{		
		int prev, next, sum, n;
		prev=next=1;
		for(n=1;n<=10;n++)
		{
			System.out.println(prev);
			sum=prev+next;
			prev=next;
			next=sum;
		}
	}
}