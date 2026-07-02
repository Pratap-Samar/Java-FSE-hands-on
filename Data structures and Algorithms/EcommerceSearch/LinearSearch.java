public class LinearSearch {

    // Searches an unsorted array of products by productId
    // Time Complexity: O(n)
    public static Product search(Product[] products, int targetId) {
        for (Product product : products) {
            if (product.getProductId() == targetId) {
                return product;
            }
        }
        return null;
    }
}
