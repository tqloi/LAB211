package Model;

import java.util.Random;

public class Algorithm {

    private int[] array;

    public int[] getArray() {
        return array;
    }

    public Algorithm(int sizeArrays) {
        generateRandomArrays(sizeArrays);
    }

    public final void generateRandomArrays(int sizeArrays) {
        Random r = new Random();
        array = new int[sizeArrays];
        for (int i = 0; i < sizeArrays; i++) {
            array[i] = r.nextInt(100);
        }
    }

    public void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    private int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        
        return i + 1;
    }

    public String linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return "Found value " + target + " at index " + i;
            }
        }
        return "No matching value found.";
    }

    public String binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (array[mid] == target) {
                return "Found value " + target + " at index " + mid;
            } else if (array[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return "No matching value found.";
    }
}
