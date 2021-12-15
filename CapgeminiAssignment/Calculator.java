package CapgeminiAssignment;

class CalculatorFunctions {
 int add(int num1, int num2) {
		return num1+num2;
	}
	 int substract(int num1, int num2) {
		return num1-num2;
		
	}
	 int multiply(int num1, int num2) {
		return num1*num2;
		
	}
	 int devide(int num1, int num2) {
		return num1/num2;	
	}
	
	
}
public class Calculator {
	public static void main(String[] args) {
		CalculatorFunctions obj = new CalculatorFunctions();
		System.out.println(obj.add(4,2));
		System.out.println(obj.substract(4,2));
		System.out.println(obj.multiply(4,2));
		System.out.println(obj.devide(4,2));
	}

}
