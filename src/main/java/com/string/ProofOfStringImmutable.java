package com.string;

public class ProofOfStringImmutable {

	public static void main(String[] args) {
		String str1="manjit";
		String str2="manjit";
		System.out.println(str1==str2);//true because it points to the same object in string constant pool
		
		str1=str1+"waikhom";//modified 
		System.out.println(str1==str2);//false because new string constant is created hence proves string in immutable
		

	}

}
