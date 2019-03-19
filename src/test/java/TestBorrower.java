import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBorrower {

    Library library;
    LibraryBook book1;
    LibraryBook book2;
    LibraryBook book3;
    Borrower borrower;

    @Before
    public void setup(){
        borrower = new Borrower("Hazel");
        book1 = new LibraryBook("The Day of The Triffids", "John Wyndham", "Sci-Fi");
        book2 = new LibraryBook("Geek Love", "Katherine Dunn", "Bizzare");
        book3 = new LibraryBook("Bridget Jones", "Helen Fielding", "Rom Com");
        library = new Library("Heathers Library", 2);

    }

    @Test
    public void startsWithNoBooks(){
        assertEquals(0, borrower.countBorrowedBooks());
    }

    @Test
    public void canBorrowBook(){
        borrower.borrowedBook(book1);
        assertEquals(1, borrower.countBorrowedBooks());
    }

    @Test
    public void canBorrowBookFromLibrary(){
        library.addBook(book1);
        borrower.borrowsBookFromLibrary(library);
        assertEquals(0, library.countBooks());
        assertEquals(1, borrower.countBorrowedBooks());
    }

    @Test
    public void canReturnBookToLibrary(){
        library.addBook(book2);
        borrower.borrowsBookFromLibrary(library);
        borrower.returnsBook(library);
        assertEquals(0, borrower.countBorrowedBooks());
        assertEquals(1, library.countBooks());
    }

    //test not passing as its

    @Test
    public void canFindSpecificBookAndReturnIt(){
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(book1, borrower.findSpecificBook(book1));
    }

//    @Test
//    public void checBorrowerHasCertainBook(){
//        library.addBook(book1);
//        library.addBook(book2);
//        borrower.borrowsBookFromLibrary(library);
//        borrower.borrowsBookFromLibrary(library);
//        assertEquals([book1, book2], borrower.booksBorrowed());
//    }
}
