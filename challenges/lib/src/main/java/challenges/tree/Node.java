package challenges.tree;

public class Node {
    int val;
  public Node left;
  public Node right;
    public Node(int val, Node left, Node right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public Node(int val, Node left) {
        this.val = val;
        this.left = left;
    }

    public Node(int val) {
        this.val = val;

    }
}
