package challenges;

import challenges.tree.BinaryTree;
import challenges.tree.Node;
import challenges.utilities.FizzBuzzTree;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTreeTest {

    @Test
    public void fizzBuzzTest () throws Exception {

        BinaryTree test = new BinaryTree();
        test.root = new Node("5");
        test.root.left = new Node("10");
        test.root.right = new Node("7");
        test.root.right.right = new Node ("3");
        test.root.right.right.right = new Node ("15");

        BinaryTree trueOut = FizzBuzzTree.fizzBuzzTree(test);
        ArrayList trueOutA = trueOut.sInOrder();
//        System.out.println(trueOutA.toString());
        String expectO = "[Buzz, FizzBuzz, Fizz, 7, Buzz]";

        assertEquals(expectO, trueOutA.toString());













    }
}
