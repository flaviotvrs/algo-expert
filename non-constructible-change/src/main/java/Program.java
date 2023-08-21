import java.util.Arrays;

public class Program {

    /*
     * O(nlogn) time | O(1) space
     */
    public int nonConstructibleChange(int[] coins) {

        Arrays.sort(coins);

        int change = 0;
        for (int coin : coins) {
            if (coin <= change + 1) {
                change += coin;
            } else {
                break;
            }
        }

        return change + 1;
    }
}
