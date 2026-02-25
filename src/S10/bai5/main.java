package S10.bai5;

public class main {
    public static void main(String[] args) {
        System.out.println("=== BẢNG LƯƠNG CHI TIẾT ===\n");

     
        OfficeStaff staff1 = new OfficeStaff("Nguyễn Văn A", 8000000);
        OfficeStaff staff2 = new OfficeStaff("Trần Thị B", 7500000);

       
        Manager manager1 = new Manager("Lê Văn C", 15000000, 20); // 20% thưởng
        Manager manager2 = new Manager("Phạm Thị D", 12000000, 15); // 15% thưởng

        System.out.println("--- NHÂN VIÊN VĂN PHÒNG ---");
        printEmployeeInfo(staff1);
        printEmployeeInfo(staff2);

        System.out.println("\n--- QUẢN LÝ (CÓ THƯỞNG KPI) ---");
        printManagerInfo(manager1);
        printManagerInfo(manager2);

       
        System.out.println("\n=== TỔNG HỢP ===");
        double totalSalary = staff1.calculateSalary() + staff2.calculateSalary()
                + manager1.calculateSalary() + manager2.calculateSalary();
        System.out.printf("Tổng lương tất cả: %.2f VND\n", totalSalary);
    }

    public static void printEmployeeInfo(Employee employee) {
        System.out.printf("Tên: %s\n", employee.getName());
        System.out.printf("Lương cơ bản: %.2f VND\n", employee.getBaseSalary());
        System.out.printf("Lương cuối cùng: %.2f VND\n", employee.calculateSalary());
        System.out.println();
    }

    public static void printManagerInfo(Manager manager) {
        System.out.printf("Tên: %s\n", manager.getName());
        System.out.printf("Lương cơ bản: %.2f VND\n", manager.getBaseSalary());
        System.out.printf("Thưởng KPI: %.2f VND\n", manager.getBonus());
        System.out.printf("Lương cuối cùng: %.2f VND\n", manager.calculateSalary());
        System.out.println();
    }
}
