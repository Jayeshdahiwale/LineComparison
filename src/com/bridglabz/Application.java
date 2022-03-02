package com.bridglabz;
import java.util.Scanner;
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the line comparison program");
		Scanner point = new Scanner(System.in);
		System.out.println("Enter the points (x1,y1),(x2,y2),(x3,y3),(x4,y4): ");
		int x1=point.nextInt();
		int y1=point.nextInt();
		int x2=point.nextInt();
		int y2=point.nextInt();
		int x3=point.nextInt();
		int y3=point.nextInt();
		int x4=point.nextInt();
		int y4=point.nextInt();
		double distance1=Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
		double distance2=Math.sqrt(Math.pow(x4-x3, 2)+Math.pow(y4-y3, 2));
		
		System.out.println("Calculated distance for first line: ");
		System.out.format("%.2f \n",distance1);
		System.out.println("Calculated distance for second line: ");
		System.out.format("%.2f \n",distance2);
		if(distance1==distance2) {
			System.out.println("Two lines are equal");
		}
		else {
			System.out.println("Two lines are unequal");
		}

	}

}
