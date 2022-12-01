import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SmartphoneTest {


    @Test
    public void shouldTestSetProducer() {

        Smartphone smartphone = new Smartphone(5, 30, "Sony", "Sony");

        smartphone.setProducer("Sony");

        String expected = "Sony";
        String actual = smartphone.getProducer();

        assertEquals(expected, actual);
    }
}
