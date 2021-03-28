package challenges.LinkedList;

public class LinkedList {

    public Node head;
    public LinkedList(){

    }
    public void addNode(String input){
        if (head == null){
            Node prevNode = new Node(input);
        } else {
            Node nextNode = new Node(input);
            nextNode.next = head;
            head = nextNode;
        }
    }

    public String toString(){
        String output = "";
        Node currentNode = this.head;
        boolean isNull = false;

        while (isNull == false){
            if (currentNode.input == null) isNull = true;
            output = output + currentNode.input + " and ";

        }
        output = output + "NULL";
        System.out.println(output);
        return output;
    }

    public Boolean includes(String inputCheck){
        Node currentNode = this.head;
        while (currentNode != null){
            if (currentNode.input == inputCheck){
                return true;
            }
        }
        return false;

    }
}
