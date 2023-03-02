package LabMarch2;

public class Library {
     String bookId;
     String bookName;
     String bookAuthor;
    
    // Method to add a book to the library
    public void addBook(String bookId, String bookName, String bookAuthor) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
    }
    
    // Method to dispense a book from the library
    public void dispenseBook(String bookId) {
        if (this.bookId.equals(bookId)) {
            this.bookId = null;
            this.bookName = null;
            this.bookAuthor = null;
            System.out.println("Book dispensed successfully.");
        } else {
            System.out.println("Book not found.");
        }
    }
    
    // Method to display all books in the library
    public void displayAllBooks() {
        System.out.println("Book ID: " + this.bookId);
        System.out.println("Book Name: " + this.bookName);
        System.out.println("Book Author: " + this.bookAuthor);
    }
}

