package SS2.bai3;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int total=0;


        System.out.print("Nhập số lượng sách trả muộn");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Nhap so ngay tre cua cuon sac thu "+ i+":");
            int daysLate = sc.nextInt();
            total += daysLate;
        }

        System.out.print("Tong so tien phat cuoi cung"+total);

        sc.close();

    }
    
}
