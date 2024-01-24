package model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Equation {

    private List<Double> doubles;

    public Equation() {
        doubles = new ArrayList<>();
    }

    public List<Double> getDoubles() {
        return doubles;
    }

    public void Superlative(double a, double b) {
        doubles.clear();
        double c = -b / a;
        System.out.println("Solution: x = " + c);
        doubles.add(a);
        doubles.add(b);
        doubles.add(c);
        isNumber(doubles); 
    }

    public void Quadratic(double a, double b, double c) {
        doubles.clear();
        doubles.add(a);
        doubles.add(b);
        doubles.add(c);
        double delta = b * b - 4 * a * c;
        if (delta > 0) {
            double solution1 = (-b + Math.sqrt(delta)) / (2 * a);
            double solution2 = (-b - Math.sqrt(delta)) / (2 * a);
            doubles.add(solution1);
            doubles.add(solution2);
            System.out.print("Solution: x1 = " + solution1);
            System.out.println(" and x2 = " + solution2);
        }
        if (delta == 0) {
            double solution = -b / (2 * a);
            doubles.add(solution);
            System.out.println("Solution: x = " + solution);
        }
        if (delta < 0) {
            System.out.println("No solution!");
        }
        isNumber(doubles);
    }

    private void isNumber(List<Double> doubles) {
        List<Double> numbers = doubles.stream().distinct().collect(Collectors.toList());
        System.out.print("Odd number: ");
        for (double number : numbers) {
            if (number % 2 != 0) {  
                System.out.print(number);
                System.out.print("  ");
            }
        }
        System.out.print("\nEven number: ");
        for (double number : numbers) {
            if (number % 2 == 0) {
                System.out.print(number);
                System.out.print("  ");
            }
        }
        System.out.print("\nPerfect Square: ");
        for (double number : numbers) {
            double d = Math.sqrt(number);
            if (d == Math.floor(d)) {
                System.out.print(number);
                System.out.print("  ");
            }
        }
        System.out.println("\n");
    }
}
