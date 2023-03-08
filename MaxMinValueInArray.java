package HomeAssignment;
//. Write a Java program to find the maximum and minimum value of an array.
public class MaxMinValueInArray {
	  public static void main(String[] args) {
	        int[] numbers = {1, 2, 3, 4, 5};

	        int maxValue = numbers[0];
	        int minValue = numbers[0];

	        for (int i = 1; i < numbers.length; i++) {
	            if (numbers[i] > maxValue) {
	                maxValue = numbers[i];
	            }
	            if (numbers[i] < minValue) {
	                minValue = numbers[i];
	            }
	        }

	        System.out.println("Max value in array: " + maxValue);
	        System.out.println("Min value in array: " + minValue);
	    }

}
