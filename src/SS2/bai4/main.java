package SS2.bai4;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ID;
        do {
            System.out.print("Nhap ma sach: ");
            ID = scanner.nextInt();

            if (ID <= 0) {
                System.out.println("Ma khong hop le, hay nhap lai");
            }
        } while (ID <= 0);

        System.out.println("Luu ma sach thanh cong");

        scanner.close();
    }
}
