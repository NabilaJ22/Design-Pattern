public class Shape {
    public double calculateArea(String shapeType, double param1, double param2) {
        double area = 0.0;

        if (shapeType.equalsIgnoreCase("circle")) {
            double radius = param1;
            area = 3.14 * radius * radius;

        } else if (shapeType.equalsIgnoreCase("rectangle")) {
            double width = param1;
            double height = param2;
            area = width * height;
        }
        return area;
    }

} 

/*abstract class Shape {
    public abstract double calculateArea();

}/* */

/*class Circle extends Shape {
    public Circle(double radius) {
    }

    
}/* */

class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;

    }

    public double calculateArea() {
        return width * height;
    }
}


