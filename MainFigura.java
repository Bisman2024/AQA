public class MainFigura {
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