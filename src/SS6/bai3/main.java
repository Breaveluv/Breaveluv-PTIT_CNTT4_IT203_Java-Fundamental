package SS6.bai3;

public class main {
    public static void main(String[] args) {

        Product sp1 = new Product("P001", "Laptop Dell", 15000000);

        System.out.println("--- Thông tin ban đầu ---\n");
        sp1.hienThiThongTin();

        System.out.println("--- Thử cập nhật giá hợp lệ ---");
        sp1.setGiaBan(16000000);
        sp1.hienThiThongTin();

      
        System.out.println("--- Thử cập nhật giá âm ---");
        sp1.setGiaBan(-5000000);
        sp1.hienThiThongTin();

  
        System.out.println("--- Thử cập nhật giá bằng 0 ---");
        sp1.setGiaBan(0);
        sp1.hienThiThongTin();

      
        System.out.println("--- Sử dụng getter để lấy dữ liệu ---");
        System.out.println("Mã SP: " + sp1.getMaSP());
        System.out.println("Tên SP: " + sp1.getTenSP());
        System.out.println("Giá bán: " + sp1.getGiaBan());
    }
}
