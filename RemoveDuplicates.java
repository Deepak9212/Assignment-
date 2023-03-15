package StringAssignment2;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str1 = "hello world";
        String str2 = "goodbye";
        String result = removeDuplicates(str1, str2);
        System.out.println(result);
    }

    public static String removeDuplicates(String str1, String str2) {
        StringBuilder sb = new StringBuilder();
        boolean[] chars = new boolean[128];

        // Mark characters from str2 as duplicates
        for (int i = 0; i < str2.length(); i++) {
            chars[str2.charAt(i)] = true;
        }

        // Copy non-duplicate characters from str1 to sb
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            if (!chars[c]) {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
