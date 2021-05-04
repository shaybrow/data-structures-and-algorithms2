package challenges.tree;

import challenges.stackandqueues.Queue;

import java.util.ArrayList;

public class BinaryTree {
public Node root;
public int maxValue;

    public BinaryTree(Node root) {
        this.root = root;
    }
    public BinaryTree() {

    }
    //iterative - doesn't work
    public int [] preOrderIterative () throws Exception {
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
    public int [] preOrder () throws Exception {
        if (this.root == null) throw new Exception("Oh snap, there's nothing to traverse");
        ArrayList<Integer> output = new ArrayList<>();
        this._preOrder(this.root, output);

        int [] actualOut = new int[output.size()];
        for (int i = 0; i < output.size(); i++) {
            actualOut[i] = output.get(i);
        }
        return actualOut;
    }
    public void _preOrder (Node input, ArrayList<Integer> inputList ) {
        if (input == null) return;
        inputList.add(input.val);
        this._preOrder(input.left, inputList);
        this._preOrder(input.right, inputList);

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

        this._postOrder(input.left, inputList);
        inputList.add(input.val);
        this._postOrder(input.right, inputList);

    }
    public int findMaxValue () throws Exception {
        if (this.root == null) throw new Exception("Can't find max on null tree");

        this._findMaxValue(this.root);
        return maxValue;
    }
    public void _findMaxValue (Node input) {
        if (input == null) return ;
//        if (maxValue == null) maxValue = input.val;
        if (maxValue < input.val) maxValue = input.val;
        this._findMaxValue(input.left);
        this._findMaxValue(input.right);

    }
    public ArrayList breadthFirstTraversal () throws Exception {
        if (this.root == null) throw new Exception("Can't traverse on null tree");
        ArrayList output = new ArrayList();
        Node temp = this.root;
        output.add(temp.val);
        Queue<Node> queue= new Queue();
        if (temp.left != null) queue.enqueue(temp.left);
        if (temp.right != null) queue.enqueue(temp.right);
        while(queue.isEmpty() != true){
            Node temp2 = queue.dequeue();

            output.add(temp2.val);
            if (temp2.left != null) queue.enqueue(temp2.left);
            if (temp2.right != null) queue.enqueue(temp2.right);

        }
        return output;


    }
    public ArrayList<String> sInOrder () throws Exception {
        if (this.root == null) throw new Exception("Oh snap, there's nothing to traverse");
        ArrayList<String> output = new ArrayList<>();
        this._sInOrder(this.root, output);


        return output;
    }
    public void _sInOrder (Node input, ArrayList<String> inputList ) {
        if (input == null) return;

        this._sInOrder(input.left, inputList);
        this._sInOrder(input.right, inputList);
        inputList.add(input.value);
    }
    public boolean contains (int checkFor) {
        if (this.root == null) return false;
        ArrayList<Integer> output = new ArrayList<>();
        this._postOrder(this.root, output);

        for (int i = 0; i < output.size(); i++) {
            int test = output.get(i);
            if (test == checkFor) return true;

        }
        return false;
    }
    public void contains (Node input, ArrayList<Integer> inputList ) {
        if (input == null) return;

        this._postOrder(input.left, inputList);
        inputList.add(input.val);
        this._postOrder(input.right, inputList);

    }

}
