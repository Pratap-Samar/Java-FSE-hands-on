# FinancialForecastExample

## Exercise 7: Financial Forecasting

**Scenario:**
You are developing a financial forecasting tool that predicts future values based on past data.

**Steps:**

1. **Understand Recursive Algorithms:**
   - Explain the concept of recursion and how it can simplify certain problems.
2. **Setup:**
   - Create a method to calculate the future value using a recursive approach.
3. **Implementation:**
   - Implement a recursive algorithm to predict future values based on past growth rates.
4. **Analysis:**
   - Discuss the time complexity of your recursive algorithm.
   - Explain how to optimize the recursive solution to avoid excessive computation.

---

## 1. Recursion

Recursion is when a method solves a problem by calling itself on a smaller version of the same problem, until it reaches a **base case** that can be answered directly. It simplifies problems that have a natural self-similar structure — like compound growth, where the value at year `n` is defined in terms of the value at year `n-1`. This maps cleanly onto the mathematical recurrence:

```
FV(n) = FV(n-1) * (1 + r),   FV(0) = P
```

instead of writing an explicit loop, the recursive definition mirrors the formula directly.

## 2 & 3. Implementation

`FinancialForecast.java` contains two versions:

- **`futureValueRecursive(P, r, n)`** — naive recursion. Each call reduces `n` by 1 until it hits the base case `n == 0`, then multiplies back up by `(1 + r)` at each level.
- **`futureValueMemoized(P, r, n)`** — same recurrence, but caches results per `n` in a `HashMap` so repeated calls for the same year don't recompute the chain.

`ForecastTest.java` runs both versions on a sample principal of ₹10,000 growing at 8% annually.

## 4. Analysis

**Time Complexity:**

| Version | Time Complexity | Space Complexity (call stack) |
|---|---|---|
| Naive recursive | O(n) — one call per year, no branching | O(n) — recursion depth |
| Memoized recursive | O(n) first call, O(1) for repeated lookups of cached years | O(n) — cache + stack |

Since this recurrence has only **one** recursive call per step (not two, like naive Fibonacci), the naive version is already O(n) rather than exponential. The real cost here isn't redundant subproblems within a single call — it's redundant work **across repeated calls** (e.g., a dashboard that asks for the 5-year, 10-year, and 20-year projection separately, each recomputing from year 0).

**Optimization:**

- **Memoization** (shown above): cache each computed `FV(n)` so future queries at or below that year return instantly instead of re-recursing.
- **Convert to iteration**: a simple `for` loop computing `FV(n)` in O(n) time and O(1) space avoids recursion's call-stack overhead entirely — useful if `n` (years) is large enough to risk a `StackOverflowError`.
- **Closed-form formula**: since compound growth has a direct formula, `FV(n) = P * (1 + r)^n`, using `Math.pow(1 + r, n)` computes the result in O(log n) time (via fast exponentiation) with no recursion or caching needed at all. This is the most efficient real-world choice.

## Files

| File | Role |
|---|---|
| `FinancialForecast.java` | Naive and memoized recursive future-value calculations |
| `ForecastTest.java` | Test class demonstrating both approaches |

## How to Run

```bash
javac FinancialForecast.java ForecastTest.java
java ForecastTest
```

## Expected Output

```
Naive Recursive Future Value after 10 years: 21589.25
Memoized Future Value after 10 years: 21589.25
Memoized Future Value after 5 years (cached lookup): 14693.28
```
