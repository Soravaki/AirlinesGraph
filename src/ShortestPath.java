import java.util.HashMap;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class ShortestPath {
    private HashMap<String, Integer> planeMap;
    Queue<String> q = new LinkedList<>();
    private int distance = 1;
    StringBuilder sb = new StringBuilder();
    private Graph name;

    public ShortestPath(String startingNode, Graph name){
        planeMap = new HashMap<>();
        planeMap.put(startingNode, 0);
        q.add(startingNode);
        while (!q.isEmpty()){
            q.add(startingNode);
            String remove = q.remove();
            for (String a : name.adjacentTo(remove)) {
                //System.out.println(a);
                q.add(a);
                planeMap.put(a, distance);
            }
            distance++;

        }
    }

    public String shortestPath(String endNode){
        retracePath(endNode);
        return sb.toString();
    }

    public void retracePath(String current){
        for (String a : name.adjacentTo(current)){
            if ( planeMap.get(a) == ( planeMap.get(current)-1) && !(planeMap.get(a)==1)){
                sb.append("-"+current);
                retracePath(a);
            }
            else
                sb.append("-").append(current);
        }
    }
}
