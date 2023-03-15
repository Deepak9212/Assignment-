package StringAssignment2;
public class DivideString {
    public static void main(String[] args) {
        String str = "abcdefghijklmnopqrstuvwxyz";
        int n = 4; // number of equal parts
        int strLength = str.length();
        int partLength = strLength / n;
        int startIndex = 0;

        // Loop through the string and divide it into equal parts
        for (int i = 0; i < n; i++) {
            String part = str.substring(startIndex, startIndex + partLength);
            System.out.println("Part " + (i+1) + ": " + part);
            startIndex += partLength;
        }
    }
}
