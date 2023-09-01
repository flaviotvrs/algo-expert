import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class Program {

    public boolean classPhotos(ArrayList<Integer> redShirtHeights, ArrayList<Integer> blueShirtHeights) {

        redShirtHeights.sort(Comparator.reverseOrder());
        blueShirtHeights.sort(Comparator.reverseOrder());

        int baseHeightDiff = redShirtHeights.get(0) - blueShirtHeights.get(0);

        if (baseHeightDiff == 0) {
            return false;
        }

        for (int i = 1; i < redShirtHeights.size(); i++) {
            int heightDiff = redShirtHeights.get(i) - blueShirtHeights.get(i);
            if (baseHeightDiff < 0 && heightDiff >= 0 || baseHeightDiff > 0 && heightDiff <= 0) {
                return false;
            }
        }

        return true;
    }
}

