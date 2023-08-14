import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductSumTest {

    @Test
    public void testCase1() {
        List<Object> test = new ArrayList<>(Arrays.asList(
                5,
                2,
                new ArrayList<Object>(Arrays.asList(7, -1)),
                3,
                new ArrayList<Object>(
                        Arrays.asList(6, new ArrayList<Object>(Arrays.asList(-13, 8)), 4)
                )
        ));

        Assert.assertEquals(12, Program.productSum(test));
    }
}
