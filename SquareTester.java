import java.util.Scanner;
public class SquareTester{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("enter the side length (double): ");
        double s = sc.nextDouble();
        Square square_double = new Square(s);
        System.out.print("Enter the side length (int): ");
        int s1 = sc.nextInt();
        Square square_int = new Square(s1);
        System.out.println("I dont need your input!");
        Square square_noInput = new Square();
        System.out.println("Area(double) = " + square_double.getArea());
        System.out.println("Area(int) = " + square_int.getArea());
        System.out.println("Area(no input) = " + square_noInput.getArea());
    }

    
}
