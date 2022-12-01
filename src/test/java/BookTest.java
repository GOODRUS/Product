import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookTest {


    @Test
    public void shouldTestSetProducer() {

        Book book = new Book(13, 130, "Война и мир", "Толстой Л.Н.");

        book.setAuthor("Толстой Л.Н.");

        String expected = "Толстой Л.Н.";
        String actual = book.getAuthor();

        assertEquals(expected, actual);
    }
}