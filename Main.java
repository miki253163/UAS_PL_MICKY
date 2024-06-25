import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String filePath = "src/data/data.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] edges = line.split("\\s+");
                double edgeA = Double.parseDouble(edges[0]);
                double edgeB = Double.parseDouble(edges[1]);
                double edgeC = Double.parseDouble(edges[2]);

                Cuboid cuboid = new Cuboid(edgeA, edgeB, edgeC);
                cuboid.displayDetails();
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
