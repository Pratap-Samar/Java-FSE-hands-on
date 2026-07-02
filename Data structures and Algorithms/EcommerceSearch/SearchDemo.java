import java.util.Arrays;
import java.util.Comparator;

public class SearchDemo {
    public static void main(String[] args) {
        Product[] products = {
            new Product(105, "Wireless Mouse", "Electronics"),
            new Product(102, "Bluetooth Speaker", "Electronics"),
            new Product(110, "Running Shoes", "Footwear"),
            new Product(101, "Yoga Mat", "Fitness"),
            new Product(107, "Backpack", "Accessories")
        };

        int targetId = 110;

        // --- Linear Search (unsorted array) ---
        long start1 = System.nanoTime();
        Product foundLinear = LinearSearch.search(products, targetId);
        long end1 = System.nanoTime();

        System.out.println("Linear Search Result: " + foundLinear);
        System.out.println("Linear Search Time: " + (end1 - start1) + " ns");

        // --- Binary Search (requires sorted array) ---
        Product[] sortedProducts = Arrays.copyOf(products, products.length);
        Arrays.sort(sortedProducts, Comparator.comparingInt(Product::getProductId));

        long start2 = System.nanoTime();
        Product foundBinary = BinarySearch.search(sortedProducts, targetId);
        long end2 = System.nanoTime();

        System.out.println("\nBinary Search Result: " + foundBinary);
        System.out.println("Binary Search Time: " + (end2 - start2) + " ns");
    }
}
