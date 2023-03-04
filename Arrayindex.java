package ArrayAssignment;

	public class Arrayindex {
	    public static void main(String[] args) {
	        // Create an array of integers
	        int[] myArray = {10, 20, 30, 40, 50};

	        // Find the index of the element 30 in the array
	        int elementIndex = -1;
	        for(int i=0; i<myArray.length; i++) {
	            if(myArray[i] == 30) {
	                elementIndex = i;
	                break;
	            }
	        }

	        // Print the index of the element 30
	        System.out.println("The index of the element 30 is: " + elementIndex);
	    }
	}

