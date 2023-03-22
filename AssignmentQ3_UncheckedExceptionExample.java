package Exception;

import java.util.Scanner;

public class AssignmentQ3_UncheckedExceptionExample {
	 public static void main(String[] args) {
	        
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        
	        try {
	            int num = Integer.parseInt(sc.nextLine());
	            int result = 10 / num;
	            System.out.println("Result: " + result);
	            
	            // Example of ArrayIndexOutOfBoundsException
	            int[] arr = new int[5];
	            System.out.println("Element at index 5: " + arr[5]);
	        } catch (NumberFormatException e) {
	            System.out.println("Invalid number format.");
	        } catch (ArithmeticException e) {
	            System.out.println("Division by zero error.");
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Array index out of bounds.");
	        } finally {
	            System.out.println("Program execution completed.");
	        }
	    }
	}
	





