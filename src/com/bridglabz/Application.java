package com.bridglabz;
import java.util.Scanner;
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the line comparison program");
		Scanner point = new Scanner(System.in);
		System.out.println("Enter the points x1 and y1 ,x2 and y2: ");
		int x1=point.nextInt();
		int y1=point.nextInt();
		int x2=point.nextInt();
		int y2=point.nextInt();
		double distance=Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
		System.out.print("Calculted distance is: ");
		System.out.format("%.2f",distance);

	}

}
