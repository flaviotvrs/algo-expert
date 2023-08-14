import org.junit.Assert;
import org.junit.Test;

public class BubbleSortTest {

    @Test
    public void sortUnsortedArray() {
        Assert.assertArrayEquals(new int[]{2, 3, 5, 5, 6, 8, 9}, BubbleSort.sort(new int[]{ 8, 5, 2, 9, 5, 6, 3 }));
    }

    @Test
    public void sortSortedArray() {
        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5}, BubbleSort.sort(new int[]{ 1, 2, 3, 4, 5}));
    }
}
