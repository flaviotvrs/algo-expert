import org.junit.Assert;
import org.junit.Test;

public class ProgramTest {

    @Test
    public void testCase1() {
        int target = 12;

        Program.BST root = new Program.BST(10);

        root.left = new Program.BST(5);
        root.left.left = new Program.BST(2);
        root.left.left.left = new Program.BST(1);
        root.left.right = new Program.BST(5);

        root.right = new Program.BST(15);
        root.right.left = new Program.BST(13);
        root.right.left.right = new Program.BST(14);
        root.right.right = new Program.BST(22);

        int result = Program.findClosestValueInBst(root, target);
        Assert.assertEquals(result, 13);
    }

}
