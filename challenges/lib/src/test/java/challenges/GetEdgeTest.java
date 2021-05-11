package challenges;
import static org.junit.Assert.*;

import challenges.GetEdge.GetEdge;
import challenges.graph.Graph;
import challenges.graph.Node;
import org.junit.Test;

import java.util.ArrayList;

public class GetEdgeTest {

    @Test
    public void testGetEdge () throws Exception {

        Graph <String> g = new Graph<>();
        ArrayList<String> places = new ArrayList<>();
        String expectFail = "There are not enough places for a path";
        String failOut = GetEdge.getEdge(g, places);
        assertEquals("Should recognize cannot build a path with two small of graph or places", failOut, expectFail);

        Node <String> a = g.addNode("a");
        Node <String> b = g.addNode("b");
        g.addEdge(a,b, 10);
        places.add("a");
        places.add("b");
        String simpleOut = GetEdge.getEdge(g,places);
        String expectSimple = "This path can be traveled and will cost 10";
        assertEquals(expectSimple, simpleOut);


        Node <String> c = g.addNode("c");
        Node <String> d = g.addNode("d");
        g.addEdge(b,c, 15);
        places.add("c");
        places.add("d");
        String expectComplexFail = "There is no path";
        String complexFailOut = GetEdge.getEdge(g,places);
        assertEquals(expectComplexFail, complexFailOut);

        g.addEdge(d,c, 25);

        String outComplex = GetEdge.getEdge(g,places);
        String expectComplex = "This path can be traveled and will cost 50";
        assertEquals(expectComplex, outComplex);




    }

}
