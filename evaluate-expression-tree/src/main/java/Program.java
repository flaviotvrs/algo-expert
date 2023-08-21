public class Program {
    static class BinaryTree {
        public int value;
        public BinaryTree left = null;
        public BinaryTree right = null;

        public BinaryTree(int value) {
            this.value = value;
        }
    }

    public int evaluateExpressionTree(BinaryTree tree) {
        if (tree.value < 0) { // is operator
            int leftEval = evaluateExpressionTree(tree.left);
            int rightEval = evaluateExpressionTree(tree.right);
            return operate(leftEval, tree.value, rightEval);
        } else { // is operand
            return tree.value;
        }
    }

    private int operate(int a, int operator, int b) {
        if (operator == -1) {
            return a + b;
        } else if (operator == -2) {
            return a - b;
        } else if (operator == -3) {
            return a / b;
        } else if (operator == -4) {
            return a * b;
        } else {
            throw new UnsupportedOperationException(String.format("Invalid operator %d. Expected -1, -2, -3 or -4.", operator));
        }
    }
}
