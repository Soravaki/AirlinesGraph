import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;
public class Airlines extends Graph{
    public Airlines(String filename, String delim) throws IOException {
        adjmap = new HashMap<>();
        Scanner sc = new Scanner(new File(filename));
        while (sc.hasNextLine()) {
            String[] inputLine = sc.nextLine().split(delim);
            addEdge(inputLine[0], inputLine[1]);
        }
    }
}

