import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestLibraryBook {

    LibraryBook book1;
    LibraryBook book2;
    LibraryBook book3;


    @Before
    public void setup(){
        book1 = new LibraryBook("The Day of The Triffids", "John Wyndham", "Sci-Fi");
        book2 = new LibraryBook("Geek Love", "Katherine Dunn", "Bizzare");
        book3 = new LibraryBook("Bridget Jones", "Helen Fielding", "Rom Com");
    }

    @Test
    public void ShouldHaveTitle(){
        assertEquals("The Day of The Triffids", book1.getTitle());
    }

    @Test
    public void ShouldHaveAuthor(){
        assertEquals("Katherine Dunn", book2.getAuthor());
    }

    @Test
    public void ShouldHaveGenre(){
        assertEquals("Sci-Fi", book1.getGenre());
    }

}
