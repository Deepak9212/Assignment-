package Assignment.java;

import java.util.Scanner;

public class Problem3 {
	public static void main(String[] args) {
		//to do auto generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("put the integer");
		int a=sc.nextInt();
		//convert in string
		String b=Integer .toString(a);
		//convert in char array
		char[]s=b.toCharArray();
		System.out.print("the individual char are");
		for(int i=0;i<s.length;i++) {
			System.out.print(s[i]+ " ");
		}
	}

}
