package S10.bai2;

public class main {
    public static void main(String[] args) {
 
        Vehicle myCar = new Car("Toyota");
        Vehicle myBike = new Bicycle("Thống Nhất");

        
        System.out.println(myCar.getBrand() + " - Cách di chuyển: ");
        myCar.move();

        System.out.println(myBike.getBrand() + " - Cách di chuyển: ");
        myBike.move();
    }
}