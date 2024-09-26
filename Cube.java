import java.util.Scanner;

public class Cube {
    private double side;
    public Cube(double s) {
        side = s;
    }
    public double getVolume() {
        return side * side * side;
    }
    public double getSurfaceArea() {
        return (side * side) * 6;
    }
}