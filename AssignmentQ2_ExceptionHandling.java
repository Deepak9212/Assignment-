package Exception;

public class AssignmentQ2_ExceptionHandling {
	 public static void main(String[] args) {
	        int a = 10, b = 0;
	        int[] arr = { 1, 2, 3 };
	        try {
	            // divide a by b
	            int result = a / b;
	            System.out.println(result);
	            // access an invalid calculation
	            int invalidResult = arr[3];
	            System.out.println(invalidResult);
	        } catch (ArithmeticException e) {
	            System.out.println("Invalid division");
	        } catch (NumberFormatException e) {
	            System.out.println("Format mismatch");
	        } catch (IllegalArgumentException e) {
	            System.out.println("calculation invalid");
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Array index is invalid");
	        } finally {
	            System.out.println("Exception Handling Completed");
	        }
	    }
	}
