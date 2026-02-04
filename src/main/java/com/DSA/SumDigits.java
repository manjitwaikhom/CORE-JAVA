//Note: Scanner class work with JDK1.5 or above
package com.DSA;


import java.util.*;
class SumDigits
{
	public static void main(String args[])
	{		
		int n;
		int res;
		int sum;
		Scanner scan= new Scanner(System.in);
		System.out.println("Please Enter No.: ");
		n=scan.nextInt();
		sum=0;
		while(n>0)
		{
			res=n%10;
			n=n/10;
			sum=sum+res;
		}
		
		System.out.println("Sum of digits is: "+sum);

	}
	}