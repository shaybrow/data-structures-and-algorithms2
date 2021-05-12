package challenges.GetEdge;

import challenges.graph.Edge;
import challenges.graph.Graph;
import challenges.graph.Node;

import java.util.ArrayList;
import java.util.List;

public class GetEdge {

    public static String getEdge(Graph graph, ArrayList<String> places){
        List <Node<String>> nodes = graph.getNodes();
        if (nodes.size() < 2 || places.size() < 2) return "There are not enough places for a path";
        int cost = 0;
        for (int i = 0; i < places.size(); i++) {
            for (int j = 0; j < nodes.size(); j++) {
                Node <String> n = nodes.get(j);
                if (n.val.equals(places.get(i)) && i < places.size()-1){
                    Boolean hasNext = false;
                    for (int k = 0; k < n.edges.size(); k++) {
                        if(n.edges.get(k).node1.val.equals(places.get(i)) && n.edges.get(k).node2.val.equals(places.get(i+1))){
                            cost += n.edges.get(k).weight;
                            hasNext = true;
                        }
                        if(n.edges.get(k).node2.val.equals(places.get(i)) && n.edges.get(k).node1.val.equals(places.get(i+1))){
                            cost += n.edges.get(k).weight;
                            hasNext =true;
                        }
                    }
                    if (hasNext == false && i != places.size()-1){
                        return "There is no path";
                    }
                }
            }
        }
        String output = "This path can be traveled and will cost " + cost;
        return output;
    }
}
