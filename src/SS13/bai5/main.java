package SS13.bai5;

import java.util.*;

public class main {
    private static List<Patient> patients = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("||=========================MENU=========================||");
            System.out.println("||              1. Tiếp nhận bệnh nhân                  ||");
            System.out.println("||              2. Cập nhật chẩn đoán                   ||");
            System.out.println("||              3. Xuất viện                            ||");
            System.out.println("||              4. Sắp xếp danh sách bệnh nhân          ||");
            System.out.println("||              5. Hiển thị danh sách bệnh nhân         ||");
            System.out.println("||              6. Thoát                                ||");
            System.out.println("||======================================================||");
            System.out.print("Chọn chức năng: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1 -> addPatient();
                case 2 -> updateDiagnosis();
                case 3 -> dischargePatient();
                case 4 -> sortPatients();
                case 5 -> displayPatients();
                case 6 -> System.out.println("Tạm biệt!");
                default -> System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 6);
    }

    private static void addPatient() {
        System.out.print("Nhập ID bệnh nhân: ");
        String id = sc.nextLine();
        
       
        for (Patient p : patients) {
            if (p.getId().equals(id)) {
                System.out.println("Lỗi: ID đã tồn tại!");
                return;
            }
        }

        System.out.print("Nhập tên bệnh nhân: ");
        String name = sc.nextLine();
        System.out.print("Nhập tuổi: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập chẩn đoán: ");
        String diagnosis = sc.nextLine();

        patients.add(new Patient(id, name, age, diagnosis));
        System.out.println("Bệnh nhân đã được thêm thành công.");
    }

    private static void updateDiagnosis() {
        System.out.print("Nhập ID bệnh nhân để cập nhật chẩn đoán: ");
        String id = sc.nextLine();
        for (Patient p : patients) {
            if (p.getId().equals(id)) {
                System.out.print("Nhập chẩn đoán mới: ");
                p.setDiagnosis(sc.nextLine());
                System.out.println("Chẩn đoán đã được cập nhật.");
                return;
            }
        }
        System.out.println("Không tìm thấy bệnh nhân với ID đã cho.");
    }

    private static void dischargePatient() {
        System.out.print("Nhập ID bệnh nhân để xuất viện: ");
        String id = sc.nextLine();
        boolean removed = patients.removeIf(p -> p.getId().equals(id));
        if (removed) {
            System.out.println("Bệnh nhân đã được xóa khỏi danh sách.");
        } else {
            System.out.println("Không tìm thấy bệnh nhân với ID đã cho.");
        }
    }

    private static void sortPatients() {
      
        patients.sort((p1, p2) -> {
            if (p2.getAge() != p1.getAge()) {
                return Integer.compare(p2.getAge(), p1.getAge()); 
            }
            return p1.getFullName().compareToIgnoreCase(p2.getFullName()); 
        });
        System.out.println("Danh sách bệnh nhân đã được sắp xếp.");
    }

    private static void displayPatients() {
        System.out.println("=======================Danh sách bệnh nhân=======================");
        if (patients.isEmpty()) {
            System.out.println("Danh sách trống.");
        } else {
            patients.forEach(System.out::println);
        }
    }
}