package com.collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class OrderOfStoringInMap {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put("c", "c-value");
		hm.put("b", "b-value");
		hm.put("a", "a-value");
		hm.put("3", "3-value");
		hm.put("2", "2-value");
		hm.put("1", "1-value");
		System.out.println("Hash Map: \n" + hm + "  >> NO ORDER");// no order

		LinkedHashMap lhm = new LinkedHashMap();
		lhm.put("c", "c-value");
		lhm.put("b", "b-value");
		lhm.put("a", "a-value");
		lhm.put("3", "3-value");
		lhm.put("2", "2-value");
		lhm.put("1", "1-value");
		lhm.put("4", "4-value");
		lhm.put("d", "a-value");
		System.out.println("LinkedHashMap: \n" + lhm + "  >> AS-ADDED");// as
																		// added

		Hashtable ht = new Hashtable();
		ht.put("c", "c-value");
		ht.put("b", "b-value");
		ht.put("a", "a-value");
		ht.put("3", "3-value");
		ht.put("2", "2-value");
		ht.put("1", "1-value");
		ht.put("4", "4-value");
		ht.put("d", "a-value");
		System.out.println("Hashtable: \n" + lhm + "  >> AS-ADDED");

		TreeMap tm = new TreeMap();
		tm.put("c", "c-value");
		tm.put("b", "b-value");
		tm.put("a", "a-value");
		tm.put("3", "3-value");
		tm.put("2", "2-value");
		tm.put("1", "1-value");
		tm.put("4", "4-value");
		tm.put("d", "a-value");
		System.out.println("TreeMap: \n" + tm + "  >> SORTED");

	}

}
