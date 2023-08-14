import java.util.ArrayList;
import java.util.List;

public class Program {

    // Tip: You can use `element instanceof ArrayList` to check whether an item
    // is an array or an integer.
    // [5, 2, [7, -1], 3, [6, [-13, 8], 4]]
    public static int productSum(List<Object> array) {
        return productSum(array, 1);
    }

    static int productSum(List<Object> array, int depth) {
        int sum = 0;
        for (Object element : array) {
            if (element instanceof ArrayList<?>) {
                sum += productSum((ArrayList<Object>)element, depth + 1);
            } else {
                // is an integer
                sum += (int) element;
            }
        }

        return sum * depth;
    }

}
