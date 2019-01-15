package com.constructor;

class Student {
	int sid;
	String sname;
	String email;
	long phone;

	void Student() {
		System.out.println("method-student");
	}

	Student() {
		System.out.println("0 arg can");
	}

	Student(int id, String sn, String em) {
		System.out.println("3 arg can");
		sid = id;
		sname = sn;
		email = em;
	}

	Student(int id, String sn, String em, long ph) {
		System.out.println("4 arg can");
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

class ConstructorEx {
	public static void main(String as[]) {
		Student S1 = new Student();
		S1.show();
		Student S2 = new Student(27, "deemanth", "deemanth@gmail.com");
		S2.show();
		Student S3 = new Student(47, "hemanth", "hemanth@gmail.com", 9901);
		S3.show();
		S1.Student();
	}
}
