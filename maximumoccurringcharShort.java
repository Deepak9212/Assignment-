package StringAssignment2;
import java.util.Arrays;

public class maximumoccurringcharShort {
    public static void main(String[] args) {
        String str = "hello world";
        char maxChar = findMaxOccurringChar(str);
        System.out.println("The maximum occurring character is: " + maxChar);
    }

    public static char findMaxOccurringChar(String str) {
        // Convert the string to a char array and sort it
        char[] chars = str.toCharArray();
        Arrays.sort(chars);

        // Loop through the sorted array and find the maximum run of a single character
        int maxRun = 1;
        char maxChar = chars[0];
        int runLength = 1;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i-1]) {
                runLength++;
                if (runLength > maxRun) {
                    maxRun = runLength;
                    maxChar = chars[i];
                }
            } else {
                runLength = 1;
            }
        }

        return maxChar;
    }
}
