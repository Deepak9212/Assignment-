package IO;

import java.util.Scanner;
import java.io.*;

public class FileReadWrite {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //  the user to choose whether to store or print data
        System.out.println("Enter 1 to store data or 2 to print data:");

        int choice = input.nextInt();
        input.nextLine();

        switch (choice) {
            case 1:
                storeData(input);
                break;
            case 2:
                printData();
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
    }

    public static void storeData(Scanner input) {
        try {
        	//the user to enter the data to store in the file
            System.out.println("Enter data to store in file:");
            String data = input.nextLine();
            // Open a FileWriter to write the data to the file
            FileWriter writer = new FileWriter("D://wel.txt");
            // Write the data to the file and close the FileWriter
            writer.write(data);
            writer.close();
            System.out.println("Data stored in file.");
        } catch (IOException e) {
            System.out.println("An error occurred while storing data.");
            e.printStackTrace();
        }
    }

    public static void printData() {
        try {
        	// Open a Scanner to read data from the file
            File file = new File("D://wel.txt");
            Scanner reader = new Scanner(file);
         // Print each line of data from the file to the console
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }
            // Close the Scanner
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            e.printStackTrace();
        }
    }
}

