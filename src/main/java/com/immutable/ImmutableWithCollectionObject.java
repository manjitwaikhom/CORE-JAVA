package com.immutable;


import java.util.HashMap;
import java.util.Iterator;

public final class ImmutableWithCollectionObject {

	private final int id;
	
	private final String name;
	
	private final HashMap<String,String> testMap;
	
	public int getId() {
		return id;
	}


	
	  public String getName() { return name; }
	 

	
	//immutable accessor function for mutable objects
	public HashMap<String, String> getTestMap() {
		//return testMap;
		return (HashMap<String, String>) testMap.clone();
	}

	
	 //Constructor performing Deep Copy
	public ImmutableWithCollectionObject(int i, String n, HashMap<String,String> hm){
		System.out.println("Performing Deep Copy for Object initialization");
		this.id=i;
		this.name=n;
		HashMap<String,String> tempMap=new HashMap<String,String>();
		String key;
		Iterator<String> it = hm.keySet().iterator();
		while(it.hasNext()){
			key=it.next();
			tempMap.put(key, hm.get(key));
		}
		this.testMap=tempMap;
	}
	
	
	// Constructor performing Shallow Copy
	/*
	public FinalClassExample(int i, String n, HashMap<String,String> hm){
		System.out.println("Performing Shallow Copy for Object initialization");
		this.id=i;
		this.name=n;
		this.testMap=hm;
	}
	*/
	
	
	public static void main(String[] args) {
		HashMap<String, String> h1 = new HashMap<String,String>();
		h1.put("1", "first");
		h1.put("2", "second");
		
		String s = "original";
		
		int i=10;
		
		ImmutableWithCollectionObject immutable = new ImmutableWithCollectionObject(i,s,h1);
		
		//Lets see whether its copy by field or referenimmutable
		System.out.println(s==immutable.getName());
		System.out.println(h1 == immutable.getTestMap());
		//print the immutable values
		System.out.println("immutable id:"+immutable.getId());
		System.out.println("immutable name:"+immutable.getName());
		System.out.println("immutable testMap:"+immutable.getTestMap());
		//change the local variable values
		i=20;
		s="modified";
		h1.put("3", "third");
		//print the values again
		System.out.println("immutable id after local variable change:"+immutable.getId());
		System.out.println("immutable name after local variable change:"+immutable.getName());
		System.out.println("immutable testMap after local variable change:"+immutable.getTestMap());
		
		HashMap<String, String> hmTest = immutable.getTestMap();
		hmTest.put("4", "new");
		
		System.out.println("immutable testMap after changing variable from immutable accessor methods:"+immutable.getTestMap());

	}

}

