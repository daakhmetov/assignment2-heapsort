🧩 Overview

This repository contains the implementation and analysis for Heap Sort, developed as part of Assignment 2: Algorithmic Analysis and Peer Code Review.
Heap Sort is an efficient, in-place, comparison-based sorting algorithm that builds a binary heap and repeatedly extracts the maximum element to produce a sorted array.

This implementation includes:

Modular structure with Maven and JUnit 5

Performance tracking (comparisons, swaps, array accesses, time)

CLI benchmark for empirical validation

⚙️ Project Structure
assignment2-heapsort/
├── src/main/java/
│   ├── algorithms/HeapSort.java
│   ├── metrics/PerformanceTracker.java
│   └── cli/BenchmarkRunner.java
├── src/test/java/
│   └── algorithms/HeapSortTest.java
├── docs/
│   ├── analysis-report.pdf
│   ├── cross-review-summary.pdf
│   └── performance-plots/
├── pom.xml
└── README.md

📊 Complexity Summary
Case	Time Complexity	Space Complexity	Stable
Best	O(n log n)	O(1)	❌ No
Average	O(n log n)	O(1)	❌ No
Worst	O(n log n)	O(1)	❌ No

Heap Sort is in-place, non-recursive, and maintains consistent O(n log n) performance across all cases.

📄 Deliverables

✅ Implementation (src/)

✅ Analysis report (docs/analysis-report.pdf)

✅ Cross-review summary (docs/cross-review-summary.pdf)

✅ Performance data (docs/performance-plots/heap_sort_results.csv)
