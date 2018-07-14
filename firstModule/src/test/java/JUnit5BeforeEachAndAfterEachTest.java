import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JUnit5BeforeEachAndAfterEachTest {

    @BeforeEach
    void beforeEach() {
        System.out.println("beforeEach()");
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

    @AfterEach
    void afterEach() {
        System.out.println("afterEach()");
    }
}