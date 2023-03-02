package LabMarch2;

public class mainlbms {
    public static void main(String[] args) {
        Library library = new Library();
        
        // Add some books to the library
        library.addBook("101", "Object Oriented Programming Using C++ and Java ", "(English, Paperback, Vasappanavara Ramesh)");
        library.addBook("102", "Database Management Systems ", "Raghu Ramakrishnan and Johannes Gehrke");
        library.addBook("103", "Computer Network", "Andrew S. Tanenbaum");
        
        // Display all books in the library
        library.displayAllBooks();
        
        // Dispense a book from the library
        library.dispenseBook("101");
        
        
    }
}

