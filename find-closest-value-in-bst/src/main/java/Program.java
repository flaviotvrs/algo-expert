import java.util.*;

class Program {

    public static int findClosestValueInBst(BST tree, int target) {

        BST current = tree;
        BST closest = current;
        int minorDiff = Integer.MAX_VALUE;

        while (current != null) {

            int diff = Math.abs(target - current.value);

            if (diff < minorDiff) {
                minorDiff = diff;
                closest = current;
            }

            if (target < current.value) {
                current = current.left;
            } else if (target > current.value) {
                current = current.right;
            } else {
                current = null;
            }
        }

        return closest.value;
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }
}
