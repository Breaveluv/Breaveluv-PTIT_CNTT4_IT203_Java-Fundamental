package KTDGSS16;

import java.util.*;

interface IRepository<T> {
    boolean add(T item);
    boolean removeById(String id);
    T findById(String id);
    List<T> findAll();
}

abstract class Product {
    protected String id;
    protected String name;
    protected double price;

    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }

    public abstract double calculateFinalPrice();

    public void displayInfo() {
        System.out.printf("ID: %-5s | Tên: %-15s | Giá gốc: %,10.0f", id, name, price);
    }
}

class ElectronicProduct extends Product {
    private int warrantyMonths;

    public ElectronicProduct(String id, String name, double price, int warrantyMonths) {
        super(id, name, price);
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public double calculateFinalPrice() {
        return (warrantyMonths > 12) ? (price + 1000000) : price;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf(" | Bảo hành: %d tháng | Loại: Điện tử\n", warrantyMonths);
    }
}

class FoodProduct extends Product {
    private int discountPercent;

    public FoodProduct(String id, String name, double price, int discountPercent) {
        super(id, name, price);
        this.discountPercent = discountPercent;
    }

    @Override
    public double calculateFinalPrice() {
        return price - (price * discountPercent / 100.0);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf(" | Giảm giá: %d%% | Loại: Thực phẩm\n", discountPercent);
    }
}

class ProductRepository implements IRepository<Product> {
    private List<Product> list = new ArrayList<>();
    private Map<String, Product> map = new HashMap<>();

    @Override
    public boolean add(Product item) {
        if (item == null || map.containsKey(item.getId())) return false;
        list.add(item);
        map.put(item.getId(), item);
        System.out.println("-> Đã thêm sản phẩm: " + item.getName());
        return true;
    }

    @Override
    public boolean removeById(String id) {
        Product p = map.remove(id);
        if (p != null) {
            return list.remove(p);
        }
        return false;
    }

    @Override
    public Product findById(String id) {
        return map.get(id);
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(list);
    }

    public Map<String, Integer> getStatistics() {
        int electronicCount = 0;
        int foodCount = 0;
        for (Product p : list) {
            if (p instanceof ElectronicProduct) electronicCount++;
            else if (p instanceof FoodProduct) foodCount++;
        }
        Map<String, Integer> stats = new HashMap<>();
        stats.put("Electronic", electronicCount);
        stats.put("Food", foodCount);
        return stats;
    }
}

public class main {
    public static void main(String[] args) {
        ProductRepository repo = new ProductRepository();

        // a) Thêm sản phẩm mẫu
        System.out.println("--- KHỞI TẠO DỮ LIỆU ---");
        repo.add(new ElectronicProduct("E01", "Laptop Gaming", 25000000, 24));
        repo.add(new ElectronicProduct("E02", "Chuột không dây", 500000, 6));
        repo.add(new ElectronicProduct("E03", "Bàn phím", 500000, 12));

        repo.add(new FoodProduct("F01", "Bánh quy bơ", 50000, 10));
        repo.add(new FoodProduct("F02", "Nước ép cam", 30000, 0));

        // b1) Hiển thị toàn bộ danh sách
        System.out.println("\n--- TẤT CẢ SẢN PHẨM TRONG HỆ THỐNG ---");
        List<Product> allProducts = repo.findAll();
        for (Product p : allProducts) {
            p.displayInfo();
            System.out.printf("   => Thành tiền (sau xử lý): %,.0f VNĐ\n", p.calculateFinalPrice());
        }

        // b2) Tìm sản phẩm theo ID
        String searchId = "E01";
        System.out.println("\n*** Đang tìm kiếm sản phẩm có ID: " + searchId + " ***");
        Product found = repo.findById(searchId);
        if (found != null) {
            System.out.print("Kết quả: ");
            found.displayInfo();
        } else {
            System.out.println("! Không tìm thấy sản phẩm.");
        }

        // b3) Sắp xếp danh sách theo giá tăng dần
        allProducts.sort(new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return Double.compare(p1.getPrice(), p2.getPrice());
            }
        });

        System.out.println("\n--- DANH SÁCH SAU KHI SẮP XẾP GIÁ TĂNG DẦN ---");
        for (Product p : allProducts) {
            System.out.printf("%-15s | Giá gốc: %,10.0f VNĐ\n", p.getName(), p.getPrice());
        }

        // b4) Thống kê số lượng
        System.out.println("\n--- THỐNG KÊ THEO PHÂN LOẠI ---");
        Map<String, Integer> stats = repo.getStatistics();
        System.out.println("Số lượng đồ Điện tử  : " + stats.get("Electronic"));
        System.out.println("Số lượng Thực phẩm   : " + stats.get("Food"));
        System.out.println("----------------------------------------\n");
    }
}