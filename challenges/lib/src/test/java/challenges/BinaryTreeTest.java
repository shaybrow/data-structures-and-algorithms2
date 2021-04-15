package challenges;



import challenges.tree.BinaryTree;
import challenges.tree.Node;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;
public class BinaryTreeTest {

    @Test
    public void testSimpleTree (){
//        test empty
        BinaryTree testEmpty = new BinaryTree();
        assertNull(testEmpty.root);
//        test 1
        BinaryTree test1 = new BinaryTree(new Node(5));
        assertNotNull(test1.root);
//      test left/right
        Node left = new Node(0);
        Node right = new Node(7);
        test1.root.left = left;
        test1.root.right = right;
        int expect = 0;

        assertNotNull(test1.root.left);
        assertNotNull(test1.root.right);


    }
    @Test
    public void testComplexTree () throws Exception {
        BinaryTree test = new BinaryTree(new Node(5));
        Node left = new Node(3);
        Node right = new Node(4);
        test.root.left = left;
        test.root.right = right;
        left.left = new Node(9);
        right.left = new Node(2);
        left.right = new Node(1);
        right.right = new Node(7);
//        in order test
        int [] trueOut = test.inOrder();
        int [] expectOut = {9,1,3,2,7,4,5};
        assertArrayEquals(expectOut, trueOut);

//        post order test
        int [] trueOutPost = test.postOrder();

        int [] expectOutPost = {9,3,1,5,2,4,7};
        assertArrayEquals(expectOutPost, trueOutPost);

//        preorder test
        int [] trueOutPre = test.preOrder();

        int [] expectOutPre = {9,1,3,2,7,4,5};

        assertArrayEquals(expectOutPre, trueOutPre);

    }
    @Test
    public void testContains(){
        BinaryTree test = new BinaryTree();
        assertFalse(test.contains(0));
//        test null
        test.root = new Node (0);
        Node left = new Node(3);
        Node right = new Node(4);
        test.root.left = left;
        test.root.right = right;
//        does not contain
        assertFalse(test.contains(10);
//        does contain node
        assertTrue(test.contains(4));
//        does contain root
        assertTrue(test.contains(0));

    }

    @Test
    public void testFindMaxValue () throws Exception{
        BinaryTree test = new BinaryTree(new Node(5));
        Node left = new Node(3);
        Node right = new Node(4);
        test.root.left = left;
        test.root.right = right;
        left.left = new Node(9);
        right.left = new Node(2);
        left.right = new Node(1);
        right.right = new Node(7);
        int actualOut = test.findMaxValue();
        int expectOut = 9;

        assertEquals(expectOut, actualOut);

        right.right.right = new Node(1000);
        expectOut = 1000;
        actualOut = test.findMaxValue();
        assertEquals(expectOut, actualOut);
    }
    @Test
    public void testBreadthFirstTraversal () throws Exception{
        BinaryTree test = new BinaryTree(new Node(5));
        Node left = new Node(3);
        Node right = new Node(4);
        test.root.left = left;
        test.root.right = right;

        String expectOut = "[5, 3, 4]";

        ArrayList trueOut = test.breadthFirstTraversal();

        assertEquals(expectOut, trueOut.toString());
        left.left = new Node(9);
        right.left = new Node(2);

        trueOut = test.breadthFirstTraversal();
        expectOut = "[5, 3, 4, 9, 2]";
        assertEquals(expectOut, trueOut.toString());

    }
}
