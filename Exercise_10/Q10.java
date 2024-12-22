package Exercise_10;

/* 10.Design a base class Shape with a method calculateArea(). 
 * 	  Create three subclasses: Circle, Rectangle, and Triangle, each overriding the calculateArea() 
 * 	  method to compute the area of the respective shape.
	  Test the program with dynamic method dispatch.
 * 
 * 
 * 
 * 
 * 
 */
// Base class
abstract class Shape {
	public abstract double calculateArea();
}
//Sub class Circle
class Circle extends Shape {
    private double radius;

    // Constructor for Circle
    public Circle(double radius) {
        this.radius = radius;
}
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;  // Area of circle 
    }
}
// Subclass Rectangle
class Rectangle extends Shape {
    private double length;
    private double width;
    
 // Constructor for Rectangle
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    @Override
    public double calculateArea() {
        return length * width;  // Area of rectangle = length * width
    }
}

// Subclass Triangle
class Triangle extends Shape {
 private double base;
 private double height;

 // Constructor for Triangle
 public Triangle(double base, double height) {
     this.base = base;
     this.height = height;
 }
 

 	 @Override
 	  public double calculateArea() {
 	  return 0.5 * base * height;  // Area of triangle = 0.5 * base * height
 }
}
    
// Main class to test dynamic method dispatch
public class Q10 {
 public static void main(String[] args) {
     // Create instances of Circle, Rectangle, and Triangle
     Shape circle = new Circle(8.0);  // Circle with radius 5
     Shape rectangle = new Rectangle(5.0, 5.0);  // Rectangle with length 4 and width 6
     Shape triangle = new Triangle(6.0, 8.0);  // Triangle with base 3 and height 4

     // Test dynamic method dispatch by calling calculateArea() on each Shape reference
     System.out.println("Area of Circle: " + circle.calculateArea());
     System.out.println("Area of Rectangle: " + rectangle.calculateArea());
     System.out.println("Area of Triangle: " + triangle.calculateArea());
 }
}
