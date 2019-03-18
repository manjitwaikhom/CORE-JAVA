package com.java8.lambdaexpression;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author manjit
 *
 */
public class Lambda1 {

	public static void main(String[] args) {
		List<String> names=Arrays.asList("manjit","victoria","atkokpam","waikhom");
		System.out.println("Before sorting: "+names);
		//old style start
		/*Collections.sort(names,new Comparator<String>(){

			@Override
			public int compare(String s1, String s2) {
				return s1.compareTo(s2);
			}});*/
		//old style end
		
		//new style start
		//first style
		/*Collections.sort(names,(String s1, String s2)-> {
			return s1.compareTo(s2);
					});*/
		//second style
		Collections.sort(names, (String s1,String s2)-> s1.compareTo(s2));
		
		//third style
		Collections.sort(names, (s1,s2)-> s1.compareTo(s2));
		//new style end
		
		
		
		System.out.println("After sorting: "+names);
	}
}
