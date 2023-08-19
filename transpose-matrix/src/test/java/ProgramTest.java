import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProgramTest {

    @Test
    public void testCase1() {
        int[][] input = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] expected = new int[][] {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};
        int[][] actual = new Program().transposeMatrix(input);
        assertEquals(expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) {
            for (int j = 0; j < expected[i].length; j++) {
                assertEquals(expected[i][j], actual[i][j]);
            }
        }
    }

}
