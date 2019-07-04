package com.java5.annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//creating annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface ManjitAnno{
    int id() default 1;
    String name() default "Waikhom";
    
}

//
@ManjitAnno(id=5, name="Singh")
class Person{
    String company;
    String country;
    
    public Person(String company, String country) {
	super();
	this.company = company;
	this.country = country;
    }
    
}

public class ClassLevelAnnotation {

    public static void main(String[] args) {
	Person person=new Person("Abhishek", "India");
	Class c=person.getClass();
	Annotation anno=c.getAnnotation(ManjitAnno.class);
	ManjitAnno mjtAnno=(ManjitAnno)anno;
	System.out.println(mjtAnno.name() + mjtAnno.id());

    }

}
