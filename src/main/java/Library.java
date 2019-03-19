import java.util.ArrayList;

public class Library {

    private String name;
    private int capacity;
    private ArrayList<LibraryBook> books;

    public Library(String name, int capacity) {
        this.name = name;
        this.capacity = 2;
        this.books = new ArrayList<LibraryBook>();
    }

    public void addBook(LibraryBook libraryBook) {
        if (this.capacity > countBooks()) {
            this.books.add(libraryBook);
        }
    }

    public int countBooks() {
        return this.books.size();
    }

    public LibraryBook removeBook() {
        return this.books.remove(0);
    }
}
