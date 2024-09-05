import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Scanner;

public class LibraryTest {

    @Test
    public void testAddBook() {
        Library library = new Library();
        String input = "101\nThe Great Gatsby\nF. Scott Fitzgerald\n";
        Scanner scanner = new Scanner(input);

        library.addBook(scanner);

        Book book = library.findBook("101");
        assertNotNull(book);
        assertEquals("The Great Gatsby", book.getTitle());
        assertEquals("F. Scott Fitzgerald", book.getAuthor());
        assertTrue(book.isAvailable());
    }
}
