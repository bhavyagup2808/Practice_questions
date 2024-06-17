import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Book{
    String title;
    String author;
    String ISBN;
    Book(String title, String author,String ISBN)
    {
        this.title=title;
        this.author=author;
        this.ISBN=ISBN;
    }
}
 
class BookOperations {
    private List<Book> books;

    public BookOperations() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(String isbn) {
        Iterator<Book> it = books.iterator();
        while (it.hasNext()) {
            Book book = it.next();
            if (book.ISBN.equals(isbn)) {
                it.remove();
                return;
            }
        }
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the collection.");
        } else {
            for (Book book : books) {
                String temp=book.title;
                System.out.println(temp);
            }
        }
    }

}
public class Ques5 {
    // Write a Java program to create a class called "Book" with attributes 
    // for title, author, and ISBN, and methods to add and remove books from a collection.
    public static void main(String[] args) {
        BookOperations c1 = new BookOperations();
        c1.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565"));
        c1.addBook(new Book("1984", "George Orwell", "9780451524935"));
        c1.displayBooks();
        c1.removeBook("9780451524935");
        c1.displayBooks();
    }
}
