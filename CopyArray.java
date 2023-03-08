package HomeAssignment;

import java.util.Arrays;

//. Write a Java program to copy an array by iterating the array. 
public class CopyArray {
	 public static void main(String[] args) {
	        int[] numbers = {1, 2, 3, 4, 5};
	        int[] copy = new int[numbers.length];

	        for (int i = 0; i < numbers.length; i++) {
	            copy[i] = numbers[i];
	        }

	        System.out.println("Original array: " + Arrays.toString(numbers));
	        System.out.println("Copied array: " + Arrays.toString(copy));
	    }

}
