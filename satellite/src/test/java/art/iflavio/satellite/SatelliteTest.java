package art.iflavio.satellite;

import org.junit.Assert;
import org.junit.Test;

public class SatelliteTest {

    @Test
    public void countConstructionsWhereImageHasFourConstructionsShouldReturnFour() {
        int[][] image = new int[][] {
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 0 },
            { 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
            { 0, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0 },
            { 0, 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 0, 0 },
            { 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0 },
            { 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 0, 0 },
            { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0 },
            { 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
        };

        int count = Satellite.countConstructions(image);
        Assert.assertEquals(4, count);
    }

    @Test
    public void countConstructionsWhereImageHasNoConstructionsShouldReturnZero() {
        int[][] image = new int[][] {
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
        };

        int count = Satellite.countConstructions(image);
        Assert.assertEquals(0, count);
    }

    @Test
    public void countConstructionsWhereImageIsFilledWithOneConstructionsShouldReturn1() {
        int[][] image = new int[][] {
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
        };

        int count = Satellite.countConstructions(image);
        Assert.assertEquals(1, count);
    }

    @Test
    public void countConstructionsWhereImageIsOneByOneAndHasNoConstructionsShouldReturnZero() {
        int[][] image = new int[][] { { 0 } };

        int count = Satellite.countConstructions(image);
        Assert.assertEquals(0, count);
    }

    @Test
    public void countConstructionsWhereImageIsOneByOneAndHasOneConstructionsShouldReturnOne() {
        int[][] image = new int[][] { { 1 } };

        int count = Satellite.countConstructions(image);
        Assert.assertEquals(1, count);
    }

    @Test
    public void countConstructionsWhereImageIsEmptyAndHasOneConstructionsShouldReturnZero() {
        int[][] image = new int[][] { { } };

        int count = Satellite.countConstructions(image);
        Assert.assertEquals(0, count);
    }

    @Test
    public void countConstructionsWhereImageIsSingleLineAndHasFiveConstructionsShouldReturnFive() {
        int[][] image = new int[][] { { 1, 0, 1, 0, 1, 0, 1, 0, 1 } };

        int count = Satellite.countConstructions(image);
        Assert.assertEquals(5, count);
    }

    @Test
    public void countConstructionsWhereImageIsSingleColumnAndHasFiveConstructionsShouldReturnFive() {
        int[][] image = new int[][] {
                { 1 },
                { 0 },
                { 1 },
                { 0 },
                { 1 },
                { 0 },
                { 1 },
                { 0 },
                { 1 },
        };

        int count = Satellite.countConstructions(image);
        Assert.assertEquals(5, count);
    }
}
