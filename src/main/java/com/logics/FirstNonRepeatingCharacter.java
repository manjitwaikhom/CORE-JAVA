package com.logics;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		String s="abcfaabbc";
		//Character c=getFirstNonRepeatingCharacter(s);
		Character c=getFirstNonRepeatingCharacterJava8(s);
		System.out.println(c);

	}
	
	private static Character getFirstNonRepeatingCharacter(String s) {
		Character c=null;
		Map<Character,Integer> map=new HashMap<>();
		for(int i=0;i<s.length();i++) {
			if(map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i),map.get(s.charAt(i))+1);
			}else {
				map.put(s.charAt(i), 1);
			}
	
		}
		System.out.println(map);
		for(Entry<Character,Integer> entry: map.entrySet()) {
			if(entry.getValue()==1) {
				c=entry.getKey();
			}
		}
		return c;
	}
	
	private static Character getFirstNonRepeatingCharacterJava8(String s) {
		Character c=null;
		Map<Character,Integer> map=new LinkedHashMap<>();
		char[] charArray = s.toCharArray();
		
		for(char ch:charArray) {
			map.put(ch,map.containsKey(ch)?map.get(ch)+1:1);
		}
		return map.entrySet().stream().filter(x->x.getValue()==1).findFirst().get().getKey();
	}
	
	}
