public class Rectangle {
    private double width;
    private double height;
    
    public Rectangle(){
        width = 1.0;
        height = 1.0;
    }
    
    public Rectangle(double w, double h) {
        width = w;
        height = h;
    }
    
    public void setDimensions(double width, double height) {
        width = width;
        height = height;
    }
    
    public void setDimensions(double size) {
        width = size;
        height = size;
    }

    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }

    public double getArea(){
        return width * height;
    }
    
    public double getPerimeter(){
        return (2 * width) + (2 * height);
    }

}


