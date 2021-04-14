package challenges.utilities;

import challenges.tree.BinaryTree;
import challenges.tree.Node;

import java.util.ArrayList;

public class FizzBuzzTree {


    public FizzBuzzTree (){}




    public static BinaryTree fizzBuzzTree (BinaryTree input) throws Exception {
        if (input.root == null) throw new Exception("Oh snap, there's nothing to traverse");

        helper(input.root);

 return input;

    }
    private static void helper(Node inputNode){
        if (inputNode == null) return;
//      stephen helped me recover my sanity (slightly)
        if (Integer.parseInt(inputNode.value) %15== 0) inputNode.value= "FizzBuzz";
        else if (Integer.parseInt(inputNode.value) %3== 0) inputNode.value = "Fizz";
        else if (Integer.parseInt(inputNode.value) %5== 0) inputNode.value= "Buzz";

//            https://www.javatpoint.com/java-int-to-string
        helper(inputNode.left);
        helper(inputNode.right);
        }


    }

