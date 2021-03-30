package challenges.LinkedList;

public class Node {
    String input;
    Node next; // indicates the node that follows the current node
    Node prev;
    public Node (String input){
        this.input = input;
        this.next = null;
    }
    public Node (String input, Node next){
        this.input = input;
        this.next = next;
    }
    public Node (String input, Node next, Node prev){
        this.input = input;
        this.next = next;
        this.prev = prev;
    }
}
