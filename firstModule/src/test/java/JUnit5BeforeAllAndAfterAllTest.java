import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JUnit5BeforeAllAndAfterAllTest {

    @BeforeAll
    static void beforeAll() {
        System.out.println("beforeAll()");
    }

    @Test
    void multiplyTest1() {
        System.out.println("multiplyTest1()");
        assertEquals(40, 4 * 10);
    }

    @Test
    void multiplyTest2() {
        System.out.println("multiplyTest2()");
        assertEquals(50, 5 * 10);
    }

    @AfterAll
    static void afterAll() {
        System.out.println("afterAll()");
    }
} 