package challenges.tree;

import java.util.ArrayList;

public class BinaryTree {
public Node root;

    public BinaryTree(Node root) {
        this.root = root;
    }
    public BinaryTree() {

    }
    //iterative
    public int [] preOrder () throws Exception {
        if (this.root == null) throw new Exception("Oh snap, there's nothing to traverse");
        ArrayList<Integer> output = new ArrayList<>();
        output.add(0, root.val );
        while (output.size() > 0 ){
        Node currentNode = new Node (output.remove(output.size()-1));
        if (currentNode.right != null) output.add(currentNode.right.val);
        if (currentNode.left != null) output.add(currentNode.left.val);
        }

        int [] actualOut = new int[output.size()];
        for (int i = 0; i < output.size(); i++) {
            actualOut[i] = output.get(i);

        }
        return actualOut;
    }
//    stephen helped me understand recursive
    public int [] inOrder () throws Exception {
        if (this.root == null) throw new Exception("Oh snap, there's nothing to traverse");
        ArrayList<Integer> output = new ArrayList<>();
        this._inOrder(this.root, output);

        int [] actualOut = new int[output.size()];
        for (int i = 0; i < output.size(); i++) {
            actualOut[i] = output.get(i);
        }
        return actualOut;
    }
    public void _inOrder (Node input, ArrayList<Integer> inputList ) {
        if (input == null) return;

        this._inOrder(input.left, inputList);
        this._inOrder(input.right, inputList);
        inputList.add(input.val);
    }
    public int [] postOrder () throws Exception {
        if (this.root == null) throw new Exception("Oh snap, there's nothing to traverse");
        ArrayList<Integer> output = new ArrayList<>();
        this._postOrder(this.root, output);

        int [] actualOut = new int[output.size()];
        for (int i = 0; i < output.size(); i++) {
            actualOut[i] = output.get(i);
        }
        return actualOut;
    }
    public void _postOrder (Node input, ArrayList<Integer> inputList ) {
        if (input == null) return;

        this._inOrder(input.left, inputList);
        inputList.add(input.val);
        this._inOrder(input.right, inputList);

    }

}
