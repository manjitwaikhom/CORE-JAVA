package com.java5.annotation;

//Creating annotation
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface ManjitAnnotation {
    int value() default 1;
}

//Declaring annotation
class Hello {
    @ManjitAnnotation(value = 10)
    public void sayHello() {
	System.out.println("hello annotation");
    }
}

//Accessing annotation
class MethodLevelAnnotation {
    public static void main(String args[]) throws Exception {

	Hello h = new Hello();
	Method m = h.getClass().getMethod("sayHello");

	ManjitAnnotation mjtanno = m.getAnnotation(ManjitAnnotation.class);
	System.out.println("value is: " + mjtanno.value());
    }
}