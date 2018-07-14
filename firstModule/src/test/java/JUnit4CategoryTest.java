import com.exadel.test.IntegrationTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JUnit4CategoryTest {

    @Test
    @Category(IntegrationTest.class)
    public void testReadingFile() throws IOException {
        String content = new String(Files.readAllBytes(Paths.get("testFile.txt")));
    }
}