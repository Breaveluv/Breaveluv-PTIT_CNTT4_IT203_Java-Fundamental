package SS6.bai4;

public class Employee {
   
    private String maNhanVien;
    private String tenNhanVien;
    private double luong;

    
    public Employee() {
        this.maNhanVien = "N/A";
        this.tenNhanVien = "N/A";
        this.luong = 0;
    }


    public Employee(String maNhanVien, String tenNhanVien) {
        this.maNhanVien = maNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.luong = 0;
    }

    public Employee(String maNhanVien, String tenNhanVien, double luong) {
        this.maNhanVien = maNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.luong = luong;
    }

   
    public void hienThiThongTin() {
        System.out.println("=== Thông Tin Nhân Viên ===");
        System.out.println("Mã nhân viên: " + maNhanVien);
        System.out.println("Tên nhân viên: " + tenNhanVien);
        System.out.println("Lương: " + luong + " VNĐ");
        System.out.println("===========================\n");
    }
}
