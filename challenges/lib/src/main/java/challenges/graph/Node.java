package challenges.graph;

import java.util.ArrayList;
import java.util.List;

public class Node<T> {
   public T val;
    public List <Edge>edges;
    public Node (T val){
        this.val = val;
        this.edges = new ArrayList();
    }

    @Override
    public String toString() {
        return "Node{" +
                "value='" + val + '\'' +

                '}';
    }
}