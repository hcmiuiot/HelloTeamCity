package CityPackage;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    @Test
    public void sum() {
        assertEquals(3, Library.sum(1, 2));
    }

    @Test
    public void divide() {
        assertEquals(1, Library.divide(1, 0), 0);
    }
}