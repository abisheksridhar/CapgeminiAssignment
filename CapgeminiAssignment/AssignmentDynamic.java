package CapgeminiAssignment;

import java.util.Scanner;
 


		


class AssignmentDynamic {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number");
		int num=sc.nextInt();
		sc.close();
		num += 32;
		System.out.println("This is after assignment += operator "+num);
		num -= 32;
		System.out.println("This is after assignment += operator "+num);
		num *= 32;
		System.out.println("This is after assignment += operator "+num);
		num /= 32;
		System.out.println("This is after assignment += operator "+num);
		num %= 32;
		System.out.println("This is after assignment += operator "+num);
		num += 21;
		System.out.println("This is after assignment += operator "+num);
		num -= 98;
		System.out.println("This is after assignment += operator "+num);
		num *= 43;
		System.out.println("This is after assignment += operator "+num);
		num /= 9;
		System.out.println("This is after assignment += operator "+num);
		num %= 22;
		System.out.println("This is after assignment += operator "+num);
        
		

	}
}
