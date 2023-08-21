import org.junit.Assert;
import org.junit.Test;

public class ProgramTest {
    @Test
    public void TestCase1() {
        Program.BinaryTree tree = new Program.BinaryTree(-1);
        tree.left = new Program.BinaryTree(2);
        tree.right = new Program.BinaryTree(-2);
        tree.right.left = new Program.BinaryTree(5);
        tree.right.right = new Program.BinaryTree(1);
        var expected = 6;
        var actual = new Program().evaluateExpressionTree(tree);
        Assert.assertEquals(expected, actual);
    }
}
