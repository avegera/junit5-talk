import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JUnit4BeforeAndAfterTest {

    @Before
    public void before() {
        System.out.println("before()");
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

    @After
    public void after() {
        System.out.println("after()");
    }
} 