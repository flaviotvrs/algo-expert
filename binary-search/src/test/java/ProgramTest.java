import org.junit.Assert;
import org.junit.Test;

public class ProgramTest {

    @Test
    public void testCase1() {
        Assert.assertEquals(
                3,
                Program.binarySearch(new int[] {0, 1, 21, 33, 45, 45, 61, 71, 72, 73}, 33)
        );
    }

    @Test
    public void testCase2() {
        Assert.assertEquals(
                -1,
                Program.binarySearch(new int[] {0, 1, 21, 33, 45, 45, 61, 71, 72, 73}, 74)
        );
    }

    @Test
    public void testCase3() {
        Assert.assertEquals(
                -1,
                Program.binarySearch(new int[] {7, 8, 9}, 5)
        );
    }

    @Test
    public void testCase4() {
        Assert.assertEquals(
                0,
                Program.binarySearch(new int[] {9}, 9)
        );
    }
}
