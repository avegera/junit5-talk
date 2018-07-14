import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JUnit4BeforeClassAndAfterClassTest {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("beforeClass()");
    }

    @Test
    public void multiplyTest1() {
        System.out.println("multiplyTest1()");
        assertEquals(40, 4 * 10);
    }

    @Test
    public void multiplyTest2() {
        System.out.println("multiplyTest2()");
        assertEquals(50, 5 * 10);
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("afterClass()");
    }
} 