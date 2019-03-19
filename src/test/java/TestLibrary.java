import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestLibrary {

    Library library;
    LibraryBook book1;
    LibraryBook book2;
    LibraryBook book3;
    Borrower borrower;

    @Before
    public void setup(){
        library = new Library("Heathers Library", 2);
        book1 = new LibraryBook("The Day of The Triffids", "John Wyndham", "Sci-Fi");
        book2 = new LibraryBook("Geek Love", "Katherine Dunn", "Bizzare");
        book3 = new LibraryBook("Bridget Jones", "Helen Fielding", "Rom Com");
        borrower = new Borrower("Hazel");
    }

    @Test
    public void countNumberOfBooksInLibrary(){
        assertEquals(0, library.countBooks());
    }

    @Test
    public void addBookToLibrary(){
        library.addBook(book1);
        assertEquals(1, library.countBooks());
    }

    @Test
    public void addBookIfCapacityNotReached(){
        library.addBook(book1);
        assertEquals(1, library.countBooks());
    }

    @Test
    public void cantAddBookCapacityFull(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        assertEquals(2, library.countBooks());
    }

    @Test
    public void canRemoveBook(){
        library.addBook(book1);
        library.removeBook();
        assertEquals(0, library.countBooks());

    }
}
