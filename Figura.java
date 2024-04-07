interface Shape {
    double perimeter();
    double area();
    String fillColor();
    String borderColor();
}
class Circle implements Shape {
    private double radius;
    private String fillColor;
    private String borderColor;
    public Circle(double radius, String fillColor, String borderColor) {
        this.radius = radius;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
    public double area() {
        return Math.PI * radius * radius;
    }
    public String fillColor() {
        return fillColor;
    }
    public String borderColor() {
        return borderColor;
    }
}
class Rectangle implements Shape {
    private double width;
    private double height;
    private String fillColor;
    private String borderColor;
    public Rectangle(double width, double height, String fillColor, String borderColor) {
        this.width = width;
        this.height = height;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }
    public double perimeter() {
        return 2 * (width + height);
    }
    public double area() {
        return width * height;
    }
    public String fillColor() {
        return fillColor;
    }
    public String borderColor() {
        return borderColor;
    }
}
class Triangle implements Shape {
    private double sideA;
    private double sideB;
    private double sideC;
    private String fillColor;
    private String borderColor;
    public Triangle(double sideA, double sideB, double sideC, String fillColor, String borderColor) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }
    public double perimeter() {
        return sideA + sideB + sideC;
    }
    public double area() {
        // Используем формулу Герона для расчета площади треугольника
        double s = perimeter() / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }
    public String fillColor() {
        return fillColor;
    }
    public String borderColor() {
        return borderColor;
    }
}
public class Figura {
    public static void main(String[] args) {
        Shape circle = new Circle(5, "Red", "Black");
        Shape rectangle = new Rectangle(10, 5, "Blue", "Green");
        Shape triangle = new Triangle(3, 4, 5, "Yellow", "Purple");

        printShapeInfo(circle);
        printShapeInfo(rectangle);
        printShapeInfo(triangle);
    }
    public static void printShapeInfo(Shape shape) {
        System.out.println("Периметр: " + shape.perimeter());
        System.out.println("Площадь: " + shape.area());
        System.out.println("Цвет фона: " + shape.fillColor());
        System.out.println("Цвет границ: " + shape.borderColor());
        System.out.println();
    }
}