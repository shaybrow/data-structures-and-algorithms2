package challenges.stackandqueues;

// stacks can only have things added and removed at the top level
public class Stack {
    public Node top;

    public Stack(){

    }

    public void push (int input){
        Node inputNode = new Node (input);
        inputNode.next = this.top;
        this.top = inputNode;

    }
    public int pop () throws Exception {
        if (this.top == null) throw new Exception("");
        int popped = this.top.val;
        this.top = this.top.next;
        return popped;
    }
    public int peek () throws Exception{
        if (this.top == null) throw new Exception("No peeking on empty stacks");
        return this.top.val;
    }
//    if there's nothing at the top it must be empty
    public boolean isEmpty (){
        if (this.top == null) return true;
        else return false;


    }
}
