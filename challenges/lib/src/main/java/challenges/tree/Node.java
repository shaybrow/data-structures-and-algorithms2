package challenges.tree;

public class Node {
   public int val;
   public String value;
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
    public Node (String value){
        this.value = value;
    }

}
