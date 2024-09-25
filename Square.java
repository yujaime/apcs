public class Square {
   private double side; //field
   public Square(double s) {
       side = s;
   }
   public Square(int s) {
       side = s;
   }
   public Square() {
       side = 1;
   }
   public double getArea() {
       return side*side;
   }
}