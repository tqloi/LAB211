package model;

public class Circle extends Shape {

    private final double pi = Math.PI;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        super.perimeter = 2 * radius * pi;
        return perimeter;
    }

    @Override
    public double getArea() {
        super.area = radius * radius * pi;
        return area;
    }

    @Override
    public void printResult() {
        System.out.println(String.format("Radius: %.1f\nArea: %.15f\nPerimeter: %.15f",
                radius, getArea(), getPerimeter()));
    }

}
