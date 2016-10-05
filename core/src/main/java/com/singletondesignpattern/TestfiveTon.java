package com.singletondesignpattern;

public class TestfiveTon {

	public static void main(String[] args) {
		Fiveton f1;
		Fiveton f2;
		Fiveton f3;
		Fiveton f4;
		Fiveton f5;
		Fiveton f6;
		Fiveton f7;
		try {
			f1 = Fiveton.getInstance();
			f2 = Fiveton.getInstance();
			f3 = Fiveton.getInstance();
			f4 = Fiveton.getInstance();
			f5 = Fiveton.getInstance();
			f6 = Fiveton.getInstance();
			//f7=(Fiveton)f1.clone();
		    //f6=Fiveton.getInstance();
			//System.out.println(f6);
			System.out.println(f5);
			System.out.println(f4);
			System.out.println(f3);
			System.out.println(f2);
			System.out.println(f1);	
				
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		

}
}