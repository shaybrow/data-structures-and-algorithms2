package challenges;
import challenges.TreeIntersection.TreeIntersection;
import challenges.tree.BinaryTree;
import challenges.tree.Node;
import org.junit.Test;

import static org.junit.Assert.*;

public class IntersectionTreeTest {

    @Test
    public void testInsertionTreeTest () {

        Node n = new Node(10);
        n.left = new Node( 7);
        n.right = new Node(15);
        BinaryTree binaryTree = new BinaryTree(n);
        BinaryTree binaryTree1 = new BinaryTree();
        int [] nothing = TreeIntersection.treeIntersection(binaryTree1, binaryTree);
//        one or both null trees returns null
        assertNull(nothing);
        binaryTree1.root = new Node(7);
//      testing simple tree with same value on different levels
        int [] trueOut = TreeIntersection.treeIntersection(binaryTree1, binaryTree);
        int [] expectOut = {7};
        assertArrayEquals(expectOut, trueOut);

        Node n1 = new Node(10);
        Node n2 = new Node(100);
        binaryTree1.root.right = n1;
        n1.right = n2;
        n2.left = new Node(15);
        int [] expectOut2 = {10, 7, 15};
        int [] trueOut2 = TreeIntersection.treeIntersection(binaryTree1, binaryTree);
//       test long tree disorganized
        assertArrayEquals(expectOut2, trueOut2);

    }
}
