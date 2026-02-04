package com.DSA;



public class PrimeNumberBetweenTwoNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		PrimeNumberBetweenTwoNumbers p=new PrimeNumberBetweenTwoNumbers ();
		for(int i=a;i<=b;i++)
		p.isPrimenumber(i);
	}
		
	
	public int isPrimenumber(int x){
		int count=0;
		int i;
		for(i=2;i<x;i++){
			int n=x%i;
			if(n==0){
				return x;
			}
			count++;
			}
		return 0;

	}

}
