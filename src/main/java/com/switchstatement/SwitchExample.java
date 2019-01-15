package com.switchstatement;

public class SwitchExample {
	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		switch(a){
		case 5:System.out.println("FRI");break;
		case 1:System.out.println("MON");break;
		case 2:System.out.println("TUE");break;
		default:System.out.println("invalid");break;
		case 3:System.out.println("WED");break;
		case 4:System.out.println("THUR");break;
		}

}
}