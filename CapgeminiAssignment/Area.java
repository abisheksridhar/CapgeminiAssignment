package CapgeminiAssignment;

import java.util.Scanner;
public class Area {

	public static void main(String[] args) {
		double side, volume,surfaceArea;
		Scanner in = new Scanner (System.in);
		System.out.println("enter length of side of cube");
		side = in.nextDouble();
		in.close();
		surfaceArea =6*side*side;
		volume=side*side*side;
		System.out.println("Surface area of cube = "+ surfaceArea);
		System.out.println("volume of cube = "+volume);
	}

}