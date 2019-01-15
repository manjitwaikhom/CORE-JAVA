package com.arrays;
class PassArray
{
public static void main(String []args)
{

String array[]={"abc","def","hig","xyz"};
arrayPrint(array); //passing the array as a argument
}


public static void arrayPrint(String []array)
{
for(int i=0;i<array.length;i++)
{
System.out.println(array[i]);
}
}
}
