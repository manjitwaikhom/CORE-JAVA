package com.DSA.arrays;

class Duplicate{
public static void main(String[] arg){
int number[]={1,2,3,4,9,5,6,7,8,2,3,4,5,9,9,9};

for(int i=0;i<number.length;i++){
	for(int j=i+1;j<(number.length)-1;j++){
		if(number[i]==number[j])
			System.out.println("Duplicate no is:"+number[i]);


				}}




}



}