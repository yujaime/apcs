import java.util.Scanner;
public class CubeTest {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the length of the side (double): ");
        double s = sc.nextDouble();
        Cube cube_double = new Cube(s);
        System.out.println("Volume of the cube is " + cube_double.getVolume());
        System.out.println("Surface area of the cube is " + cube_double.getSurfaceArea());
    }

}