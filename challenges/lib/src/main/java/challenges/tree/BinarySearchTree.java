package challenges.tree;

import java.util.ArrayList;

public class BinarySearchTree extends BinaryTree{


    public void add (int input){
        if (this.root == null) this.root = new Node(input);
        else{
            boolean done = false;
            Node currentNode = this.root;
            while (done == false){
                if ( input < currentNode.val){
                    if (currentNode.left == null){
                        currentNode.left = new Node(input);
                        done = true;
                    } else currentNode = currentNode.left;
                }else if (input == currentNode.val){
                    done = true;
                }
                else if (input > currentNode.val){
                    if (currentNode.right == null){
                        currentNode.right = new Node(input);
                        done = true;
                    } else currentNode = currentNode.right;
                }
            }

        }
    }







}
