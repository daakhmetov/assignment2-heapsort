package algorithms;

import metrics.PerformanceTracker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeapSortTest {

    @Test
    void testEmptyArray() {
        int[] arr = {};
        HeapSort sorter = new HeapSort(new PerformanceTracker());
        sorter.sort(arr);
        assertArrayEquals(new int[]{}, arr);
    }

    @Test
    void testSingleElement() {
        int[] arr = {42};
        HeapSort sorter = new HeapSort(new PerformanceTracker());
        sorter.sort(arr);
        assertArrayEquals(new int[]{42}, arr);
    }

    @Test
    void testAlreadySorted() {
        int[] arr = {1, 2, 3, 4, 5};
        HeapSort sorter = new HeapSort(new PerformanceTracker());
        sorter.sort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    void testReverseSorted() {
        int[] arr = {5, 4, 3, 2, 1};
        HeapSort sorter = new HeapSort(new PerformanceTracker());
        sorter.sort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    void testWithDuplicates() {
        int[] arr = {4, 1, 3, 4, 2, 1};
        HeapSort sorter = new HeapSort(new PerformanceTracker());
        sorter.sort(arr);
        assertArrayEquals(new int[]{1, 1, 2, 3, 4, 4}, arr);
    }

    @Test
    void testRandomArray() {
        int[] arr = {7, -2, 19, 0, 5};
        HeapSort sorter = new HeapSort(new PerformanceTracker());
        sorter.sort(arr);
        assertArrayEquals(new int[]{-2, 0, 5, 7, 19}, arr);
    }
}
