package challenges.stackandqueues;

// stacks can only have things added and removed at the top level
public class Stack<T> {
    public Node<T> top;

    public Stack(){

    }

    public void push (T input){
        Node inputNode = new Node (input);
        inputNode.next = this.top;
        this.top = inputNode;

    }
    public T pop () throws Exception {
        if (this.top == null) throw new Exception("");
        T popped = this.top.val;
        this.top = this.top.next;
        return popped;
    }
    public T peek () throws Exception{
        if (this.top == null) throw new Exception("No peeking on empty stacks");
        return this.top.val;
    }
//    if there's nothing at the top it must be empty
    public boolean isEmpty (){
        if (this.top == null) return true;
        else return false;


    }
}
