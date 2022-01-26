import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeSet;

public class ShortestPath extends Graph{
    private HashMap<String, Integer> planeMap;
    Queue<String> q = new LinkedList<>();
    private int distance = 1;
    public ShortestPath(Airlines graph, String startingNode){
        planeMap.put(startingNode, 0);
        q.add(startingNode);
        for (String a : adjacentTo(q.remove())){
            q.add(a);
            planeMap.put(a, distance);
        }
        distance++;

    }
}
