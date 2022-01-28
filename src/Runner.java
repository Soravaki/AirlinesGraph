import java.io.IOException;

public class Runner {
    public static void main(String[] args) throws IOException {
        Airlines m = new Airlines(
                "U:\\COMPUTER SCIENCE 3" +
                        "\\AirlinesGraph\\src\\airline.txt",
                " ");
        ShortestPath x = new ShortestPath("JFK", m);
        System.out.println(x.shortestPath("LAX"));
        ShortestPath y = new ShortestPath("LAS", m);
        System.out.println(y.shortestPath("MCO"));
        ShortestPath z = new ShortestPath("HOU", m);
        System.out.println(z.shortestPath("JFK"));


    }
}