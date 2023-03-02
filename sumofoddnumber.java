package LabMarch2;

import java.util.Scanner;

public class sumofoddnumber {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();
        
        int sum = 0;
        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }
        
        System.out.println("The sum of odd numbers up to " + n + " is " + sum);
        scanner.close();
    }
}
 





