package com.string;
/*--- EXAMPLE USING STRING-----*/
class String_03{
public static void main(String as[]){
String str="jlcindiajlc";
String ss1="hello";

System.out.println(ss1.concat("jlc"));
System.out.println(str);
//System.out.println(str.replaceFirst("jlc","JLC"));
System.out.println(str.replaceAll("jlc","JLC"));

String sss="i am manjit. Now i am in jlc class. Listening the class";
String ss[]=sss.split(" ");
for(int i=0;i<ss.length;i++){

System.out.println(ss[i]);
}
String ss4[]=sss.split("am");
for(int i=0;i<ss4.length;i++){
System.out.println(ss4[i]);
}
int x=99;
String s=String.valueOf(x);
System.out.println(s);

String ssss="aaBBBcDDeeFAA";
System.out.println(ssss.matches("a*B*cD*e*FA*"));
System.out.println(ssss.matches("a*BcD*e*FA*"));
str=str.replaceFirst("i","I");
System.out.println(str);
System.out.println(str.regionMatches(0,"India",0,5));
System.out.println(str.regionMatches(3,"India",0,5));
System.out.println(str.regionMatches(3,"india",1,4));
System.out.println(str.regionMatches(4,"india",1,4));
System.out.println(str.regionMatches(3,"india",0,5));
System.out.println(str.regionMatches(true,3,"india",0,5));
}
}
