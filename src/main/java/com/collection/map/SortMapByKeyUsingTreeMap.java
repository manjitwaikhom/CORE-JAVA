package com.collection.map;


import java.util.*;

public class SortMapByKeyUsingTreeMap { 

	

	
	public static void sortByKeyUsingTreeMap(Map<String, Integer> map) 
	{ 
		// TreeMap to store values of HashMap 
		TreeMap<String, Integer> treeMap = new TreeMap<>(); 

		// Copy all data from hashMap into TreeMap 
		treeMap.putAll(map); 

		// Display the TreeMap which is naturally sorted 
		for (Map.Entry<String, Integer> entry : treeMap.entrySet()) 
			System.out.println("Key = " + entry.getKey() + 
						", Value = " + entry.getValue());		 
	} 
	
	public static void sortByKeyUsingTreeMapConstructor(Map<String, Integer> map) 
	{ 
		
		TreeMap<String, Integer> treeMap = new TreeMap<>(map); 

		// Display the TreeMap which is naturally sorted 
		for (Map.Entry<String, Integer> entry : treeMap.entrySet()) 
			System.out.println("Key = " + entry.getKey() + 
						", Value = " + entry.getValue());		 
	} 
	
	public static void sortbykeyUsingArrayList(Map<String, Integer> map) 
	{ 
		ArrayList<String> sortedKeys = 
					new ArrayList<String>();
		sortedKeys.addAll(map.keySet());
		
		Collections.sort(sortedKeys); 

		// Display the TreeMap which is naturally sorted 
		for (String x : sortedKeys) 
			System.out.println("Key = " + x + 
						", Value = " + map.get(x));	 
	} 
	
	
	public static void main(String args[]) 
	{ 
	    Map<String, Integer> map = new HashMap<>();  
		map.put("Bunty", 80); 
		map.put("Abhishek", 90); 
		map.put("Ciela", 80); 
		map.put("Amit", 75); 
		map.put("Dennis", 40); 
		map.put("David", 50); 
		map.put("1David", 60); 

		System.out.println("*******sortByKeyUsingTreeMap************");
		sortByKeyUsingTreeMap(map);
		System.out.println("****sortByKeyUsingTreeMapConstructor******");
		sortByKeyUsingTreeMapConstructor(map); 
		System.out.println("****sortbykeyUsingArrayList******");
		sortbykeyUsingArrayList(map);
	} 
} 
