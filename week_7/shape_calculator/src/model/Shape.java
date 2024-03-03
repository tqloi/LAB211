package model;

abstract class Shape {
    
    protected double area;
    protected double perimeter;

    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract void printResult();
}
