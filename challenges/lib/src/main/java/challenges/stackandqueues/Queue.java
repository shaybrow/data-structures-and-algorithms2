package challenges.stackandqueues;

public class Queue {
    public Node front;
    public Node back;

    public Queue(){

    }
    public void enqueueWrong (int input){
        Node inputNode = new Node (input);
        Node iterateNode = front;
        while (iterateNode.next != null){
            iterateNode = iterateNode.next;
        }
        iterateNode.next = inputNode;
    }
//    the front.next should always be null
    public void enqueue (int input){
        Node inputNode = new Node (input);
        if (this.back != null) {
            inputNode.next = this.back;
            this.back.prev = inputNode;
//            if (this.back.next == null) this.front = this.back;
            this.back = inputNode;
        } else {
            this.back = inputNode;
            this.front = inputNode;
        }
    }

    public int dequeue () throws Exception {
        if (this.front == null) throw new Exception("Can't dequeue if queue is empty");
        int output = this.front.val;
        this.front = this.front.prev;
        return output;
    }
    public int peek () throws Exception {
        if (this.front == null) throw new Exception("Can't peek if queue is empty");
        return front.val;
    }
    public boolean isEmpty (){
    if (this.front == null) return true;
    else return false;
    }
}
