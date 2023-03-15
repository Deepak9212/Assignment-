package StringAssignment;

public class StringParsingExample {
	    public static void main(String[] args) {
	        String str = "C:\\IBM\\DB2\\PROGRAM\\DB2COPY1.EXE";

	        // Parse the string with the delimiter '\'
	        String[] tokens = str.split("\\\\");

	        // Extract the drive letter
	        String drive = tokens[0];

	        // Extract the folders and concatenate them with '|'
	        StringBuilder sb = new StringBuilder();
	        for (int i = 1; i < tokens.length - 1; i++) {
	            sb.append(tokens[i]).append(" || ");
	        }
	        String folders = sb.toString().substring(0, sb.length() - 4);

	        // Extract the file name
	        String file = tokens[tokens.length - 1];

	        // Display the results
	        System.out.println("Drive: " + drive);
	        System.out.println("Folders: " + folders);
	        System.out.println("File: " + file);
	    }
	}

