package S10.bai6;

public class main {
    public static void main(String[] args) {
        Product[] products = {
                new Product("Laptop Dell", 15000000),
                new Product("iPhone 14", 25000000),
                new Product("Samsung TV", 8000000),
                new Product("Airpods Pro", 6000000),
                new Product("iPad Air", 18000000)
        };

        System.out.println("=== DANH SÁCH SẢN PHẨM GỐC ===");
        printProducts(products);

        // Cách 1: Sắp xếp theo giá tăng dần - Bubble Sort
        System.out.println("\n=== SẮP XẾP THEO GIÁ (TĂNG DẦN) - BUBBLE SORT ===");
        Product[] sortedByPrice = products.clone();
        sortByPrice(sortedByPrice);
        printProducts(sortedByPrice);

        // Cách 2: Sắp xếp theo tên A-Z - Bubble Sort
        System.out.println("\n=== SẮP XẾP THEO TÊN (A-Z) - BUBBLE SORT ===");
        Product[] sortedByName = products.clone();
        sortByName(sortedByName);
        printProducts(sortedByName);

        System.out.println("\n=== GIẢI THÍCH ===");
        System.out.println("Không dùng Comparator:");
        System.out.println("  + Tránh phức tạp với Anonymous Class hay Lambda");
        System.out.println("  + Code trực tiếp, dễ hiểu logic sắp xếp");
        System.out.println("  + Kiểm soát hoàn toàn quá trình sắp xếp");
        System.out.println("  - Code dài hơn, ít linh hoạt");
        System.out.println("  - Khó mở rộng cho nhiều tiêu chí");
    }

   
    public static void sortByPrice(Product[] products) {
        int n = products.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (products[j].getPrice() > products[j + 1].getPrice()) {
                  
                    Product temp = products[j];
                    products[j] = products[j + 1];
                    products[j + 1] = temp;
                }
            }
        }
    }

    // Sắp xếp theo tên (Bubble Sort)
    public static void sortByName(Product[] products) {
        int n = products.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (products[j].getName().compareTo(products[j + 1].getName()) > 0) {
                    // Hoán đổi
                    Product temp = products[j];
                    products[j] = products[j + 1];
                    products[j + 1] = temp;
                }
            }
        }
    }

    public static void printProducts(Product[] products) {
        for (Product p : products) {
            System.out.println(p);
        }
    }
}
