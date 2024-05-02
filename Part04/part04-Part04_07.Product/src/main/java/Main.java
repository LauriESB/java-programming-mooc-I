public class Main {

    // Create a class Product that represents a store product. 
    // The product should have a price (double), a quantity (int) and a name (String).
    // The class should have: the constructor public Product (String initialName, double initialPrice, int initialQuantity)
    // a method public void printProduct() that prints product information in the following format:
    
    public static void main(String[] args) {
        Product product = new Product("Banana", 1.1, 13);
        
        product.printProduct();
    }
}
