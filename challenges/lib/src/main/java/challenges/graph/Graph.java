package challenges.graph;

import java.util.List;

public class Graph <T>{
    List<Node> nodes;

    public Graph (){

    }

    public Node <T> addNode (T val){
        Node output = new Node<T>(val);
         nodes.add(output);
        return output;
    }

    public int size (){
        return nodes.size();
    }

    public List<Node> getNodes (){
        return this.nodes;
    }

    public void addEdge (Node<T> input1, Node<T> input2, int weight) throws Exception{

        if (nodes.contains(input2) || nodes.contains(input1)){
            new Edge (input1, input2, weight);
        } else throw new Exception("Please insert nodes into graph before ");

    }

    public List<Node> getNeighbors (Node input1){


    }
}
