package challenges.LinkedList;

public class LinkedList {

    public Node head;
    public LinkedList(){

    }
    public void addNode(String input){
        if(this.head == null){

            Node newNode = new Node(input);
            this.head = newNode;
            System.out.println(head.input);
        } else {
            Node new2Node = new Node(input, this.head);
             this.head = new2Node;

        }
    }

    public String toString(){
        String output = "";
        Node currentNode = this.head;

        while (currentNode.next != null){


            output += currentNode.input + " and ";
            currentNode =currentNode.next;
        }
        output = output + currentNode.input + " and ";
        output = output + "NULL";
//        System.out.println(output);
        return output;
    }

    public Boolean includes(String inputCheck){
        Node currentNode = this.head;
        while (currentNode != null){
            if (currentNode.input.contains(inputCheck)){
                return true;
            }else currentNode = currentNode.next;
        }
        return false;

    }
    public void append(String input){
        Node currentNode = this.head;
        if (currentNode.next == null){
            currentNode.next = new Node(input);
        }else {
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            Node appendNode = new Node(input);
            currentNode.next = appendNode;
        }
    }
    public void insertBefore(String lookVal, String input){
        Node currentNode = this.head;
        Node nextNode = currentNode.next;
        while (!nextNode.input.contains(lookVal)){
            currentNode = currentNode.next;
            nextNode = currentNode.next;
            if(nextNode.next == null) return;
        }

        Node insertBeforeNode = new Node(input, nextNode);
        currentNode.next = insertBeforeNode;
    }
    public void insertAfter(String lookVal, String input){
        Node currentNode = this.head;
        while (currentNode.input != lookVal){
            currentNode = currentNode.next;
            if(currentNode.next == null) return;
        }
        Node insertAfterNode = new Node(input, currentNode.next);
        currentNode.next = insertAfterNode;
    }

}
