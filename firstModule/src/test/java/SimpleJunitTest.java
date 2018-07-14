import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimpleJunitTest {

    @Test
    public void simpleJunit4Test() {
        System.out.println("simpleJunit4Test()");
        assertEquals(4, 2 + 2);
    }

    @org.junit.jupiter.api.Test
    void simpleJunit5Test() {
        System.out.println("simpleJunit5Test()");
        assertEquals(4, 2 + 2);
    }
}
