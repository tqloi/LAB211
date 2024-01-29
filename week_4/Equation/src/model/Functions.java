package model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Functions {

    private List<Double> doubles;

    public Functions() {
        doubles = new ArrayList<>();
    }

    public List<Double> getDoubles() {
        return doubles;
    }

    public void SuperlativeEquation(Superlative e) {
        if (e.getA() != 0) {
            doubles.clear();
            double x = e.calculateSolution();
            System.out.print("Solution: x = " + x);
            doubles.add(e.getA());
            doubles.add(e.getB());
            doubles.add(x);
            isNumber(doubles);
        } else {
            System.err.println("a != 0");
        }
    }

    public void QuadraticEquation(Quadratic e) {
        if (e.getA() != 0) {
            doubles.clear();
            doubles.add(e.getA());
            doubles.add(e.getB());
            doubles.add(e.getC());
            double[] x = e.calculateSolutions();
            System.out.print("Solution: ");
            for (int i = 0; i < x.length; i++) {
                System.out.print(" " + x[i] + "  ");
                doubles.add(x[i]);
            }
            isNumber(doubles);
        } else {
            System.err.println("a != 0");
        }
    }

    private void isNumber(List<Double> doubles) {
        List<Double> numbers = doubles.stream().distinct().collect(Collectors.toList());
        System.out.print("\nOdd number: ");
        for (double number : numbers) {
            if (number % 2 != 0) {
                System.out.print(" " + number + "  ");
            }
        }
        System.out.print("\nEven number: ");
        for (double number : numbers) {
            if (number % 2 == 0) {
                System.out.print(" " + number + "  ");
            }
        }
        System.out.print("\nPerfect Square: ");
        for (double number : numbers) {
            double d = Math.sqrt(number);
            if (d == Math.floor(d)) {
                System.out.print(" " + number + "  ");
            }
        }
        System.out.println("\n");
    }
}
