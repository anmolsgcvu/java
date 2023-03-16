// Shape class with common features
abstract class Shape {
    private int x, y; // position of shape
    private String color; // color of shape

    public Shape(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    // getter and setter methods for position and color

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // abstract method for drawing the shape
    public abstract void draw();

    // polymorphic method for common operations
    public void move(int deltaX, int deltaY) {
        x += deltaX;
        y += deltaY;
        System.out.println("Shape moved to (" + x + ", " + y + ")");
    }
}

// Circle class that inherits from Shape
class Circle extends Shape {
    private int radius;

    public Circle(int x, int y, String color, int radius) {
        super(x, y, color);
        this.radius = radius;
    }

    // getter and setter method for radius

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    // implement draw method for Circle

    public void draw() {
        System.out.println("Drawing Circle with radius " + radius + " at (" + getX() + ", " + getY() + ")");
    }

    // specific method for Circle

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

// Square class that inherits from Shape
class Square extends Shape {
    private int sideLength;

    public Square(int x, int y, String color, int sideLength) {
        super(x, y, color);
        this.sideLength = sideLength;
    }

    // getter and setter method for side length

    public int getSideLength() {
        return sideLength;
    }

    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }

    // implement draw method for Square

    public void draw() {
        System.out.println("Drawing Square with side length " + sideLength + " at (" + getX() + ", " + getY() + ")");
    }

    // specific method for Square

    public int getPerimeter() {
        return 4 * sideLength;
    }
}

// Rectangle class that inherits from Shape
class Rectangle extends Shape {
    private int width, height;

    public Rectangle(int x, int y, String color, int width, int height) {
        super(x, y, color);
        this.width = width;
        this.height = height;
    }

    // getter and setter methods for width and height

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    // implement draw method for Rectangle

    public void draw() {
        System.out.println("Drawing Rectangle with width " + width + " and");
    }
}

public class draw {
    public static void main(String[] args) {
        // create an array of shapes
        Shape[] shapes = new Shape[3];

        // create a Circle and add it to the array
        Circle circle = new Circle(10, 10, "red", 5);
        shapes[0] = circle;

        // create a Square and add it to the array
        Square square = new Square(20, 20, "blue", 8);
        shapes[1] = square;

        // create a Rectangle and add it to the array
        Rectangle rectangle = new Rectangle(30, 30, "green", 10, 6);
        shapes[2] = rectangle;

        // display the shapes
        for (Shape shape : shapes) {
            shape.draw();
        }

        // move the shapes and display their new positions
        for (Shape shape : shapes) {
            shape.move(5, 5);
            shape.draw();
        }

        // downcast Circle to access its specific method
        Circle c = (Circle) shapes[0];
        System.out.println("Circle area: " + c.getArea());

        // downcast Square to access its specific method
        Square s = (Square) shapes[1];
        System.out.println("Square perimeter: " + s.getPerimeter());
    }
}
