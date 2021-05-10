package challenges;

import static org.junit.Assert.*;

import challenges.graph.Graph;
import challenges.graph.Node;
import org.junit.Test;

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
}
