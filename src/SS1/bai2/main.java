package SS1.bai2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số ngày chậm trễ (n): ");
        int n = sc.nextInt();

        System.out.print("Nhập số lượng sách mượn (m): ");
        int m = sc.nextInt();

        double totalFine = n * m * 5000;

        if (n > 7 && m >= 3) {
            System.out.println("Phạt bổ sung 20% do mượn nhiều sách và trả quá muộn.");

            totalFine *= 1.2;
        }

        System.out.printf("Tổng tiền phạt là: %.0fđ\n", totalFine);

        boolean shouldLockCard = totalFine > 50000;
        System.out.println("Yêu cầu khóa thẻ: " + shouldLockCard);

        sc.close();
    }
}
