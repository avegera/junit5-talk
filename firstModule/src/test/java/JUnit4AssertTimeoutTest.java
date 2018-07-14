import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class JUnit4AssertTimeoutTest {

    @Test(timeout = 100)
    public void testTimeout() throws InterruptedException {
        Thread.sleep(10);
    }
}