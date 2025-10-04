package cli;

import algorithms.HeapSort;
import metrics.PerformanceTracker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

public class BenchmarkRunner {

    public static void main(String[] args) {
        int[] sizes = {100, 1000, 10000, 100000};
        String[] inputTypes = {"random", "sorted", "reversed", "duplicate"};
        String csvPath = "docs/performance-plots/heap_sort_results.csv";

        try (FileWriter writer = new FileWriter(csvPath)) {
            writer.write("input_type,n,time_ms,comparisons,swaps,array_accesses\n");

            for (String type : inputTypes) {
                for (int n : sizes) {
                    int[] arr = generateArray(n, type, 42);
                    PerformanceTracker tracker = new PerformanceTracker();
                    HeapSort sorter = new HeapSort(tracker);

                    sorter.sort(arr);

                    if (!isSorted(arr)) {
                        throw new RuntimeException("Array not sorted correctly: " + type + " n=" + n);
                    }

                    writer.write(String.format("%s,%d,%.4f,%d,%d,%d\n",
                            type, n, tracker.getElapsedMillis(),
                            tracker.getComparisons(), tracker.getSwaps(), tracker.getArrayAccesses()));

                    System.out.printf("Done: %s, n=%d -> time=%.4fms%n",
                            type, n, tracker.getElapsedMillis());
                }
            }

            System.out.println("Benchmark completed. Results saved to " + csvPath);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int[] generateArray(int n, String type, long seed) {
        Random rand = new Random(seed);
        int[] arr = new int[n];

        switch (type) {
            case "sorted":
                for (int i = 0; i < n; i++) arr[i] = i;
                break;
            case "reversed":
                for (int i = 0; i < n; i++) arr[i] = n - i;
                break;
            case "duplicate":
                Arrays.fill(arr, 42);
                break;
            default:
                for (int i = 0; i < n; i++) arr[i] = rand.nextInt(100000);
        }
        return arr;
    }

    private static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) return false;
        }
        return true;
    }
}
