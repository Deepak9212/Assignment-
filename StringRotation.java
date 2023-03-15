package StringAssignment2;

public class StringRotation {
    public static void main(String[] args) {
        String str1 = "ABACD";
        String str2 = "CDABA";
        boolean areRotations = checkIfRotations(str1, str2);
        if (areRotations) {
            System.out.println("The two strings are rotations of each other.");
        } else {
            System.out.println("The two strings are not rotations of each other.");
        }
    }

    public static boolean checkIfRotations(String str1, String str2) {
        // Check if the lengths of the two strings are equal
        if (str1.length() != str2.length()) {
            return false;
        }

        // Concatenate the first string with itself
        String concatenated = str1 + str1;

        // Check if the second string is a substring of the concatenated string
        return concatenated.contains(str2);
    }
}
