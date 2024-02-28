package model;

public class Circle extends Shape {

    private final double pi = Math.PI;

    public Circle(double a) {
        super(a); // radius
    }

    @Override
    public double getPerimeter() {
        super.perimeter = 2 * a * pi;
        return perimeter;
    }

    @Override
    public double getArea() {
        super.area = a * a * pi;
        return area;
    }

    @Override
    public void printResult() {
        System.out.println(String.format("Radius: %.1f\nArea: %.15f\nPerimeter: %.15f",
                a, getArea(), getPerimeter()));
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

}
