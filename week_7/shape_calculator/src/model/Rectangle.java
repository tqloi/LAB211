package model;

public class Rectangle extends Shape {

    private double length;
    private double width;

    public Rectangle(double a, double b) {
        this.length = a;
        this.width = b;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        super.perimeter = 2 * (length + width);
        return perimeter;
    }

    @Override
    public double getArea() {
        super.area = length * width;
        return area;
    }

    @Override
    public void printResult() {
        System.out.println(String.format("Width: %.1f\nLength: %.1f\nArea: %.1f\nPerimeter: %.1f",
                length, width, getArea(), getPerimeter()));
    }

}
