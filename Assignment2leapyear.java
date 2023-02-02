package ControlStatement.java;

import java.util.Scanner;

public class Assignment2leapyear {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in); //declare scanner class
	System.out.println("Enter the year");
	int a=sc.nextInt();
	if(a%4==0) {
		System.out.println("This is a leap year");
		
	}else
	{
		System.out.println("This is not a leap year");
	}
}
}
