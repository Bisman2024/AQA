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