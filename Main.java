public class Main {
    public static void main(String[] args){
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle(3.0, 4.0);
        
                
        System.out.println("Rectangle 1 (Default Constructor): ");
        System.out.print("Width: " + rect1.getWidth() + "," + "Height: " + rect1.getHeight() + ",");
        System.out.print("Area: " + rect1.getArea() + "," + "Perimeter: " + rect1.getPerimeter());

        System.out.println();
        System.out.println("Rectangle 2:");
        System.out.print("Width: " + rect2.getWidth() + "," + "Height: " + rect2.getHeight() + ",");
        System.out.print("Area: " + rect2.getArea() + "," + "Perimeter: " + rect2.getPerimeter());

    }

  
}