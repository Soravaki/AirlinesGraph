import java.io.IOException;

public class Runner {
    public static void main(String[] args) throws IOException {
        Airlines m = new Airlines(
                "U:\\COMPUTER SCIENCE 3" +
                        "\\AirlinesGraph\\src\\airline.txt",
                " ");
        ShortestPath s = new ShortestPath("JFK", m);
        System.out.println("loading...");
        System.out.println(s.shortestPath("LAX"));
        System.out.println("done");

    }
}