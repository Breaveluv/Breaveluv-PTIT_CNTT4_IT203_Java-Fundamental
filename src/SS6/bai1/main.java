package SS6.bai1;

class Student {
   
    private String maSinhVien;
    private String hoTen;
    private int namSinh;
    private double diemTrungBinh;

    public Student(String maSinhVien, String hoTen, int namSinh, double diemTrungBinh) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.diemTrungBinh = diemTrungBinh;
    }

    public void hienThiThongTin() {
        System.out.println("=== Thông Tin Sinh Viên ===");
        System.out.println("Mã sinh viên: " + maSinhVien);
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Năm sinh: " + namSinh);
        System.out.println("Điểm trung bình: " + diemTrungBinh);
        System.out.println("===========================\n");
    }
}

public class main {
    public static void main(String[] args) {
       
        Student sv1 = new Student("SV001", "Nguyễn Văn A", 2005, 8.5);

       
        Student sv2 = new Student("SV002", "Trần Thị B", 2004, 9.0);

        
        System.out.println("--- Danh sách sinh viên ---\n");
        sv1.hienThiThongTin();
        sv2.hienThiThongTin();
    }
}
