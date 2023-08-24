package art.iflavio.satellite;

public class Satellite {

    private static final int CONSTRUCTION = 1;
    private static final int FOUND_CONSTRUCTION = 2;

    public static int countConstructions(final int[][] image) {

        int constructions = 0;

        for (int l = 0; l < image.length; l++) {
            for (int c = 0; c < image[l].length; c++){
                if (image[l][c] == CONSTRUCTION) {
                    constructions++;
                    followAdjacent(image, l, c);
                }
            }
        }

        return constructions;
    }

    private static void followAdjacent(final int[][] image, final int l, final int c) {

        if (l < 0 || l > image.length -1 || c < 0 || c > image[l].length -1) {
            return;
        }

        if (image[l][c] == CONSTRUCTION) {

            image[l][c] = FOUND_CONSTRUCTION;

            followAdjacent(image, l, c + 1);
            followAdjacent(image, l + 1, c + 1);
            followAdjacent(image, l + 1, c);
            followAdjacent(image, l + 1, c - 1);
            followAdjacent(image, l, c - 1);
            followAdjacent(image, l - 1, c - 1);
            followAdjacent(image, l - 1, c);
            followAdjacent(image, l - 1, c + 1);

        }
    }
}
