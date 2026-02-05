package SS9.bai6;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();

        shapes.add(new Circle(5));
        shapes.add(new Rectangle(3, 4));
        shapes.add(new Rectangle(6)); 
        System.out.println("Kết quả tính toán hình học:\n");
        double total = 0.0;
        int i = 1;
        for (Shape s : shapes) {
            double area = s.calculateArea();
            System.out.print(i++ + ". ");
            if (s instanceof Circle) {
                Circle c = (Circle) s;
                System.out.printf("Hình tròn (r=%.0f) - Diện tích: %.2f\n", c.getRadius(), area);
            } else if (s instanceof Rectangle) {
                Rectangle r = (Rectangle) s;
                if (r.getWidth() == r.getHeight()) {
                    System.out.printf("Hình vuông (cạnh %.1f) - Diện tích: %.1f\n", r.getWidth(), area);
                } else {
                    System.out.printf("Hình chữ nhật (%.1f x %.1f) - Diện tích: %.1f\n", r.getWidth(), r.getHeight(),
                            area);
                }
            } else {
                System.out.printf("Unknown shape - Diện tích: %.2f\n", area);
            }
            total += area;
            System.out.println();
        }

        System.out.printf("=> Tổng diện tích các hình: %.2f\n", total);
    }
}
