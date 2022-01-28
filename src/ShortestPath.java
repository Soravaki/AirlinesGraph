import java.util.HashMap;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class ShortestPath {
    private HashMap<String, Integer> planeMap;
    Queue<String> q = new LinkedList<>();
    StringBuilder sb = new StringBuilder();
    private final Graph graphMap;
    private String startingNode;

    public ShortestPath(String startingNode, Graph graphMap){
        this.graphMap = graphMap;
        this.startingNode = startingNode;

        planeMap = new HashMap<>();
        planeMap.put(startingNode, 0);
        q.add(startingNode);
        while (!q.isEmpty()){
                String remove = q.remove();
                //System.out.println("adjacent to remove " +graphMap.adjacentTo(remove));
                for (String a : graphMap.adjacentTo(remove)) {
                    if (!(planeMap.containsKey(a))) {
                        q.add(a);
                        planeMap.put(a, planeMap.get(remove)+1 );
                    }
                }
            //System.out.println(distance);
            /*System.out.println(planeMap);
            System.out.println(q);
            System.out.println();*/

        }
    }

    public String shortestPath(String endNode){
        System.out.println(planeMap);
        sb.append(endNode);
        retracePath(endNode);
        return sb.toString();
    }

    public void retracePath(String current){
        System.out.println(current);
        /*for (String a : graphMap.adjacentTo(current)){
            *//*System.out.println(a +" :: "+ planeMap.get(a));
            System.out.println(current +" :: "+ planeMap.get(current));*//*
            if ( planeMap.get(a) == planeMap.get(current)-1){
                sb.insert(0, a+"-");
                //System.out.println("Stringbuilder : "+ sb.toString());
                retracePath(a);
            }
        }*/

        for (String a : graphMap.adjacentTo(startingNode)){
            if ( planeMap.get(a) == planeMap.get(startingNode)+1){
                sb.append(a+"-");
                //System.out.println("Stringbuilder : "+ sb.toString());
                retracePath(a);
            }
        }
    }
}
