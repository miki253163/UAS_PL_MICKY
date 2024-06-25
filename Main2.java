import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        String inputFilePath = "src/data/data.txt";  // Path to the input file
        String outputFilePath = "Hasilnya.txt";  // Path to the output file
        List<Soal2> cuboids = new ArrayList<>();

        // Read cuboid data from the file
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\s+");
                double edgeA = Double.parseDouble(parts[0]);
                double edgeB = Double.parseDouble(parts[1]);
                double edgeC = Double.parseDouble(parts[2]);
                cuboids.add(new Soal2(edgeA, edgeB, edgeC));
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }

        // Sort cuboids by surface area
        Collections.sort(cuboids, Comparator.comparingDouble(Soal2::calculateSurfaceArea));

        // Write sorted surface areas to the output file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {
            for (Soal2 cuboid : cuboids) {
                writer.write(cuboid.toString());
                writer.newLine();
            }
            System.out.println("Surface areas have been sorted and written to " + outputFilePath);
        } catch (IOException e) {
            System.err.println("Error writing to the file: " + e.getMessage());
        }
    }
}
