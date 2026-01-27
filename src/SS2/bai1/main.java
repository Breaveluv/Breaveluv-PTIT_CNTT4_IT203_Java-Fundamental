package SS2.bai1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap tuoi cua ban: ");
        int age = scanner.nextInt();

        System.out.print("Nhap so sach dang muon: ");
        int numberOfBooks = scanner.nextInt();

       
        if (age >= 18 && numberOfBooks < 3) {
            System.out.println("Ket qua: Cho phep muon sach.");
        } else {
            System.out.println("Ket qua: Khong du dieu kien.");

         
            if (age < 18) {
                System.out.println("- Ly do: Ban chua du tuoi.");
            }

            if (numberOfBooks >= 3) {
                System.out.println("- Ly do: Ban da muon toi da 3 cuon.");
            }
        }

        scanner.close();
    }
}
