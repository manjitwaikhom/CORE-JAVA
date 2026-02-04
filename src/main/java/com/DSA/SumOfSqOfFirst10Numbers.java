package com.DSA;
class SumOfSqOfFirst10Numbers
{
	public static void main(String args[])
	{		
		int n, sum=0;
		for(n=1;n<=10;n++)
		{
			sum+=n*n;    //or sum=sum+n;*n
		}
		System.out.println(sum);
	}
}