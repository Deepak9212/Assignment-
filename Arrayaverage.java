package ArrayAssignment;

public class Arrayaverage  {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        double average = calculateAverage(arr);
        System.out.println("The average value of the array is: " + average);
    }
    
    public static double calculateAverage(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double average = (double) sum / arr.length;
        return average;
    }

}
