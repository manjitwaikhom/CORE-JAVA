package com.arrays;

import java.util.Arrays;

class RepeatedElements{

public static void main(String arg[]){
int count=0;
int[] numbers = {1,2,3,4,1,1,2};


for(int i = 0; i < numbers.length-1; i++) {
	for(int j = i+1; j < numbers.length-1; j++){
		if(numbers[i] == numbers[j]) {
			count++;
			}
		System.out.println(numbers[i]+" occurs "+count+" times.");

}
	
    
}

}

}