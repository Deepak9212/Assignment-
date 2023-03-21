package Exception;

public class AssignmentQ1 {
	 public static void main(String[] args) {
	        int[] nums = {1, 2, 3};
	        int num1 = 0;
	        String str = "xyz";
	        try {
	            int result = nums[num1] / num1;
	            int parsedNum = Integer.parseInt(str);
	            int calculation = result * parsedNum;
	            System.out.println("Result: " + calculation);
	        } catch (ArithmeticException e) {
	            System.out.println("Invalid division.");
	        } catch (NumberFormatException e) {
	            System.out.println("Format mismatch.");
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Array index is invalid.");
	        } catch (Exception e) {
	            System.out.println("Calculation invalid.");
	        } finally {
	            System.out.println("Exception Handling Completed.");
	        }
	    }
	}
	






