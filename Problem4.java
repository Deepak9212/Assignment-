package Assignment.java;

import java.util.Scanner;

public class Problem4
{
   public static void main(String[] args)
   {
      int numberOne, numberTwo, largest,smallest=0;
      try (Scanner scan = new Scanner(System.in)) {
		System.out.print("Enter the First Number: ");
		  numberOne = scan.nextInt();
		  System.out.print("Enter the Second Number: ");
		  numberTwo = scan.nextInt();
	}
      
      if(numberOne>numberTwo)
         largest = numberOne;
      else
         largest = numberTwo;
      if(numberOne>numberTwo)
          smallest = numberTwo;
       else
          smallest = numberOne;
      
      
      System.out.println("\nThe Largest number is = " +largest);
      System.out.println("\nThe smallest number is = " +smallest);
   }
}
