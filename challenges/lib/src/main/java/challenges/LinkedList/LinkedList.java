package challenges.LinkedList;

public class LinkedList {

    public Node head;
    public Node tail;
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
    public void setDoubleLinkedList (){
        Node currentNode = this.head;
//        handles for LL size 1
        if (currentNode.next == null){
            this.tail = currentNode;
            return;
        }
        Node nextNode = currentNode.next;
        nextNode.prev = currentNode;
//        handles for LL size 2
        if (nextNode.next == null){
            this.tail = nextNode;
            return;
        }
//      handles for LL size 2+
//       Stephen helped me figure out while loops iterate tot the end
        while (nextNode.next != null){
            currentNode = currentNode.next;
            nextNode = nextNode.next;
            nextNode.prev = currentNode;
//            If the node after nextNode is null nextNode must be the tail

        }
//        nextNode.prev = currentNode;
        this.tail = nextNode;
        return;
    }
    public String findKthFromEnd (int k){
        setDoubleLinkedList();
        if (this.tail == this.head) return "Exception LL has 1 node";
//        checking for 0
        if (k == 0) return this.tail.input;
        Node currentNode = this.tail;
//        checking for 1
        Node prevNode = currentNode.prev;
        if (k == 1) return prevNode.input;

        int counter = 1;
//        checking for 2+

        while (k != counter){
            currentNode = prevNode;
            System.out.println(currentNode.input);
            prevNode = prevNode.prev;
            counter ++;
            if (prevNode == this.head){
                if (k > counter){
                    return "Exception LL is shorter than k";
                }
            }

        }

        return prevNode.input;
    }
    public LinkedList zipLists(LinkedList one, LinkedList two){
        Node current1Node = one.head;
        Node next1Node = current1Node.next;
        Node current2Node = two.head;
        Node next2Node = current2Node.next;

        while (current2Node.next != null || current1Node.next != null){
            current1Node.next = current2Node;
            current2Node.next = next1Node;
            current1Node = next1Node;
            current2Node = next2Node;
            next1Node = next1Node.next;
            next2Node = next2Node.next;

        }
        current1Node.next = current2Node;
        System.out.println(current1Node);
        System.out.println(current2Node);
        
//        while (current1Node.next != null){
//            current1Node.next = next1Node;
//            next1Node = next1Node.next;
//        }
//        while (current2Node.next != null){
//            current2Node.next = next2Node;
//            next2Node = next2Node.next;
//        }

//
        return one;

    }
}
