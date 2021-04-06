package challenges.stackandqueues;

public class Node<T> {
    T val;
    Node<T> next; // indicates the node that follows the current node
    Node<T> prev;
    public Node (T val){
        this.val = val;
        this.next = null;
    }

    public Node (T val, Node next){
        this.val = val;
        this.next = next;

    }
    public Node (T val, Node next, Node prev){
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