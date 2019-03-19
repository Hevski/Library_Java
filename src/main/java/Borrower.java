import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<LibraryBook> borrowed;

    public Borrower(String name) {
        this.name = name;
        this.borrowed = new ArrayList<LibraryBook>();
    }

    public int countBorrowedBooks() {
        return this.borrowed.size();
    }

    public void borrowedBook(LibraryBook libraryBook) {
        this.borrowed.add(libraryBook);
    }

    public void borrowsBookFromLibrary(Library library) {
        LibraryBook book = library.removeBook();
        this.borrowedBook(book);
    }

    public void returnsBook(Library library ) {
        LibraryBook returnedBook = this.borrowed.remove(0);
        library.addBook(returnedBook);

    }

    public LibraryBook findSpecificBook(LibraryBook bookToFind) {
//        LibraryBook bookToReturn = bookToFind
        for (LibraryBook book : this.borrowed) {
            if (book == bookToFind) {
                this.borrowed.remove(book);
            }
        }
    }
}

//        for (int i = 0; i < countCoins(); i++){
//            total += this.coins.get(i);
//        }

