import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JUnit4IgnoreTest {

    @Test
    @Ignore
    public void multiplyTest1() {
        assertEquals(4, 2 + 2);
    }
}