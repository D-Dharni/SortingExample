/**
 * A class to implement all the sorting algorithms
 * so that we can test timing.
 *
 * @author: Nandhini Namasivayam
 * @version February 2025
 */
public class SortingAlgorithms {
    // Change this value to change testing size
    public static final int TEST_SIZE = 1000;

    // Change this value to change the range of numbers generated
    public static final int MAX_NUMBER_SIZE = 100;

    // Bubble Sort
    public static void bubbleSort(int[] arr) {
        // TODO: Implement bubble sort
        double timeBefore = System.currentTimeMillis();
        int length = arr.length;
        boolean swapped;

        for (int i = 0; i < length - 1; i++) {
            swapped = false;
            for (int j = 0; j < length - 1 - i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        double timeAfter = System.currentTimeMillis();
        System.out.println(timeAfter - timeBefore);
    }

    // Selection Sort
    public static void selectionSort(int[] arr) {
        // TODO: Implement selection sort
        int length = arr.length;
        double timeBefore = System.currentTimeMillis();
        for (int i = 0; i < length - 1; i++) {
            int smallestIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[smallestIndex]) {
                    smallestIndex = j;
                }
            }

            int temp = arr[smallestIndex];
            arr[smallestIndex] = arr[i];
            arr[i] = temp;
        }
        double timeAfter = System.currentTimeMillis();
        System.out.println(timeAfter - timeBefore);
    }

    // Merge Sort
    public static void mergeSort(int[] arr) {
        // TODO: Implement merge sort
        // Base case
        if (arr.length < 2) {
            return;
        }

        // split

        // sort both halves

        // merge together
    }

    private static void mergeSortHelper(int[] arr, int left, int right) {
        // TODO: Implement the recursive helper for merge sort
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        // TODO: Implement the merge step for merge sort
    }

    // Quick Sort
    public static void quickSort(int[] arr) {
        // TODO: Implement quick sort
    }

    private static void quickSortHelper(int[] arr, int low, int high) {
        // TODO: Implement the recursive helper for quick sort
    }

    private static int partition(int[] arr, int low, int high) {
        // TODO: Implement the partition step for quick sort
        return 0; // Placeholder
    }
}