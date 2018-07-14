import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertThrows;

class JUnit5AssertTimeoutTest {

    @Test
    void shouldFailBecauseTimeout() {
        Assertions.assertTimeout(Duration.ofMillis(100), () -> Thread.sleep(10));
    }
} 