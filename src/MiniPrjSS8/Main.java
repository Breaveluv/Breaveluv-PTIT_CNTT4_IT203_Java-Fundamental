package MiniPrjSS8;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Student[] students;
    static int n = 0;

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n===== QUẢN LÝ ĐIỂM SINH VIÊN =====");
            System.out.println("1. Nhập danh sách sinh viên");
            System.out.println("2. Hiển thị danh sách sinh viên");
            System.out.println("3. Tìm kiếm sinh viên theo học lực");
            System.out.println("4. Sắp xếp theo học lực giảm dần");
            System.out.println("5. Thoát");
            System.out.println("==================================");
            System.out.print("Chọn chức năng: ");

            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    inputStudents();
                    break;
                case 2:
                    displayStudents();
                    break;
                case 3:
                    searchByRank();
                    break;
                case 4:
                    sortByScoreDesc();
                    break;
                case 5:
                    System.out.println("Thoát chương trình!");
                    break;
                default:
                    System.out.println("Chức năng không hợp lệ!");
            }
        } while (choice != 5);
    }

    // ===== Chức năng 1: Nhập danh sách =====
    public static void inputStudents() {
        System.out.print("Nhập số lượng sinh viên: ");
        n = sc.nextInt();
        sc.nextLine();

        students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Sinh viên thứ " + (i + 1));

            String id;
            while (true) {
                System.out.print("Nhập mã SV (SV...): ");
                id = sc.nextLine();
                if (validateId(id)) break;
                System.out.println(" Mã sinh viên không hợp lệ!");
            }

            System.out.print("Nhập họ tên: ");
            String name = sc.nextLine();

            System.out.print("Nhập điểm trung bình: ");
            double score = sc.nextDouble();
            sc.nextLine();

            students[i] = new Student(id, name, score);
        }
    }

   
    public static boolean validateId(String id) {
        if (!id.startsWith("SV")) return false;
        if (id.length() != 5) return false;

        for (int i = 2; i < 5; i++) {
            if (!Character.isDigit(id.charAt(i))) return false;
        }
        return true;
    }

    
    public static void displayStudents() {
        if (students == null || n == 0) {
            System.out.println("Danh sách rỗng!");
            return;
        }

        for (Student s : students) {
            System.out.println(s);
        }
    }

   
    public static void searchByRank() {
        if (students == null) {
            System.out.println("Chưa có dữ liệu!");
            return;
        }

        System.out.print("Nhập học lực cần tìm (Gioi/Kha/Trung Binh): ");
        String rank = sc.nextLine();

        boolean found = false;
        for (Student s : students) {
            if (s.getRank().equalsIgnoreCase(rank)) {
                System.out.println(s);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy sinh viên phù hợp!");
        }
    }

   
    public static void sortByScoreDesc() {
        if (students == null) {
            System.out.println("Chưa có dữ liệu!");
            return;
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (students[i].getScore() < students[j].getScore()) {
                    Student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }

        System.out.println("Đã sắp xếp theo học lực giảm dần!");
    }
}
