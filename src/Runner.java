import java.io.IOException;

public class Runner {
    public static void main(String[] args) throws IOException {
        Airlines m = new Airlines(
                "U:\\COMPUTER SCIENCE 3" +
                        "\\AirlinesGraph\\src\\movies.txt",
                " ");
        ShortestPath s = new ShortestPath(m, "JFK");


    }
}