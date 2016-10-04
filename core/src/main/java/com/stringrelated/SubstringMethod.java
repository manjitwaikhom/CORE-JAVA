package com.stringrelated;
public class SubstringMethod{
   public static void main(String args[]){
      String Str = new String("Welcome to waikhom.com");

      System.out.print("Return Value :" );
      System.out.println(Str.substring(10) );

      System.out.print("Return Value :" );
      System.out.println(Str.substring(10, 15) );
   }
}
/*
Return Value : waikhom.com
Return Value : Tuto

*/