import java.util.HashMap;
import java.util.Map;

public class FinancialForecast {

    // Naive recursive approach
    // futureValue(P, r, n) = futureValue(P, r, n-1) * (1 + r)
    // Time Complexity: O(n)
    public static double futureValueRecursive(double principal, double growthRate, int years) {
        if (years == 0) {
            return principal;
        }
        return futureValueRecursive(principal, growthRate, years - 1) * (1 + growthRate);
    }

    // Memoized recursive approach (avoids recomputation for repeated queries
    // on the same principal/growthRate across multiple year lookups)
    private static Map<Integer, Double> memo = new HashMap<>();

    public static double futureValueMemoized(double principal, double growthRate, int years) {
        if (years == 0) {
            return principal;
        }
        if (memo.containsKey(years)) {
            return memo.get(years);
        }
        double result = futureValueMemoized(principal, growthRate, years - 1) * (1 + growthRate);
        memo.put(years, result);
        return result;
    }

    // Clears cached values (e.g., when principal or growth rate changes)
    public static void clearCache() {
        memo.clear();
    }
}
