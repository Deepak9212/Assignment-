package HomeAssignment;
//Write a Java program to find the second smallest element in an array
public class Secondsmallelementarray {
	 public static void main(String[] args) {
	        int[] numbers = {5, 1, 9, 3, 7, 2};

	        int smallest = Integer.MAX_VALUE;
	        int secondSmallest = Integer.MAX_VALUE;

	        for (int i = 0; i < numbers.length; i++) {
	            if (numbers[i] < smallest) {
	                secondSmallest = smallest;
	                smallest = numbers[i];
	            } else if (numbers[i] < secondSmallest && numbers[i] != smallest) {
	                secondSmallest = numbers[i];
	            }
	        }

	        if (secondSmallest == Integer.MAX_VALUE) {
	            System.out.println("No second smallest element");
	        } else {
	            System.out.println("Second smallest element is: " + secondSmallest);
	        }
	    }

}
