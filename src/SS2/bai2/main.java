package SS2.bai2;

public class main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Nhap ky tu code: ");
        char code = sc.next().charAt(0);

        switch (code) {
            case 'A':
                System.out.println("Tang 1: Sach Van hoc");
                break;
            case 'B':
                System.out.println("Tang 2: Sach Khoa hoc");
                break;
            case 'C':
                System.out.println("Tang 3: Sach Ngoai ngu");
                break;
            case 'D':
                System.out.println("Tang 4: Sach Tin hoc");
                break;
            default:
                System.out.println("Ma code khong hop le!");
        }

        sc.close();
    }

}
