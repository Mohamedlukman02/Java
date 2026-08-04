class Product {

    int productId;
    String productName;
    double price;

    Product() {
        System.out.println("Default Constructor");
    }

    Product(String productName) {
        this.productName = productName;
    }

    Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    void display() {
        System.out.println("Product ID : " + productId);
        System.out.println("Product Name : " + productName);
        System.out.println("Price : " + price);
    }

    public static void main(String[] args) {

        Product p1 = new Product();

        Product p2 = new Product("Laptop");
        p2.display();

        Product p3 = new Product(101, "Mobile", 25000);
        p3.display();
    }
}
