public class BubbleSort {
    public static int[] sort(int[] array) {

        boolean swap = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {

                int a = array[j];
                int b = array[j + 1];

                if (a > b) {
                    array[j] = b;
                    array[j + 1] = a;
                    swap = true;
                }
            }

            if (!swap) {
                break;
            }
        }

        return array;
    }

}
