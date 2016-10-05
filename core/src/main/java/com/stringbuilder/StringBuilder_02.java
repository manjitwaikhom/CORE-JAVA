package com.stringbuilder;
public class StringBuilder_02 {

public static void main(String[] args) {

System.out.println();
StringBuffer sb = new StringBuffer("JLC");
char arr[] = {'A','B','C','D'};
sb.append(true);
sb.append(123);
sb.append(arr);
System.out.println(sb);
System.out.println();
sb.reverse();
System.out.println(sb);
System.out.println();
sb.deleteCharAt(4);
System.out.println(sb);
System.out.println(sb.length());
System.out.println();


}

}


