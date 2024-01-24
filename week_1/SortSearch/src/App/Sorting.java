
package App;

import java.util.Arrays;

public class Sorting extends Menu {

    private final Algorithm algo;
    
    public Sorting(Algorithm a) {
        super("Sorting", new String[]{"Bubble Sort", "Quick Sort", "Quit"});
        algo = a;
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                BubbleSort();
                break;
            case 2:
                QuickSort();
                break;
            case 3:
                exitMenu();
                break;
        }
    }

    private void BubbleSort() {
        int[] array = algo.getArray().clone();
        System.out.println("Unsorted array: " + Arrays.toString(array));
        algo.bubbleSort(array);
        System.out.println("Sorted (Bubble): " + Arrays.toString(array));
    }

    private void QuickSort() {
        int[] array = algo.getArray().clone();
        System.out.println("Unsorted array: " + Arrays.toString(array));
        algo.quickSort(array, 0, array.length - 1);
        System.out.println("Sorted (Quick): " + Arrays.toString(array));
    }
}
