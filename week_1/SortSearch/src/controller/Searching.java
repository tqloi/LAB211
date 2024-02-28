package controller;

import Library.Input;
import view.Menu;
import Model.Algorithm;
import java.util.Arrays;

public class Searching extends Menu {

    private final Algorithm algo;

    public Searching(Algorithm a) {
        super("Searching", new String[]{"Linear Search", "Binary Search", "Quit"});
        algo = a;
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                linearSearch();
                break;
            case 2:
                binarySearch();
                break;
            case 3:
                exitMenu();
                break;
        }
    }

    private void linearSearch() {
        int[] array = algo.getArray().clone();
        algo.bubbleSort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));
        int target = Input.getIntFromInput("search value");
        String result = algo.linearSearch(array, target);
        System.out.println(result);
    }

    private void binarySearch() {
        int[] array = algo.getArray().clone();
        algo.quickSort(array, 0, array.length - 1);
        System.out.println("Sorted array: " + Arrays.toString(array));
        int target = Input.getIntFromInput("search value");
        String result = algo.binarySearch(array, target);
        System.out.println(result);
    }
}
