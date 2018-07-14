import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class JUnit4AssertThrowsTest {

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void testExceptionThrowingUsingRule() {
        exceptionRule.expect(NumberFormatException.class);
        exceptionRule.expectMessage("For input string");
        Integer.parseInt("1a");
    }

    @Test(expected = NullPointerException.class)
    public void testExceptionThrowing() {
        String test = null;
        test.length();
    }
}