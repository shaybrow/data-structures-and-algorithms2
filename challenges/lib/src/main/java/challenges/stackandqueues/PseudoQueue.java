package challenges.stackandqueues;

public class PseudoQueue {
public Stack front;
public Stack back;

    public PseudoQueue() {
        this.front = new Stack();
        this.back = new Stack();
    }
    public void enqueue (int input){

        back.push(input);
    }
    public int dequeue () throws Exception {
        if (this.front.isEmpty() == true){
            while (this.back.isEmpty() == false){
                this.front.push(this.back.pop());
            }

        }
        int output = this.front.pop();
        return output;
    }
}
