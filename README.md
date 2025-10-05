Overview

This repository contains the implementation and analysis of the Heap Sort algorithm as part of Assignment 2: Algorithmic Analysis and Peer Code Review.

The project includes:

In-place Heap Sort implementation with performance tracking

Comprehensive unit tests for correctness and edge cases

Peer analysis report for the Shell Sort algorithm (partner’s work)

Repository Structure
assignment2-heapsort/
├── src/main/java/
│   ├── algorithms/HeapSort.java
│   ├── metrics/PerformanceTracker.java
│   └── cli/BenchmarkRunner.java
├── src/test/java/
│   └── algorithms/HeapSortTest.java
├── docs/
│   ├── analysis-report.pdf        # Analysis of partner's Shell Sort algorithm
│   └── performance-plots/         # Benchmark results (CSV/plots)
├── README.md
└── pom.xml

Features

In-place Heap Sort implementation

Tracks comparisons, swaps, and array accesses

CLI interface for benchmarking different input types (random, sorted, reversed, duplicate)

Unit tests for all edge cases:

Empty array

Single element

Sorted input

Reverse-sorted input

Duplicate values
