package challenges;

import static org.junit.Assert.*;

import challenges.graph.Graph;
import challenges.graph.Node;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class GraphTest {

    @Test
    public void testGraph () throws Exception {
        Graph <Integer> test = new Graph<>();

        Node <Integer> a = test.addNode(7);

        Node <Integer> b = test.addNode(8);
        assertNotNull("node should exist and be added",a);



        List<Node> trueOut = test.getNodes();
//        System.out.println(trueOut);
        String expect = "[Node{value='7'}, Node{value='8'}]";
        assertEquals("should return 2 nodes and their values", expect,trueOut.toString());
        test.addEdge(a, b, 1);

        Hashtable <Node, Integer> trueHT = test.getNeighbors(a);
        System.out.println(trueHT);
        String expectOut1 = "{Node{value='8'}=1}";
        assertEquals("should return pairs of relationship and weight", expectOut1, trueHT.toString());


    }
    @Test
    public void breadthFirstTest () throws Exception{
        Graph <Integer> test = new Graph<>();
        Node<Integer> node = new Node<>(1);
        assertNull("should return null if input is not in graph",test.breadthFirst(node));

        Node <Integer> n1 = test.addNode(1);
        Node <Integer> n2 = test.addNode(2);
        Node <Integer> n3 = test.addNode(3);
        Node <Integer> n4 = test.addNode(4);

        test.addEdge(n1, n2, 3);
        ArrayList <Node> trueOut1 = test.breadthFirst(n2);

        String expect1 = "[Node{value='2'}, Node{value='1'}]";
        assertEquals("Single edge should return both", expect1, trueOut1.toString());
        test.addEdge(n2, n3, 3);
        test.addEdge(n4, n1, 5);
        Hashtable <Node, Integer> testHT= test.getNeighbors(n2);


        ArrayList <Node> trueOut = test.breadthFirst(n1);

        String expect = "[Node{value='1'}, Node{value='2'}, Node{value='3'}, Node{value='4'}]";
        assertEquals("should return all nodes", expect, trueOut.toString());
    }
}
