package com.finalmodifier;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Student stu = new Student();
		System.out.println(stu.getRollNo());
		System.out.println("-----------");
		stu.setRollNo(200);
		System.out.println(stu.getRollNo());

	}

}
