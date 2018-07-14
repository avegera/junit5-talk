import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class JUnit5AssertTrowsTest {

    @Test
    void assertThrowsExample() {
        String test = null;
        assertThrows(NullPointerException.class, () -> test.length());
    }
} 