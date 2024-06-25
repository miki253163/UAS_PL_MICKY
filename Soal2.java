public class Soal2 {
    private double edgeA;
    private double edgeB;
    private double edgeC;

    // Constructor
    public Soal2(double edgeA, double edgeB, double edgeC) {
        this.edgeA = edgeA;
        this.edgeB = edgeB;
        this.edgeC = edgeC;
    }

    // Method to calculate surface area
    public double calculateSurfaceArea() {
        return 2 * (edgeA * edgeB + edgeA * edgeC + edgeB * edgeC);
    }

    @Override
    public String toString() {
        return String.format("%.2f", calculateSurfaceArea());
    }
}
