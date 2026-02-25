package S10.bai2;

abstract class Vehicle {
    protected String brand;

    
    public Vehicle(String brand) {
        this.brand = brand;
    }


    abstract void move();

    public String getBrand() {
        return brand;
    }
}