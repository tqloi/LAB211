package model;

public class Calculator {

    private double memory;

    public Calculator() {
        this.memory = 0;
    }

    public double getMemory() {
        return memory;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }

    public void addFunction(double a, double b) {
        memory = a + b;
    }

    public void subtractFunction(double a, double b) {
        memory = a - b;
    }

    public void multipleFunction(double a, double b) {
        memory = a * b;
    }

    public void divideFunction(double a, double b) {
        memory = a / b;
    }

    public void powFunction(double a, double b) {
        memory = Math.pow(a, b);
    }

    public void BMI(int weight, int height) {
        divideFunction(height, 100);
        powFunction(memory,2);
        divideFunction(weight, memory);             
    }
}
