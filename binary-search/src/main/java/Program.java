public class Program {
    public static int binarySearch(int[] array, int target) {

        int found = -1;
        int left = 0;
        int right = array.length -1;

        while (left <= right && found == -1) {

            int middle = (left + right) / 2;

            if (array[middle] == target) {
                found = middle;
            } else if (array[middle] > target) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }

        return found;
    }
}
