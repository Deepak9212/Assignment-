package StringAssignment;

public class stringmanupalation {
	    public static void main(String[] args) {
	    	  // Create the string
	        String str = "Welcome to Java World";
	       // Returns the character at 5th position and display it.
	        System.out.println("Character at 5th position: " + str.charAt(4));
	     // Compares the above String with “Welcome” lexicographically ignoring case differences and display the result.
	        System.out.println("Is the string equal to 'Welcome'? " + str.substring(0, 7).equalsIgnoreCase("Welcome"));
	        // Concatenates “- Let us learn” to the above string and display it.
	        System.out.println("New string: " + str.concat(" - Let us learn"));
	        // Returns the position of the first occurrence of character ‘a’ and display it.
	        System.out.println("Index of first occurrence of 'a': " + str.indexOf('a'));
	        // Replaces all the occurrences of ‘a’ character with the new ‘e’ and display it.
	        System.out.println("New string after replacing 'a' with 'e': " + str.replace('a', 'e'));
	        // Returns string between 4th position and 10th position and display it.
	        System.out.println("Substring between 4th and 10th position: " + str.substring(3, 10));
	        // Returns the lowercase of the string and display it.
	        System.out.println("Lowercase string: " + str.toLowerCase());
	        
	        
	    }
	}




