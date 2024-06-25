public class Cuboid {
    private double edgeA;
    private double edgeB;
    private double edgeC;

    // Constructor
    public Cuboid(double edgeA, double edgeB, double edgeC) {
        this.edgeA = edgeA;
        this.edgeB = edgeB;
        this.edgeC = edgeC;
    }

    // Method to calculate volume
    public double calculateVolume() {
        return edgeA * edgeB * edgeC;
    }

    // Method to calculate surface area
    public double calculateSurfaceArea() {
        return 2 * (edgeA * edgeB + edgeA * edgeC + edgeB * edgeC);
    }

    // Method to display cuboid details
    public void displayDetails() {
        System.out.printf("Cuboid dengan data : A = %.2f, B = %.2f, C = %.2f\n", edgeA, edgeB, edgeC);
        System.out.printf("Volume : %.2f\n", calculateVolume());
        System.out.printf("luas permukaan : %.2f\n", calculateSurfaceArea());
        System.out.println();
    }
}
