package model;

public class Triangle extends Shape {

    protected double b;
    protected double c;

    public Triangle(double a, double b, double c) {
        super(a);
        this.b = b;
        this.c = c;
    }

    @Override
    public double getPerimeter() {
        super.perimeter = a + b + c;
        return perimeter;
    }

    @Override
    public double getArea() {
        double p = getPerimeter()/2;
        super.area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return area;
    }

    @Override
    public void printResult() {
        System.out.println(String.format("Side A: %.1f\nSide B: %.1f\nSide C: %.1f\nArea: %.15f\nPerimeter: %.1f",
                a, b, c, getArea(), getPerimeter()));
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

}
