package com.exceptions;

/*-------------throws keyword-----------------------*/

class ThrowsDemo {
	void m1() throws ArithmeticException, ArrayIndexOutOfBoundsException {
		try {
			m2();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("m1-OK OK");
			if (1 == 2) {
				throw new ArrayIndexOutOfBoundsException();
			} else {
				throw new ArithmeticException("Don't do this");
			}
		}
	}

	void m2() throws ArrayIndexOutOfBoundsException {
		m3();
	}

	void m3() throws ArrayIndexOutOfBoundsException {
		try {
			m4();
		} catch (ArithmeticException e) {
			System.out.println("m3-OK OK");
			throw new ArrayIndexOutOfBoundsException();
		}
	}

	void m4() throws ArithmeticException {
		m5();
	}

	void m5() throws ArithmeticException {
		int x = 10 / 0;
	}
}

/*********** main() *************/
public class ThrowsKeyword {
	public static void main(String args[]) {
		try {
			ThrowsDemo h = new ThrowsDemo();
			h.m1();
		} catch (Exception e) {
			System.out.println("only e:  " + e);
			System.out.println("e.getMessage():  " + e.getMessage());
			e.printStackTrace();
		}
	}
}
