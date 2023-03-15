package StringAssignment2;

public class wordreverse {
    public static void main(String[] args) {
        String str = "hello world";
        String reversed = reverseWords(str);
        System.out.println("Reversed string: " + reversed);
    }

    public static String reverseWords(String str) {
        // Split the string into words using space as a delimiter
        String[] words = str.split(" ");

        // Loop through the words and reverse each one
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(new StringBuilder(word).reverse().toString() + " ");
        }

        return sb.toString().trim();
    }
}
