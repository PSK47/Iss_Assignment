
interface Shape {
    double calculateArea();
}

abstract class Figure implements Shape {
    private String name;

    // Constructor
    public Figure(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    abstract void displayDetails();
}


class Circle extends Figure {
    private double radius;

    // Constructor
    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    // Overriding method to calculate area
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Overriding method to display details
    @Override
    void displayDetails() {
        System.out.println("Shape: " + getName());
        System.out.println("Type: Circle");
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
    }
}


class Square implements Shape {
    private double side;

    // Constructor
    public Square(double side) {
        this.side = side;
    }

    // Overridden method to calculate area
    @Override
    public double calculateArea() {
        return side * side;
    }
}

public class SubQuestion5{
    public static void main(String[] args) {
        // Polymorphism with different types of shapes
        Figure circle = new Circle("Circle1", 5.0);
        Square square = new Square(4.0);

        // Display details using polymorphism
        displayShapeDetails(circle);
        displayShapeDetails(square);
    }


    static void displayShapeDetails(Shape shape) {
        System.out.println("--------");
        shape.calculateArea();
        if (shape instanceof Figure) {
            ((Figure) shape).displayDetails();
        }
    }
}
