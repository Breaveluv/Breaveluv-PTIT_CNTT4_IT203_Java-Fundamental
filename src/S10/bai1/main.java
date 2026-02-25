package S10.bai1;


interface Shape {
    double getArea();
    double getPerimeter();
}


class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}


class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}


public class main {
    public static void main(String[] args) {
     
        Shape hinhTron = new Circle(5.0);
        Shape hinhChunhat = new Rectangle(4.0, 6.0);

        
        System.out.println("--- Kết quả tính toán ---");
        
        System.out.println("Hình Tròn (bán kính 5):");
        System.out.printf("- Diện tích: %.2f\n", hinhTron.getArea());
        System.out.printf("- Chu vi: %.2f\n", hinhTron.getPerimeter());

        System.out.println("\nHình Chữ Nhật (4x6):");
        System.out.printf("- Diện tích: %.2f\n", hinhChunhat.getArea());
        System.out.printf("- Chu vi: %.2f\n", hinhChunhat.getPerimeter());
    }
}