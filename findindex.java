package HomeAssignment;
//Write a Java program to find the index of an array element.
public class findindex {
	 public static int findIndex(int[] arr, int element) {
		    // Iterate through the array to find the index of the element
		    for (int i = 0; i < arr.length; i++) {
		      if (arr[i] == element) {
		        return i;
		      }
		    }
		    // If the element is not found, return -1
		    return -1;
		  }

		  public static void main(String[] args) {
		    // Example usage
		    int[] arr = {1, 2, 3, 4, 5};
		    int element = 4;
		    int index = findIndex(arr, element);
		    System.out.println("The index of element " + element + " is " + index);
		  }
		}
	
