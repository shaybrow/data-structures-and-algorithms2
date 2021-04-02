package challenges.stackandqueues;

public class Node {
    int val;
    Node next; // indicates the node that follows the current node
    Node prev;
    public Node (int val){
        this.val = val;
        this.next = null;
    }

    public Node (int val, Node next){
        this.val = val;
        this.next = next;

    }
    public Node (int val, Node next, Node prev){
        this.val = val;
        this.next = next;
        this.prev = prev;

    }

    @Override
    public String toString() {
        return "Node{" +
                "value='" + val + '\'' +
                ", next=" + next +

                '}';
    }
}