package model;

public class Rectangle extends Shape {

    private double b;

    public Rectangle(double a, double b) {
        super(a);   //length
        this.b = b; //width
    }

    @Override
    public double getPerimeter() {
        super.perimeter = 2 * (a + b);
        return perimeter;
    }

    @Override
    public double getArea() {
        super.area = a * b;
        return area;
    }

    @Override
    public void printResult() {
        System.out.println(String.format("Width: %.1f\nLength: %.1f\nArea: %.1f\nPerimeter: %.1f",
                a, b, getArea(), getPerimeter()));
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

}
