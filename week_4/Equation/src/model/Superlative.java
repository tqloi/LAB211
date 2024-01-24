package model;

public class Superlative {

    private double a;
    private double b;

    public Superlative(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Superlative{" + "a=" + a + ", b=" + b + '}';
    }

    public double calculateSolution() {
        return -b / a;
    }
}
