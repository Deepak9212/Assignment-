package HomeAssignment;
//. Write a Java program to find the number of even and odd integers in a given array of integers
public class CountEvenOddNumbers {
	 public static void main(String[] args) {
	      int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	      int evenCount = 0;
	      int oddCount = 0;
	      
	      for (int i = 0; i < arr.length; i++) {
	         if (arr[i] % 2 == 0) {
	            evenCount++;
	         } else {
	            oddCount++;
	         }
	      }
	      
	      System.out.println("Number of even integers: " + evenCount);
	      System.out.println("Number of odd integers: " + oddCount);
	   }

}
