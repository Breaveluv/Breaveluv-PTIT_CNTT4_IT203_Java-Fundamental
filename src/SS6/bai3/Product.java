package SS6.bai3;

public class Product {
   
    private String maSP;
    private String tenSP;
    private double giaBan;

    public Product(String maSP, String tenSP, double giaBan) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.giaBan = giaBan;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

 
    public String getTenSP() {
        return tenSP;
    }

   
    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

   
    public double getGiaBan() {
        return giaBan;
    }

    
    public void setGiaBan(double giaBan) {
        if (giaBan > 0) {
            this.giaBan = giaBan;
            System.out.println("✓ Cập nhật giá thành công: " + giaBan);
        } else {
            System.out.println("✗ Lỗi: Giá bán phải lớn hơn 0. Giá không được cập nhật!");
        }
    }

   
    public void hienThiThongTin() {
        System.out.println("=== Thông Tin Sản Phẩm ===");
        System.out.println("Mã SP: " + maSP);
        System.out.println("Tên SP: " + tenSP);
        System.out.println("Giá bán: " + giaBan + " VNĐ");
        System.out.println("===========================\n");
    }
}
