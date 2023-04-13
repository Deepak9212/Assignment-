package Lab13April;

import java.util.ArrayList;

public class OddNumbers {


    private ArrayList<Integer> A1 = new ArrayList<Integer>();
    private ArrayList<Integer> A2 = new ArrayList<Integer>();

    /*
      This method stores even numbers from 2 to N in an ArrayList A1 and returns it.
       N The upper limit of even numbers to store in the ArrayList.
       return The ArrayList A1 containing even numbers from 2 to N.
     */
    public ArrayList<Integer> storeOddNumbers(int N) {
        for (int i = 2; i <= N; i+=2) {
            A1.add(i);
        }
        return A1;
    }

    /*
      This method multiplies each number in ArrayList A1 by 5, displays the resulting sequence of numbers
      in the format "5,15,25,...5*N", adds them to a new ArrayList A2, and returns A2.
      return The ArrayList A2 containing the multiplied numbers from A1.
     */
    public ArrayList<Integer> printOddNumbers() {
        for (int i = 0; i < A1.size(); i++) {
            int value = A1.get(i) * 5;
            System.out.print(value);
            if (i < A1.size() - 1) {
                System.out.print(",");
            }
            A2.add(value);
        }
        System.out.println();
        return A2;
    }

    /*
       This method searches for the existence of the number N in ArrayList A1. If it exists, it returns N.
       If it does not exist, it returns 0.
       N The number to search for in ArrayList A1.
       return N if it exists in A1, otherwise 0.
     */
    public int retrieveOddNumber(int N) {
        if (A1.contains(N)) {
            return N;
        }
        return 0;
    }

    /*
      This is the main method used for testing the OddNumbers class.
      It creates an instance of the class, calls the storeOddNumbers() method with an argument of 10,
      calls the printOddNumbers() method and prints the resulting ArrayList, and finally calls the
      retrieveOddNumber() method with an argument of 6 and prints the resulting integer.
       args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        OddNumbers oddNumbers = new OddNumbers();
        oddNumbers.storeOddNumbers(10);
        ArrayList<Integer> A2 = oddNumbers.printOddNumbers();
        System.out.println(A2);
        int result = oddNumbers.retrieveOddNumber(6);
        System.out.println(result);
    }
}
