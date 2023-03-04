package ArrayAssignment;

	import java.util.Scanner;

	public class sumoftwonum {

	    public static void main(String[] args) {
	    	// read input from the user
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the first number: ");
	        int num1 = scanner.nextInt();
	        System.out.print("Enter the second number: ");
	        int num2 = scanner.nextInt();
	        scanner.close();
	        //create an array of integers
	        //containing the values num1 and num2
	        int[] arr = {num1, num2};
	        int sum = 0;
	        for (int i = 0; i < arr.length; i++) {
	            sum += arr[i];
	        }
	        System.out.println("The sum of the two numbers is: " + sum);
	    }

	}

