package com.constructor;

class Student1 {
	int sid;
	String sname;
	String email;
	long phone;

	// normal method
	void Student1() {
		System.out.println("method Student()");

	}

	Student1() {
		System.out.println("Zero argument constructor of Student Class");
	}

	Student1(int id, String sn, String em) {
		System.out.println("Three argument constructor of Student Class");
		sid = id;
		sname = sn;
		email = em;
	}

	Student1(int id, String sn, String em, long ph) {
		System.out.println("Four argument constructor of Student Class");
		sid = id;
		sname = sn;
		email = em;
		phone = ph;
	}

	void show() {
		System.out.println(sid);
		System.out.println(sname);
		System.out.println(email);
		System.out.println(phone);
	}
}

/************************************/

class ConstructorTestD {
	public static void main(String arg[]) {
		Student s1 = new Student();
		s1.show();
		Student s2 = new Student(102, "manjit", "manjit@aptech.com");
		s2.show();
		Student s3 = new Student(103, "singh", "singh@aptech.com", 99999);
		s3.show();
		s1.Student();
	}
}
