package challenges.graph;

public class Edge <T>{

    public Node <T> node1;
    public Node <T> node2;
    public int weight;

    public Edge(Node<T> node1, Node<T> node2, int weight) {
        this.node1 = node1;
        this.node2 = node2;
        this.weight = weight;
        node1.edges.add(this);
        node2.edges.add(this);
    }

//    public Edge(Node<T> node1, Node<T> node2) {
//        this.node1 = node1;
//        this.node2 = node2;
//    }
}
