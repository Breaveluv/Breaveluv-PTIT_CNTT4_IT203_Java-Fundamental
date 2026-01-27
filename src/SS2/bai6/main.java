package SS2.bai6;

import java.util.Scanner;

public class main {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = -1;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int count = 0;

        for (int i = 1; i <= 7; i++) {
            System.out.print("Nhập số lượt mượn sách của ngày " + i + ": ");
            int borrow = sc.nextInt();

            if (borrow == 0) {
                continue;
            }

            if (borrow > max) {
                max = borrow;
            }

            if (borrow < min) {
                min = borrow;
            }

            sum += borrow;
            count++;
        }

        if (count > 0) {
            double avg = (double) sum / count;
            System.out.println("Lượt mượn cao nhất: " + max);
            System.out.println("Lượt mượn thấp nhất: " + min);
            System.out.println("Lượt mượn trung bình: " + avg);
        } else {
            System.out.println("Không có ngày nào mở cửa");
        }

        sc.close();
    }
}







