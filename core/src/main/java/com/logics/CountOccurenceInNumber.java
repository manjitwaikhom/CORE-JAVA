package com.logics;

import java.util.*;

class CountOccurenceInNumber{

public static void main(String[] arg){

int number,rem,count=0;
Scanner scan= new Scanner(System.in);
		System.out.println("Please Enter No.: ");
		number=scan.nextInt();
System.out.print("number of occurence of 2  in "+number+" is: ");

while(number>0)
{


rem=number%10;
number/=10;

if(rem==2)
count++;



}


System.out.print(count);

}}