package com.stringtokenizer;
import java.util.StringTokenizer;

class MyStringTokenizer{
public static void main(String arg[]){
StringTokenizer st = new StringTokenizer("this is a test");
     while (st.hasMoreTokens()) {
         System.out.println(st.nextToken());	
	
}
}
 }