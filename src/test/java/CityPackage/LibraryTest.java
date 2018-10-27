package CityPackage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    @Test
    void sum() {
        assertEquals(3, Library.sum(1, 2));
    }
}