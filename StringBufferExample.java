package StringAssignment;

public class StringBufferExample {
	    public static void main(String[] args) {
	        StringBuffer sb = new StringBuffer("This is StringBuffer");

	        // 1. Add string to existing string and display it
	        sb.append(" - This is a sample program");
	        System.out.println(sb);

	        // 2. Insert string into existing string and display it
	        sb.insert(21, "Object");
	        System.out.println(sb);

	        // 3. Reverse the string and display it
	        sb.reverse();
	        System.out.println(sb);

	        // 4. Replace the word "Buffer" with "Builder" and display it
	        int index = sb.indexOf("Buffer");
	        sb.replace(index, index + "Buffer".length(), "Builder");
	        System.out.println(sb);
	    }
	}

