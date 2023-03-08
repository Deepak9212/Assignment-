package HomeAssignment;

import java.util.Arrays;

//Write a Java program to insert an element (specific position) into an array.
public class InsertElementIntoArray {
	public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int elementToInsert = 10;
        int position = 2;

        System.out.println("Before inserting element: " + Arrays.toString(numbers));

        // Create a new array with one more element than the original
        int[] newNumbers = new int[numbers.length + 1];

        // Copy elements from original array up to the insertion position
        for (int i = 0; i < position; i++) {
            newNumbers[i] = numbers[i];
        }

        // Insert new element
        newNumbers[position] = elementToInsert;

        // Copy remaining elements from original array
        for (int i = position + 1; i < newNumbers.length; i++) {
            newNumbers[i] = numbers[i - 1];
        }

        // Update original array to reference the new array
        numbers = newNumbers;

        System.out.println("After inserting element: " + Arrays.toString(numbers));
    }
}
