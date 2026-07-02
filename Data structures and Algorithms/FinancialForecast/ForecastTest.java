public class ForecastTest {
    public static void main(String[] args) {
        double principal = 10000.0;   // starting investment
        double growthRate = 0.08;     // 8% annual growth
        int years = 10;

        // --- Naive recursion ---
        double resultRecursive = FinancialForecast.futureValueRecursive(principal, growthRate, years);
        System.out.printf("Naive Recursive Future Value after %d years: %.2f%n", years, resultRecursive);

        // --- Memoized recursion ---
        double resultMemoized = FinancialForecast.futureValueMemoized(principal, growthRate, years);
        System.out.printf("Memoized Future Value after %d years: %.2f%n", years, resultMemoized);

        // Repeated call reuses cached values instantly
        double resultMemoizedAgain = FinancialForecast.futureValueMemoized(principal, growthRate, 5);
        System.out.printf("Memoized Future Value after %d years (cached lookup): %.2f%n", 5, resultMemoizedAgain);
    }
}
