package HomeAssignment;

import java.util.HashSet;
import java.util.Set;

//Write a Java program to find the duplicate values of an array
public class findduplicatevalue {
	public static void main(String[] args) {
	      int[] arr = {1, 2, 3, 4, 5, 3, 2, 6, 7, 5};
	      Set<Integer> duplicates = new HashSet<Integer>();
	      
	      for (int i = 0; i < arr.length; i++) {
	         for (int j = i+1; j < arr.length; j++) {
	            if (arr[i] == arr[j]) {
	               duplicates.add(arr[i]);
	            }
	         }
	      }
	      
	      System.out.print("Duplicate values in the array are: ");
	      for (int value : duplicates) {
	         System.out.print(value + " ");
	      }
	   }
	}

