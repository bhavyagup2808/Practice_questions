import java.util.ArrayList;
import java.util.List;

class Library {
    List<String> books;
    public Library() {
        this.books = new ArrayList<>();
    }
    public void addBook(String book) {
        if (!books.contains(book)) {
            books.add(book);
        } else {
            System.out.println(book + " is already in the library.");
        }
    }
    public void removeBook(String book) {
        if (books.contains(book)) {
            books.remove(book);
        } else {
            System.out.println(book + " is not found in the library.");
        }
    }
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("The library is currently empty.");
        } else {
            System.out.println("Books in the library: " + books);
        }
    }
}


public class Ques2 {
    public static void main(String[] args) {
        // Write a Java program to create a class called "Library" with a collection of books and 
        // methods to add and remove books
        Library library = new Library();
        library.addBook("2 States");
        library.addBook("The Revolution 2020");
        library.displayBooks();
        library.removeBook("The Revolution 2020");
        library.displayBooks();
    }
}
