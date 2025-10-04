package metrics;

public class PerformanceTracker {
    private long comparisons = 0;
    private long swaps = 0;
    private long arrayAccesses = 0;
    private long startTimeNs = 0;
    private long endTimeNs = 0;

    public void incrementComparisons() { comparisons++; }
    public void incrementSwaps() { swaps++; }
    public void incrementArrayAccesses(long count) { arrayAccesses += count; }

    public void startTimer() { startTimeNs = System.nanoTime(); }
    public void stopTimer() { endTimeNs = System.nanoTime(); }

    public double getElapsedMillis() {
        if (startTimeNs == 0) return 0.0;
        long end = (endTimeNs == 0) ? System.nanoTime() : endTimeNs;
        return (end - startTimeNs) / 1e6;
    }

    public long getComparisons() { return comparisons; }
    public long getSwaps() { return swaps; }
    public long getArrayAccesses() { return arrayAccesses; }

    public void reset() {
        comparisons = swaps = arrayAccesses = 0;
        startTimeNs = endTimeNs = 0;
    }

    @Override
    public String toString() {
        return String.format("time=%.3fms, comps=%d, swaps=%d, accesses=%d",
                getElapsedMillis(), comparisons, swaps, arrayAccesses);
    }
}
