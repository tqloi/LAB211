package model;

public class Quadratic {

    private double a;
    private double b;
    private double c;

    public Quadratic(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
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

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Quadratic{" + "a=" + a + ", b=" + b + ", c=" + c + '}';
    }

   
    public double[] calculateSolutions() {
        double delta = b * b - 4 * a * c;
        if (delta >= 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};        
        } else if (delta == 0) {
            double root = -b / (2 * a);
            return new double[]{root};
        } else {
            System.err.println("No Sulotion!");
            return new double[]{};
        }
    }
}
