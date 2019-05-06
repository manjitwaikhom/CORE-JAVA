package com.collectionsorting.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class MainApp {
	  
	public static void main(String args[]){  
	ArrayList<Student> al=new ArrayList<Student>();  
	al.add(new Student(101,"Abhishek",23));  
	al.add(new Student(106,"Tarunesh",27));  
	al.add(new Student(105,"Rohit",21));  
	  
	Collections.sort(al);  
	for(Student st:al){  
	System.out.println(st.rollno+" "+st.name+" "+st.age);  
	}  
	}  
}
