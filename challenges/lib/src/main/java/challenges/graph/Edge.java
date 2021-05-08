package challenges.graph;

public class Edge <T>{

    Node <T> node1;
    Node <T> node2;
    int weight;

    public Edge(Node<T> node1, Node<T> node2, int weight) {
        this.node1 = node1;
        this.node2 = node2;
        this.weight = weight;
        node1.edges.add(node2);
        node2.edges.add(node1);
    }

    public Edge(Node<T> node1, Node<T> node2) {
        this.node1 = node1;
        this.node2 = node2;
    }
}
