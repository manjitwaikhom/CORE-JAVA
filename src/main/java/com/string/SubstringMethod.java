package com.string;
public class SubstringMethod{
   public static void main(String args[]){
      String str = new String("Welcome to waikhom.com");

      System.out.print("Return Value :" );
      System.out.println(str.substring(10) );

      System.out.print("Return Value :" );
      System.out.println(str.substring(10, 15) );
   }
}
/*
Return Value : waikhom.com
Return Value : Tuto

*/