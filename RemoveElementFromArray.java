package HomeAssignment;

import java.util.Arrays;
//Write a Java program to remove a specific element from an array.
public class RemoveElementFromArray {
	public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int elementToRemove = 3;

        System.out.println("Before removing element: " + Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == elementToRemove) {
                for (int j = i; j < numbers.length - 1; j++) {
                    numbers[j] = numbers[j + 1];
                }
                numbers = Arrays.copyOf(numbers, numbers.length - 1);
            }
        }

        System.out.println("After removing element: " + Arrays.toString(numbers));

}}
