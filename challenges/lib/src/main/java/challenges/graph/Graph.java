package challenges.graph;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class Graph <T>{
    List<Node> nodes = new ArrayList<>();

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
        } else throw new Exception("Please insert nodes into graph before declaring an edge");

    }

    public Hashtable<Node, Integer> getNeighbors (Node input){
        Hashtable <Node, Integer> output = new Hashtable();
        for (int i = 0; i < input.edges.size(); i++) {
            Edge x = (Edge)input.edges.get(i);
            Node node1 = x.node1;
            Node node2 = x.node2;

            int z = x.weight;

            if (node1 != input) output.put(node1, z);
            else output.put(node2, z);


        }

        return output;
    }
}
