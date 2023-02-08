package Assignment.java;

import java.util.Scanner;

//write a java program find factorial of a number
public class Problem5 {
	public static void main(String[] args) {
		int i,fact= 1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		for(i=1;i<=num;i++) {
			fact=fact*i;
			
		}
		System.out.println("Factorial of the number:"+fact);
		
	}

}
