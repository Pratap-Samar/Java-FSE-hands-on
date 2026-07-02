# EcommerceSearchExample

## Exercise 2: E-commerce Platform Search Function

**Scenario:**
You are working on the search functionality of an e-commerce platform. The search needs to be optimized for fast performance.

**Steps:**

1. **Understand Asymptotic Notation:**
   - Explain Big O notation and how it helps in analyzing algorithms.
   - Describe the best, average, and worst-case scenarios for search operations.
2. **Setup:**
   - Create a class `Product` with attributes for searching, such as `productId`, `productName`, and `category`.
3. **Implementation:**
   - Implement linear search and binary search algorithms.
   - Store products in an array for linear search and a sorted array for binary search.
4. **Analysis:**
   - Compare the time complexity of linear and binary search algorithms.
   - Discuss which algorithm is more suitable for your platform and why.

---

## 1. Asymptotic Notation

**Big O notation** describes the upper bound of an algorithm's running time as a function of input size (n). It lets developers compare algorithms independent of hardware or language, focusing on how performance scales as data grows. It's used to reason about scalability before code is even deployed at large scale.

**Best, Average, Worst case for search:**

| Case | Linear Search | Binary Search |
|---|---|---|
| Best | O(1) — target is the first element | O(1) — target is the middle element |
| Average | O(n) — target is somewhere in the middle | O(log n) |
| Worst | O(n) — target is last element or absent | O(log n) — target absent, halving until range exhausted |

## 2. Product Class

`Product` holds `productId`, `productName`, and `category` — the fields used to identify and search for items.

## 3. Implementation

- `LinearSearch.java` — scans an **unsorted** array sequentially, comparing each element. O(n).
- `BinarySearch.java` — repeatedly halves a **sorted** array based on comparison with the middle element. O(log n).
- `SearchDemo.java` — populates a product array, sorts a copy for binary search, runs both searches for the same `productId`, and prints results with timing.

## 4. Analysis

| Aspect | Linear Search | Binary Search |
|---|---|---|
| Time Complexity | O(n) | O(log n) |
| Space Complexity | O(1) | O(1) (iterative) |
| Data requirement | Works on unsorted data | Requires sorted data |
| Preprocessing cost | None | O(n log n) to sort once |
| Best for | Small or frequently-changing datasets | Large, mostly static/read-heavy datasets |

**Which is more suitable for an e-commerce platform?**
Binary search is generally more suitable because product catalogs are large and searched far more often than they are updated. Maintaining a sorted index (e.g., sorted by `productId` or indexed via a database B-tree, which is a real-world extension of binary search) makes lookups O(log n) instead of O(n), which matters significantly at scale (millions of products). Linear search only makes sense for small, unsorted, or rarely-searched subsets, since sorting overhead outweighs its benefit there. In practice, e-commerce systems use database indexes and hash-based lookups (O(1) average) for exact-match search, and structures like B-trees (a generalization of binary search) for range queries — but this exercise demonstrates the core O(n) vs O(log n) tradeoff.

## Files

| File | Role |
|---|---|
| `Product.java` | Data model with `productId`, `productName`, `category` |
| `LinearSearch.java` | O(n) search over an unsorted array |
| `BinarySearch.java` | O(log n) search over a sorted array |
| `SearchDemo.java` | Test class comparing both searches with timing |

## How to Run

```bash
javac Product.java LinearSearch.java BinarySearch.java SearchDemo.java
java SearchDemo
```

## Expected Output (sample)

```
Linear Search Result: Product{id=110, name='Running Shoes', category='Footwear'}
Linear Search Time: <n> ns

Binary Search Result: Product{id=110, name='Running Shoes', category='Footwear'}
Binary Search Time: <n> ns
```
