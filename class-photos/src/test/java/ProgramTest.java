import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProgramTest {

    @Test
    public void testCase1() {
        ArrayList<Integer> redShirtHeights = new ArrayList<>(Arrays.asList(5, 8, 1, 3, 4));
        ArrayList<Integer> blueShirtHeights = new ArrayList<>(Arrays.asList(6, 9, 2, 4, 5));
        boolean actual = new Program().classPhotos(redShirtHeights, blueShirtHeights);
        Assert.assertTrue(actual);
    }

    @Test
    public void testCase2() {
        ArrayList<Integer> redShirtHeights = new ArrayList<>(Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1));
        ArrayList<Integer> blueShirtHeights = new ArrayList<>(Arrays.asList(5, 6, 7, 2, 3, 1, 2, 3));
        boolean actual = new Program().classPhotos(redShirtHeights, blueShirtHeights);
        Assert.assertFalse(actual);
    }

    @Test
    public void testCase3() {
        ArrayList<Integer> redShirtHeights = new ArrayList<>(List.of(6));
        ArrayList<Integer> blueShirtHeights = new ArrayList<>(List.of(6));
        boolean actual = new Program().classPhotos(redShirtHeights, blueShirtHeights);
        Assert.assertFalse(actual);
    }

    @Test
    public void testCase4() {
        ArrayList<Integer> redShirtHeights = new ArrayList<>(Arrays.asList(3, 5, 6, 8, 2));
        ArrayList<Integer> blueShirtHeights = new ArrayList<>(Arrays.asList(2, 4, 7, 5, 1));
        boolean actual = new Program().classPhotos(redShirtHeights, blueShirtHeights);
        Assert.assertTrue(actual);
    }

    @Test
    public void testCase5() {
        ArrayList<Integer> redShirtHeights = new ArrayList<>(Arrays.asList(5, 6));
        ArrayList<Integer> blueShirtHeights = new ArrayList<>(Arrays.asList(5, 4));
        boolean actual = new Program().classPhotos(redShirtHeights, blueShirtHeights);
        Assert.assertTrue(actual);
    }
}
