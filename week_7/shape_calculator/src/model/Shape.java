package model;

public class Shape {

    protected double a;
    protected double area;
    protected double perimeter;

    public Shape(double a) {
        this.a = a;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public void printResult() {
        System.out.println(String.format("Area: %.2f\nPerimeter: %.2f%n", area, perimeter));
    }

}
