package S10.bai2;

class Car extends Vehicle {
    public Car(String brand) {
        super(brand);
    }

    @Override
    void move() {
        System.out.println("Di chuyển bằng động cơ");
    }
}


class Bicycle extends Vehicle {
    public Bicycle(String brand) {
        super(brand);
    }

    @Override
    void move() {
        System.out.println("Di chuyển bằng sức người");
    }
}
