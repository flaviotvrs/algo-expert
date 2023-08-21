import org.junit.Assert;
import org.junit.Test;

public class ProgramTest {

    @Test
    public void testCase1() {
        int[] input = new int[] {5, 7, 1, 1, 2, 3, 22};
        int expected = 20;
        var actual = new Program().nonConstructibleChange(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCase2() {
        int[] input = new int[] {1, 1, 1, 1, 1};
        int expected = 6;
        var actual = new Program().nonConstructibleChange(input);
        Assert.assertEquals(expected, actual);
    }
}
