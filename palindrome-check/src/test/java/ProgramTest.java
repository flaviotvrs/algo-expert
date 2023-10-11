import org.junit.Assert;
import org.junit.Test;

public class ProgramTest {
    @Test
    public void TestCase1() {
        Assert.assertTrue(Program.isPalindrome("abcdcba"));
    }
}
