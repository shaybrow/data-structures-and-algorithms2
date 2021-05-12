package challenges.graph;

import challenges.stackandqueues.Queue;

import java.util.*;

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
    public ArrayList<Node> depthFirst (Node <T> input){
        if (nodes.contains(input) == false) return null;
        ArrayList<Node> output = new ArrayList<>();
        Stack<Node<T>> stack = new Stack<>();
        stack.push(input);

//        a-b-c-d
        while ( stack.isEmpty() != true){
            Node <T> current = stack.peek();
            output.add(stack.pop());
            for (Edge <T> e : current.edges){
                if(output.contains(e.node1) == false){
                    stack.push(e.node1);
                }
                if(output.contains(e.node2) == false){
                    stack.push(e.node2);
                }

            }

        }
        return output;
    }

    public ArrayList <Node> breadthFirst (Node input){
        if (nodes.contains(input) == false) return null;
        ArrayList <Node> output = new ArrayList<>();
        output.add(input);
        Hashtable <Node, Integer> inputHT = this.getNeighbors(input);
        Set <Node> inputKS = inputHT.keySet();

        for (Node n : inputKS){
            Boolean inOutput = false;
            for (int i = 0; i < output.size(); i++) {
                if (n == output.get(i)) inOutput = true;
            }

            if (inOutput == false) {

                output.add(n);
                Set<Node> set = this.getNeighbors(n).keySet();
                for (Node node : set){

                    if (output.contains(node) == false) output.add(node);

                }

            }

        }
        return output;
    }


}
