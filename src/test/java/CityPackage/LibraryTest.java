package CityPackage;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    @Test
    public void sum() {
        assertEquals(3, Library.sum(1, 2));
    }
}