import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class JUnit5TagTest {

    @Test
    @Tag("IntegrationTest")
    void testTag() throws IOException {
        String content = new String(Files.readAllBytes(Paths.get("testFile.txt")));
    }
}