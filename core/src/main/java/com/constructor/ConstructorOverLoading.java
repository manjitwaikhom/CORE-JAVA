package com.constructor;

class Person1 {
	private int age;
	private String name;

	String getName() {
		return this.name;
	}

	int getAge() {
		return this.age;
	}

	Person1() {
	}

	Person1(int age, String name) {
		this.age = age;
		this.name = name;
	}
}

/*********************************/
class Student2 extends Person1{
	int sid;
	String email;

	Student2(int age, String name, int sid, String email) {
		super(age, name);
		System.out.println("four argument constructor");
	}

	Student2(int age) {
		new Person1(age, null);
	}

	void show() {
		System.out.println("Age\t:" + getAge());
		System.out.println("Name\t:" + getName());
		System.out.println("Sid\t:" + sid);
		System.out.println("Email\t:" + email);
	}
}

/**************************************/

class ConstructorOverLoading {
	public static void main(String arg[]) {
		Student2 st1 = new Student2(26, "manjit", 257, "mjt@aptech.com");
		st1.show();
		Student2 st2 = new Student2(34);
		st2.show();

	}
}