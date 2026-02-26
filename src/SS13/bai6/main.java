package SS13.bai6;

import java.util.*;

public class main {
    private static List<Medicine> cart = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("||=======================MENU=======================||");
            System.out.println("||              1. Thêm thuốc vào đơn               ||");
            System.out.println("||              2. Điều chỉnh số lượng              ||");
            System.out.println("||              3. Xóa thuốc                        ||");
            System.out.println("||              4. In hóa đơn                       ||");
            System.out.println("||              5. Tìm thuốc giá rẻ                 ||");
            System.out.println("||              6. Thoát                            ||");
            System.out.println("||==================================================||");
            System.out.print("Chọn lựa chọn: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1 -> addMedicine();
                case 2 -> adjustQuantity();
                case 3 -> removeMedicine();
                case 4 -> printInvoice();
                case 5 -> findCheapMedicine();
                case 6 -> System.out.println("Thoát chương trình.");
            }
        } while (choice != 6);
    }

  
    private static void addMedicine() {
        System.out.print("Nhập mã thuốc: ");
        String id = sc.nextLine();
        
        
        for (Medicine m : cart) {
            if (m.getDrugId().equals(id)) {
                System.out.print("Thuốc đã tồn tại. Nhập thêm số lượng: ");
                int extra = Integer.parseInt(sc.nextLine());
                m.setQuantity(m.getQuantity() + extra);
                System.out.println("Đã cập nhật số lượng.");
                return;
            }
        }

        System.out.print("Nhập tên thuốc: ");
        String name = sc.nextLine();
        System.out.print("Nhập giá thuốc: ");
        double price = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập số lượng: ");
        int qty = Integer.parseInt(sc.nextLine());

        cart.add(new Medicine(id, name, price, qty));
        System.out.println("Thêm thuốc thành công !");
    }

    
    private static void adjustQuantity() {
        System.out.print("Nhập mã thuốc cần chỉnh: ");
        String id = sc.nextLine();
        for (int i = 0; i < cart.size(); i++) {
            if (cart.get(i).getDrugId().equals(id)) {
                System.out.print("Nhập số lượng mới: ");
                int newQty = Integer.parseInt(sc.nextLine());
                if (newQty <= 0) {
                    cart.remove(i);
                    System.out.println("Số lượng = 0, đã xóa thuốc khỏi đơn.");
                } else {
                    cart.get(i).setQuantity(newQty);
                    System.out.println("Cập nhật thành công.");
                }
                return;
            }
        }
        System.out.println("Không tìm thấy thuốc và yêu cầu nhập lại.");
    }

    
    private static void removeMedicine() {
        System.out.print("Nhập mã thuốc cần xóa: ");
        String id = sc.nextLine();
        boolean removed = cart.removeIf(m -> m.getDrugId().equals(id));
        if (removed) {
            System.out.println("Đã xóa thuốc.");
        } else {
            System.out.println("Id thuốc không tồn tại !");
        }
    }

   
    private static void printInvoice() {
        if (cart.isEmpty()) {
            System.out.println("Đơn thuốc trống!");
            return;
        }
        System.out.printf("%-10s %-20s %-12s %-10s %-12s\n", "Mã Thuốc", "Tên Thuốc", "Đơn Giá", "Số Lượng", "Thành Tiền");
        double total = 0;
        for (Medicine m : cart) {
            double amount = m.getTotalPrice();
            System.out.printf("%-10s %-20s %-12.2f %-10d %-12.2f\n", 
                m.getDrugId(), m.getDrugName(), m.getUnitPrice(), m.getQuantity(), amount);
            total += amount;
        }
        System.out.println("------------------------------------------------------------");
        System.out.printf("Tổng tiền: %.2f VNĐ\n", total);
        
        cart.clear();
        System.out.println("Hệ thống đã reset đơn thuốc cho bệnh nhân mới.");
    }

    
    private static void findCheapMedicine() {
        System.out.println("Các loại thuốc giá rẻ (< 50,000):");
        boolean found = false;
        for (Medicine m : cart) {
            if (m.getUnitPrice() < 50000) {
                System.out.printf("%-10s %-20s %-12.2f\n", m.getDrugId(), m.getDrugName(), m.getUnitPrice());
                found = true;
            }
        }
        if (!found) System.out.println("Không có thuốc nào dưới 50,000 VNĐ.");
    }
}