package com.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

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

	Map<Integer, Integer> countMapTest = new LinkedHashMap<>();
	countMapTest.put(1,3);
	countMapTest.put(2,2);
	countMapTest.put(1,1);

// using java streams
	Map<Integer, Integer> countMap = new HashMap<>();
	for (int num : numbers) {
		countMap.put(num, countMap.getOrDefault(num, 0) + 1);
	}

	//System.out.println(countMap);

}

}