import static org.junit.Assert.assertEquals;

/**
 * @author Artem Vegera
 */
public class SimpleJunitTest {

    @org.junit.Test
    public void simpleJunit4Test() {
        System.out.println("simpleJunit4Test()");
        assertEquals(4, 2 + 2);
    }

    @org.junit.jupiter.api.Test
    void simpleJunit5Test() {
        System.out.println("simpleJunit5Test()");
        assertEquals(4, 2 + 2);
    }

    @org.junit.jupiter.api.Test
    void simpleJunit5Test2() {
        System.out.println("simpleJunit5Test2()");
        assertEquals(4, 2 + 2);
    }
}
