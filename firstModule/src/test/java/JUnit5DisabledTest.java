import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JUnit5DisabledTest {

    @Test
    @Disabled
    void multiplyTest1() {
        assertEquals(4, 2 + 2);
    }
}