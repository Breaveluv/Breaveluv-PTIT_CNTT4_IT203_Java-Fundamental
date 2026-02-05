package SS9.bai5;

public class ProductionEmployee extends Employee {
    private int numOfProducts;
    private long price;

    public ProductionEmployee(String name, int numOfProducts, long price) {
        super(name);
        this.numOfProducts = numOfProducts;
        this.price = price;
    }

    @Override
    public long calculateSalary() {
        return (long) numOfProducts * price;
    }

    public int getNumOfProducts() {
        return numOfProducts;
    }

    public long getPrice() {
        return price;
    }
}
