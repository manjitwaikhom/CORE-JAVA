package com.collectionsorting.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class MainApp {
	public static void main(String args[]){  
		//Creating a list of students  
		ArrayList<Student> al=new ArrayList<Student>();  
		al.add(new Student(101,"Abhishek",23));  
		al.add(new Student(106,"Tarunesh",27));  
		al.add(new Student(105,"Rohit",21)); 
		al.add(new Student(102,"Manjit",21)); 
		  
		System.out.println("Sorting by Name");  
		
		//java 8 new style
		al.sort((Student s1,Student s2) ->s1.getName().compareTo(s2.getName()));
		
		
		//Using NameComparator to sort the elements(old style)
		Collections.sort(al,new NameComparator());  
		//Traversing the elements of list  
		for(Student st: al){  
		System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}  
		  
		System.out.println("sorting by Age");  
		//Using AgeComparator to sort the elements  
		Collections.sort(al,new AgeComparator());  
		//Traversing the list again  
		for(Student st: al){  
		System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}  
		  
		}  
}
