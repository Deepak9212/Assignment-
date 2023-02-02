package ControlStatement.java;

public class NewPattern {
	public static void main(String[] args) {
	for (int i=5; i>=1;i--) //outer loop for row number
	{
		if(i%2 !=0) { //odd number(1,3,5)
			for(int j=5;j>=i;j--){// odd position print (*)
				System.out.print( " * ");
			}
			System.out.println();
		}}
	for(int i=2;i<=5;i++)   //outer loop for row number
	{
		if(i%2 !=0) { //odd number
			for(int j=5;j>=i;j--) {  //odd position print"*"
				System.out.print(" * ");
			}
			System.out.println();
		}
		
	}
	}
}
