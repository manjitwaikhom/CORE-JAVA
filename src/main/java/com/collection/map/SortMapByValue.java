package com.collection.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SortMapByValue {

    
    public static Map<String, Integer> sortByValue(HashMap<String, Integer> hm) {
	// Create a list from elements of HashMap 
	List<Map.Entry<String, Integer>> list = new ArrayList<>(hm.entrySet());

	// Sort the list 
	Comparator<Map.Entry<String, Integer>> comparator=new Comparator<Map.Entry<String, Integer>>() {
	    @Override
	    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
		return (o1.getValue()).compareTo(o2.getValue());
	    }
	};
	
	//Descending order
	Comparator<Map.Entry<String, Integer>> reverseComparator =Collections.reverseOrder(comparator);
	Collections.sort(list, reverseComparator);
	
	//Ascending order
	//Collections.sort(list, comparator);
	
	// put data from sorted list to hashmap not recommended
	Map<String, Integer> temp = new LinkedHashMap<String, Integer>();
	for (Map.Entry<String, Integer> aa : list) {
	    temp.put(aa.getKey(), aa.getValue());
	}
	return temp;
    }

    // Driver Code 
    public static void main(String[] args) {

	HashMap<String, Integer> map = new HashMap<String, Integer>();

	// enter data into hashmap 
	map.put("Math", 98);
	map.put("Data Structure", 85);
	map.put("Database", 91);
	map.put("Java", 95);
	map.put("Operating System", 79);
	map.put("Networking", 80);
	Map<String, Integer> hm1 = sortByValue(map);

	// print the sorted hashmap 
	for (Map.Entry<String, Integer> en : hm1.entrySet()) {
	    System.out.println("Key = " + en.getKey() + ", Value = " + en.getValue());
	}
    }
}
