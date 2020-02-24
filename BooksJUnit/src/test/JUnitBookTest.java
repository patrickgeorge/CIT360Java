package test;

import JUnit.JUnitBook;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JUnitBookTest {

    public JUnitBookTest() {

    }

    String[] citation = {"Card, Orson Scott", "Ender's Game", "New York : Tor", "1992", "Print"};

    JUnitBook realBook = new JUnitBook("Orson Scott Card", "Ender's Game", "Sci-Fi", 10.99, 813.54, false, citation);
    JUnitBook nullBook = new JUnitBook();

    @Test
    public void testNull() {assertNull(nullBook.getAuthor());}

    @Test
    public void testNotEquals() {assertNotEquals("Ender's Shadow", realBook.getTitle());}

    @Test
    public void testEquals() {assertEquals(10.99, realBook.getPrice());}

    @Test
    public void testNotNull() {assertNotNull(realBook.getDeweyD());}

    @Test
    public void testNotSame() {assertNotSame("Fantasy", realBook.getGenre());}

    @Test
    public void testFalse() {assertFalse(realBook.getRented());}

    @Test
    public void testSame() {assertSame("Orson Scott Card", realBook.getAuthor());}

    @Test
    public void testArray() {assertArrayEquals(citation, realBook.getCitation());}
}
