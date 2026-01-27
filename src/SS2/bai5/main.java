package SS2.bai5;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int trustScore = 100;
        int daysLate;

        System.out.println("=== CHƯƠNG TRÌNH QUẢN LÝ ĐIỂM UY TÍN ĐỘC GIẢ ===");
        System.out.println("Điểm uy tín ban đầu: " + trustScore);
        System.out.println("Nhập số ngày trễ hạn trả sách (999 để thoát):");
        System.out.println();

        while (true) {
            System.out.print("Nhập số ngày trễ hạn: ");
            daysLate = sc.nextInt();

          
            if (daysLate == 999) {
                break;
            }

           
            if (daysLate <= 0) {
                trustScore += 5;
                System.out.println("✓ Trả đúng hạn! Cộng 5 điểm. Điểm hiện tại: " + trustScore);
            }
           
            else {
                int penalty = daysLate * 2;
                trustScore -= penalty;
                System.out.println(
                        "✗ Trả muộn " + daysLate + " ngày! Trừ " + penalty + " điểm. Điểm hiện tại: " + trustScore);
            }
            System.out.println();
        }

        
        System.out.println("\n=== KẾT QUẢ CUỐI CÙNG ===");
        System.out.println("Tổng điểm uy tín: " + trustScore);

        String category;
        if (trustScore > 120) {
            category = "Độc giả Thân thiết";
        } else if (trustScore >= 80) {
            category = "Độc giả Tiêu chuẩn";
        } else {
            category = "Độc giả cần lưu ý";
        }

        System.out.println("Xếp loại: " + category);

        sc.close();
    }
}
