package Assignment.java;

import java.util.Scanner;

// a Java program that accepts two double variables and
//test if both strictly between 0 and 1 and otherwise false .
public class Problem7 {
	public static void main(String[] args) {
		//take the input from user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		double v1=sc.nextDouble();
		System.out.println("Enter the second number");
		double v2=sc.nextDouble();
		//print the value of the method
		System.out.println(v1>0 && v1<1 && v2>0 && v2<1 );
		
	}

}
