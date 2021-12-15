package CapgeminiAssignment;

public class Bitwise {
	
	public static void main (String args[]) {
		int a=100;
		int b=200;
		int result;
		
		result = a&b;
		System.out.println("Bitwise AND operator performed , and value is :- " + result);
		result = a|b;
		System.out.println("Bitwise OR operator performed , and value is :- " + result);
		result = a^b;
		System.out.println("Bitwise XOR operator performed , and value is :- " + result);
		result =~a;
		System.out.println("Bitwise negation  operator performed , and value is :- " + result);
		result =~b;
		System.out.println("Bitwise negation operator performed , and value is :- " + result);
		result = a << 3;
		System.out.println("Value after applyeing Bitwise Left Shift operator :- " + result);
		result = b >> 4;
		System.out.println("Value after applyeing Bitwise right  Shift operator :- " + result);
		
	}

}